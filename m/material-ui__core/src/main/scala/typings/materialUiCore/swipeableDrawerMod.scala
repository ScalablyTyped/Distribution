package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.swipeableDrawerSwipeableDrawerMod.SwipeableDrawerProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeableDrawerMod extends Shortcut {
  
  @JSImport("@material-ui/core/SwipeableDrawer", JSImport.Default)
  @js.native
  val default: ComponentType[SwipeableDrawerProps] = js.native
  
  type _To = ComponentType[SwipeableDrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `swipeableDrawerMod.foo` */
  override def _to: ComponentType[SwipeableDrawerProps] = default
}
