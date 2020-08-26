package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var ctag: js.UndefOr[String] = js.native
  var i: js.UndefOr[Double] = js.native
  var n: js.UndefOr[String] = js.native
  var otag: js.UndefOr[String] = js.native
  var tag: String = js.native
  var text: js.UndefOr[String] = js.native
}

object Token {
  @scala.inline
  def apply(tag: String): Token = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtag(value: String): Self = this.set("ctag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtag: Self = this.set("ctag", js.undefined)
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setOtag(value: String): Self = this.set("otag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtag: Self = this.set("otag", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

