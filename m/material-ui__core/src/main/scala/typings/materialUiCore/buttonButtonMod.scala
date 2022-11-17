package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyDefaultComponentProps
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[ButtonTypeMap[js.Object, "button"]] = js.native
  
  object ButtonClassKey {
    
    inline def colorInherit: "colorInherit" = "colorInherit".asInstanceOf["colorInherit"]
    
    inline def contained: "contained" = "contained".asInstanceOf["contained"]
    
    inline def containedPrimary: "containedPrimary" = "containedPrimary".asInstanceOf["containedPrimary"]
    
    inline def containedSecondary: "containedSecondary" = "containedSecondary".asInstanceOf["containedSecondary"]
    
    inline def containedSizeLarge: "containedSizeLarge" = "containedSizeLarge".asInstanceOf["containedSizeLarge"]
    
    inline def containedSizeSmall: "containedSizeSmall" = "containedSizeSmall".asInstanceOf["containedSizeSmall"]
    
    inline def disableElevation: "disableElevation" = "disableElevation".asInstanceOf["disableElevation"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def endIcon: "endIcon" = "endIcon".asInstanceOf["endIcon"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def fullWidth: "fullWidth" = "fullWidth".asInstanceOf["fullWidth"]
    
    inline def iconSizeLarge: "iconSizeLarge" = "iconSizeLarge".asInstanceOf["iconSizeLarge"]
    
    inline def iconSizeMedium: "iconSizeMedium" = "iconSizeMedium".asInstanceOf["iconSizeMedium"]
    
    inline def iconSizeSmall: "iconSizeSmall" = "iconSizeSmall".asInstanceOf["iconSizeSmall"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def outlined: "outlined" = "outlined".asInstanceOf["outlined"]
    
    inline def outlinedPrimary: "outlinedPrimary" = "outlinedPrimary".asInstanceOf["outlinedPrimary"]
    
    inline def outlinedSecondary: "outlinedSecondary" = "outlinedSecondary".asInstanceOf["outlinedSecondary"]
    
    inline def outlinedSizeLarge: "outlinedSizeLarge" = "outlinedSizeLarge".asInstanceOf["outlinedSizeLarge"]
    
    inline def outlinedSizeSmall: "outlinedSizeSmall" = "outlinedSizeSmall".asInstanceOf["outlinedSizeSmall"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def sizeLarge: "sizeLarge" = "sizeLarge".asInstanceOf["sizeLarge"]
    
    inline def sizeSmall: "sizeSmall" = "sizeSmall".asInstanceOf["sizeSmall"]
    
    inline def startIcon: "startIcon" = "startIcon".asInstanceOf["startIcon"]
    
    inline def text: "text" = "text".asInstanceOf["text"]
    
    inline def textPrimary: "textPrimary" = "textPrimary".asInstanceOf["textPrimary"]
    
    inline def textSecondary: "textSecondary" = "textSecondary".asInstanceOf["textSecondary"]
    
    inline def textSizeLarge: "textSizeLarge" = "textSizeLarge".asInstanceOf["textSizeLarge"]
    
    inline def textSizeSmall: "textSizeSmall" = "textSizeSmall".asInstanceOf["textSizeSmall"]
  }
  type ButtonClassKey = "root" | "label" | "text" | "textPrimary" | "textSecondary" | "outlined" | "outlinedPrimary" | "outlinedSecondary" | "contained" | "containedPrimary" | "containedSecondary" | "disableElevation" | "focusVisible" | "disabled" | "colorInherit" | "textSizeSmall" | "textSizeLarge" | "outlinedSizeSmall" | "outlinedSizeLarge" | "containedSizeSmall" | "containedSizeLarge" | "sizeSmall" | "sizeLarge" | "fullWidth" | "startIcon" | "endIcon" | "iconSizeSmall" | "iconSizeMedium" | "iconSizeLarge"
  
  type ButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[ButtonTypeMap[P, D], D]
  
  type ButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyDefaultComponentProps[P, D]]
  
  type _To = ExtendButtonBase[ButtonTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: ExtendButtonBase[ButtonTypeMap[js.Object, "button"]] = default
}
