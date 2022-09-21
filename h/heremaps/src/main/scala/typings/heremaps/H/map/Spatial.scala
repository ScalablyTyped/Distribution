package typings.heremaps.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a spatial map object which provides its projected geometry.
  */
@js.native
trait Spatial
  extends StObject
     with Object {
  
  /**
    * To get the arrow style of this spatial object or undefined if no style is defined. A returned arrow style is treated as immutable and must not be modified afterwards to prevent
    * inconsistancies!
    * @returns {(H.map.ArrowStyle | undefined)}
    */
  def getArrows(): ArrowStyle | Unit = js.native
  
  /**
    * To get the drawing style of this object. The returned style is treated as immutable and must not be modified afterwards to prevent inconsistancies!
    * @returns {H.map.SpatialStyle}
    */
  def getStyle(): SpatialStyle = js.native
  
  /**
    * Indicates whether this spatial object represents a closed shape
    * @returns {boolean}
    */
  def isClosed(): Boolean = js.native
  
  /**
    * To set the arrow style of this object.
    * @param opt_arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - the arrow style to be applied
    * @returns {H.map.Spatial} - the Spatial instance itself
    */
  def setArrows(): Spatial = js.native
  def setArrows(opt_arrows: ArrowStyle): Spatial = js.native
  def setArrows(opt_arrows: Options): Spatial = js.native
  
  /**
    * To set the drawing style of this object. If the passed opt_style argument is an instance of H.map.SpatialStyle it is treated as immutable and must not be modified afterwards to prevent
    * inconsistancies!
    * @param opt_style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - The style to set. If it evaluates to a falsy the H.map.SpatialStyle.DEFAULT_STYLE is used.
    * @returns {H.map.Spatial} - the Spatial instance itself
    */
  def setStyle(): Spatial = js.native
  def setStyle(opt_style: SpatialStyle): Spatial = js.native
  def setStyle(opt_style: typings.heremaps.H.map.SpatialStyle.Options): Spatial = js.native
}
object Spatial {
  
  /**
    * Data to used as rendering hint for a label
    * @property x {number} - The X coordinate of the first line's starting point
    * @property y {number} - The Y coordinate of the first line's base line
    * @property angle {number} - The clockwise rotation angle in radians
    * @property font {string} - The CSS font-family
    * @property size {number} - The CSS font-size
    * @property color {string} - The CSS color
    * @property text {string} - The text content, new line characters (\\u000A) are interpreted as line breaks
    */
  trait Label extends StObject {
    
    var angle: Double
    
    var color: String
    
    var font: String
    
    var size: Double
    
    var text: String
    
    var x: Double
    
    var y: Double
  }
  object Label {
    
    inline def apply(angle: Double, color: String, font: String, size: Double, text: String, x: Double, y: Double): Label = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options which are used to initialize spatial object object
    * @property style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - the style to be used when tracing the spatial object
    * @property arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - The arrows style to be used when rendering the spatial.
    * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
    * @property zIndex {number=} - The z-index value of the map object, default is 0
    * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
    * an object.
    * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
    */
  trait Options extends StObject {
    
    var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
    
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): typings.heremaps.H.map.Spatial.Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.heremaps.H.map.Spatial.Options]
    }
    
    extension [Self <: typings.heremaps.H.map.Spatial.Options](x: Self) {
      
      inline def setArrows(value: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
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
