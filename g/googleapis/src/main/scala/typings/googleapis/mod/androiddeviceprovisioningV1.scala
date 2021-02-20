package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androiddeviceprovisioningV1 {
  
  /**
    * Android Device Provisioning Partner API
    *
    * Automates Android zero-touch enrollment for device resellers, customers,
    * and EMMs.
    *
    * @example
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * @namespace androiddeviceprovisioning
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Androiddeviceprovisioning
    */
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Androiddeviceprovisioning")
  @js.native
  class Androiddeviceprovisioning protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.Androiddeviceprovisioning {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Customers")
  @js.native
  class ResourceCustomers protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Customers$Configurations")
  @js.native
  class ResourceCustomersConfigurations protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersConfigurations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Customers$Devices")
  @js.native
  class ResourceCustomersDevices protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersDevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Customers$Dpcs")
  @js.native
  class ResourceCustomersDpcs protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersDpcs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Partners")
  @js.native
  class ResourcePartners protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartners {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Partners$Customers")
  @js.native
  class ResourcePartnersCustomers protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersCustomers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Partners$Devices")
  @js.native
  class ResourcePartnersDevices protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersDevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Partners$Vendors")
  @js.native
  class ResourcePartnersVendors protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersVendors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androiddeviceprovisioning_v1.Resource$Partners$Vendors$Customers")
  @js.native
  class ResourcePartnersVendorsCustomers protected ()
    extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersVendorsCustomers {
    def this(context: APIRequestContext) = this()
  }
}
