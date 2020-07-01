package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Offset
  */
@js.native
trait SchemaVideoOffset extends js.Object {
  /**
    * Duration, as a percentage of video duration. Do not set when
    * offsetSeconds is set. Acceptable values are 0 to 100, inclusive.
    */
  var offsetPercentage: js.UndefOr[Double] = js.native
  /**
    * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable
    * values are 0 to 86399, inclusive.
    */
  var offsetSeconds: js.UndefOr[Double] = js.native
}

object SchemaVideoOffset {
  @scala.inline
  def apply(
    offsetPercentage: js.UndefOr[Double] = js.undefined,
    offsetSeconds: js.UndefOr[Double] = js.undefined
  ): SchemaVideoOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetPercentage)) __obj.updateDynamic("offsetPercentage")(offsetPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetSeconds)) __obj.updateDynamic("offsetSeconds")(offsetSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoOffset]
  }
}

