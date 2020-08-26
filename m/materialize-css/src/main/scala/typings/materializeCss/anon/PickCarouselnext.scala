package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Carousel, 'next'> */
@js.native
trait PickCarouselnext extends js.Object {
  var next: js.UndefOr[js.Any] = js.native
}

object PickCarouselnext {
  @scala.inline
  def apply(): PickCarouselnext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselnext]
  }
  @scala.inline
  implicit class PickCarouselnextOps[Self <: PickCarouselnext] (val x: Self) extends AnyVal {
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
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

