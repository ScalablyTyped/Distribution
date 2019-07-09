package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcquireTimeoutMillis extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var acquireTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var fifo: js.UndefOr[scala.Boolean] = js.undefined
  var idleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxWaitingClients: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var numTestsPerRun: js.UndefOr[scala.Double] = js.undefined
  var priorityRange: js.UndefOr[scala.Double] = js.undefined
  var softIdleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var testOnBorrow: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AcquireTimeoutMillis {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: scala.Int | scala.Double = null,
    autostart: js.UndefOr[scala.Boolean] = js.undefined,
    evictionRunIntervalMillis: scala.Int | scala.Double = null,
    fifo: js.UndefOr[scala.Boolean] = js.undefined,
    idleTimeoutMillis: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    maxWaitingClients: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    numTestsPerRun: scala.Int | scala.Double = null,
    priorityRange: scala.Int | scala.Double = null,
    softIdleTimeoutMillis: scala.Int | scala.Double = null,
    testOnBorrow: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AcquireTimeoutMillis = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (acquireTimeoutMillis != null) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (evictionRunIntervalMillis != null) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo)
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaitingClients != null) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numTestsPerRun != null) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.asInstanceOf[js.Any])
    if (priorityRange != null) __obj.updateDynamic("priorityRange")(priorityRange.asInstanceOf[js.Any])
    if (softIdleTimeoutMillis != null) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow)
    __obj.asInstanceOf[Anon_AcquireTimeoutMillis]
  }
}

