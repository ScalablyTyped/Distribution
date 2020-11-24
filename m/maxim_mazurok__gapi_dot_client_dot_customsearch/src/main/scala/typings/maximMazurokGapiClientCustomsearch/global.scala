package typings.maximMazurokGapiClientCustomsearch

import typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch.CseResource
import typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.customsearch
import typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.v1
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
      
      /** Load Custom Search API v1 */
      def load(name: customsearch, version: v1): js.Thenable[Unit] = js.native
      def load(name: customsearch, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object customsearch extends js.Object {
        
        val cse: CseResource = js.native
      }
    }
  }
}
