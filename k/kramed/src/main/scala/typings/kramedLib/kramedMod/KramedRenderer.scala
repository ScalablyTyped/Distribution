package typings
package kramedLib.kramedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedRenderer extends js.Object {
  def blockquote(quote: java.lang.String): java.lang.String
  def br(): java.lang.String
  def code(code: java.lang.String, language: java.lang.String): java.lang.String
  def codespan(code: java.lang.String): java.lang.String
  def del(text: java.lang.String): java.lang.String
  def em(text: java.lang.String): java.lang.String
  def heading(text: java.lang.String, level: scala.Double, raw: java.lang.String): java.lang.String
  def hr(): java.lang.String
  def html(html: java.lang.String): java.lang.String
  def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def list(body: java.lang.String, ordered: scala.Boolean): java.lang.String
  def listitem(text: java.lang.String): java.lang.String
  def paragraph(text: java.lang.String): java.lang.String
  def strong(text: java.lang.String): java.lang.String
  def table(header: java.lang.String, body: java.lang.String): java.lang.String
  def tablecell(content: java.lang.String, flags: kramedLib.Anon_Align): java.lang.String
  def tablerow(content: java.lang.String): java.lang.String
  def text(text: java.lang.String): java.lang.String
}

object KramedRenderer {
  @scala.inline
  def apply(
    blockquote: js.Function1[java.lang.String, java.lang.String],
    br: js.Function0[java.lang.String],
    code: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    codespan: js.Function1[java.lang.String, java.lang.String],
    del: js.Function1[java.lang.String, java.lang.String],
    em: js.Function1[java.lang.String, java.lang.String],
    heading: js.Function3[java.lang.String, scala.Double, java.lang.String, java.lang.String],
    hr: js.Function0[java.lang.String],
    html: js.Function1[java.lang.String, java.lang.String],
    image: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    link: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    list: js.Function2[java.lang.String, scala.Boolean, java.lang.String],
    listitem: js.Function1[java.lang.String, java.lang.String],
    paragraph: js.Function1[java.lang.String, java.lang.String],
    strong: js.Function1[java.lang.String, java.lang.String],
    table: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    tablecell: js.Function2[java.lang.String, kramedLib.Anon_Align, java.lang.String],
    tablerow: js.Function1[java.lang.String, java.lang.String],
    text: js.Function1[java.lang.String, java.lang.String]
  ): KramedRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockquote")(blockquote)
    __obj.updateDynamic("br")(br)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("codespan")(codespan)
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("em")(em)
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("hr")(hr)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("listitem")(listitem)
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("strong")(strong)
    __obj.updateDynamic("table")(table)
    __obj.updateDynamic("tablecell")(tablecell)
    __obj.updateDynamic("tablerow")(tablerow)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[KramedRenderer]
  }
}

