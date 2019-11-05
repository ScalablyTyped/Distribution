package typings.marked.markedMod

import typings.marked.Anon_Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Renderer")
@js.native
class Renderer () extends js.Object {
  def this(options: MarkedOptions) = this()
  var options: MarkedOptions = js.native
  def blockquote(quote: String): String = js.native
  def br(): String = js.native
  def checkbox(checked: Boolean): String = js.native
  def code(code: String, language: String, isEscaped: Boolean): String = js.native
  def codespan(code: String): String = js.native
  def del(text: String): String = js.native
  def em(text: String): String = js.native
  def heading(text: String, level: Double, raw: String, slugger: Slugger): String = js.native
  def hr(): String = js.native
  def html(html: String): String = js.native
  def image(href: String, title: String, text: String): String = js.native
  def link(href: String, title: String, text: String): String = js.native
  def list(body: String, ordered: Boolean, start: Double): String = js.native
  def listitem(text: String): String = js.native
  def paragraph(text: String): String = js.native
  def strong(text: String): String = js.native
  def table(header: String, body: String): String = js.native
  def tablecell(content: String, flags: Anon_Align): String = js.native
  def tablerow(content: String): String = js.native
  def text(text: String): String = js.native
}

