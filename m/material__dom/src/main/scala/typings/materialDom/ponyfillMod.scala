package typings.materialDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ponyfillMod {
  
  @JSImport("@material/dom/ponyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closest(element: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def estimateScrollWidth(element: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateScrollWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matches(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
