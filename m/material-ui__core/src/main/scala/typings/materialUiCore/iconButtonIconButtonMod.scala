package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyIconButtonClassKey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonMod extends Shortcut {
  
  /**
    * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
    * regarding the available icon options.
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/IconButton/IconButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[IconButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.edgeStart
    - typings.materialUiCore.materialUiCoreStrings.edgeEnd
    - typings.materialUiCore.materialUiCoreStrings.colorInherit
    - typings.materialUiCore.materialUiCoreStrings.colorPrimary
    - typings.materialUiCore.materialUiCoreStrings.colorSecondary
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.sizeSmall
    - typings.materialUiCore.materialUiCoreStrings.label
  */
  trait IconButtonClassKey extends StObject
  object IconButtonClassKey {
    
    inline def colorInherit: typings.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def colorPrimary: typings.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typings.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def edgeEnd: typings.materialUiCore.materialUiCoreStrings.edgeEnd = "edgeEnd".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.edgeEnd]
    
    inline def edgeStart: typings.materialUiCore.materialUiCoreStrings.edgeStart = "edgeStart".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.edgeStart]
    
    inline def label: typings.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.label]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def sizeSmall: typings.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sizeSmall]
  }
  
  type IconButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  type IconButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyIconButtonClassKey[P, D]]
  
  type _To = ExtendButtonBase[IconButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: ExtendButtonBase[IconButtonTypeMap[js.Object, button]] = default
}
