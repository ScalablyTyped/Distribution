package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashLayer extends js.Object {
  var color: js.Any
  var frameCount: Double
  var frames: js.Array[FlashFrame]
  var height: Double
  var layerType: String
  var locked: Boolean
  var name: String
  var outline: Boolean
  var parentLayer: FlashLayer
  var visible: Boolean
}

object FlashLayer {
  @scala.inline
  def apply(
    color: js.Any,
    frameCount: Double,
    frames: js.Array[FlashFrame],
    height: Double,
    layerType: String,
    locked: Boolean,
    name: String,
    outline: Boolean,
    parentLayer: FlashLayer,
    visible: Boolean
  ): FlashLayer = {
    val __obj = js.Dynamic.literal(color = color, frameCount = frameCount, frames = frames, height = height, layerType = layerType, locked = locked, name = name, outline = outline, parentLayer = parentLayer, visible = visible)
  
    __obj.asInstanceOf[FlashLayer]
  }
}

