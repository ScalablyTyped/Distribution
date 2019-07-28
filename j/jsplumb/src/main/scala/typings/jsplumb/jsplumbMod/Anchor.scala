package typings.jsplumb.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  var cssClass: String
  var elementId: String
  var id: String
  var locked: Boolean
  var offsets: js.Tuple2[Double, Double]
  var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]
  var `type`: AnchorId
  var x: Double
  var y: Double
}

object Anchor {
  @scala.inline
  def apply(
    cssClass: String,
    elementId: String,
    id: String,
    locked: Boolean,
    offsets: js.Tuple2[Double, Double],
    orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint],
    `type`: AnchorId,
    x: Double,
    y: Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(cssClass = cssClass, elementId = elementId, id = id, locked = locked, offsets = offsets, orientation = orientation, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anchor]
  }
}

