package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getElementTextContent")
@js.native
object getElementTextContent extends js.Object {
  
  /**
    * Gets the text contents of an element.
    *
    * @param element The element being inspected.
    * @param [includeAlt=true] Include alt text from images.
    * @returns The text contents.
    */
  def apply(element: Element): String = js.native
  def apply(element: Element, includeAlt: Boolean): String = js.native
}
