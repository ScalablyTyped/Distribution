package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a long running operation, which conforms to OpenService API.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Operation extends js.Object {
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

object SchemaGoogleCloudServicebrokerV1beta1Operation {
  @scala.inline
  def apply(description: String = null, state: String = null): SchemaGoogleCloudServicebrokerV1beta1Operation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Operation]
  }
}

