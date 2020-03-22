package typings.jsplumb

import typings.jsplumb.mod.PerimeterShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchorCount extends js.Object {
  var anchorCount: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[PerimeterShape] = js.undefined
}

object AnonAnchorCount {
  @scala.inline
  def apply(anchorCount: Int | Double = null, rotation: Int | Double = null, shape: PerimeterShape = null): AnonAnchorCount = {
    val __obj = js.Dynamic.literal()
    if (anchorCount != null) __obj.updateDynamic("anchorCount")(anchorCount.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchorCount]
  }
}

