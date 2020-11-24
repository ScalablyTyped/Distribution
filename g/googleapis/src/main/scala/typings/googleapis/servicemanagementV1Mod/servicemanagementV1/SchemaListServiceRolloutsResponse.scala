package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListServiceRollouts method.
  */
@js.native
trait SchemaListServiceRolloutsResponse extends js.Object {
  
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of rollout resources.
    */
  var rollouts: js.UndefOr[js.Array[SchemaRollout]] = js.native
}
object SchemaListServiceRolloutsResponse {
  
  @scala.inline
  def apply(): SchemaListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceRolloutsResponse]
  }
  
  @scala.inline
  implicit class SchemaListServiceRolloutsResponseOps[Self <: SchemaListServiceRolloutsResponse] (val x: Self) extends AnyVal {
    
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
    def setRolloutsVarargs(value: SchemaRollout*): Self = this.set("rollouts", js.Array(value :_*))
    
    @scala.inline
    def setRollouts(value: js.Array[SchemaRollout]): Self = this.set("rollouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollouts: Self = this.set("rollouts", js.undefined)
  }
}
