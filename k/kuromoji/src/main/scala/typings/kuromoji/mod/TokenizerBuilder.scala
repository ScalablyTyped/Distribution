package typings.kuromoji.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit]): Unit = js.native
}

object TokenizerBuilder {
  @scala.inline
  def apply[T](build: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
  @scala.inline
  implicit class TokenizerBuilderOps[Self <: TokenizerBuilder[_], T] (val x: Self with TokenizerBuilder[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuild(value: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): Self = this.set("build", js.Any.fromFunction1(value))
  }
  
}

