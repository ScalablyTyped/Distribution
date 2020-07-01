package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
trait PickAutocompleteselectOpt extends js.Object {
  var selectOption: js.UndefOr[js.Any] = js.undefined
}

object PickAutocompleteselectOpt {
  @scala.inline
  def apply(selectOption: js.Any = null): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal()
    if (selectOption != null) __obj.updateDynamic("selectOption")(selectOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
}

