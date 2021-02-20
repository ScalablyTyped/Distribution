package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The editors of a protected range.
  */
@js.native
trait SchemaEditors extends StObject {
  
  /**
    * True if anyone in the document&#39;s domain has edit access to the
    * protected range.  Domain protection is only supported on documents within
    * a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * The email addresses of groups with edit access to the protected range.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The email addresses of users with edit access to the protected range.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}
object SchemaEditors {
  
  @scala.inline
  def apply(): SchemaEditors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditors]
  }
  
  @scala.inline
  implicit class SchemaEditorsMutableBuilder[Self <: SchemaEditors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainUsersCanEdit(value: Boolean): Self = StObject.set(x, "domainUsersCanEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUsersCanEditUndefined: Self = StObject.set(x, "domainUsersCanEdit", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
