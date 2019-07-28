package typings.kendoDashUi.kendoNs.ooxmlNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookOptions extends js.Object {
  var creator: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sheets: js.UndefOr[js.Array[WorkbookSheet]] = js.undefined
}

object WorkbookOptions {
  @scala.inline
  def apply(
    creator: String = null,
    date: Date = null,
    name: String = null,
    sheets: js.Array[WorkbookSheet] = null
  ): WorkbookOptions = {
    val __obj = js.Dynamic.literal()
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (date != null) __obj.updateDynamic("date")(date)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sheets != null) __obj.updateDynamic("sheets")(sheets)
    __obj.asInstanceOf[WorkbookOptions]
  }
}

