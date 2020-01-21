package typings.leafletRastercoords

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RasterCoords protected () extends js.Object {
    def this(map: Map_, imgsize: js.Array[Double]) = this()
    def this(map: Map_, imgsize: js.Array[Double], tilesize: Double) = this()
    def project(coords: LatLngExpression): Point_ = js.native
    def setMaxBounds(): Unit = js.native
    def unproject(coords: PointExpression): LatLng_ = js.native
    def zoomLevel(): Double = js.native
  }
  
}

