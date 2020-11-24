package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response that returns all Type Providers supported by Deployment Manager
  */
@js.native
trait SchemaTypeProvidersListResponse extends js.Object {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Output only. A list of resource type providers supported by Deployment
    * Manager.
    */
  var typeProviders: js.UndefOr[js.Array[SchemaTypeProvider]] = js.native
}
object SchemaTypeProvidersListResponse {
  
  @scala.inline
  def apply(): SchemaTypeProvidersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListResponse]
  }
  
  @scala.inline
  implicit class SchemaTypeProvidersListResponseOps[Self <: SchemaTypeProvidersListResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTypeProvidersVarargs(value: SchemaTypeProvider*): Self = this.set("typeProviders", js.Array(value :_*))
    
    @scala.inline
    def setTypeProviders(value: js.Array[SchemaTypeProvider]): Self = this.set("typeProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeProviders: Self = this.set("typeProviders", js.undefined)
  }
}
