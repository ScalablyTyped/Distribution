package typings.gulpDashIstanbul.gulpDashIstanbulMod

import typings.gulpDashIstanbul.Anon_Each
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var thresholds: js.UndefOr[Anon_Each] = js.undefined
}

object ThresholdOptions {
  @scala.inline
  def apply(coverageVariable: String = null, thresholds: Anon_Each = null): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdOptions]
  }
}

