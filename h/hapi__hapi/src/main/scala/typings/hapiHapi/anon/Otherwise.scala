package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.`private`
import typings.hapiHapi.hapiHapiStrings.default
import typings.hapiHapi.hapiHapiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Otherwise extends js.Object {
  var otherwise: js.UndefOr[String] = js.native
  var privacy: js.UndefOr[default | public | `private`] = js.native
  var statuses: js.UndefOr[js.Array[Double]] = js.native
}

object Otherwise {
  @scala.inline
  def apply(): Otherwise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Otherwise]
  }
  @scala.inline
  implicit class OtherwiseOps[Self <: Otherwise] (val x: Self) extends AnyVal {
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
    def setOtherwise(value: String): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherwise: Self = this.set("otherwise", js.undefined)
    @scala.inline
    def setPrivacy(value: default | public | `private`): Self = this.set("privacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacy: Self = this.set("privacy", js.undefined)
    @scala.inline
    def setStatusesVarargs(value: Double*): Self = this.set("statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: js.Array[Double]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
  }
  
}

