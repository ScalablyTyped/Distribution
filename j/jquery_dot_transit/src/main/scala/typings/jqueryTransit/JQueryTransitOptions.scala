package typings.jqueryTransit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Transit //////////////////////////////////////////////////
@js.native
trait JQueryTransitOptions extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var margin: js.UndefOr[String] = js.native
  
  var marginBottom: js.UndefOr[String] = js.native
  
  var marginLeft: js.UndefOr[String] = js.native
  
  var marginRight: js.UndefOr[String] = js.native
  
  var marginTop: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var perspective: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[Double | String] = js.native
  
  var rotate3d: js.UndefOr[String] = js.native
  
  var rotateX: js.UndefOr[String] = js.native
  
  var rotateY: js.UndefOr[String] = js.native
  
  var scale: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var skewX: js.UndefOr[String] = js.native
  
  var skewY: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[String] = js.native
  
  var transformOrigin: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[(js.Array[Double | String]) | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
}
object JQueryTransitOptions {
  
  @scala.inline
  def apply(): JQueryTransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTransitOptions]
  }
  
  @scala.inline
  implicit class JQueryTransitOptionsMutableBuilder[Self <: JQueryTransitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate3d(value: String): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate3dUndefined: Self = StObject.set(x, "rotate3d", js.undefined)
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
    
    @scala.inline
    def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
    
    @scala.inline
    def setScale(value: Double | js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value :_*))
    
    @scala.inline
    def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    @scala.inline
    def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTranslate(value: (js.Array[Double | String]) | String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: (Double | String)*): Self = StObject.set(x, "translate", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
