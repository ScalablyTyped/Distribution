package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.listItemListItemMod.ListItemProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItem", JSImport.Default)
  @js.native
  val default: ComponentType[ListItemProps] = js.native
  
  type _To = ComponentType[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: ComponentType[ListItemProps] = default
}
