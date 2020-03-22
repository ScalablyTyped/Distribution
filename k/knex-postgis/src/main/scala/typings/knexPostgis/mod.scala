package typings.knexPostgis

import typings.geojson.mod.GeoJsonObject
import typings.knex.mod.Knex
import typings.knex.mod.QueryBuilder
import typings.knex.mod.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex-postgis", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait KnexPostgis extends js.Object {
    /**
      * Returns the area of the surface if it is a Polygon or MultiPolygon. For geometry, a
      * 2D Cartesian area is determined with units specified by the SRID. For geography, area
      * is determined on a curved surface with units in square meters.
      *
      * @see {@link https://postgis.net/docs/ST_Area.html}
      */
    def area(geom: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return the Well-Known Text (WKT) representation of the geometry with SRID meta data.
      *
      * @see {@link https://postgis.net/docs/ST_AsEWKT.html}
      */
    def asEWKT(column: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return the geometry as a GeoJSON element.
      *
      * @see {@link https://postgis.net/docs/ST_AsGeoJSON.html}
      */
    def asGeoJSON(column: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return the Well-Known Text (WKT) representation of the geometry/geography without SRID metadata.
      *
      * @see {@link https://postgis.net/docs/ST_AsText.html}
      */
    def asText(column: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Returns a geometry covering all points within a given distance from the input geometry.
      *
      * @see {@link https://postgis.net/docs/ST_Buffer.html}
      */
    def buffer(geom: ColumnName, radius: Double): QueryBuilder[_, _] = js.native
    /**
      * Returns the geometric center of a geometry.
      *
      * @see {@link https://postgis.net/docs/ST_Centroid.html}
      */
    def centroid(geom: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * For geometry type Returns the 2D Cartesian distance between two geometries in projected
      * units (based on spatial ref). For geography type defaults to return minimum geodesic
      * distance between two geographies in meters.
      *
      * @see {@link https://postgis.net/docs/ST_Distance.html}
      */
    def distance(geom1: ColumnName, geom2: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Returns true if the geometries are within the specified distance of one another. For
      * geometry units are in those of spatial reference and For geography units are in meters
      * and measurement is defaulted to use_spheroid=true (measure around spheroid), for faster
      * check, use_spheroid=false to measure along sphere.
      *
      * @see {@link https://postgis.net/docs/ST_DWithin.html}
      */
    def dwithin(geom1: ColumnName, geom2: ColumnName, distance: Double): QueryBuilder[_, _] = js.native
    def dwithin(geom1: ColumnName, geom2: ColumnName, distance: Double, spheroid: Boolean): QueryBuilder[_, _] = js.native
    /**
      * Casts geometry to geography
      */
    def geography(geom: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Takes as input a geojson representation of a geometry and outputs a PostGIS geometry object
      *
      * @see {@link https://postgis.net/docs/ST_GeomFromGeoJSON.html}
      */
    def geomFromGeoJSON(geojson: GeoJsonObject): QueryBuilder[_, _] = js.native
    def geomFromGeoJSON(geojson: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return a specified ST_Geometry value from Well-Known Text representation (WKT).
      *
      * @see {@link https://postgis.net/docs/ST_GeomFromText.html}
      */
    def geomFromText(wkt: String): QueryBuilder[_, _] = js.native
    def geomFromText(wkt: String, srid: Double): QueryBuilder[_, _] = js.native
    /**
      * Casts geography to geometry
      */
    def geometry(geography: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Returns a geometry that represents the shared portion of geomA and geomB.
      *
      * @see {@link https://postgis.net/docs/ST_Intersection.html}
      */
    def intersection(geom1: ColumnName, geom2: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Returns TRUE if the Geometries/Geography "spatially intersect in 2D" - (share any portion
      * of space) and FALSE if they don't (they are Disjoint). For geography -- tolerance is 0.00001
      * meters (so any points that close are considered to intersect)
      *
      * @see {@link https://postgis.net/docs/ST_Intersects.html}
      */
    def intersects(geom1: ColumnName, geom2: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Creates a rectangular Polygon formed from the given minimums and maximums. Input values
      * must be in SRS specified by the SRID.
      *
      * @see {@link https://postgis.net/docs/ST_MakeEnvelope.html}
      */
    def makeEnvelope(minlon: Double, minlat: Double, maxlon: Double, maxlat: Double): QueryBuilder[_, _] = js.native
    def makeEnvelope(minlon: Double, minlat: Double, maxlon: Double, maxlat: Double, srid: Double): QueryBuilder[_, _] = js.native
    /**
      * Creates a 2D,3DZ or 4D point geometry.
      *
      * @see {@link https://postgis.net/docs/ST_MakePoint.html}
      */
    def makePoint(lon: Double, lat: Double): QueryBuilder[_, _] = js.native
    def makePoint(lon: Double, lat: Double, z: Double): QueryBuilder[_, _] = js.native
    def makePoint(lon: Double, lat: Double, z: Double, measure: Double): QueryBuilder[_, _] = js.native
    /**
      * Attempts to make an invalid geometry valid without losing vertices.
      *
      * @see {@link https://postgis.net/docs/ST_MakeValid.html}
      */
    def makeValid(geom: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * eturns an ST_Point with the given coordinate values. OGC alias for ST_MakePoint.
      *
      * @see {@link https://postgis.net/docs/ST_Point.html}
      */
    def point(lon: Double, lat: Double): QueryBuilder[_, _] = js.native
    /**
      * Return a new geometry with its coordinates transformed to a different spatial reference.
      *
      * @see {@link https://postgis.net/docs/ST_Transform.html}
      */
    def transform(geom: ColumnName, srid: Double): QueryBuilder[_, _] = js.native
    /**
      * Returns true if the geometry A is completely inside geometry B
      *
      * @see {@link https://postgis.net/docs/ST_Within.html}
      */
    def within(geom1: ColumnName, geom2: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return the X coordinate of the point, or NULL if not available. Input must be a point.
      *
      * @see {@link https://postgis.net/docs/ST_X.html}
      */
    def x(geom: ColumnName): QueryBuilder[_, _] = js.native
    /**
      * Return the Y coordinate of the point, or NULL if not available. Input must be a point.
      *
      * @see {@link https://postgis.net/docs/ST_Y.html}
      */
    def y(geom: ColumnName): QueryBuilder[_, _] = js.native
  }
  
  def apply(knex: Knex[_, js.Array[_]]): KnexPostgis = js.native
  // Same as in Knex but not exported
  type ColumnName = String | Raw[js.Any] | (QueryBuilder[js.Any, js.Any])
}

