package typings.joi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapArrays extends js.Object {
  var wrapArrays: js.UndefOr[Boolean] = js.native
}

object WrapArrays {
  @scala.inline
  def apply(): WrapArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapArrays]
  }
  @scala.inline
  implicit class WrapArraysOps[Self <: WrapArrays] (val x: Self) extends AnyVal {
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
    def setWrapArrays(value: Boolean): Self = this.set("wrapArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapArrays: Self = this.set("wrapArrays", js.undefined)
  }
  
}

