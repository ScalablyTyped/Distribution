package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.menuItemMenuItemMod.MenuItemProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod extends Shortcut {
  
  @JSImport("@material-ui/core/MenuItem", JSImport.Default)
  @js.native
  val default: ComponentType[MenuItemProps] = js.native
  
  type _To = ComponentType[MenuItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMod.foo` */
  override def _to: ComponentType[MenuItemProps] = default
}
