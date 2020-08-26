package typings.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Silent extends js.Object {
  var keySeparator: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object Silent {
  @scala.inline
  def apply(): Silent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Silent]
  }
  @scala.inline
  implicit class SilentOps[Self <: Silent] (val x: Self) extends AnyVal {
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
    def setKeySeparator(value: String): Self = this.set("keySeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySeparator: Self = this.set("keySeparator", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

