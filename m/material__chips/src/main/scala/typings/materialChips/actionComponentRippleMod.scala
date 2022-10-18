package typings.materialChips

import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionComponentRippleMod {
  
  @JSImport("@material/chips/action/component-ripple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@material/chips/action/component-ripple", "GRAPHIC_SELECTED_WIDTH_STYLE_PROP")
  @js.native
  val GRAPHIC_SELECTED_WIDTH_STYLE_PROP: /* "--mdc-chip-graphic-selected-width" */ String = js.native
  
  inline def computePrimaryActionRippleClientRect(clientRect: DOMRect, graphicSelectedWidthStyleValue: String): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("computePrimaryActionRippleClientRect")(clientRect.asInstanceOf[js.Any], graphicSelectedWidthStyleValue.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
}
