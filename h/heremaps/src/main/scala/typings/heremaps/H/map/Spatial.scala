package typings.heremaps.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a spatial map object which provides its projected geometry.
  */
@js.native
trait Spatial extends Object {
  
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
  @js.native
  trait Label extends StObject {
    
    var angle: Double = js.native
    
    var color: String = js.native
    
    var font: String = js.native
    
    var size: Double = js.native
    
    var text: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Label {
    
    @scala.inline
    def apply(angle: Double, color: String, font: String, size: Double, text: String, x: Double, y: Double): Label = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
    def apply(): typings.heremaps.H.map.Spatial.Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.heremaps.H.map.Spatial.Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: typings.heremaps.H.map.Spatial.Options] (val x: Self) extends AnyVal {
      
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
