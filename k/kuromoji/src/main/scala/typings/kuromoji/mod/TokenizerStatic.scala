package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizerStatic extends js.Object {
  def splitByPunctuation(input: String): js.Array[String] = js.native
}

object TokenizerStatic {
  @scala.inline
  def apply(splitByPunctuation: String => js.Array[String]): TokenizerStatic = {
    val __obj = js.Dynamic.literal(splitByPunctuation = js.Any.fromFunction1(splitByPunctuation))
    __obj.asInstanceOf[TokenizerStatic]
  }
  @scala.inline
  implicit class TokenizerStaticOps[Self <: TokenizerStatic] (val x: Self) extends AnyVal {
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
    def setSplitByPunctuation(value: String => js.Array[String]): Self = this.set("splitByPunctuation", js.Any.fromFunction1(value))
  }
  
}

