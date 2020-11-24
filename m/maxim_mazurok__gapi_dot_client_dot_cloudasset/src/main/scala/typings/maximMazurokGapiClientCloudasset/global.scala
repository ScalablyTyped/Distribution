package typings.maximMazurokGapiClientCloudasset

import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.FeedsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.OperationsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.V1Resource
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.cloudasset
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.v1
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
      
      /** Load Cloud Asset API v1 */
      def load(name: cloudasset, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudasset, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudasset extends js.Object {
        
        val feeds: FeedsResource = js.native
        
        val operations: OperationsResource = js.native
        
        val v1: V1Resource = js.native
      }
    }
  }
}
