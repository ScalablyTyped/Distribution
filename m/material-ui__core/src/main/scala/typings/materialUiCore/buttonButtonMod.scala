package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DefaultComponentProps
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [Button API](https://mui.com/api/button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Button/Button", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.label
    - typings.materialUiCore.materialUiCoreStrings.text
    - typings.materialUiCore.materialUiCoreStrings.textPrimary
    - typings.materialUiCore.materialUiCoreStrings.textSecondary
    - typings.materialUiCore.materialUiCoreStrings.outlined
    - typings.materialUiCore.materialUiCoreStrings.outlinedPrimary
    - typings.materialUiCore.materialUiCoreStrings.outlinedSecondary
    - typings.materialUiCore.materialUiCoreStrings.contained
    - typings.materialUiCore.materialUiCoreStrings.containedPrimary
    - typings.materialUiCore.materialUiCoreStrings.containedSecondary
    - typings.materialUiCore.materialUiCoreStrings.disableElevation
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.colorInherit
    - typings.materialUiCore.materialUiCoreStrings.textSizeSmall
    - typings.materialUiCore.materialUiCoreStrings.textSizeLarge
    - typings.materialUiCore.materialUiCoreStrings.outlinedSizeSmall
    - typings.materialUiCore.materialUiCoreStrings.outlinedSizeLarge
    - typings.materialUiCore.materialUiCoreStrings.containedSizeSmall
    - typings.materialUiCore.materialUiCoreStrings.containedSizeLarge
    - typings.materialUiCore.materialUiCoreStrings.sizeSmall
    - typings.materialUiCore.materialUiCoreStrings.sizeLarge
    - typings.materialUiCore.materialUiCoreStrings.fullWidth
    - typings.materialUiCore.materialUiCoreStrings.startIcon
    - typings.materialUiCore.materialUiCoreStrings.endIcon
    - typings.materialUiCore.materialUiCoreStrings.iconSizeSmall
    - typings.materialUiCore.materialUiCoreStrings.iconSizeMedium
    - typings.materialUiCore.materialUiCoreStrings.iconSizeLarge
  */
  trait ButtonClassKey extends StObject
  object ButtonClassKey {
    
    inline def colorInherit: typings.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def contained: typings.materialUiCore.materialUiCoreStrings.contained = "contained".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.contained]
    
    inline def containedPrimary: typings.materialUiCore.materialUiCoreStrings.containedPrimary = "containedPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.containedPrimary]
    
    inline def containedSecondary: typings.materialUiCore.materialUiCoreStrings.containedSecondary = "containedSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.containedSecondary]
    
    inline def containedSizeLarge: typings.materialUiCore.materialUiCoreStrings.containedSizeLarge = "containedSizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.containedSizeLarge]
    
    inline def containedSizeSmall: typings.materialUiCore.materialUiCoreStrings.containedSizeSmall = "containedSizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.containedSizeSmall]
    
    inline def disableElevation: typings.materialUiCore.materialUiCoreStrings.disableElevation = "disableElevation".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disableElevation]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def endIcon: typings.materialUiCore.materialUiCoreStrings.endIcon = "endIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.endIcon]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def fullWidth: typings.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def iconSizeLarge: typings.materialUiCore.materialUiCoreStrings.iconSizeLarge = "iconSizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconSizeLarge]
    
    inline def iconSizeMedium: typings.materialUiCore.materialUiCoreStrings.iconSizeMedium = "iconSizeMedium".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconSizeMedium]
    
    inline def iconSizeSmall: typings.materialUiCore.materialUiCoreStrings.iconSizeSmall = "iconSizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconSizeSmall]
    
    inline def label: typings.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.label]
    
    inline def outlined: typings.materialUiCore.materialUiCoreStrings.outlined = "outlined".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlined]
    
    inline def outlinedPrimary: typings.materialUiCore.materialUiCoreStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlinedPrimary]
    
    inline def outlinedSecondary: typings.materialUiCore.materialUiCoreStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlinedSecondary]
    
    inline def outlinedSizeLarge: typings.materialUiCore.materialUiCoreStrings.outlinedSizeLarge = "outlinedSizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlinedSizeLarge]
    
    inline def outlinedSizeSmall: typings.materialUiCore.materialUiCoreStrings.outlinedSizeSmall = "outlinedSizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlinedSizeSmall]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def sizeLarge: typings.materialUiCore.materialUiCoreStrings.sizeLarge = "sizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sizeLarge]
    
    inline def sizeSmall: typings.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sizeSmall]
    
    inline def startIcon: typings.materialUiCore.materialUiCoreStrings.startIcon = "startIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.startIcon]
    
    inline def text: typings.materialUiCore.materialUiCoreStrings.text = "text".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.text]
    
    inline def textPrimary: typings.materialUiCore.materialUiCoreStrings.textPrimary = "textPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textPrimary]
    
    inline def textSecondary: typings.materialUiCore.materialUiCoreStrings.textSecondary = "textSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textSecondary]
    
    inline def textSizeLarge: typings.materialUiCore.materialUiCoreStrings.textSizeLarge = "textSizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textSizeLarge]
    
    inline def textSizeSmall: typings.materialUiCore.materialUiCoreStrings.textSizeSmall = "textSizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.textSizeSmall]
  }
  
  type ButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[ButtonTypeMap[P, D], D]
  
  type ButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[DefaultComponentProps[P, D]]
  
  type _To = ExtendButtonBase[ButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: ExtendButtonBase[ButtonTypeMap[js.Object, button]] = default
}
