package typings.maximMazurokGapiClientArea120tables

import typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables.TablesResource
import typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables.WorkspacesResource
import typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.area120tables
import typings.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.v1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object area120tables {
        
        @JSGlobal("gapi.client.area120tables.tables")
        @js.native
        val tables: TablesResource = js.native
        
        @JSGlobal("gapi.client.area120tables.workspaces")
        @js.native
        val workspaces: WorkspacesResource = js.native
      }
      
      /** Load Area120 Tables API v1alpha1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: area120tables, version: v1alpha1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: area120tables, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
