package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a long running operation, which conforms to OpenService API.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1Operation extends js.Object {
  /**
    * Optional description of the Operation state.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The state of the operation. Valid values are: &quot;in progress&quot;,
    * &quot;succeeded&quot;, and &quot;failed&quot;.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1Operation {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Operation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1OperationOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1Operation] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

