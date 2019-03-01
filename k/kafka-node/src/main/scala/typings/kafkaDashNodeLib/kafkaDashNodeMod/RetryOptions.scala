package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var maxTimeout: js.UndefOr[scala.Double] = js.undefined
  var minTimeout: js.UndefOr[scala.Double] = js.undefined
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

