package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCancelTestOrderByCustomerRequest extends js.Object {
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrdersCancelTestOrderByCustomerRequest {
  @scala.inline
  def apply(reason: String = null): SchemaOrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerRequest]
  }
}

