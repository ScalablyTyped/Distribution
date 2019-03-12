package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  def blockquote(quote: java.lang.String): java.lang.String
  def br(): java.lang.String
  def code(code: java.lang.String, language: java.lang.String, isEscaped: scala.Boolean): java.lang.String
  def codespan(code: java.lang.String): java.lang.String
  def del(text: java.lang.String): java.lang.String
  def em(text: java.lang.String): java.lang.String
  def heading(text: java.lang.String, level: scala.Double, raw: java.lang.String, slugger: Slugger): java.lang.String
  def hr(): java.lang.String
  def html(html: java.lang.String): java.lang.String
  def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def list(body: java.lang.String, ordered: scala.Boolean, start: scala.Double): java.lang.String
  def listitem(text: java.lang.String): java.lang.String
  def paragraph(text: java.lang.String): java.lang.String
  def strong(text: java.lang.String): java.lang.String
  def table(header: java.lang.String, body: java.lang.String): java.lang.String
  def tablecell(content: java.lang.String, flags: markedLib.Anon_Align): java.lang.String
  def tablerow(content: java.lang.String): java.lang.String
  def text(text: java.lang.String): java.lang.String
}

object Renderer {
  @scala.inline
  def apply(
    blockquote: java.lang.String => java.lang.String,
    br: () => java.lang.String,
    code: (java.lang.String, java.lang.String, scala.Boolean) => java.lang.String,
    codespan: java.lang.String => java.lang.String,
    del: java.lang.String => java.lang.String,
    em: java.lang.String => java.lang.String,
    heading: (java.lang.String, scala.Double, java.lang.String, Slugger) => java.lang.String,
    hr: () => java.lang.String,
    html: java.lang.String => java.lang.String,
    image: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    link: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    list: (java.lang.String, scala.Boolean, scala.Double) => java.lang.String,
    listitem: java.lang.String => java.lang.String,
    paragraph: java.lang.String => java.lang.String,
    strong: java.lang.String => java.lang.String,
    table: (java.lang.String, java.lang.String) => java.lang.String,
    tablecell: (java.lang.String, markedLib.Anon_Align) => java.lang.String,
    tablerow: java.lang.String => java.lang.String,
    text: java.lang.String => java.lang.String
  ): Renderer = {
    val __obj = js.Dynamic.literal(blockquote = js.Any.fromFunction1(blockquote), br = js.Any.fromFunction0(br), code = js.Any.fromFunction3(code), codespan = js.Any.fromFunction1(codespan), del = js.Any.fromFunction1(del), em = js.Any.fromFunction1(em), heading = js.Any.fromFunction4(heading), hr = js.Any.fromFunction0(hr), html = js.Any.fromFunction1(html), image = js.Any.fromFunction3(image), link = js.Any.fromFunction3(link), list = js.Any.fromFunction3(list), listitem = js.Any.fromFunction1(listitem), paragraph = js.Any.fromFunction1(paragraph), strong = js.Any.fromFunction1(strong), table = js.Any.fromFunction2(table), tablecell = js.Any.fromFunction2(tablecell), tablerow = js.Any.fromFunction1(tablerow), text = js.Any.fromFunction1(text))
  
    __obj.asInstanceOf[Renderer]
  }
}

