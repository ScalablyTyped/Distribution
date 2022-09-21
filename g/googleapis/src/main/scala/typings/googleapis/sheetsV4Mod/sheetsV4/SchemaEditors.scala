package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditors extends StObject {
  
  /**
    * True if anyone in the document's domain has edit access to the protected range. Domain protection is only supported on documents within a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The email addresses of groups with edit access to the protected range.
    */
  var groups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The email addresses of users with edit access to the protected range.
    */
  var users: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEditors {
  
  inline def apply(): SchemaEditors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditors]
  }
  
  extension [Self <: SchemaEditors](x: Self) {
    
    inline def setDomainUsersCanEdit(value: Boolean): Self = StObject.set(x, "domainUsersCanEdit", value.asInstanceOf[js.Any])
    
    inline def setDomainUsersCanEditNull: Self = StObject.set(x, "domainUsersCanEdit", null)
    
    inline def setDomainUsersCanEditUndefined: Self = StObject.set(x, "domainUsersCanEdit", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersNull: Self = StObject.set(x, "users", null)
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
