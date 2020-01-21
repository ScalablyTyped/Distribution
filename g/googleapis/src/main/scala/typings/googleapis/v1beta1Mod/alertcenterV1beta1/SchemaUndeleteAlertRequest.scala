package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to undelete a specific alert that was marked for deletion.
  */
@js.native
trait SchemaUndeleteAlertRequest extends js.Object {
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert is associated with. Inferred from the caller
    * identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
}

object SchemaUndeleteAlertRequest {
  @scala.inline
  def apply(customerId: String = null): SchemaUndeleteAlertRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUndeleteAlertRequest]
  }
}

