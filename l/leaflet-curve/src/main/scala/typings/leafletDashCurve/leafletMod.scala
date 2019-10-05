package typings.leafletDashCurve

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.Path
import typings.leaflet.leafletMod.PathOptions
import typings.leafletDashCurve.leafletMod.Curve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  class Curve () extends Path {
    /*
      * Get bounds
      */
    def getBounds(): LatLngBounds = js.native
    /*
      * Get center
      */
    def getCenter(): LatLng = js.native
    /*
      * Return path
      */
    def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
    /*
      * Set path
      */
    def setPath(): Curve = js.native
  }
  
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  def curve(path: js.Array[_]): Curve = js.native
  def curve(path: js.Array[_], options: PathOptions): Curve = js.native
}

