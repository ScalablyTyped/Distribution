package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ stdLib.Error, /* tokenizer */ Tokenizer[T], scala.Unit]): scala.Unit
}

object TokenizerBuilder {
  @scala.inline
  def apply[T](
    build: js.Function1[
      js.Function2[/* err */ stdLib.Error, /* tokenizer */ Tokenizer[T], scala.Unit], 
      scala.Unit
    ]
  ): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = build)
  
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
}

