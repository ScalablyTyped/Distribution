package typings.maximMazurokGapiClientAdsense

import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.AccountsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.AdclientsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.AdunitsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.AlertsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.CustomchannelsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.MetadataResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.PaymentsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.ReportsResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.SavedadstylesResource
import typings.maximMazurokGapiClientAdsense.gapi.client.adsense.UrlchannelsResource
import typings.maximMazurokGapiClientAdsense.maximMazurokGapiClientAdsenseStrings.adsense
import typings.maximMazurokGapiClientAdsense.maximMazurokGapiClientAdsenseStrings.v1Dot4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object adsense {
        
        @JSGlobal("gapi.client.adsense.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adsense.adclients")
        @js.native
        val adclients: AdclientsResource = js.native
        
        @JSGlobal("gapi.client.adsense.adunits")
        @js.native
        val adunits: AdunitsResource = js.native
        
        @JSGlobal("gapi.client.adsense.alerts")
        @js.native
        val alerts: AlertsResource = js.native
        
        @JSGlobal("gapi.client.adsense.customchannels")
        @js.native
        val customchannels: CustomchannelsResource = js.native
        
        @JSGlobal("gapi.client.adsense.metadata")
        @js.native
        val metadata: MetadataResource = js.native
        
        @JSGlobal("gapi.client.adsense.payments")
        @js.native
        val payments: PaymentsResource = js.native
        
        @JSGlobal("gapi.client.adsense.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.adsense.savedadstyles")
        @js.native
        val savedadstyles: SavedadstylesResource = js.native
        
        @JSGlobal("gapi.client.adsense.urlchannels")
        @js.native
        val urlchannels: UrlchannelsResource = js.native
      }
      
      /** Load AdSense Management API v1.4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adsense, version: v1Dot4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adsense, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
    }
  }
}
