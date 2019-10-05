package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableUIParams extends js.Object {
  var helper: JQuery
  var item: JQuery
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: JQuery
  var position: js.Any
  var sender: JQuery
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: JQuery,
    item: JQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: JQuery,
    position: js.Any,
    sender: JQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, item = item, offset = offset, originalPosition = originalPosition, placeholder = placeholder, position = position, sender = sender)
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

