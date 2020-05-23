package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  var afterCreate: js.UndefOr[js.Function] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  var fifo: js.UndefOr[Boolean] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Function2[/* message */ String, /* logLevel */ String, Unit]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  // generic-pool v3 configs
  var maxWaitingClients: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numTestsPerRun: js.UndefOr[Double] = js.undefined
  var priorityRange: js.UndefOr[Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
  var refreshIdle: js.UndefOr[Boolean] = js.undefined
  var returnToHead: js.UndefOr[Boolean] = js.undefined
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var testOnBorrow: js.UndefOr[Boolean] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: js.UndefOr[Double] = js.undefined,
    afterCreate: js.Function = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    log: (/* message */ String, /* logLevel */ String) => Unit = null,
    max: js.UndefOr[Double] = js.undefined,
    maxWaitingClients: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    numTestsPerRun: js.UndefOr[Double] = js.undefined,
    priorityRange: js.UndefOr[Double] = js.undefined,
    reapIntervalMillis: js.UndefOr[Double] = js.undefined,
    refreshIdle: js.UndefOr[Boolean] = js.undefined,
    returnToHead: js.UndefOr[Boolean] = js.undefined,
    softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(acquireTimeoutMillis)) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.get.asInstanceOf[js.Any])
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evictionRunIntervalMillis)) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWaitingClients)) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numTestsPerRun)) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priorityRange)) __obj.updateDynamic("priorityRange")(priorityRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reapIntervalMillis)) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshIdle)) __obj.updateDynamic("refreshIdle")(refreshIdle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnToHead)) __obj.updateDynamic("returnToHead")(returnToHead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softIdleTimeoutMillis)) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

