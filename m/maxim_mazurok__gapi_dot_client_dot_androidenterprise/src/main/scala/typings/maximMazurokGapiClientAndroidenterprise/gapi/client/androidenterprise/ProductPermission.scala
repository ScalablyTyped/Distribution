package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPermission extends js.Object {
  
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
  implicit class ProductPermissionOps[Self <: ProductPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
