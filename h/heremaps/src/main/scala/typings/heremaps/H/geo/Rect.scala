package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a rectangular geographic area. The area is defined by four geographical coordinates two (left, right) longitudes and two (top, bottom) latitudes.
  */
@js.native
trait Rect extends AbstractGeometry {
  /**
    * This method checks if the latitude and longitude supplied by the caller lie within the area of this rectangular area.
    * @param lat {H.geo.Latitude} - the latitude
    * @param lng {H.geo.Longitude} - the longitude
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @returns {boolean} - true if the latitude and longitude are contained in this area, otherwise false
    */
  def containsLatLng(lat: Latitude, lng: Longitude): Boolean = js.native
  def containsLatLng(lat: Latitude, lng: Longitude, opt_skipValidation: Boolean): Boolean = js.native
  /**
    * This method checks if the point supplied by the caller lies within the area of this rectangular area.
    * @param geoPoint {H.geo.IPoint} - the point
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @returns {boolean} - true if the point is contained in this area, otherwise false
    */
  def containsPoint(geoPoint: IPoint): Boolean = js.native
  def containsPoint(geoPoint: IPoint, opt_skipValidation: Boolean): Boolean = js.native
  /**
    * This method checks if the rectangular area supplied by the caller is completely contained within the area of this rectangular area.
    * @param geoRect {H.geo.Rect} - the rectangular area
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @returns {boolean} - true if the rectangular area is contained in this area, otherwise false
    */
  def containsRect(geoRect: Rect): Boolean = js.native
  def containsRect(geoRect: Rect, opt_skipValidation: Boolean): Boolean = js.native
  /**
    * To compare this rectangle with a supplied other rectangle for equality.
    * @param other {H.geo.Rect}
    * @returns {boolean} - Whether the two rectangles are equal.
    */
  def equals(other: Rect): Boolean = js.native
  /**
    * This method returns the south-most latitude of this rectangular area
    * @returns {H.geo.Latitude} - the south-most latitude of the area
    */
  def getBottom(): Latitude = js.native
  /**
    * This method returns the bottom-right corner of the rectangular area.
    * @returns {H.geo.Point} - the bottom-right corner of the area
    */
  def getBottomRight(): Point = js.native
  /**
    * This method returns the center point of this rectangular area
    * @returns {H.geo.Point} - the center point of the area
    */
  def getCenter(): Point = js.native
  /**
    * Returns this height of this rectangular area in decimal degrees.
    * @returns {number} - the height of this area
    */
  def getHeight(): Double = js.native
  /**
    * This method returns the left-most longitude of this rectangular area
    * @returns {H.geo.Longitude} - the left-most longitude of the area
    */
  def getLeft(): Longitude = js.native
  /**
    * This method returns the right-most longitude of this rectangular area
    * @returns {H.geo.Longitude} - the right-most longitude of the area
    */
  def getRight(): Longitude = js.native
  /**
    * This method returns the north-most latitude of this rectangular area
    * @returns {H.geo.Latitude} - the north-most latitude of the area
    */
  def getTop(): Latitude = js.native
  /**
    * This method returns the top-left corner of the rectangular area.
    * @returns {H.geo.Point} - the top-left corner of the area
    */
  def getTopLeft(): Point = js.native
  /**
    * Returns this width of this rectangular area in decimal degrees.
    * @returns {number} - the width of this area
    */
  def getWidth(): Double = js.native
  /**
    * This method checks if the intersection of two bounding boxes is non-empty.
    * @param geoRect {H.geo.Rect} - a rectangular area to be tested for intersection with this rectangular area
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @returns {boolean} - a boolean value indicating whether the two areas intersect
    */
  def intersects(geoRect: Rect): Boolean = js.native
  def intersects(geoRect: Rect, opt_skipValidation: Boolean): Boolean = js.native
  /**
    * Returns a boolean value indicating whether this rectangular area spans across the date border.
    * @returns {boolean} - true if the area spans across the date border, otherwise false
    */
  def isCDB(): Boolean = js.native
  /**
    * The method checks if the area enclosed by the given bounding box is 0.
    * @returns {boolean} - true if the dimensions of the area a 0, otherwise false
    */
  def isEmpty(): Boolean = js.native
  /**
    * This method returns the smallest bounding box that covers this rectangular area and the latitude and longitude supplied by the caller.
    * @param lat {H.geo.Latitude} - the latitude
    * @param lng {H.geo.Longitude} - the longitude
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @param opt_out {H.geo.Rect=} - an optional rectangular area to store the result
    * @returns {H.geo.Rect} - either the rectangular area passed as out parameter or a new rectangular area
    */
  def mergeLatLng(lat: Latitude, lng: Longitude): Rect = js.native
  def mergeLatLng(lat: Latitude, lng: Longitude, opt_skipValidation: Boolean): Rect = js.native
  def mergeLatLng(lat: Latitude, lng: Longitude, opt_skipValidation: Boolean, opt_out: Rect): Rect = js.native
  /**
    * This method returns the smallest bounding box that covers this rectangular area and the point supplied by the caller.
    * @param geoPoint {H.geo.IPoint} - the point to merge
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @param opt_out {H.geo.Rect=} - an optional rectangular area to store the result
    * @returns {H.geo.Rect} - either the rectangular area passed as out parameter or a new rectangular area
    */
  def mergePoint(geoPoint: IPoint): Rect = js.native
  def mergePoint(geoPoint: IPoint, opt_skipValidation: Boolean): Rect = js.native
  def mergePoint(geoPoint: IPoint, opt_skipValidation: Boolean, opt_out: Rect): Rect = js.native
  /**
    * This method returns the smallest bounding box that covers this rectangular area and the rectangular area supplied by the caller.
    * @param geoRect {H.geo.Rect} - the point to merge
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @param opt_out {H.geo.Rect=} - an optional rectangular area to store the result
    * @returns {H.geo.Rect} - either the rectangular area passed as out parameter or a new rectangular area
    */
  def mergeRect(geoRect: Rect): Rect = js.native
  def mergeRect(geoRect: Rect, opt_skipValidation: Boolean): Rect = js.native
  def mergeRect(geoRect: Rect, opt_skipValidation: Boolean, opt_out: Rect): Rect = js.native
  /**
    * This method returns the smallest bounding box that covers this rectangular area and the rectangular area supplied by the caller.
    * @param top {H.geo.Latitude} - The top latitude of the rectangle to merge
    * @param left {H.geo.Longitude} - The left longitude of the rectangle to merge
    * @param bottom {H.geo.Latitude} - The bottom latitude of the rectangle to merge
    * @param right {H.geo.Longitude} - The right longitude of the rectangle to merge
    * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
    * @param opt_out {H.geo.Rect=} - an optional rectangular area to store the result
    * @returns {H.geo.Rect} - either the rectangular area passed as out parameter or a new rectangular area
    */
  def mergeTopLeftBottomRight(top: Latitude, left: Longitude, bottom: Latitude, right: Longitude): Rect = js.native
  def mergeTopLeftBottomRight(top: Latitude, left: Longitude, bottom: Latitude, right: Longitude, opt_skipValidation: Boolean): Rect = js.native
  def mergeTopLeftBottomRight(
    top: Latitude,
    left: Longitude,
    bottom: Latitude,
    right: Longitude,
    opt_skipValidation: Boolean,
    opt_out: Rect
  ): Rect = js.native
  /**
    * This method clones the given bounding rect and resizes the clone if necessary until the location supplied by the caller is at its center.
    * @param center {H.geo.IPoint} - a point which is to be the center of the resized rectangular area
    * @param opt_out {H.geo.Rect=} - an optional rectangular area to store the result
    * @returns {H.geo.Rect} - the resized rectangular area
    */
  def resizeToCenter(center: IPoint): Rect = js.native
  def resizeToCenter(center: IPoint, opt_out: Rect): Rect = js.native
}

