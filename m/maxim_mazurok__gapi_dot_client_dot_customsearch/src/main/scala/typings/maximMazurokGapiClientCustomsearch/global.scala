package typings.maximMazurokGapiClientCustomsearch

import typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch.CseResource
import typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.customsearch
import typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object customsearch {
        
        @JSGlobal("gapi.client.customsearch.cse")
        @js.native
        val cse: CseResource = js.native
      }
      
      /** Load Custom Search API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: customsearch, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: customsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
