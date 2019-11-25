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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], parentLayer = parentLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashLayer]
  }
}

