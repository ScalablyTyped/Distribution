package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSetting extends js.Object {
  var key: String
  var template: String | (js.Function1[/* item */ js.Any, String])
}

object GroupSetting {
  @scala.inline
  def apply(key: String, template: String | (js.Function1[/* item */ js.Any, String])): GroupSetting = {
    val __obj = js.Dynamic.literal(key = key, template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupSetting]
  }
}

