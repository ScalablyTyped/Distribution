package typings.kendoDashUi.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueFilterOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ValueFilterOptions {
  @scala.inline
  def apply(name: String = null): ValueFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ValueFilterOptions]
  }
}

