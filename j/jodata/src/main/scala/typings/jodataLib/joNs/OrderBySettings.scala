package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBySettings extends ISettings {
  var DefaultOrder: java.lang.String
  var DefaultProperty: java.lang.String
  var Order: java.lang.String
  var Property: java.lang.String
}

object OrderBySettings {
  @scala.inline
  def apply(
    DefaultOrder: java.lang.String,
    DefaultProperty: java.lang.String,
    Order: java.lang.String,
    Property: java.lang.String,
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): OrderBySettings = {
    val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder, DefaultProperty = DefaultProperty, Order = Order, Property = Property, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[OrderBySettings]
  }
}

