package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BearingSnap extends js.Object {
  var bearingSnap: js.UndefOr[scala.Double] = js.undefined
  var pitchWithRotate: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BearingSnap {
  @scala.inline
  def apply(
    bearingSnap: scala.Int | scala.Double = null,
    pitchWithRotate: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BearingSnap = {
    val __obj = js.Dynamic.literal()
    if (bearingSnap != null) __obj.updateDynamic("bearingSnap")(bearingSnap.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchWithRotate)) __obj.updateDynamic("pitchWithRotate")(pitchWithRotate)
    __obj.asInstanceOf[Anon_BearingSnap]
  }
}

