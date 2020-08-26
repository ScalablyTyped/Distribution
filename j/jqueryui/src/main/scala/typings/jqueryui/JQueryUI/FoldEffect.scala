package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldEffect extends js.Object {
  var horizFirst: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[js.Any] = js.native
}

object FoldEffect {
  @scala.inline
  def apply(): FoldEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldEffect]
  }
  @scala.inline
  implicit class FoldEffectOps[Self <: FoldEffect] (val x: Self) extends AnyVal {
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
    def setHorizFirst(value: Boolean): Self = this.set("horizFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizFirst: Self = this.set("horizFirst", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

