package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the metadata for basic sample series represented by a line
  * chart
  */
@js.native
trait SchemaBasicPerfSampleSeries extends js.Object {
  var perfMetricType: js.UndefOr[String] = js.native
  var perfUnit: js.UndefOr[String] = js.native
  var sampleSeriesLabel: js.UndefOr[String] = js.native
}

object SchemaBasicPerfSampleSeries {
  @scala.inline
  def apply(perfMetricType: String = null, perfUnit: String = null, sampleSeriesLabel: String = null): SchemaBasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    if (perfMetricType != null) __obj.updateDynamic("perfMetricType")(perfMetricType.asInstanceOf[js.Any])
    if (perfUnit != null) __obj.updateDynamic("perfUnit")(perfUnit.asInstanceOf[js.Any])
    if (sampleSeriesLabel != null) __obj.updateDynamic("sampleSeriesLabel")(sampleSeriesLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicPerfSampleSeries]
  }
}

