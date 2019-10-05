package typings.jose.joseMod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions[komplet] extends js.Object {
  var complete: js.UndefOr[komplet] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply[komplet](complete: komplet = null): DecodeOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptions[komplet]]
  }
}

