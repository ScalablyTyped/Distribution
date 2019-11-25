package typings.leafletDashGroupedlayercontrol.leafletMod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
object Control extends js.Object {
  @js.native
  class GroupedLayers protected ()
    extends typings.leaflet.leafletMod.Control {
    def this(
      baseLayers: StringDictionary[Layer],
      groupedOverlays: StringDictionary[StringDictionary[LayerGroup[_]]],
      options: GroupedLayersOptions
    ) = this()
  }
  
}

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def groupedLayers(
    baseLayers: StringDictionary[Layer],
    groupedOverlays: StringDictionary[StringDictionary[LayerGroup[_]]],
    options: GroupedLayersOptions
  ): typings.leaflet.leafletMod.Control = js.native
}

