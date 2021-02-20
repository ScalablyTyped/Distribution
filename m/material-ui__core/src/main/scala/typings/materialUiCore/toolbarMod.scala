package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.toolbarToolbarMod.ToolbarProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Toolbar", JSImport.Default)
  @js.native
  val default: ComponentType[ToolbarProps] = js.native
  
  type _To = ComponentType[ToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarMod.foo` */
  override def _to: ComponentType[ToolbarProps] = default
}
