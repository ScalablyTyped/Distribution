package typings.i18nextExpressMiddleware.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleOptions extends js.Object {
  var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.native
  var removeLngFromUrl: js.UndefOr[Boolean] = js.native
}

object HandleOptions {
  @scala.inline
  def apply(): HandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleOptions]
  }
  @scala.inline
  implicit class HandleOptionsOps[Self <: HandleOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreRoutesVarargs(value: String*): Self = this.set("ignoreRoutes", js.Array(value :_*))
    @scala.inline
    def setIgnoreRoutesFunction4(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* options */ HandleOptions, /* i18next */ I18next) => Boolean
    ): Self = this.set("ignoreRoutes", js.Any.fromFunction4(value))
    @scala.inline
    def setIgnoreRoutes(value: js.Array[String] | IgnoreRoutesFunction): Self = this.set("ignoreRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreRoutes: Self = this.set("ignoreRoutes", js.undefined)
    @scala.inline
    def setRemoveLngFromUrl(value: Boolean): Self = this.set("removeLngFromUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveLngFromUrl: Self = this.set("removeLngFromUrl", js.undefined)
  }
  
}

