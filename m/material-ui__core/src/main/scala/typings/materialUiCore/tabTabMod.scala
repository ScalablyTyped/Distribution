package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyTabClassKeyDefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tab API](https://mui.com/api/tab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Tab/Tab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TabTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.labelIcon
    - typings.materialUiCore.materialUiCoreStrings.textColorInherit
    - typings.materialUiCore.materialUiCoreStrings.textColorPrimary
    - typings.materialUiCore.materialUiCoreStrings.textColorSecondary
    - typings.materialUiCore.materialUiCoreStrings.selected
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.fullWidth
    - typings.materialUiCore.materialUiCoreStrings.wrapped
    - typings.materialUiCore.materialUiCoreStrings.wrapper
  */
  trait TabClassKey extends StObject
  object TabClassKey {
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def fullWidth: typings.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def labelIcon: typings.materialUiCore.materialUiCoreStrings.labelIcon = "labelIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.labelIcon]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typings.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.selected]
    
    inline def textColorInherit: typings.materialUiCore.materialUiCoreStrings.textColorInherit = "textColorInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textColorInherit]
    
    inline def textColorPrimary: typings.materialUiCore.materialUiCoreStrings.textColorPrimary = "textColorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textColorPrimary]
    
    inline def textColorSecondary: typings.materialUiCore.materialUiCoreStrings.textColorSecondary = "textColorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textColorSecondary]
    
    inline def wrapped: typings.materialUiCore.materialUiCoreStrings.wrapped = "wrapped".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.wrapped]
    
    inline def wrapper: typings.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.wrapper]
  }
  
  type TabProps[D /* <: ElementType[Any] */, P] = OverrideProps[TabTypeMap[P, D], D]
  
  type TabTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyTabClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TabTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `tabTabMod.foo` */
  override def _to: ExtendButtonBase[TabTypeMap[js.Object, div]] = default
}
