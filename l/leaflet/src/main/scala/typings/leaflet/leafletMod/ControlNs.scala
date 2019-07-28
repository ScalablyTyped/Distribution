package typings.leaflet.leafletMod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.ControlNs.Attribution
import typings.leaflet.leafletMod.ControlNs.AttributionOptions
import typings.leaflet.leafletMod.ControlNs.Layers
import typings.leaflet.leafletMod.ControlNs.LayersObject
import typings.leaflet.leafletMod.ControlNs.LayersOptions
import typings.leaflet.leafletMod.ControlNs.Scale
import typings.leaflet.leafletMod.ControlNs.ScaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
object ControlNs extends js.Object {
  @js.native
  class Attribution () extends Control {
    def this(options: AttributionOptions) = this()
    @JSName("options")
    var options_Attribution: AttributionOptions = js.native
    def addAttribution(text: String): this.type = js.native
    def removeAttribution(text: String): this.type = js.native
    def setPrefix(prefix: String): this.type = js.native
  }
  
  trait AttributionOptions extends ControlOptions {
    var prefix: js.UndefOr[String | Boolean] = js.undefined
  }
  
  @js.native
  class Layers () extends Control {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
    @JSName("options")
    var options_Layers: LayersOptions = js.native
    def addBaseLayer(layer: Layer, name: String): this.type = js.native
    def addOverlay(layer: Layer, name: String): this.type = js.native
    def collapse(): this.type = js.native
    def expand(): this.type = js.native
    def removeLayer(layer: Layer): this.type = js.native
  }
  
  trait LayersOptions extends ControlOptions {
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    var collapsed: js.UndefOr[Boolean] = js.undefined
    var hideSingleBase: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  class Scale () extends Control {
    def this(options: ScaleOptions) = this()
    @JSName("options")
    var options_Scale: ScaleOptions = js.native
  }
  
  trait ScaleOptions extends ControlOptions {
    var imperial: js.UndefOr[Boolean] = js.undefined
    var maxWidth: js.UndefOr[Double] = js.undefined
    var metric: js.UndefOr[Boolean] = js.undefined
    var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  class Zoom () extends Control {
    def this(options: typings.leaflet.leafletMod.ControlNs.ZoomOptions) = this()
    @JSName("options")
    var options_Zoom: typings.leaflet.leafletMod.ControlNs.ZoomOptions = js.native
  }
  
  trait ZoomOptions extends ControlOptions {
    var zoomInText: js.UndefOr[String] = js.undefined
    var zoomInTitle: js.UndefOr[String] = js.undefined
    var zoomOutText: js.UndefOr[String] = js.undefined
    var zoomOutTitle: js.UndefOr[String] = js.undefined
  }
  
  type LayersObject = StringDictionary[Layer]
}

@JSImport("leaflet", "control")
@js.native
object controlNs extends js.Object {
  def attribution(): Attribution = js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  def layers(): Layers = js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  def scale(): Scale = js.native
  def scale(options: ScaleOptions): Scale = js.native
  def zoom(): typings.leaflet.leafletMod.ControlNs.Zoom = js.native
  def zoom(options: typings.leaflet.leafletMod.ControlNs.ZoomOptions): typings.leaflet.leafletMod.ControlNs.Zoom = js.native
}

