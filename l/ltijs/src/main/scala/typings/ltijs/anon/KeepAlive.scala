package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAlive extends js.Object {
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
  var pass: String
  var useNewUrlParser: js.UndefOr[Boolean] = js.undefined
  var user: String
}

object KeepAlive {
  @scala.inline
  def apply(
    pass: String,
    user: String,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: js.UndefOr[Double] = js.undefined,
    useNewUrlParser: js.UndefOr[Boolean] = js.undefined
  ): KeepAlive = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelay)) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNewUrlParser)) __obj.updateDynamic("useNewUrlParser")(useNewUrlParser.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAlive]
  }
}

