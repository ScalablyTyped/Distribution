package typings.leaflet.mod

import typings.leaflet.mod.Control_.Attribution
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Control_.LayersObject
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Control_.Scale
import typings.leaflet.mod.Control_.ScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSImport("leaflet", "control")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attribution(): Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("attribution")().asInstanceOf[Attribution]
  @scala.inline
  def attribution(options: AttributionOptions): Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("attribution")(options.asInstanceOf[js.Any]).asInstanceOf[Attribution]
  
  @scala.inline
  def layers(): Layers = ^.asInstanceOf[js.Dynamic].applyDynamic("layers")().asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: Unit, overlays: Unit, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: Unit, overlays: LayersObject): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any])).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: Unit, overlays: LayersObject, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: LayersObject): Layers = ^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any]).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: LayersObject, overlays: Unit, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any])).asInstanceOf[Layers]
  @scala.inline
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  
  @scala.inline
  def scale(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")().asInstanceOf[Scale]
  @scala.inline
  def scale(options: ScaleOptions): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(options.asInstanceOf[js.Any]).asInstanceOf[Scale]
  
  @scala.inline
  def zoom(): typings.leaflet.mod.Control_.Zoom = ^.asInstanceOf[js.Dynamic].applyDynamic("zoom")().asInstanceOf[typings.leaflet.mod.Control_.Zoom]
  @scala.inline
  def zoom(options: typings.leaflet.mod.Control_.ZoomOptions): typings.leaflet.mod.Control_.Zoom = ^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Control_.Zoom]
}
