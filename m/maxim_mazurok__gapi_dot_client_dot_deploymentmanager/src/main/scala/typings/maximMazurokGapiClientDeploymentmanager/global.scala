package typings.maximMazurokGapiClientDeploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.DeploymentsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ManifestsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.OperationsResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.ResourcesResource
import typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager.TypesResource
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.deploymentmanager
import typings.maximMazurokGapiClientDeploymentmanager.maximMazurokGapiClientDeploymentmanagerStrings.v2
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
      
      /** Load Cloud Deployment Manager V2 API v2 */
      def load(name: deploymentmanager, version: v2): js.Thenable[Unit] = js.native
      def load(name: deploymentmanager, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object deploymentmanager extends js.Object {
        
        val deployments: DeploymentsResource = js.native
        
        val manifests: ManifestsResource = js.native
        
        val operations: OperationsResource = js.native
        
        val resources: ResourcesResource = js.native
        
        val types: TypesResource = js.native
      }
    }
  }
}
