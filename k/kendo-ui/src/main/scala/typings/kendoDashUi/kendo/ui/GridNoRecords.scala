package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridNoRecords extends js.Object {
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object GridNoRecords {
  @scala.inline
  def apply(template: String | js.Function = null): GridNoRecords = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridNoRecords]
  }
}

