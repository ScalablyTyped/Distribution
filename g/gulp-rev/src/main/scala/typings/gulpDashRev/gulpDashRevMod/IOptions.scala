package typings.gulpDashRev.gulpDashRevMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(base: String = null, cwd: String = null, merge: js.UndefOr[Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    __obj.asInstanceOf[IOptions]
  }
}

