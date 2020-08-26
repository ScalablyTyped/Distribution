package typings.ionicReact.createAnimationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyValue extends js.Object {
  var fromValue: js.Any = js.native
  var property: String = js.native
  var toValue: js.Any = js.native
}

object PropertyValue {
  @scala.inline
  def apply(fromValue: js.Any, property: String, toValue: js.Any): PropertyValue = {
    val __obj = js.Dynamic.literal(fromValue = fromValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
  @scala.inline
  implicit class PropertyValueOps[Self <: PropertyValue] (val x: Self) extends AnyVal {
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
    def setFromValue(value: js.Any): Self = this.set("fromValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setToValue(value: js.Any): Self = this.set("toValue", value.asInstanceOf[js.Any])
  }
  
}

