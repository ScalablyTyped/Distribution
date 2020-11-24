package typings.maximMazurokGapiClientArea120tables

import typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables.TablesResource
import typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables.WorkspacesResource
import typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.area120tables
import typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.v1alpha1
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
      
      /** Load Area120 Tables API v1alpha1 */
      def load(name: area120tables, version: v1alpha1): js.Thenable[Unit] = js.native
      def load(name: area120tables, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object area120tables extends js.Object {
        
        val tables: TablesResource = js.native
        
        val workspaces: WorkspacesResource = js.native
      }
    }
  }
}
