package typings.keystonejsAppNuxt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.native
}

object Dev {
  @scala.inline
  def apply(): Dev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dev]
  }
  @scala.inline
  implicit class DevOps[Self <: Dev] (val x: Self) extends AnyVal {
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
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
  }
  
}

