package typings.atKeystonejsAppDashAdminDashUi.atKeystonejsAppDashAdminDashUiMod

import typings.atKeystonejsAppDashAdminDashUi.Anon_Authentication
import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminUIOptions[ListNames /* <: String */, UserType /* <: js.Object */] extends js.Object {
  var adminPath: js.UndefOr[String] = js.undefined
  var apiPath: js.UndefOr[String] = js.undefined
  var authStrategy: js.UndefOr[BaseAuthStrategy] = js.undefined
  var enableDefaultRoute: js.UndefOr[Boolean] = js.undefined
  var graphiqlPath: js.UndefOr[String] = js.undefined
  var isAccessAllowed: js.UndefOr[js.Function1[/* opts */ Anon_Authentication[UserType, ListNames], Boolean]] = js.undefined
  var pages: js.UndefOr[js.Array[_]] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object AdminUIOptions {
  @scala.inline
  def apply[ListNames /* <: String */, UserType /* <: js.Object */](
    adminPath: String = null,
    apiPath: String = null,
    authStrategy: BaseAuthStrategy = null,
    enableDefaultRoute: js.UndefOr[Boolean] = js.undefined,
    graphiqlPath: String = null,
    isAccessAllowed: /* opts */ Anon_Authentication[UserType, ListNames] => Boolean = null,
    pages: js.Array[_] = null,
    schemaName: String = null
  ): AdminUIOptions[ListNames, UserType] = {
    val __obj = js.Dynamic.literal()
    if (adminPath != null) __obj.updateDynamic("adminPath")(adminPath)
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath)
    if (authStrategy != null) __obj.updateDynamic("authStrategy")(authStrategy)
    if (!js.isUndefined(enableDefaultRoute)) __obj.updateDynamic("enableDefaultRoute")(enableDefaultRoute)
    if (graphiqlPath != null) __obj.updateDynamic("graphiqlPath")(graphiqlPath)
    if (isAccessAllowed != null) __obj.updateDynamic("isAccessAllowed")(js.Any.fromFunction1(isAccessAllowed))
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    __obj.asInstanceOf[AdminUIOptions[ListNames, UserType]]
  }
}

