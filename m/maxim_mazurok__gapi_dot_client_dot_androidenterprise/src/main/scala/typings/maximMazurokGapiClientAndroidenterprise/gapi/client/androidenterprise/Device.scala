package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /** The Google Play Services Android ID for the device encoded as a lowercase hex string. For example, "123456789abcdef0". */
  var androidId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the extent to which the device is controlled by a managed Google Play EMM in various deployment configurations. Possible values include: - "managedDevice", a device that
    * has the EMM's device policy controller (DPC) as the device owner. - "managedProfile", a device that has a profile managed by the DPC (DPC is profile owner) in addition to a
    * separate, personal profile that is unavailable to the DPC. - "containerApp", no longer used (deprecated). - "unmanagedProfile", a device that has been allowed (by the domain's
    * admin, using the Admin Console to enable the privilege) to use managed Google Play, but the profile is itself not owned by a DPC.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /** The policy enforced on the device. */
  var policy: js.UndefOr[Policy] = js.undefined
  
  /** The device report updated with the latest app states. */
  var report: js.UndefOr[DeviceReport] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    inline def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setReport(value: DeviceReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
  }
}
