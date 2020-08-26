package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormHelperText/FormHelperText.FormHelperTextClassKey>> */
@js.native
trait PartialClassNameMapFormHe extends js.Object {
  var contained: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var marginDense: js.UndefOr[String] = js.native
  var required: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapFormHe {
  @scala.inline
  def apply(): PartialClassNameMapFormHe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFormHe]
  }
  @scala.inline
  implicit class PartialClassNameMapFormHeOps[Self <: PartialClassNameMapFormHe] (val x: Self) extends AnyVal {
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
    def setContained(value: String): Self = this.set("contained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContained: Self = this.set("contained", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFilled(value: String): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setMarginDense(value: String): Self = this.set("marginDense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginDense: Self = this.set("marginDense", js.undefined)
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

