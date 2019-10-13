package typings.mapbox.mapboxMod._Global_.L.mapbox

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map
  extends typings.leaflet.leafletMod.Map {
  var featureLayer: FeatureLayer = js.native
  var gridControl: GridControl = js.native
  var gridLayer: GridLayer = js.native
  var infoControl: InfoControl = js.native
  var legendControl: LegendControl = js.native
  var shareControl: ShareControl = js.native
  var tileLayer: TileLayer = js.native
  def getTileJSON(): js.Any = js.native
}

@JSGlobal("L.mapbox.map")
@js.native
object map extends js.Object {
  /**
  		 * Create and automatically configure a map with layers, markers, and interactivity.
  		 */
  def apply(element: String, idOrTileJson: js.Any): Map = js.native
  def apply(element: String, idOrTileJson: js.Any, options: MapOptions): Map = js.native
  def apply(element: Element, idOrTileJson: js.Any): Map = js.native
  def apply(element: Element, idOrTileJson: js.Any, options: MapOptions): Map = js.native
}

