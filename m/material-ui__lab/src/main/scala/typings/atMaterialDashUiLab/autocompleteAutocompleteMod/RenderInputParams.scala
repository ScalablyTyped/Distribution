package typings.atMaterialDashUiLab.autocompleteAutocompleteMod

import typings.atMaterialDashUiLab.Anon_ClassName
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputParams extends js.Object {
  var InputLabelProps: js.Object
  var InputProps: Anon_ClassName
  var disabled: Boolean
  var inputProps: js.Object
  var ref: Ref[_]
}

object RenderInputParams {
  @scala.inline
  def apply(
    InputLabelProps: js.Object,
    InputProps: Anon_ClassName,
    disabled: Boolean,
    inputProps: js.Object,
    ref: Ref[_] = null
  ): RenderInputParams = {
    val __obj = js.Dynamic.literal(InputLabelProps = InputLabelProps, InputProps = InputProps, disabled = disabled, inputProps = inputProps)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputParams]
  }
}

