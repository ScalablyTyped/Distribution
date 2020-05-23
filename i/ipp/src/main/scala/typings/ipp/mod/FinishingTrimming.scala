package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingTrimming extends js.Object {
  var `trimming-offset`: js.UndefOr[Double] = js.undefined
  var `trimming-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
  var `trimming-type`: js.UndefOr[TrimmingType] = js.undefined
  var `trimming-when`: js.UndefOr[String] = js.undefined
}

object FinishingTrimming {
  @scala.inline
  def apply(
    `trimming-offset`: js.UndefOr[Double] = js.undefined,
    `trimming-reference-edge`: ReferenceEdge = null,
    `trimming-type`: TrimmingType = null,
    `trimming-when`: String = null
  ): FinishingTrimming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`trimming-offset`)) __obj.updateDynamic("trimming-offset")(`trimming-offset`.get.asInstanceOf[js.Any])
    if (`trimming-reference-edge` != null) __obj.updateDynamic("trimming-reference-edge")(`trimming-reference-edge`.asInstanceOf[js.Any])
    if (`trimming-type` != null) __obj.updateDynamic("trimming-type")(`trimming-type`.asInstanceOf[js.Any])
    if (`trimming-when` != null) __obj.updateDynamic("trimming-when")(`trimming-when`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingTrimming]
  }
}

