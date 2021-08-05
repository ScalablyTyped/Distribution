package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGrant extends StObject {
  
  /** The Android permission or group, e.g. android.permission.READ_CALENDAR or android.permission_group.CALENDAR. */
  var permission: js.UndefOr[String] = js.undefined
  
  /** The policy for granting the permission. */
  var policy: js.UndefOr[String] = js.undefined
}
object PermissionGrant {
  
  inline def apply(): PermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrant]
  }
  
  extension [Self <: PermissionGrant](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
