package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPermission extends StObject {
  
  /** An opaque string uniquely identifying the permission. */
  var permissionId: js.UndefOr[String] = js.native
  
  /** Whether the permission has been accepted or not. */
  var state: js.UndefOr[String] = js.native
}
object ProductPermission {
  
  @scala.inline
  def apply(): ProductPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPermission]
  }
  
  @scala.inline
  implicit class ProductPermissionMutableBuilder[Self <: ProductPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
