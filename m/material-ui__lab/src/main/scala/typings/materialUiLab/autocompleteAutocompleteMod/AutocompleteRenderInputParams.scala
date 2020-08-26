package typings.materialUiLab.autocompleteAutocompleteMod

import typings.materialUiLab.anon.ClassName
import typings.materialUiLab.materialUiLabStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteRenderInputParams extends js.Object {
  var InputLabelProps: js.Object = js.native
  var InputProps: ClassName = js.native
  var disabled: Boolean = js.native
  var fullWidth: Boolean = js.native
  var id: String = js.native
  var inputProps: js.Object = js.native
  var size: js.UndefOr[small] = js.native
}

object AutocompleteRenderInputParams {
  @scala.inline
  def apply(
    InputLabelProps: js.Object,
    InputProps: ClassName,
    disabled: Boolean,
    fullWidth: Boolean,
    id: String,
    inputProps: js.Object
  ): AutocompleteRenderInputParams = {
    val __obj = js.Dynamic.literal(InputLabelProps = InputLabelProps.asInstanceOf[js.Any], InputProps = InputProps.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputProps = inputProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteRenderInputParams]
  }
  @scala.inline
  implicit class AutocompleteRenderInputParamsOps[Self <: AutocompleteRenderInputParams] (val x: Self) extends AnyVal {
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
    def setInputLabelProps(value: js.Object): Self = this.set("InputLabelProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputProps(value: ClassName): Self = this.set("InputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

