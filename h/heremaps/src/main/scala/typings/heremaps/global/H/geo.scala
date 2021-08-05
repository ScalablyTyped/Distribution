package typings.heremaps.global.H

import typings.heremaps.H.geo.Altitude
import typings.heremaps.H.geo.AltitudeContext
import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.IProjection
import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** geo *****/
object geo {
  
  /**
    * The base class for all geometry types.
    */
  @JSGlobal("H.geo.AbstractGeometry")
  @js.native
  class AbstractGeometry ()
    extends StObject
       with typings.heremaps.H.geo.AbstractGeometry {
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
  /**
    * Contexts for altitudes to specify the contextual origin of an altitude's value
    */
  @JSGlobal("H.geo.AltitudeContext")
  @js.native
  object AltitudeContext extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.geo.AltitudeContext & Double] = js.native
    
    /* 1 */ val GL: typings.heremaps.H.geo.AltitudeContext.GL & Double = js.native
    
    /* 2 */ val OL: typings.heremaps.H.geo.AltitudeContext.OL & Double = js.native
    
    /* 4 */ val SB: typings.heremaps.H.geo.AltitudeContext.SB & Double = js.native
    
    /* 3 */ val SL: typings.heremaps.H.geo.AltitudeContext.SL & Double = js.native
    
    /* 5 */ val WE: typings.heremaps.H.geo.AltitudeContext.WE & Double = js.native
    
    /* 6 */ val WG: typings.heremaps.H.geo.AltitudeContext.WG & Double = js.native
    
