package typings.maximMazurokGapiClientChromeuxreport

import typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport.RecordsResource
import typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.chromeuxreport
import typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object chromeuxreport {
        
        @JSGlobal("gapi.client.chromeuxreport.records")
        @js.native
        val records: RecordsResource = js.native
      }
      
      /** Load Chrome UX Report API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: chromeuxreport, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: chromeuxreport, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
