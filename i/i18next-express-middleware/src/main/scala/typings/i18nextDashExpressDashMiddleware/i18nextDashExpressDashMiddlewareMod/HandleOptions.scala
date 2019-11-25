package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleOptions extends js.Object {
  var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.undefined
  var removeLngFromUrl: js.UndefOr[Boolean] = js.undefined
}

object HandleOptions {
  @scala.inline
  def apply(
    ignoreRoutes: js.Array[String] | IgnoreRoutesFunction = null,
    removeLngFromUrl: js.UndefOr[Boolean] = js.undefined
  ): HandleOptions = {
    val __obj = js.Dynamic.literal()
    if (ignoreRoutes != null) __obj.updateDynamic("ignoreRoutes")(ignoreRoutes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeLngFromUrl)) __obj.updateDynamic("removeLngFromUrl")(removeLngFromUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleOptions]
  }
}

