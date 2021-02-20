package typings.intercomClient

import typings.intercomClient.anon.Id
import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.tag
import typings.intercomClient.intercomClientStrings.tagDotlist
import typings.intercomClient.userMod.UserIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @js.native
  trait List extends StObject {
    
    var pages: Next = js.native
    
    var tags: js.Array[Tag] = js.native
    
    var total_count: Double = js.native
    
    var `type`: tagDotlist = js.native
  }
  object List {
    
    @scala.inline
    def apply(pages: Next, tags: js.Array[Tag], total_count: Double, `type`: tagDotlist): List = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: tagDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<intercom-client.intercom-client/Tag.TagIdentifier> */
  @js.native
  trait Tag extends StObject {
    
    val id: String = js.native
    
    var name: String = js.native
    
    val `type`: tag = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(id: String, name: String, `type`: tag): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagCompanies extends TagOper {
    
    var name: String = js.native
    
    var users: js.Array[Id] = js.native
  }
  object TagCompanies {
    
    @scala.inline
    def apply(name: String, users: js.Array[Id]): TagCompanies = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCompanies]
    }
    
    @scala.inline
    implicit class TagCompaniesMutableBuilder[Self <: TagCompanies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[Id]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: Id*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TagIdentifier extends StObject {
    
    var id: String = js.native
  }
  object TagIdentifier {
    
    @scala.inline
    def apply(id: String): TagIdentifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagIdentifier]
    }
    
    @scala.inline
    implicit class TagIdentifierMutableBuilder[Self <: TagIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.tagMod.TagCompanies
    - typings.intercomClient.tagMod.TagUsers
  */
  trait TagOper extends StObject
  object TagOper {
    
    @scala.inline
    def TagCompanies(name: String, users: js.Array[Id]): typings.intercomClient.tagMod.TagCompanies = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.tagMod.TagCompanies]
    }
    
    @scala.inline
    def TagUsers(name: String, users: js.Array[UserIdentifier]): typings.intercomClient.tagMod.TagUsers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.tagMod.TagUsers]
    }
  }
  
  @js.native
  trait TagUsers extends TagOper {
    
    var name: String = js.native
    
    var users: js.Array[UserIdentifier] = js.native
  }
  object TagUsers {
    
    @scala.inline
    def apply(name: String, users: js.Array[UserIdentifier]): TagUsers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagUsers]
    }
    
    @scala.inline
    implicit class TagUsersMutableBuilder[Self <: TagUsers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[UserIdentifier]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: UserIdentifier*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
