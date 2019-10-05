package typings.jose.joseMod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var complete: js.UndefOr[komplet] = js.undefined
  var crit: js.UndefOr[js.Array[String]] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply[komplet](algorithms: js.Array[String] = null, complete: komplet = null, crit: js.Array[String] = null): VerifyOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (crit != null) __obj.updateDynamic("crit")(crit)
    __obj.asInstanceOf[VerifyOptions[komplet]]
  }
}

