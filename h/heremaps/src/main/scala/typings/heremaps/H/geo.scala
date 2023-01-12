package typings.heremaps.H

import typings.heremaps.H.geo.Polygon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** geo *****/
object geo {
  
  @js.native
  sealed trait AltitudeContext extends StObject
  /**
    * Contexts for altitudes to specify the contextual origin of an altitude's value
    */
  @JSGlobal("H.geo.AltitudeContext")
  @js.native
  object AltitudeContext extends StObject {
    
    /** Ground level */
    @js.native
    sealed trait GL
      extends StObject
         with AltitudeContext
    
    /** Obstruction level */
    @js.native
    sealed trait OL
      extends StObject
         with AltitudeContext
    
    /** Sea bed level */
    @js.native
    sealed trait SB
      extends StObject
         with AltitudeContext
    
    /** Mean sea level */
    @js.native
    sealed trait SL
      extends StObject
         with AltitudeContext
    
    /** WGS84 ellipsoid */
    @js.native
    sealed trait WE
      extends StObject
         with AltitudeContext
    
    /** WGS84 geoid */
    @js.native
    sealed trait WG
      extends StObject
         with AltitudeContext
    
    /** Ground level */
    @js.native
    sealed trait undefined
      extends StObject
         with AltitudeContext
  }
  
  /**
    * The base class for all geometry types.
    */
  trait AbstractGeometry extends StObject {
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    def getBoundingBox(): Rect
    
    /**
      * To obtain a GeoJSON representation of the given geometry.
      * @return {object} - A GeoJSON Geometry object representing the given geometry.
      */
    def toGeoJSON(): js.Object
  }
  object AbstractGeometry {
    
