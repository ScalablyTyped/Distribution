package typings.maximMazurokGapiClientAdsensehost

import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typings.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.adsensehost
import typings.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.v4Dot1
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
      
      /** Load AdSense Host API v4.1 */
      def load(name: adsensehost, version: v4Dot1): js.Thenable[Unit] = js.native
      def load(name: adsensehost, version: v4Dot1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adsensehost extends js.Object {
        
        val accounts: AccountsResource = js.native
        
        val adclients: AdclientsResource = js.native
        
        val associationsessions: AssociationsessionsResource = js.native
        
        val customchannels: CustomchannelsResource = js.native
        
        val reports: ReportsResource = js.native
        
        val urlchannels: UrlchannelsResource = js.native
      }
    }
  }
}
