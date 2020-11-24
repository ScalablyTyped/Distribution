package typings.htmlCodesniffer.mod.Util

import typings.std.ArrayLike
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getAllElements")
@js.native
object getAllElements extends js.Object {
  
  /**
    * Returns all elements that are visible to the accessibility API.
    *
    * @param element The parent element to search.
    * @param selector Optional selector to pass to
    */
  def apply(element: Element, selector: String): ArrayLike[Element] = js.native
}
