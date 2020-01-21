package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRefundReason extends js.Object {
  var description: js.UndefOr[String] = js.native
  var reasonCode: js.UndefOr[String] = js.native
}

object SchemaRefundReason {
  @scala.inline
  def apply(description: String = null, reasonCode: String = null): SchemaRefundReason = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRefundReason]
  }
}

