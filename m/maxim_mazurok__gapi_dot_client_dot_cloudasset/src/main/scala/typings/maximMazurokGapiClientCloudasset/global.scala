package typings.maximMazurokGapiClientCloudasset

import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.FeedsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.OperationsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.V1Resource
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.cloudasset
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudasset {
        
        @JSGlobal("gapi.client.cloudasset.feeds")
        @js.native
        val feeds: FeedsResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Cloud Asset API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudasset, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudasset, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
