package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBySettings extends ISettings {
  var DefaultOrder: String = js.native
  var DefaultProperty: String = js.native
  var Order: String = js.native
  var Property: String = js.native
}

object OrderBySettings {
  @scala.inline
  def apply(
    DefaultOrder: String,
    DefaultProperty: String,
    Order: String,
    Property: String,
    isSet: () => Boolean,
    reset: () => Unit
  ): OrderBySettings = {
    val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder.asInstanceOf[js.Any], DefaultProperty = DefaultProperty.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[OrderBySettings]
  }
  @scala.inline
  implicit class OrderBySettingsOps[Self <: OrderBySettings] (val x: Self) extends AnyVal {
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
    def setDefaultOrder(value: String): Self = this.set("DefaultOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultProperty(value: String): Self = this.set("DefaultProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: String): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("Property", value.asInstanceOf[js.Any])
  }
  
}

