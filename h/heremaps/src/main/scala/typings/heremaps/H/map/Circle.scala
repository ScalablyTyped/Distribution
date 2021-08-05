package typings.heremaps.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Point
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Polygon with a circular shape.
  */
@js.native
trait Circle
  extends StObject
     with Polygon {
  
  /**
    * To get the center point of this circle You must not modify the returned Point instance without calling setCenter immediately afterwards.
    * @returns {H.geo.Point}
    */
  def getCenter(): Point = js.native
  
  /**
    * To get the precision value of this circle
    * @returns {number}
    */
  def getPrecision(): Double = js.native
  
  /**
    * To get the length of the radius of the circle in meters.
    * @returns {number}
    */
  def getRadius(): Double = js.native
  
  /**
    * To set the geographical center point of this circle. If the specified center is an instance of H.geo.Point you must not modify this Point instance without calling setCenter
    * immediately afterwards.
    * @param center {H.geo.IPoint}
    */
  def setCenter(center: IPoint): Unit = js.native
  
  /**
    * To set the precision of this circle {@see H.map.Circle.Options#precision}
    * @param precision {number}
    */
  def setPrecision(precision: Double): Unit = js.native
  
  /**
    * To set the length of the radius of the circle in meters. The value is clamped to the of {@code[0 ... 20015089.27787877]} (half WGS84 mean circumference)
    * @param radius {number}
    */
  def setRadius(radius: Double): Unit = js.native
}
object Circle {
  
  /**
    * @property style {H.map.SpatialStyle=} - the style to be used when tracing the polyline
    * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
    * @property precision {number=} - The precision of a circle as a number of segments to be used when rendering the circle.
    * The value is clamped to the range between [4 ... 360], where 60 is
    * the default. Note that the lower the value the more angular and the less circle-like the shape appears and, conversely, the higher the value the smoother and more rounded the result.
    * Thus, starting at the extreme low end of the possible values, 4 produces a square, 6 a hexagon, while 30 results in a circle-like shape, although it appears increasingly angular as
    * the zoom level increases (as you zoom in), and finally 360 produces a smooth circle.
    * @property zIndex {number=} - The z-index value of the circle, default is 0
    * @property min {number=} - The minimum zoom level for which the circle is visible, default is -Infinity
    * @property max {number=} - The maximum zoom level for which the circle is visible, default is Infinity
    * @property provider {(H.map.provider.Provider | null)=} - The provider of this object.
    * This property is only needed if a customized Implementation of ObjectProvider wants to instantiate an object.
    * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData
    */
  trait Options extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
    
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
