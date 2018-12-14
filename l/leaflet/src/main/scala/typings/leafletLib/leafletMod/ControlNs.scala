package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
object ControlNs extends js.Object {
  @js.native
  class Attribution ()
    extends leafletLib.leafletMod.Control {
    def this(options: AttributionOptions) = this()
    @JSName("options")
    var options_Attribution: AttributionOptions = js.native
    def addAttribution(text: java.lang.String): this.type = js.native
    def removeAttribution(text: java.lang.String): this.type = js.native
    def setPrefix(prefix: java.lang.String): this.type = js.native
  }
  
  
  trait AttributionOptions
    extends leafletLib.leafletMod.ControlOptions {
    var prefix: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  }
  
  @js.native
  class Layers ()
    extends leafletLib.leafletMod.Control {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
    @JSName("options")
    var options_Layers: LayersOptions = js.native
    def addBaseLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String): this.type = js.native
    def addOverlay(layer: leafletLib.leafletMod.Layer, name: java.lang.String): this.type = js.native
    def collapse(): this.type = js.native
    def expand(): this.type = js.native
    def removeLayer(layer: leafletLib.leafletMod.Layer): this.type = js.native
  }
  
  
  trait LayersObject
    extends /* name */ org.scalablytyped.runtime.StringDictionary[leafletLib.leafletMod.Layer]
  
  
  trait LayersOptions
    extends leafletLib.leafletMod.ControlOptions {
    var autoZIndex: js.UndefOr[scala.Boolean] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var hideSingleBase: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class Scale ()
    extends leafletLib.leafletMod.Control {
    def this(options: ScaleOptions) = this()
    @JSName("options")
    var options_Scale: ScaleOptions = js.native
  }
  
  
  trait ScaleOptions
    extends leafletLib.leafletMod.ControlOptions {
    var imperial: js.UndefOr[scala.Boolean] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var metric: js.UndefOr[scala.Boolean] = js.undefined
    var updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class Zoom ()
    extends leafletLib.leafletMod.Control {
    def this(options: ZoomOptions) = this()
    @JSName("options")
    var options_Zoom: ZoomOptions = js.native
  }
  
  
  trait ZoomOptions
    extends leafletLib.leafletMod.ControlOptions {
    var zoomInText: js.UndefOr[java.lang.String] = js.undefined
    var zoomInTitle: js.UndefOr[java.lang.String] = js.undefined
    var zoomOutText: js.UndefOr[java.lang.String] = js.undefined
    var zoomOutTitle: js.UndefOr[java.lang.String] = js.undefined
  }
  
}

@JSImport("leaflet", "control")
@js.native
object controlNs extends js.Object {
  def attribution(): leafletLib.leafletMod.ControlNs.Attribution = js.native
  def attribution(options: leafletLib.leafletMod.ControlNs.AttributionOptions): leafletLib.leafletMod.ControlNs.Attribution = js.native
  def layers(): leafletLib.leafletMod.ControlNs.Layers = js.native
  def layers(baseLayers: leafletLib.leafletMod.ControlNs.LayersObject): leafletLib.leafletMod.ControlNs.Layers = js.native
  def layers(
    baseLayers: leafletLib.leafletMod.ControlNs.LayersObject,
    overlays: leafletLib.leafletMod.ControlNs.LayersObject
  ): leafletLib.leafletMod.ControlNs.Layers = js.native
  def layers(
    baseLayers: leafletLib.leafletMod.ControlNs.LayersObject,
    overlays: leafletLib.leafletMod.ControlNs.LayersObject,
    options: leafletLib.leafletMod.ControlNs.LayersOptions
  ): leafletLib.leafletMod.ControlNs.Layers = js.native
  def scale(): leafletLib.leafletMod.ControlNs.Scale = js.native
  def scale(options: leafletLib.leafletMod.ControlNs.ScaleOptions): leafletLib.leafletMod.ControlNs.Scale = js.native
  def zoom(): leafletLib.leafletMod.ControlNs.Zoom = js.native
  def zoom(options: leafletLib.leafletMod.ControlNs.ZoomOptions): leafletLib.leafletMod.ControlNs.Zoom = js.native
}

