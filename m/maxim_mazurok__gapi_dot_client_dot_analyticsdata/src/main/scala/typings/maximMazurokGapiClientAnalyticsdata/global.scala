package typings.maximMazurokGapiClientAnalyticsdata

import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.PropertiesResource
import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.V1alphaResource
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.analyticsdata
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.v1alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object analyticsdata {
        
        @JSGlobal("gapi.client.analyticsdata.properties")
        @js.native
        val properties: PropertiesResource = js.native
        
        @JSGlobal("gapi.client.analyticsdata.v1alpha")
        @js.native
        val v1alpha: V1alphaResource = js.native
      }
      
      /** Load Google Analytics Data API v1alpha */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsdata, version: v1alpha): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analyticsdata, version: v1alpha, callback: js.Function0[_]): Unit = js.native
    }
  }
}
