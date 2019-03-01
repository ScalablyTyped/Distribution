package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookOptions extends js.Object {
  var creator: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sheets: js.UndefOr[js.Array[WorkbookSheet]] = js.undefined
}

object WorkbookOptions {
  @scala.inline
  def apply(
    creator: java.lang.String = null,
    date: stdLib.Date = null,
    name: java.lang.String = null,
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

