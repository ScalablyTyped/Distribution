package typings.intercomClient

import typings.intercomClient.anon.Id
import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.tag
import typings.intercomClient.intercomClientStrings.tagDotlist
import typings.intercomClient.userMod.UserIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  trait List extends StObject {
    
    var pages: Next
    
    var tags: js.Array[Tag]
    
    var total_count: Double
    
    var `type`: tagDotlist
  }
  object List {
    
    inline def apply(pages: Next, tags: js.Array[Tag], total_count: Double): List = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tag.list")
      __obj.asInstanceOf[List]
    }
    
    extension [Self <: List](x: Self) {
      
      inline def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      inline def setType(value: tagDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<intercom-client.intercom-client/Tag.TagIdentifier> */
  trait Tag extends StObject {
    
    val id: String
    
    var name: String
    
    val `type`: tag
  }
  object Tag {
    
    inline def apply(id: String, name: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagCompanies
    extends StObject
       with TagOper {
    
    var name: String
    
    var users: js.Array[Id]
  }
  object TagCompanies {
    
    inline def apply(name: String, users: js.Array[Id]): TagCompanies = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCompanies]
    }
    
    extension [Self <: TagCompanies](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[Id]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: Id*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait TagIdentifier extends StObject {
    
    var id: String
  }
  object TagIdentifier {
    
    inline def apply(id: String): TagIdentifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagIdentifier]
    }
    
    extension [Self <: TagIdentifier](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.tagMod.TagCompanies
    - typings.intercomClient.tagMod.TagUsers
  */
  trait TagOper extends StObject
  object TagOper {
    
    inline def TagCompanies(name: String, users: js.Array[Id]): typings.intercomClient.tagMod.TagCompanies = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.tagMod.TagCompanies]
    }
    
    inline def TagUsers(name: String, users: js.Array[UserIdentifier]): typings.intercomClient.tagMod.TagUsers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.tagMod.TagUsers]
    }
  }
  
  trait TagUsers
    extends StObject
       with TagOper {
    
    var name: String
    
    var users: js.Array[UserIdentifier]
  }
  object TagUsers {
    
    inline def apply(name: String, users: js.Array[UserIdentifier]): TagUsers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagUsers]
    }
    
    extension [Self <: TagUsers](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[UserIdentifier]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserIdentifier*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
}
