package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptionsObject extends js.Object {
  /**
    * The order the event handler should be called. This opens for having one
    * handler be called before another, independent of in which order they were
    * added.
    */
  var order: Double
}

object EventOptionsObject {
  @scala.inline
  def apply(order: Double): EventOptionsObject = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptionsObject]
  }
}

