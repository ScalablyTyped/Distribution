package typings
package imageminDashJpegtranLib.imageminDashJpegtranMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arithmetic: js.UndefOr[scala.Boolean] = js.undefined
  var progressive: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arithmetic: js.UndefOr[scala.Boolean] = js.undefined,
    progressive: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arithmetic)) __obj.updateDynamic("arithmetic")(arithmetic)
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive)
    __obj.asInstanceOf[Options]
  }
}

