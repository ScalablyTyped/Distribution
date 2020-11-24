package typings.maximMazurokGapiClientCloudresourcemanager

import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.FoldersResource
import typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OperationsResource
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.cloudresourcemanager
import typings.maximMazurokGapiClientCloudresourcemanager.maximMazurokGapiClientCloudresourcemanagerStrings.v2
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
      
      /** Load Cloud Resource Manager API v2 */
      def load(name: cloudresourcemanager, version: v2): js.Thenable[Unit] = js.native
      def load(name: cloudresourcemanager, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudresourcemanager extends js.Object {
        
        val folders: FoldersResource = js.native
        
        val operations: OperationsResource = js.native
      }
    }
  }
}
