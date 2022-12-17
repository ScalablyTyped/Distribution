package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.materialUiLab.anon.ClassKey
import typings.materialUiLab.materialUiLabStrings.button
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonToggleButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.disabled
    - typings.materialUiLab.materialUiLabStrings.selected
    - typings.materialUiLab.materialUiLabStrings.label
    - typings.materialUiLab.materialUiLabStrings.sizeSmall
    - typings.materialUiLab.materialUiLabStrings.sizeLarge
  */
  trait ToggleButtonClassKey extends StObject
  object ToggleButtonClassKey {
    
    inline def disabled: typings.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typings.materialUiLab.materialUiLabStrings.disabled]
    
    inline def label: typings.materialUiLab.materialUiLabStrings.label = "label".asInstanceOf[typings.materialUiLab.materialUiLabStrings.label]
    
    inline def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    inline def selected: typings.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typings.materialUiLab.materialUiLabStrings.selected]
    
    inline def sizeLarge: typings.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeLarge]
    
    inline def sizeSmall: typings.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeSmall]
  }
  
  type ToggleButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[ToggleButtonTypeMap[P, D], D]
  
  type ToggleButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKey[P, D]]
  
  type _To = ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonToggleButtonMod.foo` */
  override def _to: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = default
}
