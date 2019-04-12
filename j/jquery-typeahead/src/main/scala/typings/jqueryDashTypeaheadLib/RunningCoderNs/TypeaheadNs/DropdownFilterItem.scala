package typings
package jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownFilterItem extends js.Object {
  var all: java.lang.String
  var key: java.lang.String
  var template: java.lang.String | (js.Function1[/* item */ js.Any, java.lang.String])
  var value: java.lang.String
}

object DropdownFilterItem {
  @scala.inline
  def apply(
    all: java.lang.String,
    key: java.lang.String,
    template: java.lang.String | (js.Function1[/* item */ js.Any, java.lang.String]),
    value: java.lang.String
  ): DropdownFilterItem = {
    val __obj = js.Dynamic.literal(all = all, key = key, template = template.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[DropdownFilterItem]
  }
}

