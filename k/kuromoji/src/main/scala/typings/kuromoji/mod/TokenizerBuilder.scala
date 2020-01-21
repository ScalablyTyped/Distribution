package typings.kuromoji.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit]): Unit
}

object TokenizerBuilder {
  @scala.inline
  def apply[T](build: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
  
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
}

