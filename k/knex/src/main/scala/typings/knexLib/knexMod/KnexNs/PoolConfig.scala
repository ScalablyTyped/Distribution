package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var acquireTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var afterCreate: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var beforeDestroy: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var create: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var fifo: js.UndefOr[scala.Boolean] = js.undefined
  var idleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  // generic-pool v3 configs
  var maxWaitingClients: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numTestsPerRun: js.UndefOr[scala.Double] = js.undefined
  var priorityRange: js.UndefOr[scala.Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var refreshIdle: js.UndefOr[scala.Boolean] = js.undefined
  var returnToHead: js.UndefOr[scala.Boolean] = js.undefined
  var softIdleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var testOnBorrow: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: scala.Int | scala.Double = null,
    afterCreate: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    autostart: js.UndefOr[scala.Boolean] = js.undefined,
    beforeDestroy: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    create: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    destroy: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    evictionRunIntervalMillis: scala.Int | scala.Double = null,
    fifo: js.UndefOr[scala.Boolean] = js.undefined,
    idleTimeoutMillis: scala.Int | scala.Double = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    maxWaitingClients: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    numTestsPerRun: scala.Int | scala.Double = null,
    priorityRange: scala.Int | scala.Double = null,
    reapIntervalMillis: scala.Int | scala.Double = null,
    refreshIdle: js.UndefOr[scala.Boolean] = js.undefined,
    returnToHead: js.UndefOr[scala.Boolean] = js.undefined,
    softIdleTimeoutMillis: scala.Int | scala.Double = null,
    testOnBorrow: js.UndefOr[scala.Boolean] = js.undefined,
    validate: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (acquireTimeoutMillis != null) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.asInstanceOf[js.Any])
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate)
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (evictionRunIntervalMillis != null) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo)
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaitingClients != null) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (numTestsPerRun != null) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.asInstanceOf[js.Any])
    if (priorityRange != null) __obj.updateDynamic("priorityRange")(priorityRange.asInstanceOf[js.Any])
    if (reapIntervalMillis != null) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshIdle)) __obj.updateDynamic("refreshIdle")(refreshIdle)
    if (!js.isUndefined(returnToHead)) __obj.updateDynamic("returnToHead")(returnToHead)
    if (softIdleTimeoutMillis != null) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[PoolConfig]
  }
}

