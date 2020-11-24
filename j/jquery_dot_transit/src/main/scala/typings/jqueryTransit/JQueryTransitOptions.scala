package typings.jqueryTransit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Transit //////////////////////////////////////////////////
@js.native
trait JQueryTransitOptions extends js.Object {
  
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
  implicit class JQueryTransitOptionsOps[Self <: JQueryTransitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: String): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: String): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: String): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPerspective(value: String): Self = this.set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRotate3d(value: String): Self = this.set("rotate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate3d: Self = this.set("rotate3d", js.undefined)
    
    @scala.inline
    def setRotateX(value: String): Self = this.set("rotateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateX: Self = this.set("rotateX", js.undefined)
    
    @scala.inline
    def setRotateY(value: String): Self = this.set("rotateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateY: Self = this.set("rotateY", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: Double*): Self = this.set("scale", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: Double | js.Array[Double]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSkewX(value: String): Self = this.set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    
    @scala.inline
    def setSkewY(value: String): Self = this.set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: (Double | String)*): Self = this.set("translate", js.Array(value :_*))
    
    @scala.inline
    def setTranslate(value: (js.Array[Double | String]) | String): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
