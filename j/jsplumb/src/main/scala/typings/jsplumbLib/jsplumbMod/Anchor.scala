package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  var cssClass: java.lang.String
  var elementId: java.lang.String
  var id: java.lang.String
  var locked: scala.Boolean
  var offsets: js.Tuple2[scala.Double, scala.Double]
  var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]
  var `type`: AnchorId
  var x: scala.Double
  var y: scala.Double
}

object Anchor {
  @scala.inline
  def apply(
    cssClass: java.lang.String,
    elementId: java.lang.String,
    id: java.lang.String,
    locked: scala.Boolean,
    offsets: js.Tuple2[scala.Double, scala.Double],
    orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint],
    `type`: AnchorId,
    x: scala.Double,
    y: scala.Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(cssClass = cssClass, elementId = elementId, id = id, locked = locked, offsets = offsets, orientation = orientation, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anchor]
  }
}

