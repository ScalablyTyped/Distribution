package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormHelperText API](https://mui.com/api/form-helper-text/)
    */
  @JSImport("@material-ui/core/FormHelperText", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormHelperTextTypeMap[js.Object, "p"]] = js.native
  
  type _To = OverridableComponent[FormHelperTextTypeMap[js.Object, "p"]]
  
  /* This means you don't have to write `default`, but can instead just say `formHelperTextMod.foo` */
  override def _to: OverridableComponent[FormHelperTextTypeMap[js.Object, "p"]] = default
}
