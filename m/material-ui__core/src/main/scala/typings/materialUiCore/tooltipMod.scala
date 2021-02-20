package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tooltipTooltipMod.TooltipProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tooltip", JSImport.Default)
  @js.native
  val default: ComponentType[TooltipProps] = js.native
  
  type _To = ComponentType[TooltipProps]
  
  /* This means you don't have to write `default`, but can instead just say `tooltipMod.foo` */
  override def _to: ComponentType[TooltipProps] = default
}
