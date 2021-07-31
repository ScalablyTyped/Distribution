package typings.maximMazurokGapiClientDatamigration

import typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration.ProjectsResource
import typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.datamigration
import typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object datamigration {
        
        @JSGlobal("gapi.client.datamigration.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Database Migration API v1beta1 */
      @scala.inline
      def load(name: datamigration, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: datamigration, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
