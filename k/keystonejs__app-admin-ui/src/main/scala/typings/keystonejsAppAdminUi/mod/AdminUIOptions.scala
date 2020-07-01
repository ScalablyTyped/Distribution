package typings.keystonejsAppAdminUi.mod

import typings.keystonejsAppAdminUi.anon.Authentication
import typings.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminUIOptions[ListNames /* <: String */, UserType /* <: js.Object */] extends js.Object {
  var adminPath: js.UndefOr[String] = js.undefined
  var apiPath: js.UndefOr[String] = js.undefined
  var authStrategy: js.UndefOr[BaseAuthStrategy] = js.undefined
  var enableDefaultRoute: js.UndefOr[Boolean] = js.undefined
  var graphiqlPath: js.UndefOr[String] = js.undefined
  var isAccessAllowed: js.UndefOr[js.Function1[/* opts */ Authentication[UserType, ListNames], Boolean]] = js.undefined
  var pages: js.UndefOr[js.Array[_]] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object AdminUIOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ ListNames, /* <: js.Object */ UserType](
    adminPath: String = null,
    apiPath: String = null,
    authStrategy: BaseAuthStrategy = null,
    enableDefaultRoute: js.UndefOr[Boolean] = js.undefined,
    graphiqlPath: String = null,
    isAccessAllowed: /* opts */ Authentication[UserType, ListNames] => Boolean = null,
    pages: js.Array[_] = null,
    schemaName: String = null
  ): AdminUIOptions[ListNames, UserType] = {
    val __obj = js.Dynamic.literal()
    if (adminPath != null) __obj.updateDynamic("adminPath")(adminPath.asInstanceOf[js.Any])
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath.asInstanceOf[js.Any])
    if (authStrategy != null) __obj.updateDynamic("authStrategy")(authStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDefaultRoute)) __obj.updateDynamic("enableDefaultRoute")(enableDefaultRoute.get.asInstanceOf[js.Any])
    if (graphiqlPath != null) __obj.updateDynamic("graphiqlPath")(graphiqlPath.asInstanceOf[js.Any])
    if (isAccessAllowed != null) __obj.updateDynamic("isAccessAllowed")(js.Any.fromFunction1(isAccessAllowed))
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUIOptions[ListNames, UserType]]
  }
}

