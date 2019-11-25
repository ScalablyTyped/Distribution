package typings.kendoDashUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicFilterOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object DynamicFilterOptions {
  @scala.inline
  def apply(name: String = null): DynamicFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicFilterOptions]
  }
}

