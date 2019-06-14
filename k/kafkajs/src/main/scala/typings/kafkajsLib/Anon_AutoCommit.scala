package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCommit extends js.Object {
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  var autoCommitInterval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var autoCommitThreshold: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var eachBatch: js.UndefOr[js.Function1[/* batch */ Anon_Batch, js.Promise[scala.Unit]]] = js.undefined
  var eachBatchAutoResolve: js.UndefOr[scala.Boolean] = js.undefined
  var eachMessage: js.UndefOr[js.Function1[/* message */ Anon_MessagePartition, js.Promise[scala.Unit]]] = js.undefined
  var partitionsConsumedConcurrently: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoCommit {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[scala.Boolean] = js.undefined,
    autoCommitInterval: scala.Int | scala.Double = null,
    autoCommitThreshold: scala.Int | scala.Double = null,
    eachBatch: /* batch */ Anon_Batch => js.Promise[scala.Unit] = null,
    eachBatchAutoResolve: js.UndefOr[scala.Boolean] = js.undefined,
    eachMessage: /* message */ Anon_MessagePartition => js.Promise[scala.Unit] = null,
    partitionsConsumedConcurrently: scala.Int | scala.Double = null
  ): Anon_AutoCommit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoCommitInterval != null) __obj.updateDynamic("autoCommitInterval")(autoCommitInterval.asInstanceOf[js.Any])
    if (autoCommitThreshold != null) __obj.updateDynamic("autoCommitThreshold")(autoCommitThreshold.asInstanceOf[js.Any])
    if (eachBatch != null) __obj.updateDynamic("eachBatch")(js.Any.fromFunction1(eachBatch))
    if (!js.isUndefined(eachBatchAutoResolve)) __obj.updateDynamic("eachBatchAutoResolve")(eachBatchAutoResolve)
    if (eachMessage != null) __obj.updateDynamic("eachMessage")(js.Any.fromFunction1(eachMessage))
    if (partitionsConsumedConcurrently != null) __obj.updateDynamic("partitionsConsumedConcurrently")(partitionsConsumedConcurrently.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoCommit]
  }
}

