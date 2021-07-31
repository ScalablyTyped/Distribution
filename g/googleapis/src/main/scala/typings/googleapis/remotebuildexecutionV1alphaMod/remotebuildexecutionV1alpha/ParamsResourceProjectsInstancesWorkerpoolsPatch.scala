package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesWorkerpoolsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * WorkerPool resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest] = js.undefined
}
object ParamsResourceProjectsInstancesWorkerpoolsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesWorkerpoolsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesWorkerpoolsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesWorkerpoolsPatchMutableBuilder[Self <: ParamsResourceProjectsInstancesWorkerpoolsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
