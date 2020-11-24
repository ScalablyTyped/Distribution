package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of deployments and a page token used
  * to build the next request if the request has been truncated.
  */
@js.native
trait SchemaDeploymentsListResponse extends js.Object {
  
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
  implicit class SchemaDeploymentsListResponseOps[Self <: SchemaDeploymentsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentsVarargs(value: SchemaDeployment*): Self = this.set("deployments", js.Array(value :_*))
    
    @scala.inline
    def setDeployments(value: js.Array[SchemaDeployment]): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployments: Self = this.set("deployments", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
