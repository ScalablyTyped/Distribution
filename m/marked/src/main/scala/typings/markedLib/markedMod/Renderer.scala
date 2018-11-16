package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Renderer")
@js.native
class Renderer ()
  extends markedLib.markedMod.markedNs.Renderer {
  def this(options: markedLib.markedMod.markedNs.MarkedOptions) = this()
  /* CompleteClass */
  override def blockquote(quote: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def br(): java.lang.String = js.native
  /* CompleteClass */
  override def code(code: java.lang.String, language: java.lang.String, isEscaped: scala.Boolean): java.lang.String = js.native
  /* CompleteClass */
  override def codespan(code: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def del(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def em(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def heading(text: java.lang.String, level: scala.Double, raw: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def hr(): java.lang.String = js.native
  /* CompleteClass */
  override def html(html: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def list(body: java.lang.String, ordered: scala.Boolean, start: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def listitem(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def paragraph(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def strong(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def table(header: java.lang.String, body: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def tablecell(content: java.lang.String, flags: markedLib.Anon_Header): java.lang.String = js.native
  /* CompleteClass */
  override def tablerow(content: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def text(text: java.lang.String): java.lang.String = js.native
}

