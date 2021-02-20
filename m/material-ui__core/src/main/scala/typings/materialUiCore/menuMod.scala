package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.menuMenuMod.MenuProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod extends Shortcut {
  
  @JSImport("@material-ui/core/Menu", JSImport.Default)
  @js.native
  val default: ComponentType[MenuProps] = js.native
  
  type _To = ComponentType[MenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuMod.foo` */
  override def _to: ComponentType[MenuProps] = default
}
