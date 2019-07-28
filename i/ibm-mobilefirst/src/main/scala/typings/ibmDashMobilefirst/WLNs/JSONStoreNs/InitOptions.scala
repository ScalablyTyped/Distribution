package typings.ibmDashMobilefirst.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var analytics: js.UndefOr[Boolean] = js.undefined
  var clear: js.UndefOr[Boolean] = js.undefined
  var localKeyGen: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    analytics: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    localKeyGen: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    username: String = null
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

