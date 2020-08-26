package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizer extends js.Object {
  def tokenize(text: String): js.Array[String] = js.native
}

object ITokenizer {
  @scala.inline
  def apply(tokenize: String => js.Array[String]): ITokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[ITokenizer]
  }
  @scala.inline
  implicit class ITokenizerOps[Self <: ITokenizer] (val x: Self) extends AnyVal {
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
    def setTokenize(value: String => js.Array[String]): Self = this.set("tokenize", js.Any.fromFunction1(value))
  }
  
}

