package typings.maximMazurokGapiClientDatacatalog

import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.CatalogResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.EntriesResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.ProjectsResource
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.datacatalog
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object datacatalog {
        
        @JSGlobal("gapi.client.datacatalog.catalog")
        @js.native
        val catalog: CatalogResource = js.native
        
        @JSGlobal("gapi.client.datacatalog.entries")
        @js.native
        val entries: EntriesResource = js.native
        
        @JSGlobal("gapi.client.datacatalog.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Google Cloud Data Catalog API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datacatalog, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datacatalog, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
