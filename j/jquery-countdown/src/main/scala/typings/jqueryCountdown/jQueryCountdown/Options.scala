package typings.jqueryCountdown.jQueryCountdown

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
    precision: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elapse)) __obj.updateDynamic("elapse")(elapse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

