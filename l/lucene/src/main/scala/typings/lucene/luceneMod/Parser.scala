package typings.lucene.luceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def escape(str: String): String
  def unescape(str: String): String
}

object Parser {
  @scala.inline
  def apply(escape: String => String, unescape: String => String): Parser = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), unescape = js.Any.fromFunction1(unescape))
  
    __obj.asInstanceOf[Parser]
  }
}

