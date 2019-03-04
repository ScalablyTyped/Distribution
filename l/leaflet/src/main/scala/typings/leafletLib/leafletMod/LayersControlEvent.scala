package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlEvent extends LayerEvent {
  var name: java.lang.String
}

object LayersControlEvent {
  @scala.inline
  def apply(layer: Layer, name: java.lang.String, target: js.Any, `type`: java.lang.String): LayersControlEvent = {
    val __obj = js.Dynamic.literal(layer = layer, name = name, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayersControlEvent]
  }
}

