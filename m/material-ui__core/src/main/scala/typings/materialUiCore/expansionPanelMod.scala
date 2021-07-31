package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.expansionPanelExpansionPanelMod.ExpansionPanelProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelMod extends Shortcut {
  
  @JSImport("@material-ui/core/ExpansionPanel", JSImport.Default)
  @js.native
  val default: ComponentType[ExpansionPanelProps] = js.native
  
  type _To = ComponentType[ExpansionPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `expansionPanelMod.foo` */
  override def _to: ComponentType[ExpansionPanelProps] = default
}
