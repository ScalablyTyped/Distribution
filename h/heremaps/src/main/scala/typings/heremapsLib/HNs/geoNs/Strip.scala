package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A strip is a flat list of latitude, longitude, altitude tuples in a fixed order.
  */
@JSGlobal("H.geo.Strip")
@js.native
/**
  * Constructor
  * @param opt_latLngAlts {Array<number>=} - An optional array of latitude, longitude and altitude triples to initialize the strip with.
  * @param opt_ctx {H.geo.AltitudeContext=} - An optional altitude context for all altitudes contained in this strip.
  */
class Strip () extends js.Object {
  def this(opt_latLngAlts: js.Array[scala.Double]) = this()
  def this(opt_latLngAlts: js.Array[scala.Double], opt_ctx: AltitudeContext) = this()
  /**
    * This method is a utility method that iterates over the lat, lng, alt array and calls the provided function for each 3 elements passing lat, lng and alt and the virtual point
    * index as arguments.
    * @param eachFn {function(H.geo.Latitude, H.geo.Longitude, H.geo.Altitude, number)} - the function to be called for each 3 elements
    * @param opt_start {number=} - an optional start index to iterate from
    * @param opt_end {number=} - an optional end index to iterate to
    */
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* n */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* n */ scala.Double, 
      scala.Unit
    ],
    opt_start: scala.Double
  ): scala.Unit = js.native
  def eachLatLngAlt(
    eachFn: js.Function4[
      /* lat */ Latitude, 
      /* lng */ Longitude, 
      /* alt */ Altitude, 
      /* n */ scala.Double, 
      scala.Unit
    ],
    opt_start: scala.Double,
    opt_end: scala.Double
  ): scala.Unit = js.native
  /**
    * This method extracts a H.geo.Point from this strip at the virtual point index. If the extracted point has an alt value, the strip's altitude context will be supplied to the point.
    * @param pointIndex {number} - the virtual point index in the strip
    * @param opt_out {H.geo.Point=} - an optional point object to store the lat, lng, alt values
    * @returns {H.geo.Point} - returns either the 'opt_out' point object or a new point object.
    */
  def extractPoint(pointIndex: scala.Double): Point = js.native
  def extractPoint(pointIndex: scala.Double, opt_out: Point): Point = js.native
  /**
    * This method returns the bounding box of this strip.
    * @returns {?H.geo.Rect} - this strip's bounding rectangle
    */
  def getBounds(): Rect = js.native
  /**
    * This method returns the number of times that legs in this strip cross the date border.
    * @param opt_closed {boolean=} - indicates whether the strip is closed (i.e. whether the strip's last and first coordinates form the closing leg of a polygon)
    * @returns {number} - the amount of times this strip crosses the date border.
    */
  def getDBCs(): scala.Double = js.native
  def getDBCs(opt_closed: scala.Boolean): scala.Double = js.native
  /**
    * This method returns the internal array keeping the lat, lng, alt values. Modifying this array directly can destroy the integrity of this strip. Use it only for read access.
    * @returns {Array<number>} - returns the raw lat, lng, alt values of this strip
    */
  def getLatLngAltArray(): js.Array[scala.Double] = js.native
  /**
    * This method return the number of points stored in this strip.
    * @returns {number} - the number of points in this strip
    */
  def getPointCount(): scala.Double = js.native
  /**
    * This method inserts one set of lat, lng, alt values into the strip at the specified index.
    * @param index {number} - the index at which to add the element
    * @param lat {H.geo.Latitude} - the latitude to insert
    * @param lng {H.geo.Longitude} - the longitude to insert
    * @param alt {H.geo.Altitude} - the altitude to insert
    */
  def insertLatLngAlt(index: scala.Double, lat: Latitude, lng: Longitude, alt: Altitude): scala.Unit = js.native
  /**
    * This method inserts the lat, lng, alt values of a H.geo.Point into the list at the specified index.
    * @param pointIndex {number}
    * @param geoPoint {H.geo.IPoint}
    */
  def insertPoint(pointIndex: scala.Double, geoPoint: IPoint): scala.Unit = js.native
  /**
    * This method pushes a lat, lng, alt to the end of this strip.
    * @param lat {H.geo.Latitude}
    * @param lng {H.geo.Longitude}
    * @param alt {H.geo.Altitude}
    */
  def pushLatLngAlt(lat: Latitude, lng: Longitude, alt: Altitude): scala.Unit = js.native
  /**
    * This method pushes the lat, lng, alt values of a H.geo.Point to the end of this strip.
    * @param geoPoint {H.geo.IPoint}
    */
  def pushPoint(geoPoint: IPoint): scala.Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from the strip at the specified index.
    * @param index {number}
    */
  def removeLatLngAlt(index: scala.Double): scala.Unit = js.native
  /**
    * This method removes one set of lat, lng, alt values from this strip at the virtual point index specified.
    * @param pointIndex {number} - the virtual point index
    */
  def removePoint(pointIndex: scala.Double): scala.Unit = js.native
  /**
    * This method splices the strip at the provided index, removing the specified number of items at that index and inserting the lat, lng, alt array.
    * @param index {number} - The index at which to splice
    * @param opt_nRemove {number=} - The number of lat, lng, alt values to remove
    * @param opt_latLngAlts {Array<number>=} - The lat, lng, alt values to add
    * @returns {Array<number>} - an array of removed elements
    */
  def spliceLatLngAlts(index: scala.Double): js.Array[scala.Double] = js.native
  def spliceLatLngAlts(index: scala.Double, opt_nRemove: scala.Double): js.Array[scala.Double] = js.native
  def spliceLatLngAlts(index: scala.Double, opt_nRemove: scala.Double, opt_latLngAlts: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

/**
  * A strip is a flat list of latitude, longitude, altitude tuples in a fixed order.
  */
@JSGlobal("H.geo.Strip")
@js.native
object Strip extends js.Object {
  /**
    * This method initializes a new strip with an array of lat, lng values. Arrays are expected to have an even length with the format [lat, lng, lat, lng, ...].
    * @param latLngs {Array<number>} - the array of lat, lng value.
    * @returns {H.geo.Strip} - the strip containing the lat, lng values
    */
  def fromLatLngArray(latLngs: js.Array[scala.Double]): heremapsLib.HNs.geoNs.Strip = js.native
  /**
    * This method checks whether two longitudes form a leg which crosses the date border.
    * @param lng1 {H.geo.Longitude} - the start longitude of the leg
    * @param lng2 {H.geo.Longitude} - the end longitude of the leg
    * @returns {boolean} - true if the leg crosses the date border, otherwise false
    */
  def isDBC(lng1: heremapsLib.HNs.geoNs.Longitude, lng2: heremapsLib.HNs.geoNs.Longitude): scala.Boolean = js.native
}

