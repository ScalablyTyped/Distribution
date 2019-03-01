package typings
package gulpDashRevLib.gulpDashRevMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    cwd: java.lang.String = null,
    merge: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    __obj.asInstanceOf[IOptions]
  }
}