    inline def apply(getBoundingBox: () => Rect, toGeoJSON: () => js.Object): AbstractGeometry = {
      val __obj = js.Dynamic.literal(getBoundingBox = js.Any.fromFunction0(getBoundingBox), toGeoJSON = js.Any.fromFunction0(toGeoJSON))
      __obj.asInstanceOf[AbstractGeometry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractGeometry] (val x: Self) extends AnyVal {
      
      inline def setGetBoundingBox(value: () => Rect): Self = StObject.set(x, "getBoundingBox", js.Any.fromFunction0(value))
      
      inline def setToGeoJSON(value: () => js.Object): Self = StObject.set(x, "toGeoJSON", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A Geographic coordinate that specifies the height of a point in meters. A value of undefined is treated as 0.
    */
  type Altitude = Double
  
  /**
    * An interface to represent a geographic point. Every point in geo space is represented by three coordinates latitude, longitude and optional altitude.
    * @property lat {H.geo.Latitude} - The latitude coordinate.
    * @property lng {H.geo.Longitude} - The longitude coordinate.
    * @property alt {H.geo.Altitude=} - The altitude coordinate.
    * @property ctx {H.geo.AltitudeContext=} - The altitude context.
    */
  trait IPoint extends StObject {
    
    var alt: js.UndefOr[Altitude] = js.undefined
    
    var ctx: js.UndefOr[AltitudeContext] = js.undefined
    
    var lat: Latitude
    
    var lng: Longitude
  }
  object IPoint {
    
    inline def apply(lat: Latitude, lng: Longitude): IPoint = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: Altitude): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCtx(value: AltitudeContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      inline def setLat(value: Latitude): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Longitude): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProjection extends StObject {
    
    def geoToPoint(geoPoint: IPoint): typings.heremaps.H.math.Point = js.native
    def geoToPoint(geoPoint: IPoint, opt_out: typings.heremaps.H.math.Point): typings.heremaps.H.math.Point = js.native
    
    def latLngToPoint(lat: Double, lng: Double): typings.heremaps.H.math.Point = js.native
    def latLngToPoint(lat: Double, lng: Double, opt_out: typings.heremaps.H.math.Point): typings.heremaps.H.math.Point = js.native
    
    def pointToGeo(point: typings.heremaps.H.math.IPoint): Point = js.native
    def pointToGeo(point: typings.heremaps.H.math.IPoint, opt_out: Point): Point = js.native
    
    def xyToGeo(x: Double, y: Double): Point = js.native
    def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
  }
  
  /**
    * A geographic coordinate that specifies the north-south position of a point on the Earth's surface in the range from -90 to + 90 degrees, inclusive.
    */
  type Latitude = Double
  
  @js.native
  trait LineString
    extends StObject
       with AbstractGeometry {
    
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
      opt_start: Double
    ): Unit = js.native
    def eachLatLngAlt(
      eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit],
      opt_start: Double,
      opt_end: Double
    ): Unit = js.native
    def eachLatLngAlt(
      eachFn: js.Function4[/* lat */ Latitude, /* lng */ Longitude, /* alt */ Altitude, /* index */ Double, Unit],
      opt_start: Unit,
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
    def spliceLatLngAlts(index: Double, opt_nRemove: Double): js.Array[Double] = js.native
    def spliceLatLngAlts(index: Double, opt_nRemove: Double, opt_latLngAlts: js.Array[Double]): js.Array[Double] = js.native
    def spliceLatLngAlts(index: Double, opt_nRemove: Unit, opt_latLngAlts: js.Array[Double]): js.Array[Double] = js.native
  }
  
  /**
    * A Geographic coordinate that specifies the east-west position of a point on the Earth's surface in the range from -180 to 180 degrees, inclusive.
    */
  type Longitude = Double
  
  @js.native
  trait MultiGeometry[T]
    extends StObject
       with AbstractGeometry {
    
    /**
      * Returns the bounding rectangle of the geometry.
      * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
      */
    def getBounds(): Rect = js.native
    
    /**
      * Returns the aggregated geometries of the multi-geometry. The returned geometries must be treated as read-only to not violate the integrity of the multi-geometry.
      * @return {T[]} - An array of geometries
      */
    def getGeometries(): js.Array[T] = js.native
    
    /**
      * Adds the specified geometry to the current multi-geometry.
      * @param geometry {T} - A geometry which will be added to the current multi-geometry
      * @throws {H.lang.InvalidArgumentError} - in case of invalid geometry argument
      */
    def push(geometry: T): Unit = js.native
    
    /**
      * Removes the specified geometry from the multi-geometry
      * @param geometry {T} - The geometry (by reference) to remove from this multi-geometry.
      * @return {T} - the removed geometry or null if the geometry was not found
      */
    def remove(geometry: T): T = js.native
    
    /**
      * Removes a contained geometry at the given index.
      * @param index {number} - The index of the geometry to remove.
      * @return {T} - the removed geometry.
      * @throws {H.lang.OutOfRangeError} - if no geometry exists at the given index.
      */
    def removeAt(index: Double): T = js.native
    
    /**
      * This method splices the specified MultiGeometry at the provided index, removing the specified number of items at that index and inserting new items.
      * @param index {number} - The index at which to start changing the list.
      * @param opt_deleteCount {number=} - The number of geometries to remove.
      * @param opt_items {T[]=} - The geometries to add.
      * @return {T[]} - the removed geometries.
      */
    def splice(index: Double): js.Array[T] = js.native
    def splice(index: Double, opt_deleteCount: Double): js.Array[T] = js.native
    def splice(index: Double, opt_deleteCount: Double, opt_items: js.Array[T]): js.Array[T] = js.native
    def splice(index: Double, opt_deleteCount: Unit, opt_items: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait MultiLineString
    extends StObject
       with MultiGeometry[LineString]
  
  type MultiPoint = MultiGeometry[Point]
  
  type MultiPolygon = MultiGeometry[Polygon]
  
  /**
    * PixelProjection transforms pixel world coordinates at a certain scale (zoom level) to geographical coordinates and vice versa.
    * By default, it uses the Mercator projection to transform geographic points into the 2d plane map points, which are adjusted to the current scale.
    * @property projection {H.geo.IProjection} - This property indicates the geographical projection that underlies the given PixelProjection.
    * @property x {number} - This property holds the x-offset in the projection relative to the top-left corner of the screen.
    * @property y {number} - This property holds the y-offset in the projection relative to the top-left corner of the screen.
    * @property w {number} - This property holds a value indicating the width of the world in pixels.
    * @property h {number} - This property holds a value indicating the height of the world in pixels.
    */
  @js.native
  trait PixelProjection extends StObject {
    
    /**
      * This method translates a point defines in terms of its geographic coordinates to pixel coordinates at the specified zoom level.
      * @param geoPoint {H.geo.IPoint} - An object containing the geographic coordinates
      * @param opt_out {H.math.IPoint=} - An optional point to store the result
      * @return {H.math.IPoint} - An object representing the results of the the conversion to pixel coordinates
      */
    def geoToPixel(geoPoint: IPoint): typings.heremaps.H.math.IPoint = js.native
    def geoToPixel(geoPoint: IPoint, opt_out: typings.heremaps.H.math.IPoint): typings.heremaps.H.math.IPoint = js.native
    
    /**
      * This method retrieves the current zoom scale factor previously set by a call to H.geo.PixelProjection#rescale.
      * @return {number} - A value indicating the zoom scale factor
      */
    def getZoomScale(): Double = js.native
    
    var h: Double = js.native
    
    /**
      * This method translates geographical coordinates (latitude, longitude) supplied by the caller into a point defined in terms of pixel coordinates.
      * This method accepts longitudes outside of the normal longitude range.
      * @param latitude {number} - The latitude to translate
      * @param longitude {number} - The longitude to translate
      * @param opt_out {H.math.IPoint=} - An optional point to store the result
      * @return {H.math.Point} - The results of the conversion as a point object containing x and y coordinates (in pixels)
      */
    def latLngToPixel(latitude: Double, longitude: Double): typings.heremaps.H.math.Point = js.native
    def latLngToPixel(latitude: Double, longitude: Double, opt_out: typings.heremaps.H.math.IPoint): typings.heremaps.H.math.Point = js.native
    
    /**
      * This method translates a point defined in terms of its pixel coordinates to a location defined in geographic coordinates.
      * @param point {H.math.IPoint} - An object defining a location on the screen in terms of pixel coordinates
      * @param opt_out {H.geo.IPoint=} - An optional point to store the result
      * @return {H.geo.IPoint} - An object representing the results of conversion to a geographic location
      */
    def pixelToGeo(point: typings.heremaps.H.math.IPoint): IPoint = js.native
    def pixelToGeo(point: typings.heremaps.H.math.IPoint, opt_out: IPoint): IPoint = js.native
    
    /**
      * This method method translates a map point to world pixel coordinates relative to current projection offset.
      * @param point {H.math.IPoint} - An object representing the map point to convert
      * @return {H.math.Point} - The result of the conversion as an object containing pixel coordinate
      */
    def pointToPixel(point: typings.heremaps.H.math.IPoint): typings.heremaps.H.math.Point = js.native
    
    var projection: IProjection = js.native
    
    /**
      * This method updates the scale exponent for the pixel projection.
      * @param zoom {number} - A value indicating the zoom level
      */
    def rescale(zoom: Double): Unit = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    /**
      * This method translates the x and y coordinates of a pixel to a geographic point.
      * @param x {number} - A value indicating the pixel x-coordinate
      * @param y {number} - A value indicating the pixel y-coordinate
      * @param opt_out {H.geo.Point=} - An optional point to store the result
      * @return {H.geo.Point} - An object representing the results of the conversion to a geographic location
      */
    def xyToGeo(x: Double, y: Double): Point = js.native
    def xyToGeo(x: Double, y: Double, opt_out: Point): Point = js.native
    
    var y: Double = js.native
  }
  
  /**
    * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
    * @property lat {H.geo.Latitude} - The latitude coordinate.
    * @property lng {H.geo.Longitude} - The longitude coordinate.
    * @property alt {H.geo.Altitude} - The altitude coordinate.
    * @property ctx {H.geo.AltitudeContext} - The altitude context.
    */
  @js.native
  trait Point
    extends StObject
       with AbstractGeometry
       with IPoint {
    
    @JSName("alt")
    var alt_Point: Altitude = js.native
    
    @JSName("ctx")
    var ctx_Point: AltitudeContext = js.native
    
    /**
      * To calculate the distance between this point and the supplied other point. The method uses the Haversine formula. The altitude is not considered.
      * @param other {H.geo.IPoint}
      * @returns {number} - The distance between the given location and the location supplied by the caller in meters.
      */
    def distance(other: IPoint): Double = js.native
    
    /**
      * To compare this point with a supplied other point for equality. Two points are considered equal if they have the same lat and lng as well as equivalent values for alt and ctx.
      * @param other {H.geo.IPoint}
      * @returns {boolean} - Whether the two points are equal.
      */
    def equals(other: IPoint): Boolean = js.native
    
    /**
      * This method calculates the geographic point of a destination point using the distance and bearing specified by the caller.
      * The altitude is ignored, instead the WGS84 Mean Radius is taken.
      * @param bearing {number} - The bearing to use in the calculation in degrees.
      * @param distance {number} - The distance to the destination in meters.
      * @param opt_overGreatCircle {boolean=} - If true the computation uses the 'Great Circle' otherwise 'Rhumb Line'.
      * @returns {H.geo.Point} - The calculated point
      */
    def walk(bearing: Double, distance: Double): Point = js.native
    def walk(bearing: Double, distance: Double, opt_overGreatCircle: Boolean): Point = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html
    */
  @js.native
  trait Polygon
    extends StObject
       with AbstractGeometry {
    
    def getExterior(): LineString = js.native
    
    def getInteriors(): js.Array[LineString] = js.native
    
    def getPoleCovering(): Direction = js.native
    
    /**
      * To add an interior ring.
      * @param interior - The interior ring to add.
      * @throws {@link H.lang.InvalidArgumentError}
      */
    def pushInterior(interior: LineString): Unit = js.native
    
    /**
      * To remove the specified interior ring.
      * @param interior - The interior ring to remove.
      */
    def removeInterior(interior: LineString): js.UndefOr[LineString] = js.native
    
    /**
      * To remove an interior ring at the given index.
      * @param opt_index - The index of the interior ring to remove, defaults to 0.
      */
    def removeInteriorAt(): js.UndefOr[LineString] = js.native
    def removeInteriorAt(opt_index: Double): js.UndefOr[LineString] = js.native
    
    /**
      * To set the exterior ring of the polygon.
      * @param exterior - The exterior ring to set
      */
    def setExterior(exterior: LineString): Unit = js.native
    
    /**
      * To specify whether this polygon covers the North or the South Pole.
      * This information is only needed for very special polygons that are defined as a line string around the world on longitude axis (for example along the coast of the Antarctic).
      * In such cases, an additional information is needed to know if the southern part of the Earth (Antarctic) or the northern part (anything except Antarctic) should be covered.
      * @param direction - The direction to set.
      */
    def setPoleCovering(direction: Direction): Polygon = js.native
    
    /**
      * Applies a splice-operation on the list of interior rings of the polygon.
      * @param opt_index - The index at which to start changing the list, defaults to 0.
      * @param opt_deleteCount - The number of interior rings to remove, defaults to Infinity.
      * @param var_args - repeatable, The interior rings to insert.
      */
    def spliceInteriors(opt_index: Double, opt_deleteCount: Double, var_args: LineString*): js.Array[LineString] = js.native
    def spliceInteriors(opt_index: Double, opt_deleteCount: Unit, var_args: LineString*): js.Array[LineString] = js.native
    def spliceInteriors(opt_index: Unit, opt_deleteCount: Double, var_args: LineString*): js.Array[LineString] = js.native
    def spliceInteriors(opt_index: Unit, opt_deleteCount: Unit, var_args: LineString*): js.Array[LineString] = js.native
  }
  object Polygon {
    
    /**
      * {@link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html#.Direction}
      */
    trait Direction extends StObject {
      
      var NORTH: Double
      
      var SOUTH: Double
    }
    object Direction {
      
      inline def apply(NORTH: Double, SOUTH: Double): Direction = {
        val __obj = js.Dynamic.literal(NORTH = NORTH.asInstanceOf[js.Any], SOUTH = SOUTH.asInstanceOf[js.Any])
        __obj.asInstanceOf[Direction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
        
        inline def setNORTH(value: Double): Self = StObject.set(x, "NORTH", value.asInstanceOf[js.Any])
        
        inline def setSOUTH(value: Double): Self = StObject.set(x, "SOUTH", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * This class represents a rectangular geographic area. The area is defined by four geographical coordinates two (left, right) longitudes and two (top, bottom) latitudes.
    */
  @js.native
  trait Rect
    extends StObject
       with AbstractGeometry {
    
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
    def mergeLatLng(lat: Latitude, lng: Longitude, opt_skipValidation: Unit, opt_out: Rect): Rect = js.native
    
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
    def mergePoint(geoPoint: IPoint, opt_skipValidation: Unit, opt_out: Rect): Rect = js.native
    
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
    def mergeRect(geoRect: Rect, opt_skipValidation: Unit, opt_out: Rect): Rect = js.native
    
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
    def mergeTopLeftBottomRight(
      top: Latitude,
      left: Longitude,
      bottom: Latitude,
      right: Longitude,
      opt_skipValidation: Unit,
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
}
