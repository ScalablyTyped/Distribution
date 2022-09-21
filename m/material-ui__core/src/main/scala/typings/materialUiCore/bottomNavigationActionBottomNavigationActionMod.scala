package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyDefaultComponent
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
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
  val default: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.selected
    - typings.materialUiCore.materialUiCoreStrings.iconOnly
    - typings.materialUiCore.materialUiCoreStrings.wrapper
    - typings.materialUiCore.materialUiCoreStrings.label
  */
  trait BottomNavigationActionClassKey extends StObject
  object BottomNavigationActionClassKey {
    
    inline def iconOnly: typings.materialUiCore.materialUiCoreStrings.iconOnly = "iconOnly".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.iconOnly]
    
    inline def label: typings.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.label]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typings.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.selected]
    
    inline def wrapper: typings.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.wrapper]
  }
  
  type BottomNavigationActionProps[D /* <: ElementType[Any] */, P] = OverrideProps[BottomNavigationActionTypeMap[P, D], D]
  
  type BottomNavigationActionTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyDefaultComponent[P, D]]
  
  type _To = ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionBottomNavigationActionMod.foo` */
  override def _to: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]] = default
}
