package typings.maximMazurokGapiClientCloudasset

import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.FeedsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.OperationsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.V1Resource
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.cloudasset
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
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
      @scala.inline
      def load(name: cloudasset, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: cloudasset, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
