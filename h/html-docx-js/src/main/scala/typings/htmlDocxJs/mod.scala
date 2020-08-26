package typings.htmlDocxJs

import typings.htmlDocxJs.anon.Margins
import typings.node.Buffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-docx-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def asBlob(
    /**
    * An HTML formatted string. It should be a complete, valid HTML
    * (including DOCTYPE, `html` and `body` tags).
    * This may be less convenient, but gives you possibility of including
    * CSS rules in `style` tags.
    */
  html: String
  ): Blob | Buffer = js.native
  def asBlob(
    /**
    * An HTML formatted string. It should be a complete, valid HTML
    * (including DOCTYPE, `html` and `body` tags).
    * This may be less convenient, but gives you possibility of including
    * CSS rules in `style` tags.
    */
  html: String,
    /** Additional options for controlling page setup for the document. */
  options: Margins
  ): Blob | Buffer = js.native
}

