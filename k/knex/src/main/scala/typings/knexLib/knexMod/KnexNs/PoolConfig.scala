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

