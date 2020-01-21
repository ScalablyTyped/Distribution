package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  /**
    * if true, requires payload validation as part of the scheme and forbids routes from disabling payload auth validation. Defaults to false.
    */
  var payload: js.UndefOr[Boolean] = js.undefined
}

object AnonPayload {
  @scala.inline
  def apply(payload: js.UndefOr[Boolean] = js.undefined): AnonPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

