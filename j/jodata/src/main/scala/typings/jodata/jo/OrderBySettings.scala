package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBySettings extends ISettings {
  var DefaultOrder: String
  var DefaultProperty: String
  var Order: String
  var Property: String
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
}

