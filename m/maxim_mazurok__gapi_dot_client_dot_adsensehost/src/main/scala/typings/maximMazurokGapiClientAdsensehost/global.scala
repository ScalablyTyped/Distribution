package typings.maximMazurokGapiClientAdsensehost

import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typings.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.adsensehost
import typings.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.v4Dot1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object adsensehost {
        
        @JSGlobal("gapi.client.adsensehost.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.adclients")
        @js.native
        val adclients: AdclientsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.associationsessions")
        @js.native
        val associationsessions: AssociationsessionsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.customchannels")
        @js.native
        val customchannels: CustomchannelsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.urlchannels")
        @js.native
        val urlchannels: UrlchannelsResource = js.native
      }
      
      /** Load AdSense Host API v4.1 */
      @scala.inline
      def load(name: adsensehost, version: v4Dot1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: adsensehost, version: v4Dot1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
