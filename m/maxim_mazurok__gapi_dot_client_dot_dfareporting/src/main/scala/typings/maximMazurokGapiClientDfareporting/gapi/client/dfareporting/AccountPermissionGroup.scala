package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermissionGroup extends StObject {
  
  /** ID of this account permission group. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroup". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this account permission group. */
  var name: js.UndefOr[String] = js.undefined
}
object AccountPermissionGroup {
  
  @scala.inline
  def apply(): AccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroup]
  }
  
  @scala.inline
  implicit class AccountPermissionGroupMutableBuilder[Self <: AccountPermissionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
