package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallFailureEvent extends js.Object {
  
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** Additional details on the failure if applicable. */
  var failureDetails: js.UndefOr[String] = js.native
  
  /** The reason for the installation failure. This field will always be present. */
  var failureReason: js.UndefOr[String] = js.native
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the install failure event occured. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
  
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.native
}
object InstallFailureEvent {
  
  @scala.inline
  def apply(): InstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallFailureEvent]
  }
  
  @scala.inline
  implicit class InstallFailureEventOps[Self <: InstallFailureEvent] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: String): Self = this.set("failureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDetails: Self = this.set("failureDetails", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
