package typings.jqueryDashCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Deferred initialization mode
    */
  var defer: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow to continue after finishes
    */
  var elapse: js.UndefOr[Boolean] = js.undefined
  /**
    * The update rate in milliseconds
    */
  var precision: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defer: js.UndefOr[Boolean] = js.undefined,
    elapse: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (!js.isUndefined(elapse)) __obj.updateDynamic("elapse")(elapse.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

