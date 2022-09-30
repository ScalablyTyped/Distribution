package typings.maximMazurokGapiClientCloudasset

import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.AssetsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.EffectiveIamPoliciesResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.FeedsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.OperationsResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.SavedQueriesResource
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.V1Resource
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.cloudasset
import typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.v1
import typings.std.PromiseLike
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
        
        @JSGlobal("gapi.client.cloudasset.assets")
        @js.native
        val assets: AssetsResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.effectiveIamPolicies")
        @js.native
        val effectiveIamPolicies: EffectiveIamPoliciesResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.feeds")
        @js.native
        val feeds: FeedsResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.savedQueries")
        @js.native
        val savedQueries: SavedQueriesResource = js.native
        
        @JSGlobal("gapi.client.cloudasset.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Cloud Asset API v1 */
      inline def load(name: cloudasset, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: cloudasset, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
