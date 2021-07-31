package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.drawerDrawerMod.DrawerProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod extends Shortcut {
  
  @JSImport("@material-ui/core/Drawer", JSImport.Default)
  @js.native
  val default: ComponentType[DrawerProps] = js.native
  
  type _To = ComponentType[DrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `drawerMod.foo` */
  override def _to: ComponentType[DrawerProps] = default
}
