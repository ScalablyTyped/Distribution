package typings.maximMazurokGapiClientAnalyticsadmin

import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountSummariesResource
import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountsResource
import typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.PropertiesResource
import typings.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.analyticsadmin
import typings.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.v1alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
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
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsadmin, version: v1alpha): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsadmin, version: v1alpha, callback: js.Function0[_]): Unit = js.native
    }
  }
}
