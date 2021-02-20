package typings.maximMazurokGapiClientAndroidenterprise

import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.DevicesResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EnterprisesResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EntitlementsResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicensesResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicenseusersResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.InstallsResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsfordeviceResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsforuserResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationssettingsResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.PermissionsResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ProductsResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ServiceaccountkeysResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutclustersResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutpagesResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.UsersResource
import typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.WebappsResource
import typings.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.androidenterprise
import typings.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object androidenterprise {
        
        @JSGlobal("gapi.client.androidenterprise.devices")
        @js.native
        val devices: DevicesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.entitlements")
        @js.native
        val entitlements: EntitlementsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.grouplicenses")
        @js.native
        val grouplicenses: GrouplicensesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.grouplicenseusers")
        @js.native
        val grouplicenseusers: GrouplicenseusersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.installs")
        @js.native
        val installs: InstallsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationsfordevice")
        @js.native
        val managedconfigurationsfordevice: ManagedconfigurationsfordeviceResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationsforuser")
        @js.native
        val managedconfigurationsforuser: ManagedconfigurationsforuserResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationssettings")
        @js.native
        val managedconfigurationssettings: ManagedconfigurationssettingsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.permissions")
        @js.native
        val permissions: PermissionsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.products")
        @js.native
        val products: ProductsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.serviceaccountkeys")
        @js.native
        val serviceaccountkeys: ServiceaccountkeysResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.storelayoutclusters")
        @js.native
        val storelayoutclusters: StorelayoutclustersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.storelayoutpages")
        @js.native
        val storelayoutpages: StorelayoutpagesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.users")
        @js.native
        val users: UsersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.webapps")
        @js.native
        val webapps: WebappsResource = js.native
      }
      
      /** Load Google Play EMM API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androidenterprise, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: androidenterprise, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
