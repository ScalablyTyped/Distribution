package typings.jqueryTransit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Transit //////////////////////////////////////////////////
trait JQueryTransitOptions extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
  
  var marginBottom: js.UndefOr[String] = js.undefined
  
  var marginLeft: js.UndefOr[String] = js.undefined
  
  var marginRight: js.UndefOr[String] = js.undefined
  
  var marginTop: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var perspective: js.UndefOr[String] = js.undefined
  
  var rotate: js.UndefOr[Double | String] = js.undefined
  
  var rotate3d: js.UndefOr[String] = js.undefined
  
  var rotateX: js.UndefOr[String] = js.undefined
  
  var rotateY: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var skewX: js.UndefOr[String] = js.undefined
  
  var skewY: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
  
  var transformOrigin: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr[(js.Array[Double | String]) | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var x: js.UndefOr[Double | String] = js.undefined
  
  var y: js.UndefOr[Double | String] = js.undefined
}
object JQueryTransitOptions {
  
  inline def apply(): JQueryTransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTransitOptions]
  }
  
  extension [Self <: JQueryTransitOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotate3d(value: String): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
    
    inline def setRotate3dUndefined: Self = StObject.set(x, "rotate3d", js.undefined)
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
    
    inline def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
    
    inline def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
    
    inline def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
    
    inline def setScale(value: Double | js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value :_*))
    
    inline def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    inline def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTranslate(value: (js.Array[Double | String]) | String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTranslateVarargs(value: (Double | String)*): Self = StObject.set(x, "translate", js.Array(value :_*))
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
