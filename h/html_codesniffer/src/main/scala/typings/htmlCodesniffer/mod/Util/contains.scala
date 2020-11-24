package typings.htmlCodesniffer.mod.Util

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.contains")
@js.native
object contains extends js.Object {
  
  def apply(parent: Document, child: DocumentType): Boolean = js.native
  def apply(parent: Document, child: Element): Boolean = js.native
  def apply(parent: Element, child: DocumentType): Boolean = js.native
  /**
    * Returns true if the passed child is contained by the passed parent.
    *
    * Uses either the IE contains() method or the W3C compareDocumentPosition()
    * method, as appropriate.
    *
    * @param parent The parent element or document.
    * @param child The child.
    */
  def apply(parent: Element, child: Element): Boolean = js.native
}
