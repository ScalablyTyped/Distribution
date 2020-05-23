package typings.jsplumb.anon

import typings.jsplumb.mod.PerimeterShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorCount extends js.Object {
  var anchorCount: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[PerimeterShape] = js.undefined
}

object AnchorCount {
  @scala.inline
  def apply(
    anchorCount: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    shape: PerimeterShape = null
  ): AnchorCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorCount)) __obj.updateDynamic("anchorCount")(anchorCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorCount]
  }
}

