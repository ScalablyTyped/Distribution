package typings.gulpDashAutoprefixer.gulpDashAutoprefixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
  var cascade: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    browsers: js.Array[String] = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Options]
  }
}

