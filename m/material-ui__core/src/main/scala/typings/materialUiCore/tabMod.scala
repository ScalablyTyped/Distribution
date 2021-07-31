package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tabTabMod.TabProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tab", JSImport.Default)
  @js.native
  val default: ComponentType[TabProps] = js.native
  
  type _To = ComponentType[TabProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabMod.foo` */
  override def _to: ComponentType[TabProps] = default
}
