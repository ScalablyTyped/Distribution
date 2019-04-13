package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Renderer")
@js.native
class Renderer () extends js.Object {
  def this(options: MarkedOptions) = this()
  def blockquote(quote: java.lang.String): java.lang.String = js.native
  def br(): java.lang.String = js.native
  def code(code: java.lang.String, language: java.lang.String, isEscaped: scala.Boolean): java.lang.String = js.native
  def codespan(code: java.lang.String): java.lang.String = js.native
  def del(text: java.lang.String): java.lang.String = js.native
  def em(text: java.lang.String): java.lang.String = js.native
  def heading(text: java.lang.String, level: scala.Double, raw: java.lang.String, slugger: Slugger): java.lang.String = js.native
  def hr(): java.lang.String = js.native
  def html(html: java.lang.String): java.lang.String = js.native
  def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String = js.native
  def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String = js.native
  def list(body: java.lang.String, ordered: scala.Boolean, start: scala.Double): java.lang.String = js.native
  def listitem(text: java.lang.String): java.lang.String = js.native
  def paragraph(text: java.lang.String): java.lang.String = js.native
  def strong(text: java.lang.String): java.lang.String = js.native
  def table(header: java.lang.String, body: java.lang.String): java.lang.String = js.native
  def tablecell(content: java.lang.String, flags: markedLib.Anon_Align): java.lang.String = js.native
  def tablerow(content: java.lang.String): java.lang.String = js.native
  def text(text: java.lang.String): java.lang.String = js.native
}

