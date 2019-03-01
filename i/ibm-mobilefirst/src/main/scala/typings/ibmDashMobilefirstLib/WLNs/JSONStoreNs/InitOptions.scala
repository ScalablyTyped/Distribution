package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var analytics: js.UndefOr[scala.Boolean] = js.undefined
  var clear: js.UndefOr[scala.Boolean] = js.undefined
  var localKeyGen: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    analytics: js.UndefOr[scala.Boolean] = js.undefined,
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    localKeyGen: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    username: java.lang.String = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics)
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (!js.isUndefined(localKeyGen)) __obj.updateDynamic("localKeyGen")(localKeyGen)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[InitOptions]
  }
}

