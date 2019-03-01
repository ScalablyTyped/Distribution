package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait Event extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var element: homeworksLib.JQuery
  var value: java.lang.String | js.Array[java.lang.String] | scala.Double
}

object Event {
  @scala.inline
  def apply(
    element: homeworksLib.JQuery,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double,
    checked: js.UndefOr[scala.Boolean] = js.undefined
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[Event]
  }
}

