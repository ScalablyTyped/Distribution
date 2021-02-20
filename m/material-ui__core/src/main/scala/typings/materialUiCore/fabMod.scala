package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.fabFabMod.FabProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabMod extends Shortcut {
  
  @JSImport("@material-ui/core/Fab", JSImport.Default)
  @js.native
  val default: ComponentType[FabProps] = js.native
  
  type _To = ComponentType[FabProps]
  
  /* This means you don't have to write `default`, but can instead just say `fabMod.foo` */
  override def _to: ComponentType[FabProps] = default
}
