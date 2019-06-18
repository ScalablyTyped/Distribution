package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerRunOptions extends js.Object {
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  var autoCommitInterval: js.UndefOr[scala.Double] = js.undefined
  var autoCommitThreshold: js.UndefOr[scala.Double] = js.undefined
  var eachBatch: js.UndefOr[js.Function1[/* payload */ ConsumerEachBatchPayload, js.Promise[scala.Unit]]] = js.undefined
  var eachBatchAutoResolve: js.UndefOr[scala.Boolean] = js.undefined
  var eachMessage: js.UndefOr[js.Function1[/* payload */ ConsumerEachMessagePayload, js.Promise[scala.Unit]]] = js.undefined
}

object ConsumerRunOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[scala.Boolean] = js.undefined,
    autoCommitInterval: scala.Int | scala.Double = null,
    autoCommitThreshold: scala.Int | scala.Double = null,
    eachBatch: /* payload */ ConsumerEachBatchPayload => js.Promise[scala.Unit] = null,
    eachBatchAutoResolve: js.UndefOr[scala.Boolean] = js.undefined,
    eachMessage: /* payload */ ConsumerEachMessagePayload => js.Promise[scala.Unit] = null
  ): ConsumerRunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitInterval != null) __obj.updateDynamic("autoCommitInterval")(autoCommitInterval.asInstanceOf[js.Any])
    if (autoCommitThreshold != null) __obj.updateDynamic("autoCommitThreshold")(autoCommitThreshold.asInstanceOf[js.Any])
    if (eachBatch != null) __obj.updateDynamic("eachBatch")(js.Any.fromFunction1(eachBatch))
    if (!js.isUndefined(eachBatchAutoResolve)) __obj.updateDynamic("eachBatchAutoResolve")(eachBatchAutoResolve)
    if (eachMessage != null) __obj.updateDynamic("eachMessage")(js.Any.fromFunction1(eachMessage))
    __obj.asInstanceOf[ConsumerRunOptions]
  }
}

