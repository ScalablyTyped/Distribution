package typings.lockfile.lockfileMod

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
    pollPeriod: Int | Double = null,
    retries: Int | Double = null,
    retryWait: Int | Double = null,
    stale: Int | Double = null,
    wait: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (pollPeriod != null) __obj.updateDynamic("pollPeriod")(pollPeriod.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryWait != null) __obj.updateDynamic("retryWait")(retryWait.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

