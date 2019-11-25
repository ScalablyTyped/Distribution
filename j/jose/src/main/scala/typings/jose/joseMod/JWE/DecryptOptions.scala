package typings.jose.joseMod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var complete: js.UndefOr[komplet] = js.undefined
  var crit: js.UndefOr[js.Array[String]] = js.undefined
}

object DecryptOptions {
  @scala.inline
  def apply[komplet](algorithms: js.Array[String] = null, complete: komplet = null, crit: js.Array[String] = null): DecryptOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (crit != null) __obj.updateDynamic("crit")(crit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptions[komplet]]
  }
}

