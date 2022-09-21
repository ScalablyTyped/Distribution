package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.materialUiCoreStrings.button
import typings.materialUiCore.stepButtonStepButtonMod.StepButtonTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Steppers](https://mui.com/components/steppers/)
    *
    * API:
    *
    * - [StepButton API](https://mui.com/api/step-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/StepButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = js.native
  
  type _To = ExtendButtonBase[StepButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonMod.foo` */
  override def _to: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = default
}
