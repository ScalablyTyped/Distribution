package typings.kendoUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object SheetOptions {
  @scala.inline
  def apply(change: /* e */ SheetChangeEvent => Unit = null, name: String = null): SheetOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetOptions]
  }
}

