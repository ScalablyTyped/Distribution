package typings.maximMazurokGapiClientBigtableadmin

import typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin.OperationsResource
import typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin.ProjectsResource
import typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.bigtableadmin
import typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.v2
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
      
      /** Load Cloud Bigtable Admin API v2 */
      def load(name: bigtableadmin, version: v2): js.Thenable[Unit] = js.native
      def load(name: bigtableadmin, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object bigtableadmin extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
