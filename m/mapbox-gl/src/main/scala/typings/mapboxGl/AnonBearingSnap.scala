package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBearingSnap extends js.Object {
  var bearingSnap: js.UndefOr[Double] = js.undefined
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
}

object AnonBearingSnap {
  @scala.inline
  def apply(bearingSnap: Int | Double = null, pitchWithRotate: js.UndefOr[Boolean] = js.undefined): AnonBearingSnap = {
    val __obj = js.Dynamic.literal()
    if (bearingSnap != null) __obj.updateDynamic("bearingSnap")(bearingSnap.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchWithRotate)) __obj.updateDynamic("pitchWithRotate")(pitchWithRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBearingSnap]
  }
}

