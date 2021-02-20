package typings.maximMazurokGapiClientDeploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.DeploymentsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ManifestsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.OperationsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ResourcesResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.TypesResource
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.deploymentmanager
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
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
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: deploymentmanager, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: deploymentmanager, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
