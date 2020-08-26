package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetXssFilterConfiguration extends js.Object {
  var reportUri: js.UndefOr[String] = js.native
  var setOnOldIE: js.UndefOr[Boolean] = js.native
}

object IHelmetXssFilterConfiguration {
  @scala.inline
  def apply(): IHelmetXssFilterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetXssFilterConfiguration]
  }
  @scala.inline
  implicit class IHelmetXssFilterConfigurationOps[Self <: IHelmetXssFilterConfiguration] (val x: Self) extends AnyVal {
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
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
    @scala.inline
    def setSetOnOldIE(value: Boolean): Self = this.set("setOnOldIE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetOnOldIE: Self = this.set("setOnOldIE", js.undefined)
  }
  
}

