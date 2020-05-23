package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingFolding extends js.Object {
  var `folding-direction`: js.UndefOr[FoldingDirection] = js.undefined
  var `folding-offset`: js.UndefOr[Double] = js.undefined
  var `folding-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}

object FinishingFolding {
  @scala.inline
  def apply(
    `folding-direction`: FoldingDirection = null,
    `folding-offset`: js.UndefOr[Double] = js.undefined,
    `folding-reference-edge`: ReferenceEdge = null
  ): FinishingFolding = {
    val __obj = js.Dynamic.literal()
    if (`folding-direction` != null) __obj.updateDynamic("folding-direction")(`folding-direction`.asInstanceOf[js.Any])
    if (!js.isUndefined(`folding-offset`)) __obj.updateDynamic("folding-offset")(`folding-offset`.get.asInstanceOf[js.Any])
    if (`folding-reference-edge` != null) __obj.updateDynamic("folding-reference-edge")(`folding-reference-edge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingFolding]
  }
}

