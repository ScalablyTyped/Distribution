package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Punctuation extends js.Object {
  var punctuation: js.UndefOr[String] = js.native
}

object Punctuation {
  @scala.inline
  def apply(): Punctuation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Punctuation]
  }
  @scala.inline
  implicit class PunctuationOps[Self <: Punctuation] (val x: Self) extends AnyVal {
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
    def setPunctuation(value: String): Self = this.set("punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePunctuation: Self = this.set("punctuation", js.undefined)
  }
  
}

