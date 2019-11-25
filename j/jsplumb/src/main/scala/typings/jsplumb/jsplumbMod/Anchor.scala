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
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

