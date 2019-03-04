package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableUIParams extends js.Object {
  var element: jqueryuiLib.JQuery
  var helper: jqueryuiLib.JQuery
  var originalElement: jqueryuiLib.JQuery
  var originalPosition: js.Any
  var originalSize: js.Any
  var position: js.Any
  var size: js.Any
}

object ResizableUIParams {
  @scala.inline
  def apply(
    element: jqueryuiLib.JQuery,
    helper: jqueryuiLib.JQuery,
    originalElement: jqueryuiLib.JQuery,
    originalPosition: js.Any,
    originalSize: js.Any,
    position: js.Any,
    size: js.Any
  ): ResizableUIParams = {
    val __obj = js.Dynamic.literal(element = element, helper = helper, originalElement = originalElement, originalPosition = originalPosition, originalSize = originalSize, position = position, size = size)
  
    __obj.asInstanceOf[ResizableUIParams]
  }
}

