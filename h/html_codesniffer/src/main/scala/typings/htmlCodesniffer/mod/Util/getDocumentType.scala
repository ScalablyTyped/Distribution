package typings.htmlCodesniffer.mod.Util

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getDocumentType")
@js.native
object getDocumentType extends js.Object {
  
  /**
    * Get the document type being tested.
    *
    * Possible values: html5, xhtml5, xhtml11, xhtml10, html401, html40
    * ... or empty string if it couldn't work out the doctype.
    *
    * This will only give the thumbs-up to the "strict" doctypes.
    *
    * @param document The document being tested.
    */
  def apply(document: Document): DocumentType = js.native
}
