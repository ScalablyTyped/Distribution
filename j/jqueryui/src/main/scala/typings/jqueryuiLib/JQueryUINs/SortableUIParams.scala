package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableUIParams extends js.Object {
  var helper: jqueryuiLib.JQuery
  var item: jqueryuiLib.JQuery
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: jqueryuiLib.JQuery
  var position: js.Any
  var sender: jqueryuiLib.JQuery
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: jqueryuiLib.JQuery,
    item: jqueryuiLib.JQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: jqueryuiLib.JQuery,
    position: js.Any,
    sender: jqueryuiLib.JQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, item = item, offset = offset, originalPosition = originalPosition, placeholder = placeholder, position = position, sender = sender)
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

