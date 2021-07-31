package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tabsTabsMod.TabsProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tabs", JSImport.Default)
  @js.native
  val default: ComponentType[TabsProps] = js.native
  
  type _To = ComponentType[TabsProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabsMod.foo` */
  override def _to: ComponentType[TabsProps] = default
}
