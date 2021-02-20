package typings.maximMazurokGapiClientBigtableadmin

import typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin.OperationsResource
import typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin.ProjectsResource
import typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.bigtableadmin
import typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object bigtableadmin {
        
        @JSGlobal("gapi.client.bigtableadmin.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.bigtableadmin.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Bigtable Admin API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigtableadmin, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigtableadmin, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
