package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.`7`
import typings.materialUiCore.anon.`8`
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.menuItemMenuItemMod.MenuItemTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Menus](https://mui.com/components/menus/)
    *
    * API:
    *
    * - [MenuItem API](https://mui.com/api/menu-item/)
    * - inherits [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@material-ui/core/MenuItem", JSImport.Default)
  @js.native
  val default: (OverridableComponent[MenuItemTypeMap[`7`, "li"]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, "li"]]) = js.native
  
  type _To = (OverridableComponent[MenuItemTypeMap[`7`, "li"]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, "li"]])
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMod.foo` */
  override def _to: (OverridableComponent[MenuItemTypeMap[`7`, "li"]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, "li"]]) = default
}
