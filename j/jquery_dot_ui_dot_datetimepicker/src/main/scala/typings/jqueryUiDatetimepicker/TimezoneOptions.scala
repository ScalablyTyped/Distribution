package typings.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezoneOptions extends js.Object {
  var label: String
  var value: Double
}

object TimezoneOptions {
  @scala.inline
  def apply(label: String, value: Double): TimezoneOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezoneOptions]
  }
}

