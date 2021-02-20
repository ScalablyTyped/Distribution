package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.popoverPopoverMod.PopoverProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popover", JSImport.Default)
  @js.native
  val default: ComponentType[PopoverProps] = js.native
  
  type _To = ComponentType[PopoverProps]
  
  /* This means you don't have to write `default`, but can instead just say `popoverMod.foo` */
  override def _to: ComponentType[PopoverProps] = default
}
