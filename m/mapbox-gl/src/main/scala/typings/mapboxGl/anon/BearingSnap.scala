package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BearingSnap extends js.Object {
  var bearingSnap: js.UndefOr[Double] = js.undefined
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
}

object BearingSnap {
  @scala.inline
  def apply(
    bearingSnap: js.UndefOr[Double] = js.undefined,
    pitchWithRotate: js.UndefOr[Boolean] = js.undefined
  ): BearingSnap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bearingSnap)) __obj.updateDynamic("bearingSnap")(bearingSnap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchWithRotate)) __obj.updateDynamic("pitchWithRotate")(pitchWithRotate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BearingSnap]
  }
}

