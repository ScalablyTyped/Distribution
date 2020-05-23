package typings.knex.anon

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
    acquireTimeoutMillis: js.UndefOr[Double] = js.undefined,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    maxWaitingClients: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    numTestsPerRun: js.UndefOr[Double] = js.undefined,
    priorityRange: js.UndefOr[Double] = js.undefined,
    softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): Readonlyminnumbermaxnumbe = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(acquireTimeoutMillis)) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evictionRunIntervalMillis)) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWaitingClients)) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numTestsPerRun)) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priorityRange)) __obj.updateDynamic("priorityRange")(priorityRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softIdleTimeoutMillis)) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyminnumbermaxnumbe]
  }
}

