package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[Boolean] = js.native
  var directives: IHelmetContentSecurityPolicyDirectives = js.native
  var disableAndroid: js.UndefOr[Boolean] = js.native
  var loose: js.UndefOr[Boolean] = js.native
  var reportOnly: js.UndefOr[
    Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean])
  ] = js.native
  var setAllHeaders: js.UndefOr[Boolean] = js.native
}

object IHelmetContentSecurityPolicyConfiguration {
  @scala.inline
  def apply(directives: IHelmetContentSecurityPolicyDirectives): IHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetContentSecurityPolicyConfiguration]
  }
  @scala.inline
  implicit class IHelmetContentSecurityPolicyConfigurationOps[Self <: IHelmetContentSecurityPolicyConfiguration] (val x: Self) extends AnyVal {
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
    def setDirectives(value: IHelmetContentSecurityPolicyDirectives): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserSniff(value: Boolean): Self = this.set("browserSniff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserSniff: Self = this.set("browserSniff", js.undefined)
    @scala.inline
    def setDisableAndroid(value: Boolean): Self = this.set("disableAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAndroid: Self = this.set("disableAndroid", js.undefined)
    @scala.inline
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
    @scala.inline
    def setReportOnlyFunction2(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = this.set("reportOnly", js.Any.fromFunction2(value))
    @scala.inline
    def setReportOnly(
      value: Boolean | (js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean])
    ): Self = this.set("reportOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportOnly: Self = this.set("reportOnly", js.undefined)
    @scala.inline
    def setSetAllHeaders(value: Boolean): Self = this.set("setAllHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAllHeaders: Self = this.set("setAllHeaders", js.undefined)
  }
  
}

