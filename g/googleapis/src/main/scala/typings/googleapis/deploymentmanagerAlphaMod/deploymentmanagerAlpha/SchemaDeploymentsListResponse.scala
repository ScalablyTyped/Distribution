package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of deployments and a page token used
  * to build the next request if the request has been truncated.
  */
@js.native
trait SchemaDeploymentsListResponse extends StObject {
  
  /**
    * Output only. The deployments contained in this response.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.native
  
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDeploymentsListResponse {
  
  @scala.inline
  def apply(): SchemaDeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentsListResponse]
  }
  
  @scala.inline
  implicit class SchemaDeploymentsListResponseMutableBuilder[Self <: SchemaDeploymentsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: js.Array[SchemaDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: SchemaDeployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
