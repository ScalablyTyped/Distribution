package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTextAttributes
  extends StObject
     with SVGAttributes {
  
  var dx: js.UndefOr[String | Double] = js.undefined
  
  var dy: js.UndefOr[String | Double] = js.undefined
  
  var `length-adjust`: js.UndefOr[String] = js.undefined
  
  var lengthAdjust: js.UndefOr[String] = js.undefined
  
  var rotate: js.UndefOr[String] = js.undefined
  
  @JSName("text-anchor")
  var `text-anchor_SVGTextAttributes`: js.UndefOr[String] = js.undefined
  
  var `text-lenght`: js.UndefOr[Double] = js.undefined
  
  @JSName("textAnchor")
  var textAnchor_SVGTextAttributes: js.UndefOr[String] = js.undefined
  
  var textLength: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[String | Double] = js.undefined
}
object SVGTextAttributes {
  
  inline def apply(): SVGTextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTextAttributes]
  }
  
  extension [Self <: SVGTextAttributes](x: Self) {
    
    inline def setDx(value: String | Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: String | Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def `setLength-adjust`(value: String): Self = StObject.set(x, "length-adjust", value.asInstanceOf[js.Any])
    
    inline def `setLength-adjustUndefined`: Self = StObject.set(x, "length-adjust", js.undefined)
    
    inline def setLengthAdjust(value: String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-lenght`(value: Double): Self = StObject.set(x, "text-lenght", value.asInstanceOf[js.Any])
    
    inline def `setText-lenghtUndefined`: Self = StObject.set(x, "text-lenght", js.undefined)
    
    inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setTextLength(value: Double): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
