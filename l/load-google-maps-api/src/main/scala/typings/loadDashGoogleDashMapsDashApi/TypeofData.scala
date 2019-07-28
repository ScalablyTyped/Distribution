package typings.loadDashGoogleDashMapsDashApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googlemaps.googleNs.mapsNs.DataNs.Feature
import typings.googlemaps.googleNs.mapsNs.DataNs.Geometry
import typings.googlemaps.googleNs.mapsNs.DataNs.GeometryCollection
import typings.googlemaps.googleNs.mapsNs.DataNs.LineString
import typings.googlemaps.googleNs.mapsNs.DataNs.LinearRing
import typings.googlemaps.googleNs.mapsNs.DataNs.MultiLineString
import typings.googlemaps.googleNs.mapsNs.DataNs.MultiPoint
import typings.googlemaps.googleNs.mapsNs.DataNs.MultiPolygon
import typings.googlemaps.googleNs.mapsNs.DataNs.Point
import typings.googlemaps.googleNs.mapsNs.DataNs.Polygon
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofData extends js.Object {
  var Feature: Instantiable0[typings.googlemaps.googleNs.mapsNs.DataNs.Feature]
  var Geometry: Instantiable0[typings.googlemaps.googleNs.mapsNs.DataNs.Geometry]
  var GeometryCollection: Instantiable1[
    /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
    typings.googlemaps.googleNs.mapsNs.DataNs.GeometryCollection
  ]
  var LineString: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typings.googlemaps.googleNs.mapsNs.DataNs.LineString
  ]
  var LinearRing: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typings.googlemaps.googleNs.mapsNs.DataNs.LinearRing
  ]
  var MultiLineString: Instantiable1[
    /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
    typings.googlemaps.googleNs.mapsNs.DataNs.MultiLineString
  ]
  var MultiPoint: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typings.googlemaps.googleNs.mapsNs.DataNs.MultiPoint
  ]
  var MultiPolygon: Instantiable1[
    /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
    typings.googlemaps.googleNs.mapsNs.DataNs.MultiPolygon
  ]
  var Point: Instantiable1[/* latLng */ LatLng, typings.googlemaps.googleNs.mapsNs.DataNs.Point]
  var Polygon: Instantiable1[
    /* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], 
    typings.googlemaps.googleNs.mapsNs.DataNs.Polygon
  ]
}

object TypeofData {
  @scala.inline
  def apply(
    Feature: Instantiable0[Feature],
    Geometry: Instantiable0[Geometry],
    GeometryCollection: Instantiable1[
      /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
      GeometryCollection
    ],
    LineString: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString],
    LinearRing: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing],
    MultiLineString: Instantiable1[
      /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
      MultiLineString
    ],
    MultiPoint: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint],
    MultiPolygon: Instantiable1[
      /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
      MultiPolygon
    ],
    Point: Instantiable1[/* latLng */ LatLng, Point],
    Polygon: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
  ): TypeofData = {
    val __obj = js.Dynamic.literal(Feature = Feature, Geometry = Geometry, GeometryCollection = GeometryCollection, LineString = LineString, LinearRing = LinearRing, MultiLineString = MultiLineString, MultiPoint = MultiPoint, MultiPolygon = MultiPolygon, Point = Point, Polygon = Polygon)
  
    __obj.asInstanceOf[TypeofData]
  }
}

