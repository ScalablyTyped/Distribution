package typings.materialAnimation.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in @material/animation.@material/animation/types.StandardCssPropertyName ]: @material/animation.@material/animation/types.CssVendorProperty} */
@js.native
trait CssVendorPropertyMap extends js.Object {
  
  var animation: CssVendorProperty = js.native
  
  var transform: CssVendorProperty = js.native
  
  var transition: CssVendorProperty = js.native
}
object CssVendorPropertyMap {
  
  @scala.inline
  def apply(animation: CssVendorProperty, transform: CssVendorProperty, transition: CssVendorProperty): CssVendorPropertyMap = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssVendorPropertyMap]
  }
  
  @scala.inline
  implicit class CssVendorPropertyMapOps[Self <: CssVendorPropertyMap] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: CssVendorProperty): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: CssVendorProperty): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: CssVendorProperty): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
}
