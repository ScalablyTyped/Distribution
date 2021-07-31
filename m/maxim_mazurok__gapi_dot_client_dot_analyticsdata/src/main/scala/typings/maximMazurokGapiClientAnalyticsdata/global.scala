package typings.maximMazurokGapiClientAnalyticsdata

import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.PropertiesResource
import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.V1alphaResource
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.analyticsdata
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.v1alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object analyticsdata {
        
        @JSGlobal("gapi.client.analyticsdata.properties")
        @js.native
        val properties: PropertiesResource = js.native
        
        @JSGlobal("gapi.client.analyticsdata.v1alpha")
        @js.native
        val v1alpha: V1alphaResource = js.native
      }
      
      /** Load Google Analytics Data API v1alpha */
      @scala.inline
      def load(name: analyticsdata, version: v1alpha): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: analyticsdata, version: v1alpha, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
