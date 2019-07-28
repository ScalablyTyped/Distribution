package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecomposedTransformation extends js.Object {
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var translateX: Double
  var translateY: Double
}

object DecomposedTransformation {
  @scala.inline
  def apply(
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    translateX: Double,
    translateY: Double
  ): DecomposedTransformation = {
    val __obj = js.Dynamic.literal(rotation = rotation, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[DecomposedTransformation]
  }
}

