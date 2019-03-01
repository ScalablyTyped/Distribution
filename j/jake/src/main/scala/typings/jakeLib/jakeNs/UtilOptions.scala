package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////
// File-utils //////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
trait UtilOptions extends js.Object {
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object UtilOptions {
  @scala.inline
  def apply(silent: js.UndefOr[scala.Boolean] = js.undefined): UtilOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[UtilOptions]
  }
}

