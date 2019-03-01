package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolOptions extends js.Object {
  var autoCleanIdle: js.UndefOr[scala.Boolean] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  var maxPoolSize: js.UndefOr[scala.Double] = js.undefined
  var systemNaming: js.UndefOr[js.Any] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(
    autoCleanIdle: js.UndefOr[scala.Boolean] = js.undefined,
    connectTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    maxPoolSize: scala.Int | scala.Double = null,
    systemNaming: js.Any = null
  ): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCleanIdle)) __obj.updateDynamic("autoCleanIdle")(autoCleanIdle)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (maxPoolSize != null) __obj.updateDynamic("maxPoolSize")(maxPoolSize.asInstanceOf[js.Any])
    if (systemNaming != null) __obj.updateDynamic("systemNaming")(systemNaming)
    __obj.asInstanceOf[PoolOptions]
  }
}

