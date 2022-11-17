package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyStepButtonClasskey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonStepButtonMod extends Shortcut {
  
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
  @JSImport("@material-ui/core/StepButton/StepButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[StepButtonTypeMap[js.Object, "button"]] = js.native
  
  object StepButtonClasskey {
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def touchRipple: "touchRipple" = "touchRipple".asInstanceOf["touchRipple"]
    
    inline def vertical: "vertical" = "vertical".asInstanceOf["vertical"]
  }
  type StepButtonClasskey = "root" | "vertical" | "touchRipple"
  
  type StepButtonIcon = ReactNode
  
  type StepButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[StepButtonTypeMap[P, D], D]
  
  type StepButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyStepButtonClasskey[P, D]]
  
  type _To = ExtendButtonBase[StepButtonTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonStepButtonMod.foo` */
  override def _to: ExtendButtonBase[StepButtonTypeMap[js.Object, "button"]] = default
}
