package typings.materialAnimation.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsVendorProperty extends js.Object {
  var cssProperty: StandardCssPropertyName = js.native
  var prefixed: PrefixedJsEventType = js.native
  var standard: StandardJsEventType = js.native
}

object JsVendorProperty {
  @scala.inline
  def apply(cssProperty: StandardCssPropertyName, prefixed: PrefixedJsEventType, standard: StandardJsEventType): JsVendorProperty = {
    val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsVendorProperty]
  }
  @scala.inline
  implicit class JsVendorPropertyOps[Self <: JsVendorProperty] (val x: Self) extends AnyVal {
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
    def setCssProperty(value: StandardCssPropertyName): Self = this.set("cssProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixed(value: PrefixedJsEventType): Self = this.set("prefixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: StandardJsEventType): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
  
}

