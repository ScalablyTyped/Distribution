package typings.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenMata extends js.Object {
  var delimiters: js.Array[Delimiter]
}

object TokenMata {
  @scala.inline
  def apply(delimiters: js.Array[Delimiter]): TokenMata = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenMata]
  }
}

