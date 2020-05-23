package typings.marked.mod

import typings.marked.anon.Align
import typings.marked.markedNumbers.`1`
import typings.marked.markedNumbers.`2`
import typings.marked.markedNumbers.`3`
import typings.marked.markedNumbers.`4`
import typings.marked.markedNumbers.`5`
import typings.marked.markedNumbers.`6`
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
  def code(code: String, language: js.UndefOr[String], isEscaped: Boolean): String = js.native
  def codespan(code: String): String = js.native
  def del(text: String): String = js.native
  def em(text: String): String = js.native
  @JSName("heading")
  def heading_1(text: String, level: `1`, raw: String, slugger: Slugger): String = js.native
  @JSName("heading")
  def heading_2(text: String, level: `2`, raw: String, slugger: Slugger): String = js.native
  @JSName("heading")
  def heading_3(text: String, level: `3`, raw: String, slugger: Slugger): String = js.native
  @JSName("heading")
  def heading_4(text: String, level: `4`, raw: String, slugger: Slugger): String = js.native
  @JSName("heading")
  def heading_5(text: String, level: `5`, raw: String, slugger: Slugger): String = js.native
  @JSName("heading")
  def heading_6(text: String, level: `6`, raw: String, slugger: Slugger): String = js.native
  def hr(): String = js.native
  def html(html: String): String = js.native
  def image(href: String, title: String, text: String): String = js.native
  def image(href: String, title: Null, text: String): String = js.native
  def image(href: Null, title: String, text: String): String = js.native
  def image(href: Null, title: Null, text: String): String = js.native
  def link(href: String, title: String, text: String): String = js.native
  def link(href: String, title: Null, text: String): String = js.native
  def link(href: Null, title: String, text: String): String = js.native
  def link(href: Null, title: Null, text: String): String = js.native
  def list(body: String, ordered: Boolean, start: Double): String = js.native
  def listitem(text: String): String = js.native
  def paragraph(text: String): String = js.native
  def strong(text: String): String = js.native
  def table(header: String, body: String): String = js.native
  def tablecell(content: String, flags: Align): String = js.native
  def tablerow(content: String): String = js.native
  def text(text: String): String = js.native
}

