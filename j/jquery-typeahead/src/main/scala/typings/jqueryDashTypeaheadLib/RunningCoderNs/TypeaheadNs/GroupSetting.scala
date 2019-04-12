package typings
package jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSetting extends js.Object {
  var key: java.lang.String
  var template: java.lang.String | (js.Function1[/* item */ js.Any, java.lang.String])
}

object GroupSetting {
  @scala.inline
  def apply(
    key: java.lang.String,
    template: java.lang.String | (js.Function1[/* item */ js.Any, java.lang.String])
  ): GroupSetting = {
    val __obj = js.Dynamic.literal(key = key, template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupSetting]
  }
}

