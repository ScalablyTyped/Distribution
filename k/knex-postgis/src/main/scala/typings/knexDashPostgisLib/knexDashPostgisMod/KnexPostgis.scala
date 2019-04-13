package typings
package knexDashPostgisLib.knexDashPostgisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnexPostgis extends js.Object {
  /**
    * Returns the area of the surface if it is a Polygon or MultiPolygon. For geometry, a
    * 2D Cartesian area is determined with units specified by the SRID. For geography, area
    * is determined on a curved surface with units in square meters.
    *
    * @see {@link https://postgis.net/docs/ST_Area.html}
    */
  def area(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return the Well-Known Text (WKT) representation of the geometry with SRID meta data.
    *
    * @see {@link https://postgis.net/docs/ST_AsEWKT.html}
    */
  def asEWKT(column: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return the geometry as a GeoJSON element.
    *
    * @see {@link https://postgis.net/docs/ST_AsGeoJSON.html}
    */
  def asGeoJSON(column: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return the Well-Known Text (WKT) representation of the geometry/geography without SRID metadata.
    *
    * @see {@link https://postgis.net/docs/ST_AsText.html}
    */
  def asText(column: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns a geometry covering all points within a given distance from the input geometry.
    *
    * @see {@link https://postgis.net/docs/ST_Buffer.html}
    */
  def buffer(geom: knexDashPostgisLib.ColumnName, radius: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns the geometric center of a geometry.
    *
    * @see {@link https://postgis.net/docs/ST_Centroid.html}
    */
  def centroid(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * For geometry type Returns the 2D Cartesian distance between two geometries in projected
    * units (based on spatial ref). For geography type defaults to return minimum geodesic
    * distance between two geographies in meters.
    *
    * @see {@link https://postgis.net/docs/ST_Distance.html}
    */
  def distance(geom1: knexDashPostgisLib.ColumnName, geom2: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns true if the geometries are within the specified distance of one another. For
    * geometry units are in those of spatial reference and For geography units are in meters
    * and measurement is defaulted to use_spheroid=true (measure around spheroid), for faster
    * check, use_spheroid=false to measure along sphere.
    *
    * @see {@link https://postgis.net/docs/ST_DWithin.html}
    */
  def dwithin(geom1: knexDashPostgisLib.ColumnName, geom2: knexDashPostgisLib.ColumnName, distance: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  def dwithin(
    geom1: knexDashPostgisLib.ColumnName,
    geom2: knexDashPostgisLib.ColumnName,
    distance: scala.Double,
    spheroid: scala.Boolean
  ): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Casts geometry to geography
    */
  def geography(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Takes as input a geojson representation of a geometry and outputs a PostGIS geometry object
    *
    * @see {@link https://postgis.net/docs/ST_GeomFromGeoJSON.html}
    */
  def geomFromGeoJSON(geojson: geojsonLib.geojsonMod.GeoJsonObject): knexLib.knexMod.QueryBuilder = js.native
  def geomFromGeoJSON(geojson: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return a specified ST_Geometry value from Well-Known Text representation (WKT).
    *
    * @see {@link https://postgis.net/docs/ST_GeomFromText.html}
    */
  def geomFromText(wkt: java.lang.String): knexLib.knexMod.QueryBuilder = js.native
  def geomFromText(wkt: java.lang.String, srid: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Casts geography to geometry
    */
  def geometry(geography: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns a geometry that represents the shared portion of geomA and geomB.
    *
    * @see {@link https://postgis.net/docs/ST_Intersection.html}
    */
  def intersection(geom1: knexDashPostgisLib.ColumnName, geom2: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns TRUE if the Geometries/Geography "spatially intersect in 2D" - (share any portion
    * of space) and FALSE if they don't (they are Disjoint). For geography -- tolerance is 0.00001
    * meters (so any points that close are considered to intersect)
    *
    * @see {@link https://postgis.net/docs/ST_Intersects.html}
    */
  def intersects(geom1: knexDashPostgisLib.ColumnName, geom2: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Creates a rectangular Polygon formed from the given minimums and maximums. Input values
    * must be in SRS specified by the SRID.
    *
    * @see {@link https://postgis.net/docs/ST_MakeEnvelope.html}
    */
  def makeEnvelope(minlon: scala.Double, minlat: scala.Double, maxlon: scala.Double, maxlat: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  def makeEnvelope(
    minlon: scala.Double,
    minlat: scala.Double,
    maxlon: scala.Double,
    maxlat: scala.Double,
    srid: scala.Double
  ): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Creates a 2D,3DZ or 4D point geometry.
    *
    * @see {@link https://postgis.net/docs/ST_MakePoint.html}
    */
  def makePoint(lon: scala.Double, lat: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  def makePoint(lon: scala.Double, lat: scala.Double, z: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  def makePoint(lon: scala.Double, lat: scala.Double, z: scala.Double, measure: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Attempts to make an invalid geometry valid without losing vertices.
    *
    * @see {@link https://postgis.net/docs/ST_MakeValid.html}
    */
  def makeValid(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * eturns an ST_Point with the given coordinate values. OGC alias for ST_MakePoint.
    *
    * @see {@link https://postgis.net/docs/ST_Point.html}
    */
  def point(lon: scala.Double, lat: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return a new geometry with its coordinates transformed to a different spatial reference.
    *
    * @see {@link https://postgis.net/docs/ST_Transform.html}
    */
  def transform(geom: knexDashPostgisLib.ColumnName, srid: scala.Double): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Returns true if the geometry A is completely inside geometry B
    *
    * @see {@link https://postgis.net/docs/ST_Within.html}
    */
  def within(geom1: knexDashPostgisLib.ColumnName, geom2: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return the X coordinate of the point, or NULL if not available. Input must be a point.
    *
    * @see {@link https://postgis.net/docs/ST_X.html}
    */
  def x(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
  /**
    * Return the Y coordinate of the point, or NULL if not available. Input must be a point.
    *
    * @see {@link https://postgis.net/docs/ST_Y.html}
    */
  def y(geom: knexDashPostgisLib.ColumnName): knexLib.knexMod.QueryBuilder = js.native
}

