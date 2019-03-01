package typings
package jqueryDashCountdownLib.jQueryCountdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Deferred initialization mode
    */
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow to continue after finishes
    */
  var elapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The update rate in milliseconds
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    elapse: js.UndefOr[scala.Boolean] = js.undefined,
    precision: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(elapse)) __obj.updateDynamic("elapse")(elapse)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

