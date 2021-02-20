package typings.leafletCurve

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.Path
import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "Curve")
  @js.native
  class Curve_ () extends Path {
    def this(options: LayerOptions) = this()
    
    /*
      * Get bounds
      */
    def getBounds(): LatLngBounds_ = js.native
    
    /*
      * Get center
      */
    def getCenter(): LatLng_ = js.native
    
    /*
      * Return path
      */
    def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
    
    /*
      * Set path
      */
    def setPath(): Curve_ = js.native
  }
  
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  @JSImport("leaflet", "curve")
  @js.native
  def curve(path: js.Array[_], options: js.UndefOr[PathOptions]): Curve_ = js.native
}
