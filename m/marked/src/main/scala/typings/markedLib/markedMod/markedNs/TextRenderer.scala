package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRenderer extends js.Object {
  def br(): java.lang.String
  def codespan(text: java.lang.String): java.lang.String
  def del(text: java.lang.String): java.lang.String
  def em(text: java.lang.String): java.lang.String
  def image(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def link(href: java.lang.String, title: java.lang.String, text: java.lang.String): java.lang.String
  def strong(text: java.lang.String): java.lang.String
  def text(text: java.lang.String): java.lang.String
}

object TextRenderer {
  @scala.inline
  def apply(
    br: () => java.lang.String,
    codespan: java.lang.String => java.lang.String,
    del: java.lang.String => java.lang.String,
    em: java.lang.String => java.lang.String,
    image: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    link: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    strong: java.lang.String => java.lang.String,
    text: java.lang.String => java.lang.String
  ): TextRenderer = {
    val __obj = js.Dynamic.literal(br = js.Any.fromFunction0(br), codespan = js.Any.fromFunction1(codespan), del = js.Any.fromFunction1(del), em = js.Any.fromFunction1(em), image = js.Any.fromFunction3(image), link = js.Any.fromFunction3(link), strong = js.Any.fromFunction1(strong), text = js.Any.fromFunction1(text))
  
    __obj.asInstanceOf[TextRenderer]
  }
}

