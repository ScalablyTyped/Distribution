package typings.homeworks.homeworks

import typings.homeworks.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait Event extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var element: JQuery
  var value: String | js.Array[String] | Double
}

object Event {
  @scala.inline
  def apply(
    element: JQuery,
    value: String | js.Array[String] | Double,
    checked: js.UndefOr[Boolean] = js.undefined
  ): Event = {
    val __obj = js.Dynamic.literal(element = element, value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[Event]
  }
}

