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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("frameCount")(frameCount)
    __obj.updateDynamic("frames")(frames)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("layerType")(layerType)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("parentLayer")(parentLayer)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[FlashLayer]
  }
}

