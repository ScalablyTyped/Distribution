package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownFilterItem extends js.Object {
  var all: String
  var key: String
  var template: String | (js.Function1[/* item */ js.Any, String])
  var value: String
}

object DropdownFilterItem {
  @scala.inline
  def apply(
    all: String,
    key: String,
    template: String | (js.Function1[/* item */ js.Any, String]),
    value: String
  ): DropdownFilterItem = {
    val __obj = js.Dynamic.literal(all = all, key = key, template = template.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[DropdownFilterItem]
  }
}

