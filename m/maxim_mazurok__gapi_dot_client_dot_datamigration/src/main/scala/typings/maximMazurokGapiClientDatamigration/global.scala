package typings.maximMazurokGapiClientDatamigration

import typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration.ProjectsResource
import typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.datamigration
import typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object datamigration {
        
        @JSGlobal("gapi.client.datamigration.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Database Migration API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datamigration, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datamigration, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
