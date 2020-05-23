package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolOptions extends js.Object {
  var autoCleanIdle: js.UndefOr[Boolean] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var maxPoolSize: js.UndefOr[Double] = js.undefined
  var systemNaming: js.UndefOr[js.Any] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(
    autoCleanIdle: js.UndefOr[Boolean] = js.undefined,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    maxPoolSize: js.UndefOr[Double] = js.undefined,
    systemNaming: js.Any = null
  ): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCleanIdle)) __obj.updateDynamic("autoCleanIdle")(autoCleanIdle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoolSize)) __obj.updateDynamic("maxPoolSize")(maxPoolSize.get.asInstanceOf[js.Any])
    if (systemNaming != null) __obj.updateDynamic("systemNaming")(systemNaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOptions]
  }
}

