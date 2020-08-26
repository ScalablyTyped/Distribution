package typings.koaResponseTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaResponseTimeOptions extends js.Object {
  var hrtime: js.UndefOr[Boolean] = js.native
}

object KoaResponseTimeOptions {
  @scala.inline
  def apply(): KoaResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaResponseTimeOptions]
  }
  @scala.inline
  implicit class KoaResponseTimeOptionsOps[Self <: KoaResponseTimeOptions] (val x: Self) extends AnyVal {
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
    def setHrtime(value: Boolean): Self = this.set("hrtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrtime: Self = this.set("hrtime", js.undefined)
  }
  
}

