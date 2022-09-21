package typings.materialUiCore

import typings.materialUiCore.tooltipTooltipMod.TooltipProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@material-ui/core/Tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
