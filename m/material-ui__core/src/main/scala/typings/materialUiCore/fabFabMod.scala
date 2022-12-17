package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyFabClassKey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabFabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/components/floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Fab/Fab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[FabTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.label
    - typings.materialUiCore.materialUiCoreStrings.primary
    - typings.materialUiCore.materialUiCoreStrings.secondary
    - typings.materialUiCore.materialUiCoreStrings.extended
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.colorInherit
    - typings.materialUiCore.materialUiCoreStrings.sizeSmall
    - typings.materialUiCore.materialUiCoreStrings.sizeMedium
  */
  trait FabClassKey extends StObject
  object FabClassKey {
    
    inline def colorInherit: typings.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def extended: typings.materialUiCore.materialUiCoreStrings.extended = "extended".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.extended]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def label: typings.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.label]
    
    inline def primary: typings.materialUiCore.materialUiCoreStrings.primary = "primary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.primary]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def secondary: typings.materialUiCore.materialUiCoreStrings.secondary = "secondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.secondary]
    
    inline def sizeMedium: typings.materialUiCore.materialUiCoreStrings.sizeMedium = "sizeMedium".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sizeMedium]
    
    inline def sizeSmall: typings.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sizeSmall]
  }
  
  type FabProps[D /* <: ElementType[Any] */, P] = OverrideProps[FabTypeMap[P, D], D]
  
  type FabTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyFabClassKey[P, D]]
  
  type _To = ExtendButtonBase[FabTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `fabFabMod.foo` */
  override def _to: ExtendButtonBase[FabTypeMap[js.Object, button]] = default
}
