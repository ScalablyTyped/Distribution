package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyStepButtonClasskey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
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
  val default: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.vertical
    - typings.materialUiCore.materialUiCoreStrings.touchRipple
  */
  trait StepButtonClasskey extends StObject
  object StepButtonClasskey {
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def touchRipple: typings.materialUiCore.materialUiCoreStrings.touchRipple = "touchRipple".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.touchRipple]
    
    inline def vertical: typings.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.vertical]
  }
  
  type StepButtonIcon = ReactNode
  
  type StepButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[StepButtonTypeMap[P, D], D]
  
  type StepButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyStepButtonClasskey[P, D]]
  
  type _To = ExtendButtonBase[StepButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonStepButtonMod.foo` */
  override def _to: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = default
}
