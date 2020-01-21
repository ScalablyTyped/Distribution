package typings.materialDom

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom/ponyfill", JSImport.Namespace)
@js.native
object ponyfillMod extends js.Object {
  def closest(element: Element, selector: String): Element = js.native
  def matches(element: Element, selector: String): Boolean = js.native
}

