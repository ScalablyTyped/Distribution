package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Triggered when layers have been removed (and saved) from the FeatureGroup.
  */
trait Deleted extends LeafletEvent {
  /**
    * List of all layers just removed from the map.
    */
  var layers: LayerGroup[_]
}

object Deleted {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Deleted = {
    val __obj = js.Dynamic.literal(layer = layer, layers = layers, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Deleted]
  }
}

