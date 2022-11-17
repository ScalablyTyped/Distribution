package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyIconButtonClassKey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]] = js.native
  
  object IconButtonClassKey {
    
    inline def colorInherit: "colorInherit" = "colorInherit".asInstanceOf["colorInherit"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def edgeEnd: "edgeEnd" = "edgeEnd".asInstanceOf["edgeEnd"]
    
    inline def edgeStart: "edgeStart" = "edgeStart".asInstanceOf["edgeStart"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def sizeSmall: "sizeSmall" = "sizeSmall".asInstanceOf["sizeSmall"]
  }
  type IconButtonClassKey = "root" | "edgeStart" | "edgeEnd" | "colorInherit" | "colorPrimary" | "colorSecondary" | "disabled" | "sizeSmall" | "label"
  
  type IconButtonProps[D /* <: ElementType[Any] */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  type IconButtonTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyIconButtonClassKey[P, D]]
  
  type _To = ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]] = default
}
