package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsPitchforkTypeOuterBackgroundOptions extends StObject {
  
  /**
    * (Highstock) Name of the dash style to use for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Defines additional snapping area around an annotation making
    * this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The URL for an image to use as the annotation shape. Note,
    * type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) The pixel stroke width of the shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object AnnotationsPitchforkTypeOuterBackgroundOptions {
  
  inline def apply(): AnnotationsPitchforkTypeOuterBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkTypeOuterBackgroundOptions]
  }
  
  extension [Self <: AnnotationsPitchforkTypeOuterBackgroundOptions](x: Self) {
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setSnap(value: Double): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStroke(value: ColorString): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
