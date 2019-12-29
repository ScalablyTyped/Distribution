package typings.jake.jakeMod._Global_.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////
// File-utils //////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
trait UtilOptions extends js.Object {
  var silent: js.UndefOr[Boolean] = js.undefined
}

object UtilOptions {
  @scala.inline
  def apply(silent: js.UndefOr[Boolean] = js.undefined): UtilOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilOptions]
  }
}

