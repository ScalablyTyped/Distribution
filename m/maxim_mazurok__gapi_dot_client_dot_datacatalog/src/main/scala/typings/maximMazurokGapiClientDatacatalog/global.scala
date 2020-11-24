package typings.maximMazurokGapiClientDatacatalog

import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.CatalogResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.EntriesResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.ProjectsResource
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.datacatalog
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.v1beta1
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
      
      /** Load Google Cloud Data Catalog API v1beta1 */
      def load(name: datacatalog, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: datacatalog, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object datacatalog extends js.Object {
        
        val catalog: CatalogResource = js.native
        
        val entries: EntriesResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
