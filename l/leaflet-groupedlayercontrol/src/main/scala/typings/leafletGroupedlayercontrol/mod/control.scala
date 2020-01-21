package typings.leafletGroupedlayercontrol.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def groupedLayers(
    baseLayers: StringDictionary[Layer],
    groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
    options: GroupedLayersOptions
  ): typings.leaflet.mod.Control_ = js.native
}

