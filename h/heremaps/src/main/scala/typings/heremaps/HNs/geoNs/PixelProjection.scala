package typings.heremaps.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PixelProjection transforms pixel world coordinates at a certain scale (zoom level) to geographical coordinates and vice versa.
  * By default, it uses the Mercator projection to transform geographic points into the 2d plane map points, which are adjusted to the current scale.
  * @property projection {H.geo.IProjection} - This property indicates the geographical projection that underlies the given PixelProjection.
  * @property x {number} - This property holds the x-offset in the projection relative to the top-left corner of the screen.
  * @property y {number} - This property holds the y-offset in the projection relative to the top-left corner of the screen.
  * @property w {number} - This property holds a value indicating the width of the world in pixels.
  * @property h {number} - This property holds a value indicating the height of the world in pixels.
  */
@JSGlobal("H.geo.PixelProjection")
@js.native
/**
  * Constructor
  * @param opt_projection {H.geo.IProjection=} - An object representing the projection to use, the default is spherical Mercator H.geo.mercator
  * @param opt_sizeAtLevelZero {number=} A value indicating the size of a tile representation of the world in pixels at zoom level 0, the default is 256
  */
class PixelProjection () extends js.Object {
  def this(opt_projection: IProjection) = this()
  def this(opt_projection: IProjection, opt_sizeAtLevelZero: Double) = this()
  var h: Double = js.native
  var projection: IProjection = js.native
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  /**
    * This method translates a point defines in terms of its geographic coordinates to pixel coordinates at the specified zoom level.
    * @param geoPoint {H.geo.IPoint} - An object containing the geographic coordinates
    * @param opt_out {H.math.IPoint=} - An optional point to store the result
    * @return {H.math.IPoint} - An object representing the results of the the conversion to pixel coordinates
    */
  def geoToPixel(geoPoint: IPoint): typings.heremaps.HNs.mathNs.IPoint = js.native
  def geoToPixel(geoPoint: IPoint, opt_out: typings.heremaps.HNs.mathNs.IPoint): typings.heremaps.HNs.mathNs.IPoint = js.native
  /**
    * This method retrieves the current zoom scale factor previously set by a call to H.geo.PixelProjection#rescale.
    * @return {number} - A value indicating the zoom scale factor
    */
  def getZoomScale(): Double = js.native
  /**
    * This method translates geographical coordinates (latitude, longitude) supplied by the caller into a point defined in terms of pixel coordinates.
    * This method accepts longitudes outside of the normal longitude range.
    * @param latitude {number} - The latitude to translate
    * @param longitude {number} - The longitude to translate
    * @param opt_out {H.math.IPoint=} - An optional point to store the result
    * @return {H.math.Point} - The results of the conversion as a point object containing x and y coordinates (in pixels)
    */
  def latLngToPixel(latitude: Double, longitude: Double): typings.heremaps.HNs.mathNs.Point = js.native
  def latLngToPixel(latitude: Double, longitude: Double, opt_out: typings.heremaps.HNs.mathNs.IPoint): typings.heremaps.HNs.mathNs.Point = js.native
  /**
    * This method translates a point defined in terms of its pixel coordinates to a location defined in geographic coordinates.
    * @param point {H.math.IPoint} - An object defining a location on the screen in terms of pixel coordinates
    * @param opt_out {H.geo.IPoint=} - An optional point to store the result
    * @return {H.geo.IPoint} - An object representing the results of conversion to a geographic location
    */
  def pixelToGeo(point: typings.heremaps.HNs.mathNs.IPoint): IPoint = js.native
  def pixelToGeo(point: typings.heremaps.HNs.mathNs.IPoint, opt_out: IPoint): IPoint = js.native
  /**
    * This method method translates a map point to world pixel coordinates relative to current projection offset.
    * @param point {H.math.IPoint} - An object representing the map point to convert
    * @return {H.math.Point} - The result of the conversion as an object containing pixel coordinate
    */
  def pointToPixel(point: typings.heremaps.HNs.mathNs.IPoint): typings.heremaps.HNs.mathNs.Point = js.native
  /**
    * This method updates the scale exponent for the pixel projection.
    * @param zoom {number} - A value indicating the zoom level
    */
  def rescale(zoom: Double): Unit = js.native
  /**
    * This method translates the x and y coordinates of a pixel to a geographic point.
    * @param x {number} - A value indicating the pixel x-coordinate
    * @param y {number} - A value indicating the pixel y-coordinate
    * @param opt_out {H.geo.Point=} - An optional point to store the result
    * @return {H.geo.Point} - An object representing the results of the conversion to a geographic location
    */
  def xyToGeo(x: Double, y: Double): Point = js.native
  def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
}

