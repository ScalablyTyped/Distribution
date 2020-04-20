package typings.less2sass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Less2Sass extends js.Object {
  def convert(file: String): String
}

object Less2Sass {
  @scala.inline
  def apply(convert: String => String): Less2Sass = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[Less2Sass]
  }
}

