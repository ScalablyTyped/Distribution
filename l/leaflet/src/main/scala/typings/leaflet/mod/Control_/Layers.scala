package typings.leaflet.mod.Control_

import typings.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Control.Layers")
@js.native
class Layers ()
  extends typings.leaflet.mod.Control_ {
  def this(baseLayers: LayersObject) = this()
  def this(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject) = this()
  def this(baseLayers: LayersObject, overlays: LayersObject) = this()
  def this(baseLayers: js.UndefOr[scala.Nothing], overlays: js.UndefOr[scala.Nothing], options: LayersOptions) = this()
  def this(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject, options: LayersOptions) = this()
  def this(baseLayers: LayersObject, overlays: js.UndefOr[scala.Nothing], options: LayersOptions) = this()
  def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
  
  def addBaseLayer(layer: Layer, name: String): this.type = js.native
  
  def addOverlay(layer: Layer, name: String): this.type = js.native
  
  def collapse(): this.type = js.native
  
  def expand(): this.type = js.native
  
  @JSName("options")
  var options_Layers: LayersOptions = js.native
  
  def removeLayer(layer: Layer): this.type = js.native
}
