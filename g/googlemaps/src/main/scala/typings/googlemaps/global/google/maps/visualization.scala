package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.visualization.HeatmapLayerOptions
import typings.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @JSGlobal("google.maps.visualization.HeatmapLayer")
  @js.native
  class HeatmapLayer ()
    extends StObject
       with typings.googlemaps.google.maps.visualization.HeatmapLayer {
    def this(opts: HeatmapLayerOptions) = this()
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineLayer")
  @js.native
  class MapsEngineLayer protected ()
    extends StObject
       with typings.googlemaps.google.maps.visualization.MapsEngineLayer {
    def this(options: MapsEngineLayerOptions) = this()
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineStatus")
  @js.native
  object MapsEngineStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.visualization.MapsEngineStatus & String] = js.native
    
    /* "INVALID_LAYER" */ val INVALID_LAYER: typings.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER & String = js.native
    
    /* "OK" */ val OK: typings.googlemaps.google.maps.visualization.MapsEngineStatus.OK & String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR & String = js.native
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEventListener")
  @js.native
  class MapsEventListener ()
    extends StObject
       with typings.googlemaps.google.maps.visualization.MapsEventListener
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MouseEvent")
  @js.native
  class MouseEvent ()
    extends StObject
       with typings.googlemaps.google.maps.visualization.MouseEvent {
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
}
