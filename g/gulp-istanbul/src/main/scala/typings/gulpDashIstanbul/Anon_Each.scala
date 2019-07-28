package typings.gulpDashIstanbul

import typings.gulpDashIstanbul.gulpDashIstanbulMod.CoverageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Each extends js.Object {
  var each: js.UndefOr[CoverageOptions | Double] = js.undefined
  var global: js.UndefOr[CoverageOptions | Double] = js.undefined
}

object Anon_Each {
  @scala.inline
  def apply(each: CoverageOptions | Double = null, global: CoverageOptions | Double = null): Anon_Each = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(each.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Each]
  }
}

