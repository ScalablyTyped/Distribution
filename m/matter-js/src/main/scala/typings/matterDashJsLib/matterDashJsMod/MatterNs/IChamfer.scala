package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChamfer extends js.Object {
  var quality: js.UndefOr[scala.Double] = js.undefined
  var qualityMax: js.UndefOr[scala.Double] = js.undefined
  var qualityMin: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object IChamfer {
  @scala.inline
  def apply(
    quality: scala.Int | scala.Double = null,
    qualityMax: scala.Int | scala.Double = null,
    qualityMin: scala.Int | scala.Double = null,
    radius: scala.Double | js.Array[scala.Double] = null
  ): IChamfer = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (qualityMax != null) __obj.updateDynamic("qualityMax")(qualityMax.asInstanceOf[js.Any])
    if (qualityMin != null) __obj.updateDynamic("qualityMin")(qualityMin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChamfer]
  }
}

