package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewPermissionsEvent extends StObject {
  
  /** The set of permissions that the enterprise admin has already approved for this application. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var approvedPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var requestedPermissions: js.UndefOr[js.Array[String]] = js.undefined
}
object NewPermissionsEvent {
  
  inline def apply(): NewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewPermissionsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewPermissionsEvent] (val x: Self) extends AnyVal {
    
    inline def setApprovedPermissions(value: js.Array[String]): Self = StObject.set(x, "approvedPermissions", value.asInstanceOf[js.Any])
    
    inline def setApprovedPermissionsUndefined: Self = StObject.set(x, "approvedPermissions", js.undefined)
    
    inline def setApprovedPermissionsVarargs(value: String*): Self = StObject.set(x, "approvedPermissions", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRequestedPermissions(value: js.Array[String]): Self = StObject.set(x, "requestedPermissions", value.asInstanceOf[js.Any])
    
    inline def setRequestedPermissionsUndefined: Self = StObject.set(x, "requestedPermissions", js.undefined)
    
    inline def setRequestedPermissionsVarargs(value: String*): Self = StObject.set(x, "requestedPermissions", js.Array(value*))
  }
}
