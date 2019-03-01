package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecomposedTransformation extends js.Object {
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var skewX: scala.Double
  var skewY: scala.Double
  var translateX: scala.Double
  var translateY: scala.Double
}

object DecomposedTransformation {
  @scala.inline
  def apply(
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    translateX: scala.Double,
    translateY: scala.Double
  ): DecomposedTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.updateDynamic("skewX")(skewX)
    __obj.updateDynamic("skewY")(skewY)
    __obj.updateDynamic("translateX")(translateX)
    __obj.updateDynamic("translateY")(translateY)
    __obj.asInstanceOf[DecomposedTransformation]
  }
}

