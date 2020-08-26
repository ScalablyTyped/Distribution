package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineString extends AbstractGeometry {
  /**
    * A utility method to iterate over the points of a line string.
    * @param eachFn {function(lat, lng, alt, index)} - The function to invoke for every point. It gets the point's latitude, longitude, altitude and index as arguments.
    * @param opt_start {number=} - The point's start index (inclusive) to iterate from, defaults to 0.
    * @param opt_end {number=} - The point's end index (exclusive) to iterate to, defaults to Infinity.
    */
  def eachLatLngAlt(
    eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit]
  ): Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit],
    opt_start: js.UndefOr[scala.Nothing],
    opt_end: Double
  ): Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit],
    opt_start: Double
  ): Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit],
    opt_start: Double,
    opt_end: Double
  ): Unit = js.native
  /**
    * This method extracts a H.geo.Point from this LineString at the virtual point index.
    * If the extracted point has an alt value, the LineString's altitude context will be supplied to the point.
    * @param pointIndex {number} - the virtual point index in the LineString
    * @param opt_out {H.geo.Point=} - an optional point object to store the lat, lng, alt values
    * @return {H.geo.Point} - Returns either the 'opt_out' point object or a new point object.
    */
  def extractPoint(pointIndex: Double): Point = js.native
  def extractPoint(pointIndex: Double, opt_out: Point): Point = js.native
  /**
    * This method returns the bounding box of this LineString.
    * Note: The LineString is treated as an open path. If the bounding rectangle for a closed shape is required, the closing leg must be merged in an extra step.
    * @return {H.geo.Rect} - This LineString's bounding rectangle
    */
  def getBounds(): Rect = js.native
  /**
    * To obtain the number of times that this LineString cross the International Date Line.
    * @param opt_asClosed {boolean=} - Indicates whether the LineString is treated as closed (the LineString's last and first coordinates form the closing leg of a polygon).
    * It defaults to false.
    * @return {number}
    */
  def getDBCs(): Double = js.native
  def getDBCs(opt_asClosed: Boolean): Double = js.native
  /**
    * Returns the vertices of the line segments as an array of alternating latitude, longitude and altitude coordinates.
    * The returned array must be treated as read-only to not violate the integrity of the line-string.
    * @return {number[]} - Returns the raw lat, lng, alt values of this LineString
    */
  def getLatLngAltArray(): js.Array[Double] = js.native
  /**
    * This method return the number of points stored in this LineString.
    * @return {number} - The number of points in this LineString
    */
  def getPointCount(): Double = js.native
  /**
    * This method inserts one set of lat, lng, alt values into the LineString at the specified index.
    * @param index {number} - the index at which to add the element
    * @param lat {H.geo.Latitude} - the latitude to insert
    * @param lng {H.geo.Longitude} - the longitude to insert
    * @param alt {H.geo.Altitude} - the altitude to insert
    */
  def insertLatLngAlt(index: Double, lat: Latitude, lng: Longitude, alt: Altitude): Unit = js.native
  /**
    * This method inserts the lat, lng, alt values of a H.geo.Point into the list at the specified index.
    * @param pointIndex {number}
    * @param geoPoint {H.geo.IPoint}
    */
  def insertPoint(pointIndex: Double, geoPoint: IPoint): Unit = js.native
  /**
    * This method pushes a lat, lng, alt to the end of this LineString.
    * @param lat {H.geo.Latitude}
    * @param lng {H.geo.Longitude}
    * @param alt {H.geo.Altitude}
    * @throws {H.lang.InvalidArgumentError} - in case of invalid lat, lng, alt value
    */
  def pushLatLngAlt(lat: Latitude, lng: Longitude, alt: Altitude): Unit = js.native
  /**
    * This method pushes the lat, lng, alt values of a {H.geo.Point} to the end of this LineString.
    * @param geoPoint {H.geo.IPoint}
    * @throws {H.lang.InvalidArgumentError} - in case of invalid geoPoint argument
    */
  def pushPoint(geoPoint: IPoint): Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from the LineString at the specified index
    * @param index {number}
    */
  def removeLatLngAlt(index: Double): Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from this LineString at the virtual point index specified.
    * @param pointIndex {number} - the virtual point index
    */
  def removePoint(pointIndex: Double): Unit = js.native
  /**
    * This method splices the LineString at the provided index, removing the specified number of items at that index and inserting the lat, lng, alt array.
    * @param index {number} - The index at which to splice
    * @param opt_nRemove {number=} - The number of lat, lng, alt values to remove
    * @param opt_latLngAlts {number[]=} - The lat, lng, alt values to add
    * @return {number[]} - An array of removed elements
    * @throws {H.lang.InvalidArgumentError} - in case of invalid opt_latLngAlts argument
    */
  def spliceLatLngAlts(index: Double): js.Array[Double] = js.native
  def spliceLatLngAlts(index: Double, opt_nRemove: js.UndefOr[scala.Nothing], opt_latLngAlts: js.Array[Double]): js.Array[Double] = js.native
  def spliceLatLngAlts(index: Double, opt_nRemove: Double): js.Array[Double] = js.native
  def spliceLatLngAlts(index: Double, opt_nRemove: Double, opt_latLngAlts: js.Array[Double]): js.Array[Double] = js.native
}

