package typings.hubspotDashPace.HubSpotPaceInterfacesNs

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
    lagThreshold: Int | Double = null,
    minSamples: Int | Double = null,
    sampleCount: Int | Double = null
  ): PaceEventLagOptions = {
    val __obj = js.Dynamic.literal()
    if (lagThreshold != null) __obj.updateDynamic("lagThreshold")(lagThreshold.asInstanceOf[js.Any])
    if (minSamples != null) __obj.updateDynamic("minSamples")(minSamples.asInstanceOf[js.Any])
    if (sampleCount != null) __obj.updateDynamic("sampleCount")(sampleCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceEventLagOptions]
  }
}

