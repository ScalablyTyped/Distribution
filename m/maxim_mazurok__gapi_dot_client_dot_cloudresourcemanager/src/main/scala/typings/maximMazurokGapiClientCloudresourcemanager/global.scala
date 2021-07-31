package typings.maximMazurokGapiClientCloudresourcemanager

import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.FoldersResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OperationsResource
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.cloudresourcemanager
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudresourcemanager {
        
        @JSGlobal("gapi.client.cloudresourcemanager.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Cloud Resource Manager API v2 */
      @scala.inline
      def load(name: cloudresourcemanager, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: cloudresourcemanager, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
