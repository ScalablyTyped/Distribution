package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.appBarAppBarMod.AppBarProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod extends Shortcut {
  
  @JSImport("@material-ui/core/AppBar", JSImport.Default)
  @js.native
  val default: ComponentType[AppBarProps] = js.native
  
  type _To = ComponentType[AppBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `appBarMod.foo` */
  override def _to: ComponentType[AppBarProps] = default
}
