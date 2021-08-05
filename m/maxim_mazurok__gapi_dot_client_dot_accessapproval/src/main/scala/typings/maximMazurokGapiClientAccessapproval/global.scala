package typings.maximMazurokGapiClientAccessapproval

import typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.FoldersResource
import typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.OrganizationsResource
import typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.ProjectsResource
import typings.maximMazurokGapiClientAccessapproval.maximMazurokGapiClientAccessapprovalStrings.accessapproval
import typings.maximMazurokGapiClientAccessapproval.maximMazurokGapiClientAccessapprovalStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object accessapproval {
        
        @JSGlobal("gapi.client.accessapproval.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.accessapproval.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.accessapproval.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Access Approval API v1 */
      inline def load(name: accessapproval, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: accessapproval, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
