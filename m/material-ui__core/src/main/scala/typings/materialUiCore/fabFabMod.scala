package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyFabClassKeyDefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[FabTypeMap[js.Object, "button"]] = js.native
  
  object FabClassKey {
    
    inline def colorInherit: "colorInherit" = "colorInherit".asInstanceOf["colorInherit"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def extended: "extended" = "extended".asInstanceOf["extended"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def primary: "primary" = "primary".asInstanceOf["primary"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def secondary: "secondary" = "secondary".asInstanceOf["secondary"]
    
    inline def sizeMedium: "sizeMedium" = "sizeMedium".asInstanceOf["sizeMedium"]
    
    inline def sizeSmall: "sizeSmall" = "sizeSmall".asInstanceOf["sizeSmall"]
  }
  type FabClassKey = "root" | "label" | "primary" | "secondary" | "extended" | "focusVisible" | "disabled" | "colorInherit" | "sizeSmall" | "sizeMedium"
  
  type FabProps[D /* <: ElementType[Any] */, P] = OverrideProps[FabTypeMap[P, D], D]
  
  type FabTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyFabClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[FabTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `fabFabMod.foo` */
  override def _to: ExtendButtonBase[FabTypeMap[js.Object, "button"]] = default
}
