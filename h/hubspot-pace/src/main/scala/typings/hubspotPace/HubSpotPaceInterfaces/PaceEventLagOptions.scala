package typings.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceEventLagOptions extends js.Object {
  /**
    * Above how many ms of lag is the CPU considered busy?
    */
  var lagThreshold: js.UndefOr[Double] = js.undefined
  /**
    * When we first start measuring event lag, not much is going on in the browser yet, so it's not uncommon for the numbers to be abnormally low for the first few samples. This configures how many samples we need before we consider a low number to mean completion.
    */
  var minSamples: js.UndefOr[Double] = js.undefined
  /**
    * How many samples should we average to decide what the current lag is?
    */
  var sampleCount: js.UndefOr[Double] = js.undefined
}

object PaceEventLagOptions {
  @scala.inline
  def apply(
    lagThreshold: js.UndefOr[Double] = js.undefined,
    minSamples: js.UndefOr[Double] = js.undefined,
    sampleCount: js.UndefOr[Double] = js.undefined
  ): PaceEventLagOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lagThreshold)) __obj.updateDynamic("lagThreshold")(lagThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSamples)) __obj.updateDynamic("minSamples")(minSamples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleCount)) __obj.updateDynamic("sampleCount")(sampleCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceEventLagOptions]
  }
}

