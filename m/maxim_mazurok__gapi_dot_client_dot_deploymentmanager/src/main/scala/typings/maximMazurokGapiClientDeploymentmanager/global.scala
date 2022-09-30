package typings.maximMazurokGapiClientDeploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.DeploymentsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ManifestsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.OperationsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ResourcesResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.TypesResource
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.deploymentmanager
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.v2
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
      
      object deploymentmanager {
        
        @JSGlobal("gapi.client.deploymentmanager.deployments")
        @js.native
        val deployments: DeploymentsResource = js.native
        
        @JSGlobal("gapi.client.deploymentmanager.manifests")
        @js.native
        val manifests: ManifestsResource = js.native
        
        @JSGlobal("gapi.client.deploymentmanager.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.deploymentmanager.resources")
        @js.native
        val resources: ResourcesResource = js.native
        
        @JSGlobal("gapi.client.deploymentmanager.types")
        @js.native
        val types: TypesResource = js.native
      }
      
      /** Load Cloud Deployment Manager V2 API v2 */
      inline def load(name: deploymentmanager, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: deploymentmanager, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
