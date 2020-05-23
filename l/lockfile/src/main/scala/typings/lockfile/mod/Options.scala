package typings.lockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pollPeriod: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var retryWait: js.UndefOr[Double] = js.undefined
  var stale: js.UndefOr[Double] = js.undefined
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pollPeriod: js.UndefOr[Double] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    retryWait: js.UndefOr[Double] = js.undefined,
    stale: js.UndefOr[Double] = js.undefined,
    wait: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pollPeriod)) __obj.updateDynamic("pollPeriod")(pollPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryWait)) __obj.updateDynamic("retryWait")(retryWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

