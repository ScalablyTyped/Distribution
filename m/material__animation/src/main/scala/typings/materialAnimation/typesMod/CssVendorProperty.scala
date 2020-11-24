package typings.materialAnimation.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssVendorProperty extends js.Object {
  
  var prefixed: PrefixedCssPropertyName = js.native
  
  var standard: StandardCssPropertyName = js.native
}
object CssVendorProperty {
  
  @scala.inline
  def apply(prefixed: PrefixedCssPropertyName, standard: StandardCssPropertyName): CssVendorProperty = {
    val __obj = js.Dynamic.literal(prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssVendorProperty]
  }
  
  @scala.inline
  implicit class CssVendorPropertyOps[Self <: CssVendorProperty] (val x: Self) extends AnyVal {
    
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
    def setPrefixed(value: PrefixedCssPropertyName): Self = this.set("prefixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: StandardCssPropertyName): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
}
