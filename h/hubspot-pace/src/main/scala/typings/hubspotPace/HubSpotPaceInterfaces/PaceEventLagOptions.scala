package typings.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceEventLagOptions extends js.Object {
  /**
    * Above how many ms of lag is the CPU considered busy?
    */
  var lagThreshold: js.UndefOr[Double] = js.native
  /**
    * When we first start measuring event lag, not much is going on in the browser yet, so it's not uncommon for the numbers to be abnormally low for the first few samples. This configures how many samples we need before we consider a low number to mean completion.
    */
  var minSamples: js.UndefOr[Double] = js.native
  /**
    * How many samples should we average to decide what the current lag is?
    */
  var sampleCount: js.UndefOr[Double] = js.native
}

object PaceEventLagOptions {
  @scala.inline
  def apply(): PaceEventLagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceEventLagOptions]
  }
  @scala.inline
  implicit class PaceEventLagOptionsOps[Self <: PaceEventLagOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLagThreshold(value: Double): Self = this.set("lagThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagThreshold: Self = this.set("lagThreshold", js.undefined)
    @scala.inline
    def setMinSamples(value: Double): Self = this.set("minSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSamples: Self = this.set("minSamples", js.undefined)
    @scala.inline
    def setSampleCount(value: Double): Self = this.set("sampleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleCount: Self = this.set("sampleCount", js.undefined)
  }
  
}

