package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerEvent extends LeafletEvent {
  var layer: Layer
}

object LayerEvent {
  @scala.inline
  def apply(layer: Layer, target: js.Any, `type`: java.lang.String): LayerEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LayerEvent]
  }
}

