package typings.maximMazurokGapiClientAnalyticsdata

import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.PropertiesResource
import typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.V1alphaResource
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.analyticsdata
import typings.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.v1alpha
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
      
      /** Load Google Analytics Data API v1alpha */
      def load(name: analyticsdata, version: v1alpha): js.Thenable[Unit] = js.native
      def load(name: analyticsdata, version: v1alpha, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object analyticsdata extends js.Object {
        
        val properties: PropertiesResource = js.native
        
        val v1alpha: V1alphaResource = js.native
      }
    }
  }
}
