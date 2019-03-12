package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SheetOptions {
  @scala.inline
  def apply(change: /* e */ SheetChangeEvent => scala.Unit = null, name: java.lang.String = null): SheetOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SheetOptions]
  }
}

