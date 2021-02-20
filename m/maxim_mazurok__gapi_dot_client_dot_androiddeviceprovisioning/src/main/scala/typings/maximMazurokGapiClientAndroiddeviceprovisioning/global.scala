package typings.maximMazurokGapiClientAndroiddeviceprovisioning

import typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.CustomersResource
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.OperationsResource
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.PartnersResource
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.androiddeviceprovisioning
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object androiddeviceprovisioning {
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.partners")
        @js.native
        val partners: PartnersResource = js.native
      }
      
      /** Load Android Device Provisioning Partner API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androiddeviceprovisioning, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androiddeviceprovisioning, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
