package typings
package lockfileLib.lockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pollPeriod: js.UndefOr[scala.Double] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var retryWait: js.UndefOr[scala.Double] = js.undefined
  var stale: js.UndefOr[scala.Double] = js.undefined
  @JSName("wait")
  var wait_FOptions: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pollPeriod: scala.Int | scala.Double = null,
    retries: scala.Int | scala.Double = null,
    retryWait: scala.Int | scala.Double = null,
    stale: scala.Int | scala.Double = null,
    wait: scala.Int | scala.Double = null
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

