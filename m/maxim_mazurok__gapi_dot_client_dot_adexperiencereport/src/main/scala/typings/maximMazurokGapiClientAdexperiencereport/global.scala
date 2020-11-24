package typings.maximMazurokGapiClientAdexperiencereport

import typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.SitesResource
import typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.ViolatingSitesResource
import typings.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.adexperiencereport
import typings.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.v1
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
      
      /** Load Ad Experience Report API v1 */
      def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
      def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adexperiencereport extends js.Object {
        
        val sites: SitesResource = js.native
        
        val violatingSites: ViolatingSitesResource = js.native
      }
    }
  }
}
