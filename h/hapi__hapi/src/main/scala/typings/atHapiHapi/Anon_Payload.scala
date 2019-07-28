package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  /**
    * if true, requires payload validation as part of the scheme and forbids routes from disabling payload auth validation. Defaults to false.
    */
  var payload: js.UndefOr[Boolean] = js.undefined
}

object Anon_Payload {
  @scala.inline
  def apply(payload: js.UndefOr[Boolean] = js.undefined): Anon_Payload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_Payload]
  }
}

