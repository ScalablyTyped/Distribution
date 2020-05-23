package typings.grpcGrpcJs.backoffTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  var initialDelay: js.UndefOr[Double] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
}

object BackoffOptions {
  @scala.inline
  def apply(
    initialDelay: js.UndefOr[Double] = js.undefined,
    jitter: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    multiplier: js.UndefOr[Double] = js.undefined
  ): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jitter)) __obj.updateDynamic("jitter")(jitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

