package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for EnableService method.
  */
@js.native
trait SchemaEnableServiceRequest extends js.Object {
  /**
    * The identity of consumer resource which service enablement will be
    * applied to.  The Google Service Management implementation accepts the
    * following forms: - &quot;project:&lt;project_id&gt;&quot;  Note: this is
    * made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.native
}

object SchemaEnableServiceRequest {
  @scala.inline
  def apply(consumerId: String = null): SchemaEnableServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (consumerId != null) __obj.updateDynamic("consumerId")(consumerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnableServiceRequest]
  }
}

