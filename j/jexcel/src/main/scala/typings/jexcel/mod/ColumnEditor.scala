package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEditor extends js.Object {
  // tslint:disable-next-line ban-types
  var closeEditor: js.UndefOr[js.Function] = js.undefined
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.undefined
  // tslint:disable-next-line ban-types
  var openEditor: js.UndefOr[js.Function] = js.undefined
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.undefined
}

object ColumnEditor {
  @scala.inline
  def apply(
    closeEditor: js.Function = null,
    getValue: js.Function = null,
    openEditor: js.Function = null,
    setValue: js.Function = null
  ): ColumnEditor = {
    val __obj = js.Dynamic.literal()
    if (closeEditor != null) __obj.updateDynamic("closeEditor")(closeEditor.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(getValue.asInstanceOf[js.Any])
    if (openEditor != null) __obj.updateDynamic("openEditor")(openEditor.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEditor]
  }
}

