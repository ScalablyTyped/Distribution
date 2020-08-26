package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReisezentrumOpeningHours extends js.Object {
  var Di: js.UndefOr[String] = js.native
  var Do: js.UndefOr[String] = js.native
  var Fr: js.UndefOr[String] = js.native
  var Mi: js.UndefOr[String] = js.native
  var Mo: js.UndefOr[String] = js.native
  var Sa: js.UndefOr[String] = js.native
  var So: js.UndefOr[String] = js.native
}

object ReisezentrumOpeningHours {
  @scala.inline
  def apply(): ReisezentrumOpeningHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReisezentrumOpeningHours]
  }
  @scala.inline
  implicit class ReisezentrumOpeningHoursOps[Self <: ReisezentrumOpeningHours] (val x: Self) extends AnyVal {
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
    def setDi(value: String): Self = this.set("Di", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDi: Self = this.set("Di", js.undefined)
    @scala.inline
    def setDo(value: String): Self = this.set("Do", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDo: Self = this.set("Do", js.undefined)
    @scala.inline
    def setFr(value: String): Self = this.set("Fr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFr: Self = this.set("Fr", js.undefined)
    @scala.inline
    def setMi(value: String): Self = this.set("Mi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMi: Self = this.set("Mi", js.undefined)
    @scala.inline
    def setMo(value: String): Self = this.set("Mo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMo: Self = this.set("Mo", js.undefined)
    @scala.inline
    def setSa(value: String): Self = this.set("Sa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSa: Self = this.set("Sa", js.undefined)
    @scala.inline
    def setSo(value: String): Self = this.set("So", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSo: Self = this.set("So", js.undefined)
  }
  
}

