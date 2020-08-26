package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.dense
import typings.materialUiCore.materialUiCoreStrings.none
import typings.materialUiCore.materialUiCoreStrings.normal
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[dense | none | normal] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var startAdornment: js.UndefOr[ReactNode] = js.native
}

object Disabled {
  @scala.inline
  def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFilled(value: Boolean): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setMargin(value: dense | none | normal): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setStartAdornment(value: ReactNode): Self = this.set("startAdornment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAdornment: Self = this.set("startAdornment", js.undefined)
  }
  
}

