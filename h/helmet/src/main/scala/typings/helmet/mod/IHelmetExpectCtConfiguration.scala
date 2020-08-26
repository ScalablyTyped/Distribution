package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetExpectCtConfiguration extends js.Object {
  var enforce: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var reportUri: js.UndefOr[String] = js.native
}

object IHelmetExpectCtConfiguration {
  @scala.inline
  def apply(): IHelmetExpectCtConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetExpectCtConfiguration]
  }
  @scala.inline
  implicit class IHelmetExpectCtConfigurationOps[Self <: IHelmetExpectCtConfiguration] (val x: Self) extends AnyVal {
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
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
  }
  
}

