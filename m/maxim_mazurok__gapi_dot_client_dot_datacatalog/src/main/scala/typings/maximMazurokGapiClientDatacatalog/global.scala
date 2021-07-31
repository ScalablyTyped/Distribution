package typings.maximMazurokGapiClientDatacatalog

import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.CatalogResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.EntriesResource
import typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.ProjectsResource
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.datacatalog
import typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
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
      @scala.inline
      def load(name: datacatalog, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: datacatalog, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
