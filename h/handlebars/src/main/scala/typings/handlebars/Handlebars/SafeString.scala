package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeString extends js.Object {
  def toHTML(): String
}

object SafeString {
  @scala.inline
  def apply(toHTML: () => String): SafeString = {
    val __obj = js.Dynamic.literal(toHTML = js.Any.fromFunction0(toHTML))
    __obj.asInstanceOf[SafeString]
  }
}

