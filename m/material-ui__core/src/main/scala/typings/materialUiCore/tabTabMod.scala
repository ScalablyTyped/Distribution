package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyTabClassKeyDefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[TabTypeMap[js.Object, "div"]] = js.native
  
  object TabClassKey {
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def fullWidth: "fullWidth" = "fullWidth".asInstanceOf["fullWidth"]
    
    inline def labelIcon: "labelIcon" = "labelIcon".asInstanceOf["labelIcon"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def selected: "selected" = "selected".asInstanceOf["selected"]
    
    inline def textColorInherit: "textColorInherit" = "textColorInherit".asInstanceOf["textColorInherit"]
    
    inline def textColorPrimary: "textColorPrimary" = "textColorPrimary".asInstanceOf["textColorPrimary"]
    
    inline def textColorSecondary: "textColorSecondary" = "textColorSecondary".asInstanceOf["textColorSecondary"]
    
    inline def wrapped: "wrapped" = "wrapped".asInstanceOf["wrapped"]
    
    inline def wrapper: "wrapper" = "wrapper".asInstanceOf["wrapper"]
  }
  type TabClassKey = "root" | "labelIcon" | "textColorInherit" | "textColorPrimary" | "textColorSecondary" | "selected" | "disabled" | "fullWidth" | "wrapped" | "wrapper"
  
  type TabProps[D /* <: ElementType[Any] */, P] = OverrideProps[TabTypeMap[P, D], D]
  
  type TabTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyTabClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TabTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `tabTabMod.foo` */
  override def _to: ExtendButtonBase[TabTypeMap[js.Object, "div"]] = default
}
