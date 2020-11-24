package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.visualization.HeatmapLayerOptions
import typings.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.visualization")
@js.native
object visualization extends js.Object {
  
  @js.native
  class HeatmapLayer ()
    extends typings.googlemaps.google.maps.visualization.HeatmapLayer {
    def this(opts: HeatmapLayerOptions) = this()
  }
  
  // TODO find source documentation
  @js.native
  class MapsEngineLayer protected ()
    extends typings.googlemaps.google.maps.visualization.MapsEngineLayer {
    def this(options: MapsEngineLayerOptions) = this()
  }
  
  // TODO find source documentation
  @js.native
  object MapsEngineStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.visualization.MapsEngineStatus with String] = js.native
    
    /* "INVALID_LAYER" */ val INVALID_LAYER: typings.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER with String = js.native
    
    /* "OK" */ val OK: typings.googlemaps.google.maps.visualization.MapsEngineStatus.OK with String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR with String = js.native
  }
  
  // TODO find source documentation
  @js.native
  class MapsEventListener ()
    extends typings.googlemaps.google.maps.visualization.MapsEventListener
  
  // TODO find source documentation
  @js.native
  class MouseEvent ()
    extends typings.googlemaps.google.maps.visualization.MouseEvent
}
