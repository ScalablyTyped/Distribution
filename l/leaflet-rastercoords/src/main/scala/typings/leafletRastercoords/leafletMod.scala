package typings.leafletRastercoords

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.Point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", "RasterCoords")
  @js.native
  open class RasterCoords protected () extends StObject {
    def this(map: Map_, imgsize: js.Array[Double]) = this()
    def this(map: Map_, imgsize: js.Array[Double], tilesize: Double) = this()
    
    def getMaxBounds(): LatLngBounds_ = js.native
    
    def project(coords: LatLngExpression): Point_ = js.native
    
    def setMaxBounds(): Unit = js.native
    
    def unproject(coords: PointExpression): LatLng_ = js.native
    
    def zoomLevel(): Double = js.native
  }
}
