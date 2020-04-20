package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerStatic extends js.Object {
  def splitByPunctuation(input: String): js.Array[String]
}

object TokenizerStatic {
  @scala.inline
  def apply(splitByPunctuation: String => js.Array[String]): TokenizerStatic = {
    val __obj = js.Dynamic.literal(splitByPunctuation = js.Any.fromFunction1(splitByPunctuation))
    __obj.asInstanceOf[TokenizerStatic]
  }
}

