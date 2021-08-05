package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternOptionsObject extends StObject {
  
  /**
    * For automatically calculated width and height on images, it is possible
    * to set an aspect ratio. The image will be zoomed to fill the bounding
    * box, maintaining the aspect ratio defined.
    */
  var aspectRatio: Double
  
  /**
    * Background color for the pattern if a `path` is set (not images).
    */
  var backgroundColor: ColorString
  
  /**
    * Pattern color, used as default path stroke.
    */
  var color: ColorString
  
  /**
    * Analogous to pattern.width.
    */
  var height: Double
  
  /**
    * ID to assign to the pattern. This is automatically computed if not added,
    * and identical patterns are reused. To refer to an existing pattern for a
    * Highcharts color, use `color: "url(#pattern-id)"`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * URL to an image to use as the pattern.
    */
  var image: String
  
  /**
    * Opacity of the pattern as a float value from 0 to 1.
    */
  var opacity: Double
  
  /**
    * Either an SVG path as string, or an object. As an object, supply the path
    * string in the `path.d` property. Other supported properties are standard
    * SVG attributes like `path.stroke` and `path.fill`. If a path is supplied
    * for the pattern, the `image` property is ignored.
    */
  var path: String | SVGAttributes
  
  /**
    * SVG `patternTransform` to apply to the entire pattern.
    */
  var patternTransform: String
  
  /**
    * Width of the pattern. For images this is automatically set to the width
    * of the element bounding box if not supplied. For non-image patterns the
    * default is 32px. Note that automatic resizing of image patterns to fill a
    * bounding box dynamically is only supported for patterns with an
    * automatically calculated ID.
    */
  var width: Double
  
  /**
    * Horizontal offset of the pattern. Defaults to 0.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical offset of the pattern. Defaults to 0.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PatternOptionsObject {
  
  inline def apply(
    aspectRatio: Double,
    backgroundColor: ColorString,
    color: ColorString,
    height: Double,
    image: String,
    opacity: Double,
    path: String | SVGAttributes,
    patternTransform: String,
    width: Double
  ): PatternOptionsObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternOptionsObject]
  }
  
  extension [Self <: PatternOptionsObject](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ColorString): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | SVGAttributes): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPatternTransform(value: String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
