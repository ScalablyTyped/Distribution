package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.FormSelectOptions> */
trait PartialFormSelectOptions extends js.Object {
  var classes: js.UndefOr[String] = js.undefined
  var dropdownOptions: js.UndefOr[PartialDropdownOptionsAlignment] = js.undefined
}

object PartialFormSelectOptions {
  @scala.inline
  def apply(classes: String = null, dropdownOptions: PartialDropdownOptionsAlignment = null): PartialFormSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (dropdownOptions != null) __obj.updateDynamic("dropdownOptions")(dropdownOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFormSelectOptions]
  }
}

