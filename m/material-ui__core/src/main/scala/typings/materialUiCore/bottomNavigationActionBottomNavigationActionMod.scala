package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyDefaultComponent
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionBottomNavigationActionMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigationAction API](https://mui.com/api/bottom-navigation-action/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/BottomNavigationAction/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]] = js.native
  
  object BottomNavigationActionClassKey {
    
    inline def iconOnly: "iconOnly" = "iconOnly".asInstanceOf["iconOnly"]
    
    inline def label: "label" = "label".asInstanceOf["label"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def selected: "selected" = "selected".asInstanceOf["selected"]
    
    inline def wrapper: "wrapper" = "wrapper".asInstanceOf["wrapper"]
  }
  type BottomNavigationActionClassKey = "root" | "selected" | "iconOnly" | "wrapper" | "label"
  
  type BottomNavigationActionProps[D /* <: ElementType[Any] */, P] = OverrideProps[BottomNavigationActionTypeMap[P, D], D]
  
  type BottomNavigationActionTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyDefaultComponent[P, D]]
  
  type _To = ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionBottomNavigationActionMod.foo` */
  override def _to: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]] = default
}
