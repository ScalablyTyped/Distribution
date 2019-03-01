package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezoneOptions extends js.Object {
  var label: java.lang.String
  var value: scala.Double
}

object TimezoneOptions {
  @scala.inline
  def apply(label: java.lang.String, value: scala.Double): TimezoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimezoneOptions]
  }
}

