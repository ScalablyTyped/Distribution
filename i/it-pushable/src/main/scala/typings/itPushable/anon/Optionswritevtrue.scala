package typings.itPushable.anon

import typings.itPushable.itPushableBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined it-pushable.it-pushable.Options & {  writev :true} */
@js.native
trait Optionswritevtrue extends js.Object {
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], _]] = js.native
  var writev: js.UndefOr[Boolean] with `true` = js.native
}

object Optionswritevtrue {
  @scala.inline
  def apply(writev: js.UndefOr[Boolean] with `true`): Optionswritevtrue = {
    val __obj = js.Dynamic.literal(writev = writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionswritevtrue]
  }
  @scala.inline
  implicit class OptionswritevtrueOps[Self <: Optionswritevtrue] (val x: Self) extends AnyVal {
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
    def setWritev(value: js.UndefOr[Boolean] with `true`): Self = this.set("writev", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEnd(value: /* err */ js.UndefOr[Error] => _): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
  }
  
}

