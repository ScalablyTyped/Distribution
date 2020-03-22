package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  min ? :number,   max ? :number,   idleTimeoutMillis ? :number,   maxWaitingClients ? :number,   testOnBorrow ? :boolean,   acquireTimeoutMillis ? :number,   fifo ? :boolean,   priorityRange ? :number,   autostart ? :boolean,   evictionRunIntervalMillis ? :number,   numTestsPerRun ? :number,   softIdleTimeoutMillis ? :number,   Promise ? :any}> */
trait Readonlyminnumbermaxnumbe extends js.Object {
  val Promise: js.UndefOr[js.Any] = js.undefined
  val acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  val autostart: js.UndefOr[Boolean] = js.undefined
  val evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  val fifo: js.UndefOr[Boolean] = js.undefined
  val idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  val max: js.UndefOr[Double] = js.undefined
  val maxWaitingClients: js.UndefOr[Double] = js.undefined
  val min: js.UndefOr[Double] = js.undefined
  val numTestsPerRun: js.UndefOr[Double] = js.undefined
  val priorityRange: js.UndefOr[Double] = js.undefined
  val softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
  val testOnBorrow: js.UndefOr[Boolean] = js.undefined
}

object Readonlyminnumbermaxnumbe {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: Int | Double = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: Int | Double = null,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: Int | Double = null,
    max: Int | Double = null,
    maxWaitingClients: Int | Double = null,
    min: Int | Double = null,
    numTestsPerRun: Int | Double = null,
    priorityRange: Int | Double = null,
    softIdleTimeoutMillis: Int | Double = null,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): Readonlyminnumbermaxnumbe = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (acquireTimeoutMillis != null) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (evictionRunIntervalMillis != null) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.asInstanceOf[js.Any])
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaitingClients != null) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numTestsPerRun != null) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.asInstanceOf[js.Any])
    if (priorityRange != null) __obj.updateDynamic("priorityRange")(priorityRange.asInstanceOf[js.Any])
    if (softIdleTimeoutMillis != null) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyminnumbermaxnumbe]
  }
}

