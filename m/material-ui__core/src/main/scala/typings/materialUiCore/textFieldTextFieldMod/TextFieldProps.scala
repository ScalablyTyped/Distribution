package typings.materialUiCore.textFieldTextFieldMod

import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.materialUiCore.textFieldTextFieldMod.StandardTextFieldProps
  - typings.materialUiCore.textFieldTextFieldMod.FilledTextFieldProps
  - typings.materialUiCore.textFieldTextFieldMod.OutlinedTextFieldProps
*/
trait TextFieldProps extends js.Object

object TextFieldProps {
  @scala.inline
  def StandardTextFieldProps(): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  def FilledTextFieldProps(variant: filled): TextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  def OutlinedTextFieldProps(variant: outlined): TextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

