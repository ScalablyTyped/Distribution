package typings.hedron.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoints extends js.Object {
  var lg: js.UndefOr[Double] = js.undefined
  var md: js.UndefOr[Double] = js.undefined
  var sm: js.UndefOr[Double] = js.undefined
}

object Breakpoints {
  @scala.inline
  def apply(lg: Int | Double = null, md: Int | Double = null, sm: Int | Double = null): Breakpoints = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
}

