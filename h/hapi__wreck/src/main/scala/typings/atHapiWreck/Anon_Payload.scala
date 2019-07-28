package typings.atHapiWreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: js.UndefOr[js.Any] = js.undefined
}

object Anon_Payload {
  @scala.inline
  def apply(payload: js.Any = null): Anon_Payload = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_Payload]
  }
}

