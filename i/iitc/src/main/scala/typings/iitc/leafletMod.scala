package typings.iitc

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.PolylineOptions
import typings.leaflet.mod.Polyline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// geodesic
/* augmented module */
object leafletMod {
  
  // tslint:disable-next-line:no-empty-interface
  @JSImport("leaflet", "GeodesicCircle")
  @js.native
  class GeodesicCircle protected ()
    extends Polyline_[LineString | MultiLineString, js.Any] {
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  }
  
  // tslint:disable-next-line:no-empty-interface
  @JSImport("leaflet", "GeodesicPolygon")
  @js.native
  class GeodesicPolygon_ protected () extends GeodesicPolyline_ {
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  }
  
  @JSImport("leaflet", "GeodesicPolyline")
  @js.native
  class GeodesicPolyline_ protected ()
    extends Polyline_[LineString | MultiLineString, js.Any] {
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
    def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  }
  
  @JSImport("leaflet", "geodesicPolygon")
  @js.native
  def geodesicPolygon(latlngs: js.Array[LatLng_], options: js.UndefOr[PolylineOptions]): GeodesicPolygon_ = js.native
  
  @JSImport("leaflet", "geodesicPolyline")
  @js.native
  def geodesicPolyline(latlngs: js.Array[LatLng_], options: js.UndefOr[PolylineOptions]): GeodesicPolyline_ = js.native
}
