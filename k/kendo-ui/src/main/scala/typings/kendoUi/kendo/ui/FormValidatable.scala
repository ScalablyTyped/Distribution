package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValidatable extends js.Object {
  var errorTemplate: String | js.Function
  var validateOnBlur: Boolean
  var validationSummary: Boolean
}

object FormValidatable {
  @scala.inline
  def apply(errorTemplate: String | js.Function, validateOnBlur: Boolean, validationSummary: Boolean): FormValidatable = {
    val __obj = js.Dynamic.literal(errorTemplate = errorTemplate.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validationSummary = validationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidatable]
  }
}

