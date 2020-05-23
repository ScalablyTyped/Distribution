package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  /**
    * if true, requires payload validation as part of the scheme and forbids routes from disabling payload auth validation. Defaults to false.
    */
  var payload: js.UndefOr[Boolean] = js.undefined
}

object Payload {
  @scala.inline
  def apply(payload: js.UndefOr[Boolean] = js.undefined): Payload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

