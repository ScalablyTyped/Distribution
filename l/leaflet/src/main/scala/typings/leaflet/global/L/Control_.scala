package typings.leaflet.global.L

import typings.leaflet.anon.InstantiableT
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.LayersObject
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Control_.ScaleOptions
import typings.leaflet.mod.Control_.ZoomOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.Control")
@js.native
class Control_ ()
  extends typings.leaflet.mod.Control_ {
  def this(options: ControlOptions) = this()
}
/* static members */
object Control_ {
  
  @JSGlobal("L.Control")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("L.Control.Attribution")
  @js.native
  class Attribution ()
    extends typings.leaflet.mod.Control_.Attribution {
    def this(options: AttributionOptions) = this()
  }
  
  @JSGlobal("L.Control.Layers")
  @js.native
  class Layers ()
    extends typings.leaflet.mod.Control_.Layers {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: Unit, overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: Unit, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: Unit, overlays: LayersObject, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
  }
  
  @JSGlobal("L.Control.Scale")
  @js.native
  class Scale ()
    extends typings.leaflet.mod.Control_.Scale {
    def this(options: ScaleOptions) = this()
  }
  
  @JSGlobal("L.Control.Zoom")
  @js.native
  class Zoom ()
    extends typings.leaflet.mod.Control_.Zoom {
    def this(options: ZoomOptions) = this()
  }
  
  inline def extend[T /* <: js.Object */](props: T): InstantiableT[T] & typings.leaflet.anon.Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[InstantiableT[T] & typings.leaflet.anon.Attribution]
}
