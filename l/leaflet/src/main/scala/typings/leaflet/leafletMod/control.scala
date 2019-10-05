package typings.leaflet.leafletMod

import typings.leaflet.leafletMod.Control.Attribution
import typings.leaflet.leafletMod.Control.AttributionOptions
import typings.leaflet.leafletMod.Control.Layers
import typings.leaflet.leafletMod.Control.LayersObject
import typings.leaflet.leafletMod.Control.LayersOptions
import typings.leaflet.leafletMod.Control.Scale
import typings.leaflet.leafletMod.Control.ScaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def attribution(): Attribution = js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  def layers(): Layers = js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  def scale(): Scale = js.native
  def scale(options: ScaleOptions): Scale = js.native
  def zoom(): typings.leaflet.leafletMod.Control.Zoom = js.native
  def zoom(options: typings.leaflet.leafletMod.Control.ZoomOptions): typings.leaflet.leafletMod.Control.Zoom = js.native
}

