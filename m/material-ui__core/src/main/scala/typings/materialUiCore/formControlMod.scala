package typings.materialUiCore

import typings.materialUiCore.formControlFormControlMod.FormControlTypeMap
import typings.materialUiCore.formControlUseFormControlMod.FormControlState
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("@material-ui/core/FormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides context such as filled/focused/error/required for form inputs.
    * Relying on the context provides high flexibility and ensures that the state always stays
    * consistent across the children of the `FormControl`.
    * This context is used by the following components:
    *
    * -   FormLabel
    * -   FormHelperText
    * -   Input
    * -   InputLabel
    *
    * You can find one composition example below and more going to [the demos](https://mui.com/components/text-fields/#components).
    *
    * ```jsx
    * <FormControl>
    *   <InputLabel htmlFor="my-input">Email address</InputLabel>
    *   <Input id="my-input" aria-describedby="my-helper-text" />
    *   <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
    * </FormControl>
    * ```
    *
    * ⚠️Only one input can be used within a FormControl.
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormControl API](https://mui.com/api/form-control/)
    */
  @JSImport("@material-ui/core/FormControl", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormControlTypeMap[js.Object, "div"]] = js.native
  
  inline def useFormControl(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormControl")().asInstanceOf[js.UndefOr[FormControlState]]
}
