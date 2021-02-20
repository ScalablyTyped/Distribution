package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account Permission Group List Response
  */
@js.native
trait SchemaAccountPermissionGroupsListResponse extends StObject {
  
  /**
    * Account permission group collection.
    */
  var accountPermissionGroups: js.UndefOr[js.Array[SchemaAccountPermissionGroup]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccountPermissionGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaAccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountPermissionGroupsListResponseMutableBuilder[Self <: SchemaAccountPermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPermissionGroups(value: js.Array[SchemaAccountPermissionGroup]): Self = StObject.set(x, "accountPermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPermissionGroupsUndefined: Self = StObject.set(x, "accountPermissionGroups", js.undefined)
    
    @scala.inline
    def setAccountPermissionGroupsVarargs(value: SchemaAccountPermissionGroup*): Self = StObject.set(x, "accountPermissionGroups", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
