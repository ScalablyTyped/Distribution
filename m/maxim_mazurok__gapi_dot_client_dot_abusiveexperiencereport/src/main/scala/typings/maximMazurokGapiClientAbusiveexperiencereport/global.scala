package typings.maximMazurokGapiClientAbusiveexperiencereport

import typings.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport.SitesResource
import typings.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport.ViolatingSitesResource
import typings.maximMazurokGapiClientAbusiveexperiencereport.maximMazurokGapiClientAbusiveexperiencereportStrings.abusiveexperiencereport
import typings.maximMazurokGapiClientAbusiveexperiencereport.maximMazurokGapiClientAbusiveexperiencereportStrings.v1
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
      
      /** Load Abusive Experience Report API v1 */
      def load(name: abusiveexperiencereport, version: v1): js.Thenable[Unit] = js.native
      def load(name: abusiveexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object abusiveexperiencereport extends js.Object {
        
        val sites: SitesResource = js.native
        
        val violatingSites: ViolatingSitesResource = js.native
      }
    }
  }
}
