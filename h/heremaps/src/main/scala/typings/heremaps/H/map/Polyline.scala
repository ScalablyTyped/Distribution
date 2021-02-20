package typings.heremaps.H.map

import typings.heremaps.H.geo.LineString
import typings.heremaps.H.geo.MultiLineString
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a polyline in geo-space. It is defined by a path containing the vertices of a polyline (lat, lng, alt values) and a pen to use when tracing the path on the map.
  */
@js.native
trait Polyline extends GeoShape {
  
  /**
    * This method adds a listener for a specific event.
    * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
    * @param type {string} - The name of the event
    * @param handler {function()} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {{}=} - An object defining the scope for the handler function
    */
  def addEventListener(`type`: String, handler: js.Function0[Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    handler: js.Function0[Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean): Unit = js.native
  def addEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean, opt_scope: js.Object): Unit = js.native
  
  /**
    * Clips the geometry of the Polyline to a rectangular area
    * @param geoRect {H.geo.Rect} - The rectangle to clip against.
    * @returns {Array<Array<number>>} - a list of geometry segments that intersecting the given rectangle.
    * Each segment is represented as a list of alternating latitude and longitude coordinates that describes a line string.
    */
  def clip(geoRect: typings.heremaps.H.geo.Rect): js.Array[js.Array[Double]] = js.native
  
  /**
    * This method compares the rendering z-order of the given object with another object. (The 'given object' mean the object on which the method has been invoke.)
    * @param other {H.map.Object} -The map object with which to compare the given object.
    * @return {number} - A value lower than 0 indicates that the given object has a lower z-order. 0 indicates that both objects have the same z-order.
    * A value greater than 0, indicates that the given object has a higher z-order.
    */
  def compareZOrder(other: Object): Double = js.native
  
  /**
    * Returns the smallest rectangle which encloses the whole geometry of the GeoShape.
    * @return {H.geo.Rect}
    */
  def getBounds(): typings.heremaps.H.geo.Rect = js.native
  
  /**
    * To obtain the polyline's geometry. If you modify the obtained geometry, you must call setGeometry(geometry) afterwards to not violate the integrity of the polyline.
    * @return {H.geo.LineString | H.geo.MultiLineString}
    */
  def getGeometry(): LineString | MultiLineString = js.native
  
  /**
    * This method removes a previously added listener from the EventTarget instance.
    * @param type {string} - The name of the event
    * @param handler {function()} - An event handler function
    * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
    * @param opt_scope {{}=} - An object defining the scope for the handler function
    */
  def removeEventListener(`type`: String, handler: js.Function0[Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    handler: js.Function0[Unit],
    opt_capture: js.UndefOr[scala.Nothing],
    opt_scope: js.Object
  ): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, handler: js.Function0[Unit], opt_capture: Boolean, opt_scope: js.Object): Unit = js.native
  
  /**
    * To set the polyline's geometry. If the given geometry is modified afterwards, it must be set again via setGeometry(geometry) to not violate the integrity of the polyline.
    * @param geometry {H.geo.LineString | H.geo.MultiLineString} - the geometry to set.
    * @return {H.map.Polyline} - The polyline instance itself.
    */
  def setGeometry(geometry: LineString): Polyline = js.native
  def setGeometry(geometry: MultiLineString): Polyline = js.native
}
object Polyline {
  
  /**
    * Options which are used to initialize a polyline
    * @property style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - the style to be used when tracing the polyline
    * @property arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - The arrows style to be used when rendering the polyline.
    * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
    * @property zIndex {number=} - The z-index value of the map object, default is 0
    * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
    * an object.
    * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData
    */
  @js.native
  trait Options extends StObject {
    
    var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var provider: js.UndefOr[Provider] = js.native
    
    var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.native
    
    var visibility: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
