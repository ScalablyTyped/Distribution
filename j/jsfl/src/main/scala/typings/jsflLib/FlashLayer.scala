package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashLayer extends js.Object {
  var color: js.Any
  var frameCount: scala.Double
  var frames: js.Array[FlashFrame]
  var height: scala.Double
  var layerType: java.lang.String
  var locked: scala.Boolean
  var name: java.lang.String
  var outline: scala.Boolean
  var parentLayer: FlashLayer
  var visible: scala.Boolean
}

object FlashLayer {
  @scala.inline
  def apply(
    color: js.Any,
    frameCount: scala.Double,
    frames: js.Array[FlashFrame],
    height: scala.Double,
    layerType: java.lang.String,
    locked: scala.Boolean,
    name: java.lang.String,
    outline: scala.Boolean,
    parentLayer: FlashLayer,
    visible: scala.Boolean
  ): FlashLayer = {
    val __obj = js.Dynamic.literal(color = color, frameCount = frameCount, frames = frames, height = height, layerType = layerType, locked = locked, name = name, outline = outline, parentLayer = parentLayer, visible = visible)
  
    __obj.asInstanceOf[FlashLayer]
  }
}

