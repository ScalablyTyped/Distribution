package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var perspective: js.UndefOr[Double | Animation] = js.undefined
  
  var rotate: js.UndefOr[String | Animation] = js.undefined
  
  var rotateX: js.UndefOr[String | Animation] = js.undefined
  
  var rotateY: js.UndefOr[String | Animation] = js.undefined
  
  var rotateZ: js.UndefOr[String | Animation] = js.undefined
  
  var scale: js.UndefOr[Double | Animation] = js.undefined
  
  var scaleX: js.UndefOr[Double | Animation] = js.undefined
  
  var scaleY: js.UndefOr[Double | Animation] = js.undefined
  
  var skewX: js.UndefOr[String | Animation] = js.undefined
  
  var skewY: js.UndefOr[String | Animation] = js.undefined
  
  var translateX: js.UndefOr[Double | Animation] = js.undefined
  
  var translateY: js.UndefOr[Double | Animation] = js.undefined
}
object Transform {
  
  inline def apply(): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setPerspective(value: Double | Animation): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    inline def setRotate(value: String | Animation): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setRotateX(value: String | Animation): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
    
    inline def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
    
    inline def setRotateY(value: String | Animation): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
    
    inline def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
    
    inline def setRotateZ(value: String | Animation): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
    
    inline def setRotateZUndefined: Self = StObject.set(x, "rotateZ", js.undefined)
    
    inline def setScale(value: Double | Animation): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleX(value: Double | Animation): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double | Animation): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setSkewX(value: String | Animation): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    inline def setSkewY(value: String | Animation): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    inline def setTranslateX(value: Double | Animation): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double | Animation): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
