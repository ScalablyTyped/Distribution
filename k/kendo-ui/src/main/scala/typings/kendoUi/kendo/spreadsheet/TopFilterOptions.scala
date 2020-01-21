package typings.kendoUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopFilterOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object TopFilterOptions {
  @scala.inline
  def apply(name: String = null): TopFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopFilterOptions]
  }
}

