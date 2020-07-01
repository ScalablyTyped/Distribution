package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.FormSelect, 'getSelectedValues' | 'destroy'> */
trait PickFormSelectgetSelected extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.undefined
  var getSelectedValues: js.UndefOr[js.Any] = js.undefined
}

object PickFormSelectgetSelected {
  @scala.inline
  def apply(destroy: js.Any = null, getSelectedValues: js.Any = null): PickFormSelectgetSelected = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (getSelectedValues != null) __obj.updateDynamic("getSelectedValues")(getSelectedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFormSelectgetSelected]
  }
}

