package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderEntry extends js.Object {
  var Direction: OrderDirection
  def ValueSelector(item: js.Any): js.Any
}

object OrderEntry {
  @scala.inline
  def apply(Direction: OrderDirection, ValueSelector: js.Any => js.Any): OrderEntry = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], ValueSelector = js.Any.fromFunction1(ValueSelector))
    __obj.asInstanceOf[OrderEntry]
  }
}

