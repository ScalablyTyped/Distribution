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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("helper")(helper)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("originalPosition")(originalPosition)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[SortableUIParams]
  }
}

