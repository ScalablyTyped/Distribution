package typings.materialAnimation.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in @material/animation.@material/animation/types.StandardJsEventType ]: @material/animation.@material/animation/types.JsVendorProperty} */
@js.native
trait JsVendorPropertyMap extends js.Object {
  var animationend: JsVendorProperty = js.native
  var animationiteration: JsVendorProperty = js.native
  var animationstart: JsVendorProperty = js.native
  var transitionend: JsVendorProperty = js.native
}

object JsVendorPropertyMap {
  @scala.inline
  def apply(
    animationend: JsVendorProperty,
    animationiteration: JsVendorProperty,
    animationstart: JsVendorProperty,
    transitionend: JsVendorProperty
  ): JsVendorPropertyMap = {
    val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsVendorPropertyMap]
  }
  @scala.inline
  implicit class JsVendorPropertyMapOps[Self <: JsVendorPropertyMap] (val x: Self) extends AnyVal {
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
    def setAnimationend(value: JsVendorProperty): Self = this.set("animationend", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationiteration(value: JsVendorProperty): Self = this.set("animationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationstart(value: JsVendorProperty): Self = this.set("animationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionend(value: JsVendorProperty): Self = this.set("transitionend", value.asInstanceOf[js.Any])
  }
  
}

