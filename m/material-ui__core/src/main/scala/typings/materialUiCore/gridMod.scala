package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.gridGridMod.GridProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod extends Shortcut {
  
  @JSImport("@material-ui/core/Grid", JSImport.Default)
  @js.native
  val default: ComponentType[GridProps] = js.native
  
  type _To = ComponentType[GridProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridMod.foo` */
  override def _to: ComponentType[GridProps] = default
}