    /* 0 */ val undefined: typings.heremaps.H.geo.AltitudeContext.undefined & Double = js.native
  }
  
  @JSGlobal("H.geo.LineString")
  @js.native
  /**
    * Constructor
    * @param opt_latLngAlts {number[]=} - An optional array of latitude, longitude and altitude triples to initialize the LineString with.
    * @param opt_ctx {H.geo.AltitudeContext=} - An optional altitude context for all altitudes contained in this LineString.
    * @throws {H.lang.InvalidArgumentError} - in case of invalid lat, lng, alt values
    */
  class LineString ()
    extends StObject
       with typings.heremaps.H.geo.LineString {
    def this(opt_latLngAlts: js.Array[Double]) = this()
    def this(opt_latLngAlts: js.Array[Double], opt_ctx: AltitudeContext) = this()
    def this(opt_latLngAlts: Unit, opt_ctx: AltitudeContext) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  object LineString {
    
    @JSGlobal("H.geo.LineString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method initializes a new LineString with an array of lat, lng values. Arrays are expected to have an even length with the format [lat, lng, lat, lng, ...].
      * @param latLngs {number[]} - the array of lat, lng value.
      * @return {H.geo.LineString} - The LineString containing the lat, lng values
      * @throws {H.lang.InvalidArgumentError} - throws an error in case the latLngs array has an odd length
      */
    /* static member */
    inline def fromLatLngArray(latLngs: js.Array[Double]): typings.heremaps.H.geo.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngArray")(latLngs.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.geo.LineString]
    
    /**
      * To obtain whether a leg (formed by the given two longitudes) crosses the International Date Line.
      * @param lng1 {H.geo.Longitude} - The start longitude of the leg
      * @param lng2 {H.geo.Longitude} - The end longitude of the leg
      * @return {boolean}
      */
    /* static member */
    inline def isDBC(lng1: Longitude, lng2: Longitude): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDBC")(lng1.asInstanceOf[js.Any], lng2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("H.geo.MultiGeometry")
  @js.native
  class MultiGeometry[T] protected ()
    extends StObject
       with typings.heremaps.H.geo.MultiGeometry[T] {
    /**
      * The base class for a geometry that is a container for multiple geometries of a generic type. The type of the contained geometries is specified by the generic type parameter T
      * @param geometries {T[]} - The list of geometries which are initially aggregated.
      * @throws {H.lang.InvalidArgumentError} - if geometries parameter is not valid
      */
    def this(geometries: js.Array[T]) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
  @JSGlobal("H.geo.MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends StObject
       with typings.heremaps.H.geo.MultiLineString {
    /**
      * A MultiLineString is a collection of line strings represented as a H.geo.MultiGeometry with a H.geo.LineString as generic type parameter T.
      * @param lineStrings {H.geo.LineString[]} - The list of line-strings which are initially represented by the MultiLineString.
      * @throws {H.lang.InvalidArgumentError} - if the lineStrings argument is not valid
      */
    def this(lineStrings: js.Array[typings.heremaps.H.geo.LineString]) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
  @JSGlobal("H.geo.MultiPoint")
  @js.native
  class MultiPoint ()
    extends StObject
       with typings.heremaps.H.geo.MultiGeometry[typings.heremaps.H.geo.Point] {
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
  @JSGlobal("H.geo.MultiPolygon")
  @js.native
  class MultiPolygon ()
    extends StObject
       with typings.heremaps.H.geo.MultiGeometry[typings.heremaps.H.geo.Polygon] {
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
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
  class PixelProjection ()
    extends StObject
       with typings.heremaps.H.geo.PixelProjection {
    def this(opt_projection: IProjection) = this()
    def this(opt_projection: Unit, opt_sizeAtLevelZero: Double) = this()
    def this(opt_projection: IProjection, opt_sizeAtLevelZero: Double) = this()
  }
  
  /**
    * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
    * @property lat {H.geo.Latitude} - The latitude coordinate.
    * @property lng {H.geo.Longitude} - The longitude coordinate.
    * @property alt {H.geo.Altitude} - The altitude coordinate.
    * @property ctx {H.geo.AltitudeContext} - The altitude context.
    */
  @JSGlobal("H.geo.Point")
  @js.native
  class Point protected ()
    extends StObject
       with typings.heremaps.H.geo.Point {
    /**
      * Constructor
      * @property lat {H.geo.Latitude} - The latitude coordinate.
      * @property lng {H.geo.Longitude} - The longitude coordinate.
      * @property opt_alt {H.geo.Altitude=} - The altitude coordinate.
      * @property opt_ctx {H.geo.AltitudeContext=} - The altitude context.
      */
    def this(lat: Latitude, lng: Longitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: Altitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: Unit, opt_ctx: AltitudeContext) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: Altitude, opt_ctx: AltitudeContext) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
    
    /* CompleteClass */
    var lat: Latitude = js.native
    
    /* CompleteClass */
    var lng: Longitude = js.native
  }
  object Point {
    
    @JSGlobal("H.geo.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method creates a Point instance from a given IPoint object.
      * @param iPoint {H.geo.IPoint} - The IPoint object to use
      * @returns {H.geo.Point} - the created Point instance
      */
    /* static member */
    inline def fromIPoint(iPoint: IPoint): typings.heremaps.H.geo.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIPoint")(iPoint.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.geo.Point]
    
    /**
      * This method validates the given IPoint. It checks, if lat, lng, alt and ctx have valid types. Additionally the value of the lat property is clamped into a range of -90 ... +90
      * and the value of the lng property is modulo into a range of -180 ... +180 plus validates the values of the alt and ctx properties
      * @param point {H.geo.IPoint} - The point to validate
      * @param opt_caller {Function=} - The caller to use for InvalidArgumentError. If omitted no error is thrown
      * @param opt_argNr {number=} - The argument number to use for InvalidArgumentError.
      * @returns {boolean} - if the given point could validate
      */
    /* static member */
    inline def validate(point: IPoint): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(point.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def validate(point: IPoint, opt_caller: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(point.asInstanceOf[js.Any], opt_caller.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(point: IPoint, opt_caller: js.Function0[Unit], opt_argNr: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(point.asInstanceOf[js.Any], opt_caller.asInstanceOf[js.Any], opt_argNr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(point: IPoint, opt_caller: Unit, opt_argNr: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(point.asInstanceOf[js.Any], opt_caller.asInstanceOf[js.Any], opt_argNr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html
    */
  @JSGlobal("H.geo.Polygon")
  @js.native
  class Polygon protected ()
    extends StObject
       with typings.heremaps.H.geo.Polygon {
    def this(exterior: typings.heremaps.H.geo.LineString) = this()
    def this(
      exterior: typings.heremaps.H.geo.LineString,
      opt_interiors: js.Array[typings.heremaps.H.geo.LineString]
    ) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  
  /**
    * This class represents a rectangular geographic area. The area is defined by four geographical coordinates two (left, right) longitudes and two (top, bottom) latitudes.
    */
  @JSGlobal("H.geo.Rect")
  @js.native
  class Rect protected ()
    extends StObject
       with typings.heremaps.H.geo.Rect {
    /**
      * Constructor
      * @param top {H.geo.Latitude} - the northern-most latitude
      * @param left {H.geo.Longitude} - the left-most longitude
      * @param bottom {H.geo.Latitude} - the southern-most latitude
      * @param right {H.geo.Longitude} - the right-most latitude
      */
    def this(top: Latitude, left: Longitude, bottom: Latitude, right: Longitude) = this()
    
    /**
      * Checks whether the geometry is equal to the geometry supplied by the caller.
      * Two geometries are considered as equal if they represent the same geometry type and have equal coordinate values.
      * @param other {any} - The geometry to check against
      * @return {boolean} - true if the two geometries are equal, otherwise false
      */
    /* CompleteClass */
    override def equals(other: js.Any): Boolean = js.native
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    /* CompleteClass */
    override def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  }
  object Rect {
    
    @JSGlobal("H.geo.Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method creates the minimum rectangular area covering all of the coordinates in the argument array.
      * @param latLngAltArray {Array<number>} - the array of coordinates to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {(H.geo.Rect | undefined)} - returns the minimum rectangular area covering the coordinates
      */
    /* static member */
    inline def coverLatLngAlts(latLngAltArray: js.Array[Double]): typings.heremaps.H.geo.Rect | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("coverLatLngAlts")(latLngAltArray.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.geo.Rect | Unit]
    inline def coverLatLngAlts(latLngAltArray: js.Array[Double], opt_skipValidation: Boolean): typings.heremaps.H.geo.Rect | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("coverLatLngAlts")(latLngAltArray.asInstanceOf[js.Any], opt_skipValidation.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect | Unit]
    
    /**
      * This method creates the minimum rectangular area covering all of the points in the argument array.
      * @param pointArray {Array<H.geo.IPoint>} - the array of points to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {H.geo.Rect} - returns the minimum rectangular area covering the points or null if no point is covered
      */
    /* static member */
    inline def coverPoints(pointArray: js.Array[IPoint]): typings.heremaps.H.geo.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("coverPoints")(pointArray.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.geo.Rect]
    inline def coverPoints(pointArray: js.Array[IPoint], opt_skipValidation: Boolean): typings.heremaps.H.geo.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("coverPoints")(pointArray.asInstanceOf[js.Any], opt_skipValidation.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect]
    
    /**
      * This method creates the minimum rectangular area covering all of the rectangular areas in the argument array.
      * @param rectArray {Array<H.geo.Rect>} - the array of points to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {(H.geo.Rect | undefined)} - returns the minimum rectangular area covering the rectangular areas
      */
    /* static member */
    inline def coverRects(rectArray: js.Array[typings.heremaps.H.geo.Rect]): typings.heremaps.H.geo.Rect | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("coverRects")(rectArray.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.geo.Rect | Unit]
    inline def coverRects(rectArray: js.Array[typings.heremaps.H.geo.Rect], opt_skipValidation: Boolean): typings.heremaps.H.geo.Rect | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("coverRects")(rectArray.asInstanceOf[js.Any], opt_skipValidation.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect | Unit]
    
    /**
      * This method creates a rectangular area from a top-left and bottom-right point pair.
      * @param topLeft {H.geo.IPoint} - the top-left corner of the area
      * @param bottomRight {H.geo.IPoint} - the bottom-right corner of the area
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {H.geo.Rect} - returns the rectangular area defined by the top-left and bottom-right corners
      */
    /* static member */
    inline def fromPoints(topLeft: IPoint, bottomRight: IPoint): typings.heremaps.H.geo.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect]
    inline def fromPoints(topLeft: IPoint, bottomRight: IPoint, opt_skipValidation: Boolean): typings.heremaps.H.geo.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any], opt_skipValidation.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect]
    
    /**
      * This method merges two rects by their values. The result of the merge is a bounding rect which covers all provided rect bounds.
      * @param topA {H.geo.Latitude} - the northern-most latitude
      * @param leftA {H.geo.Longitude} - the left-most longitude of operand A
      * @param bottomA {H.geo.Latitude} - the southern-most latitude of operand A
      * @param rightA {H.geo.Longitude} - the right-most latitude of operand A
      * @param topB {H.geo.Latitude} - the northern-most latitude of operand B
      * @param leftB {H.geo.Longitude} - the left-most longitude of operand B
      * @param bottomB {H.geo.Latitude} - the southern-most latitude of operand B
      * @param rightB {H.geo.Longitude} - the right-most latitude of operand B
      * @param opt_out {H.geo.Rect=} - an optional rect to store the results
      * @returns {H.geo.Rect} - either the opt_out rect or a new rect
      */
    /* static member */
    inline def merge(
      topA: Latitude,
      leftA: Longitude,
      bottomA: Latitude,
      rightA: Longitude,
      topB: Latitude,
      leftB: Longitude,
      bottomB: Latitude,
      rightB: Longitude
    ): typings.heremaps.H.geo.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(topA.asInstanceOf[js.Any], leftA.asInstanceOf[js.Any], bottomA.asInstanceOf[js.Any], rightA.asInstanceOf[js.Any], topB.asInstanceOf[js.Any], leftB.asInstanceOf[js.Any], bottomB.asInstanceOf[js.Any], rightB.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect]
    inline def merge(
      topA: Latitude,
      leftA: Longitude,
      bottomA: Latitude,
      rightA: Longitude,
      topB: Latitude,
      leftB: Longitude,
      bottomB: Latitude,
      rightB: Longitude,
      opt_out: typings.heremaps.H.geo.Rect
    ): typings.heremaps.H.geo.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(topA.asInstanceOf[js.Any], leftA.asInstanceOf[js.Any], bottomA.asInstanceOf[js.Any], rightA.asInstanceOf[js.Any], topB.asInstanceOf[js.Any], leftB.asInstanceOf[js.Any], bottomB.asInstanceOf[js.Any], rightB.asInstanceOf[js.Any], opt_out.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.geo.Rect]
  }
}
