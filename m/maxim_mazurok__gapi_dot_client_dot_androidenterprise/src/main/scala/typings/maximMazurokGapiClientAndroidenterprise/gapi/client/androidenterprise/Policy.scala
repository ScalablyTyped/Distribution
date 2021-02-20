package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends StObject {
  
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
  implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdatePolicy(value: String): Self = StObject.set(x, "autoUpdatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdatePolicyUndefined: Self = StObject.set(x, "autoUpdatePolicy", js.undefined)
    
    @scala.inline
    def setDeviceReportPolicy(value: String): Self = StObject.set(x, "deviceReportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceReportPolicyUndefined: Self = StObject.set(x, "deviceReportPolicy", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: MaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    @scala.inline
    def setProductAvailabilityPolicy(value: String): Self = StObject.set(x, "productAvailabilityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAvailabilityPolicyUndefined: Self = StObject.set(x, "productAvailabilityPolicy", js.undefined)
    
    @scala.inline
    def setProductPolicy(value: js.Array[ProductPolicy]): Self = StObject.set(x, "productPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductPolicyUndefined: Self = StObject.set(x, "productPolicy", js.undefined)
    
    @scala.inline
    def setProductPolicyVarargs(value: ProductPolicy*): Self = StObject.set(x, "productPolicy", js.Array(value :_*))
  }
}
