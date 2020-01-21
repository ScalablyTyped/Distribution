package typings.gulpIstanbul.mod

import typings.gulpIstanbul.AnonEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var thresholds: js.UndefOr[AnonEach] = js.undefined
}

object ThresholdOptions {
  @scala.inline
  def apply(coverageVariable: String = null, thresholds: AnonEach = null): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdOptions]
  }
}

