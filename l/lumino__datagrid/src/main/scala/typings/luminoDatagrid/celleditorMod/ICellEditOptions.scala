package typings.luminoDatagrid.celleditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellEditOptions extends js.Object {
  /**
    * Cell editor to use for editing.
    *
    * #### Notes
    * This object is only used by cell editor controller.
    * If not set, controller picks the most suitable editor
    * for the particular cell configuration.
    */
  var editor: js.UndefOr[ICellEditor] = js.native
  /**
    * Callback method to call on cell edit cancel.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback method to call on cell edit commit.
    */
  var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.native
  /**
    * Cell input validator to use for value validation.
    */
  var validator: js.UndefOr[ICellInputValidator] = js.native
}

object ICellEditOptions {
  @scala.inline
  def apply(): ICellEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellEditOptions]
  }
  @scala.inline
  implicit class ICellEditOptionsOps[Self <: ICellEditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEditor(value: ICellEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnCommit(value: /* response */ ICellEditResponse => Unit): Self = this.set("onCommit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCommit: Self = this.set("onCommit", js.undefined)
    @scala.inline
    def setValidator(value: ICellInputValidator): Self = this.set("validator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
  
}

