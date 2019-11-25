package typings.imageminDashJpegtran.imageminDashJpegtranMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arithmetic: js.UndefOr[Boolean] = js.undefined
  var progressive: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(arithmetic: js.UndefOr[Boolean] = js.undefined, progressive: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arithmetic)) __obj.updateDynamic("arithmetic")(arithmetic.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

