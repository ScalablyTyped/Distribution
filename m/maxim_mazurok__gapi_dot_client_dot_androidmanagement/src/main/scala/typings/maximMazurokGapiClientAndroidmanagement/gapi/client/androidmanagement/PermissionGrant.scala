package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionGrant extends StObject {
  
  /** The Android permission or group, e.g. android.permission.READ_CALENDAR or android.permission_group.CALENDAR. */
  var permission: js.UndefOr[String] = js.native
  
  /** The policy for granting the permission. */
  var policy: js.UndefOr[String] = js.native
}
object PermissionGrant {
  
  @scala.inline
  def apply(): PermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrant]
  }
  
  @scala.inline
  implicit class PermissionGrantMutableBuilder[Self <: PermissionGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
