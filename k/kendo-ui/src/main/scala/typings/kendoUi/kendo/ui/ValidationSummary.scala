package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSummary extends js.Object {
  var container: js.UndefOr[String | JQuery] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object ValidationSummary {
  @scala.inline
  def apply(container: String | JQuery = null, template: String | js.Function = null): ValidationSummary = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSummary]
  }
}

