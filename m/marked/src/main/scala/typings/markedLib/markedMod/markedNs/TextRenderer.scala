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
    br: js.Function0[java.lang.String],
    codespan: js.Function1[java.lang.String, java.lang.String],
    del: js.Function1[java.lang.String, java.lang.String],
    em: js.Function1[java.lang.String, java.lang.String],
    image: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    link: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    strong: js.Function1[java.lang.String, java.lang.String],
    text: js.Function1[java.lang.String, java.lang.String]
  ): TextRenderer = {
    val __obj = js.Dynamic.literal(br = br, codespan = codespan, del = del, em = em, image = image, link = link, strong = strong, text = text)
  
    __obj.asInstanceOf[TextRenderer]
  }
}

