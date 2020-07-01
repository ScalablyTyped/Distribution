package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the relative number of devices running a given configuration of
  * the Android platform.
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * Output only. The estimated fraction (0-1) of the total market with this
    * configuration.
    */
  var marketShare: js.UndefOr[Double] = js.native
  /**
    * Output only. The time this distribution was measured.
    */
  var measurementTime: js.UndefOr[String] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(marketShare: js.UndefOr[Double] = js.undefined, measurementTime: String = null): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(marketShare)) __obj.updateDynamic("marketShare")(marketShare.get.asInstanceOf[js.Any])
    if (measurementTime != null) __obj.updateDynamic("measurementTime")(measurementTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDistribution]
  }
}

