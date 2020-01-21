package typings.gulpRev.mod

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
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

