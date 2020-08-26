package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetHpkpConfiguration extends js.Object {
  var includeSubDomains: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.native
  var maxAge: Double = js.native
  var reportOnly: js.UndefOr[Boolean] = js.native
  var reportUri: js.UndefOr[String] = js.native
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.native
  var sha256s: js.Array[String] = js.native
}

object IHelmetHpkpConfiguration {
  @scala.inline
  def apply(maxAge: Double, sha256s: js.Array[String]): IHelmetHpkpConfiguration = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sha256s = sha256s.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetHpkpConfiguration]
  }
  @scala.inline
  implicit class IHelmetHpkpConfigurationOps[Self <: IHelmetHpkpConfiguration] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha256sVarargs(value: String*): Self = this.set("sha256s", js.Array(value :_*))
    @scala.inline
    def setSha256s(value: js.Array[String]): Self = this.set("sha256s", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeSubDomains(value: Boolean): Self = this.set("includeSubDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSubDomains: Self = this.set("includeSubDomains", js.undefined)
    @scala.inline
    def setReportOnly(value: Boolean): Self = this.set("reportOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportOnly: Self = this.set("reportOnly", js.undefined)
    @scala.inline
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
    @scala.inline
    def setSetIf(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("setIf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetIf: Self = this.set("setIf", js.undefined)
  }
  
}

