package typings.maximMazurokGapiClientAnalyticsadmin

import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountSummariesResource
import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountsResource
import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.PropertiesResource
import typings.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.analyticsadmin
import typings.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.v1alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object analyticsadmin {
        
        @JSGlobal("gapi.client.analyticsadmin.accountSummaries")
        @js.native
        val accountSummaries: AccountSummariesResource = js.native
        
        @JSGlobal("gapi.client.analyticsadmin.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.analyticsadmin.properties")
        @js.native
        val properties: PropertiesResource = js.native
      }
      
      /** Load Google Analytics Admin API v1alpha */
      inline def load(name: analyticsadmin, version: v1alpha): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: analyticsadmin, version: v1alpha, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
