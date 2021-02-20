package typings.materialDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ponyfillMod {
  
  @JSImport("@material/dom/ponyfill", "closest")
  @js.native
  def closest(element: Element, selector: String): Element | Null = js.native
  
  @JSImport("@material/dom/ponyfill", "estimateScrollWidth")
  @js.native
  def estimateScrollWidth(element: Element): Double = js.native
  
  @JSImport("@material/dom/ponyfill", "matches")
  @js.native
  def matches(element: Element, selector: String): Boolean = js.native
}
