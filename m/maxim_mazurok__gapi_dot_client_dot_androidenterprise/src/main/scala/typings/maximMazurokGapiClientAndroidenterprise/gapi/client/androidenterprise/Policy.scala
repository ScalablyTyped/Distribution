package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends js.Object {
  
  /**
    * The auto-update policy for apps installed on the device. "choiceToTheUser" allows the device's user to configure the app update policy. "always" enables auto updates. "never"
    * disables auto updates. "wifiOnly" enables auto updates only when the device is connected to wifi.
    */
  var autoUpdatePolicy: js.UndefOr[String] = js.native
  
  /** Whether the device reports app states to the EMM. The default value is "deviceReportDisabled". */
  var deviceReportPolicy: js.UndefOr[String] = js.native
  
  /** The maintenance window defining when apps running in the foreground should be updated. */
  var maintenanceWindow: js.UndefOr[MaintenanceWindow] = js.native
  
  /**
    * The availability granted to the device for the specified products. "all" gives the device access to all products, regardless of approval status. "all" does not enable automatic
    * visibility of "alpha" or "beta" tracks. "whitelist" grants the device access the products specified in productPolicy[]. Only products that are approved or products that were
    * previously approved (products with revoked approval) by the enterprise can be whitelisted. If no value is provided, the availability set at the user level is applied by default.
    */
  var productAvailabilityPolicy: js.UndefOr[String] = js.native
  
  /** The list of product policies. The productAvailabilityPolicy needs to be set to WHITELIST or ALL for the product policies to be applied. */
  var productPolicy: js.UndefOr[js.Array[ProductPolicy]] = js.native
}
object Policy {
  
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdatePolicy(value: String): Self = this.set("autoUpdatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdatePolicy: Self = this.set("autoUpdatePolicy", js.undefined)
    
    @scala.inline
    def setDeviceReportPolicy(value: String): Self = this.set("deviceReportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceReportPolicy: Self = this.set("deviceReportPolicy", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: MaintenanceWindow): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    
    @scala.inline
    def setProductAvailabilityPolicy(value: String): Self = this.set("productAvailabilityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductAvailabilityPolicy: Self = this.set("productAvailabilityPolicy", js.undefined)
    
    @scala.inline
    def setProductPolicyVarargs(value: ProductPolicy*): Self = this.set("productPolicy", js.Array(value :_*))
    
    @scala.inline
    def setProductPolicy(value: js.Array[ProductPolicy]): Self = this.set("productPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductPolicy: Self = this.set("productPolicy", js.undefined)
  }
}
