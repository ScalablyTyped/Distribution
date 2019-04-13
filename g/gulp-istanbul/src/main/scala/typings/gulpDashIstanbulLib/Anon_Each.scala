package typings
package gulpDashIstanbulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Each extends js.Object {
  var each: js.UndefOr[gulpDashIstanbulLib.gulpDashIstanbulMod.CoverageOptions | scala.Double] = js.undefined
  var global: js.UndefOr[gulpDashIstanbulLib.gulpDashIstanbulMod.CoverageOptions | scala.Double] = js.undefined
}

object Anon_Each {
  @scala.inline
  def apply(
    each: gulpDashIstanbulLib.gulpDashIstanbulMod.CoverageOptions | scala.Double = null,
    global: gulpDashIstanbulLib.gulpDashIstanbulMod.CoverageOptions | scala.Double = null
  ): Anon_Each = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(each.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Each]
  }
}

