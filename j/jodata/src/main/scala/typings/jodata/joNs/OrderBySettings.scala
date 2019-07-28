package typings.jodata.joNs

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
    reset: () => Unit,
    toString: () => String
  ): OrderBySettings = {
    val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder, DefaultProperty = DefaultProperty, Order = Order, Property = Property, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[OrderBySettings]
  }
}

