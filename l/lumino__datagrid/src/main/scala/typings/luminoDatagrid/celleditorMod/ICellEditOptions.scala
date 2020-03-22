package typings.luminoDatagrid.celleditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditOptions extends js.Object {
  /**
    * Cell editor to use for editing.
    *
    * #### Notes
    * This object is only used by cell editor controller.
    * If not set, controller picks the most suitable editor
    * for the particular cell configuration.
    */
  var editor: js.UndefOr[ICellEditor] = js.undefined
  /**
    * Callback method to call on cell edit cancel.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback method to call on cell edit commit.
    */
  var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.undefined
  /**
    * Cell input validator to use for value validation.
    */
  var validator: js.UndefOr[ICellInputValidator] = js.undefined
}

object ICellEditOptions {
  @scala.inline
  def apply(
    editor: ICellEditor = null,
    onCancel: () => Unit = null,
    onCommit: /* response */ ICellEditResponse => Unit = null,
    validator: ICellInputValidator = null
  ): ICellEditOptions = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onCommit != null) __obj.updateDynamic("onCommit")(js.Any.fromFunction1(onCommit))
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellEditOptions]
  }
}

