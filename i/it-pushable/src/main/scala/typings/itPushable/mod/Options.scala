package typings.itPushable.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], _]] = js.native
  var writev: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setOnEnd(value: /* err */ js.UndefOr[Error] => _): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setWritev(value: Boolean): Self = this.set("writev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritev: Self = this.set("writev", js.undefined)
  }
  
}

