package typings.keystonejsAppAdminUi.mod

import typings.keystonejsAppAdminUi.anon.Authentication
import typings.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUIOptions[ListNames /* <: String */, UserType /* <: js.Object */] extends js.Object {
  var adminPath: js.UndefOr[String] = js.native
  var apiPath: js.UndefOr[String] = js.native
  var authStrategy: js.UndefOr[BaseAuthStrategy] = js.native
  var enableDefaultRoute: js.UndefOr[Boolean] = js.native
  var graphiqlPath: js.UndefOr[String] = js.native
  var isAccessAllowed: js.UndefOr[js.Function1[/* opts */ Authentication[UserType, ListNames], Boolean]] = js.native
  var pages: js.UndefOr[js.Array[_]] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object AdminUIOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ ListNames, /* <: js.Object */ UserType](): AdminUIOptions[ListNames, UserType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminUIOptions[ListNames, UserType]]
  }
  @scala.inline
  implicit class AdminUIOptionsOps[Self <: AdminUIOptions[_, _], /* <: java.lang.String */ ListNames, /* <: js.Object */ UserType] (val x: Self with (AdminUIOptions[ListNames, UserType])) extends AnyVal {
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
    def setAdminPath(value: String): Self = this.set("adminPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminPath: Self = this.set("adminPath", js.undefined)
    @scala.inline
    def setApiPath(value: String): Self = this.set("apiPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiPath: Self = this.set("apiPath", js.undefined)
    @scala.inline
    def setAuthStrategy(value: BaseAuthStrategy): Self = this.set("authStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthStrategy: Self = this.set("authStrategy", js.undefined)
    @scala.inline
    def setEnableDefaultRoute(value: Boolean): Self = this.set("enableDefaultRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDefaultRoute: Self = this.set("enableDefaultRoute", js.undefined)
    @scala.inline
    def setGraphiqlPath(value: String): Self = this.set("graphiqlPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphiqlPath: Self = this.set("graphiqlPath", js.undefined)
    @scala.inline
    def setIsAccessAllowed(value: /* opts */ Authentication[UserType, ListNames] => Boolean): Self = this.set("isAccessAllowed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsAccessAllowed: Self = this.set("isAccessAllowed", js.undefined)
    @scala.inline
    def setPagesVarargs(value: js.Any*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[_]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
  }
  
}

