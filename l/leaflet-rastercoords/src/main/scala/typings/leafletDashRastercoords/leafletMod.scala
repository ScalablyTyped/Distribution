package typings.leafletDashRastercoords

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Point
import typings.leaflet.leafletMod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  class RasterCoords protected () extends js.Object {
    def this(map: Map, imgsize: js.Array[Double]) = this()
    def this(map: Map, imgsize: js.Array[Double], tilesize: Double) = this()
    def project(coords: LatLngExpression): Point = js.native
    def setMaxBounds(): Unit = js.native
    def unproject(coords: PointExpression): LatLng = js.native
    def zoomLevel(): Double = js.native
  }
  
}

