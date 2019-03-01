package typings
package gulpDashIstanbulLib.gulpDashIstanbulMod.GulpIstanbulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdOptions extends js.Object {
  var coverageVariable: js.UndefOr[java.lang.String] = js.undefined
  var thresholds: js.UndefOr[gulpDashIstanbulLib.Anon_Each] = js.undefined
}

object ThresholdOptions {
  @scala.inline
  def apply(coverageVariable: java.lang.String = null, thresholds: gulpDashIstanbulLib.Anon_Each = null): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable)
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds)
    __obj.asInstanceOf[ThresholdOptions]
  }
}

