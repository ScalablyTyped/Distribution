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
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  @scala.inline
  implicit class SchemaDistributionOps[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
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
    def setMarketShare(value: Double): Self = this.set("marketShare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketShare: Self = this.set("marketShare", js.undefined)
    @scala.inline
    def setMeasurementTime(value: String): Self = this.set("measurementTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurementTime: Self = this.set("measurementTime", js.undefined)
  }
  
}

