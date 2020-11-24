package typings.leafletGroupedlayercontrol.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Control")
@js.native
object Control_ extends js.Object {
  
  @js.native
  class GroupedLayers protected ()
    extends typings.leaflet.mod.Control_ {
    def this(
      baseLayers: StringDictionary[Layer],
      groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
      options: GroupedLayersOptions
    ) = this()
  }
}
