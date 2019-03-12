package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenizer extends js.Object {
  def tokenize(text: java.lang.String): js.Array[java.lang.String]
}

object ITokenizer {
  @scala.inline
  def apply(tokenize: java.lang.String => js.Array[java.lang.String]): ITokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
  
    __obj.asInstanceOf[ITokenizer]
  }
}

