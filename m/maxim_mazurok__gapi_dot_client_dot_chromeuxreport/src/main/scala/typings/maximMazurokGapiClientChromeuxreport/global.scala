package typings.maximMazurokGapiClientChromeuxreport

import typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport.RecordsResource
import typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.chromeuxreport
import typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.v1
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
      
      /** Load Chrome UX Report API v1 */
      def load(name: chromeuxreport, version: v1): js.Thenable[Unit] = js.native
      def load(name: chromeuxreport, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object chromeuxreport extends js.Object {
        
        val records: RecordsResource = js.native
      }
    }
  }
}
