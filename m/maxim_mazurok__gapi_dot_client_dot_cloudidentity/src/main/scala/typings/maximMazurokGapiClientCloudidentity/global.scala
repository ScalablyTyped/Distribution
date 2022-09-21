package typings.maximMazurokGapiClientCloudidentity

import typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.CustomersResource
import typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.DevicesResource
import typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.GroupsResource
import typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.cloudidentity
import typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudidentity {
        
        @JSGlobal("gapi.client.cloudidentity.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.cloudidentity.devices")
        @js.native
        val devices: DevicesResource = js.native
        
        @JSGlobal("gapi.client.cloudidentity.groups")
        @js.native
        val groups: GroupsResource = js.native
      }
      
      /** Load Cloud Identity API v1 */
      inline def load(name: cloudidentity, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: cloudidentity, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
