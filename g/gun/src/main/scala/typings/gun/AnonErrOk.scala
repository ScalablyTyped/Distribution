package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrOk extends js.Object {
  var err: js.UndefOr[scala.Nothing] = js.undefined
  var ok: String
}

object AnonErrOk {
  @scala.inline
  def apply(ok: String, err: js.UndefOr[scala.Nothing] = js.undefined): AnonErrOk = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    if (!js.isUndefined(err)) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrOk]
  }
}

