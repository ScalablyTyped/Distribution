package typings.gulpIstanbul

import typings.gulpIstanbul.mod.CoverageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEach extends js.Object {
  var each: js.UndefOr[CoverageOptions | Double] = js.undefined
  var global: js.UndefOr[CoverageOptions | Double] = js.undefined
}

object AnonEach {
  @scala.inline
  def apply(each: CoverageOptions | Double = null, global: CoverageOptions | Double = null): AnonEach = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(each.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEach]
  }
}

