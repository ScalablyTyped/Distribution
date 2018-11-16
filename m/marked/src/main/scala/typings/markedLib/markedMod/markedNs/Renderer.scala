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
  def heading(text: java.lang.String, level: scala.Double, raw: java.lang.String): java.lang.String
  def hr(): java.lang.String
  def html(html: java.lang.String): java.lang.String
  def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def list(body: java.lang.String, ordered: scala.Boolean, start: scala.Double): java.lang.String
  def listitem(text: java.lang.String): java.lang.String
  def paragraph(text: java.lang.String): java.lang.String
  def strong(text: java.lang.String): java.lang.String
  def table(header: java.lang.String, body: java.lang.String): java.lang.String
  def tablecell(content: java.lang.String, flags: markedLib.Anon_Header): java.lang.String
  def tablerow(content: java.lang.String): java.lang.String
  def text(text: java.lang.String): java.lang.String
}

