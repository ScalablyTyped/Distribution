package typings.kramed.mod

import typings.kramed.AnonAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedRenderer extends js.Object {
  def blockquote(quote: String): String
  def br(): String
  def code(code: String, language: String): String
  def codespan(code: String): String
  def del(text: String): String
  def em(text: String): String
  def heading(text: String, level: Double, raw: String): String
  def hr(): String
  def html(html: String): String
  def image(href: String, title: String, text: String): String
  def link(href: String, title: String, text: String): String
  def list(body: String, ordered: Boolean): String
  def listitem(text: String): String
  def paragraph(text: String): String
  def strong(text: String): String
  def table(header: String, body: String): String
  def tablecell(content: String, flags: AnonAlign): String
  def tablerow(content: String): String
  def text(text: String): String
}

object KramedRenderer {
  @scala.inline
  def apply(
    blockquote: String => String,
    br: () => String,
    code: (String, String) => String,
    codespan: String => String,
    del: String => String,
    em: String => String,
    heading: (String, Double, String) => String,
    hr: () => String,
    html: String => String,
    image: (String, String, String) => String,
    link: (String, String, String) => String,
    list: (String, Boolean) => String,
    listitem: String => String,
    paragraph: String => String,
    strong: String => String,
    table: (String, String) => String,
    tablecell: (String, AnonAlign) => String,
    tablerow: String => String,
    text: String => String
  ): KramedRenderer = {
    val __obj = js.Dynamic.literal(blockquote = js.Any.fromFunction1(blockquote), br = js.Any.fromFunction0(br), code = js.Any.fromFunction2(code), codespan = js.Any.fromFunction1(codespan), del = js.Any.fromFunction1(del), em = js.Any.fromFunction1(em), heading = js.Any.fromFunction3(heading), hr = js.Any.fromFunction0(hr), html = js.Any.fromFunction1(html), image = js.Any.fromFunction3(image), link = js.Any.fromFunction3(link), list = js.Any.fromFunction2(list), listitem = js.Any.fromFunction1(listitem), paragraph = js.Any.fromFunction1(paragraph), strong = js.Any.fromFunction1(strong), table = js.Any.fromFunction2(table), tablecell = js.Any.fromFunction2(tablecell), tablerow = js.Any.fromFunction1(tablerow), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[KramedRenderer]
  }
}

