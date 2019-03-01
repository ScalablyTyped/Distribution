package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetToolbar extends js.Object {
  var data: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var home: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var insert: js.UndefOr[scala.Boolean | js.Any] = js.undefined
}

object SpreadsheetToolbar {
  @scala.inline
  def apply(
    data: scala.Boolean | js.Any = null,
    home: scala.Boolean | js.Any = null,
    insert: scala.Boolean | js.Any = null
  ): SpreadsheetToolbar = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetToolbar]
  }
}

