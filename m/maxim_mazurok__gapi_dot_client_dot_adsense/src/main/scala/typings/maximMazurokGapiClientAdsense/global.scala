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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load AdSense Management API v1.4 */
      def load(name: adsense, version: v1Dot4): js.Thenable[Unit] = js.native
      def load(name: adsense, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adsense extends js.Object {
        
        val accounts: AccountsResource = js.native
        
        val adclients: AdclientsResource = js.native
        
        val adunits: AdunitsResource = js.native
        
        val alerts: AlertsResource = js.native
        
        val customchannels: CustomchannelsResource = js.native
        
        val metadata: MetadataResource = js.native
        
        val payments: PaymentsResource = js.native
        
        val reports: ReportsResource = js.native
        
        val savedadstyles: SavedadstylesResource = js.native
        
        val urlchannels: UrlchannelsResource = js.native
      }
    }
  }
}
