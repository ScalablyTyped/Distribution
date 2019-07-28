package typings.atMaterialDom

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom", JSImport.Namespace)
@js.native
object atMaterialDomMod extends js.Object {
  @JSName("ponyfill")
  @js.native
  object ponyfillNs extends js.Object {
    def closest(element: Element, selector: String): Element = js.native
    def matches(element: Element, selector: String): Boolean = js.native
  }
  
}

