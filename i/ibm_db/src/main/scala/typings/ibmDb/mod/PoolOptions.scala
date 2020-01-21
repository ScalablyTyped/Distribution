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
    connectTimeout: Int | Double = null,
    idleTimeout: Int | Double = null,
    maxPoolSize: Int | Double = null,
    systemNaming: js.Any = null
  ): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCleanIdle)) __obj.updateDynamic("autoCleanIdle")(autoCleanIdle.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (maxPoolSize != null) __obj.updateDynamic("maxPoolSize")(maxPoolSize.asInstanceOf[js.Any])
    if (systemNaming != null) __obj.updateDynamic("systemNaming")(systemNaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolOptions]
  }
}

