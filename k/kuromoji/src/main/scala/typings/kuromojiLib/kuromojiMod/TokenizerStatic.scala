package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerStatic extends js.Object {
  def splitByPunctuation(input: java.lang.String): js.Array[java.lang.String]
}

object TokenizerStatic {
  @scala.inline
  def apply(splitByPunctuation: java.lang.String => js.Array[java.lang.String]): TokenizerStatic = {
    val __obj = js.Dynamic.literal(splitByPunctuation = js.Any.fromFunction1(splitByPunctuation))
  
    __obj.asInstanceOf[TokenizerStatic]
  }
}

