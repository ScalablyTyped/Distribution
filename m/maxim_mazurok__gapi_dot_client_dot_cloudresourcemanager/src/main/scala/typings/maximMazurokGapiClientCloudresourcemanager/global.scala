package typings.maximMazurokGapiClientCloudresourcemanager

import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.FoldersResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OperationsResource
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.cloudresourcemanager
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudresourcemanager {
        
        @JSGlobal("gapi.client.cloudresourcemanager.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.cloudresourcemanager.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Cloud Resource Manager API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudresourcemanager, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudresourcemanager, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
