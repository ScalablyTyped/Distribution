package typings.helmet.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetHstsConfiguration extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var includeSubDomains: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.native
}

object IHelmetHstsConfiguration {
  @scala.inline
  def apply(): IHelmetHstsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetHstsConfiguration]
  }
  @scala.inline
  implicit class IHelmetHstsConfigurationOps[Self <: IHelmetHstsConfiguration] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setIncludeSubDomains(value: Boolean): Self = this.set("includeSubDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSubDomains: Self = this.set("includeSubDomains", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setSetIf(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("setIf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetIf: Self = this.set("setIf", js.undefined)
  }
  
}

