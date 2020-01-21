package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListPerfSampleSeriesResponse extends js.Object {
  /**
    * The resulting PerfSampleSeries sorted by id
    */
  var perfSampleSeries: js.UndefOr[js.Array[SchemaPerfSampleSeries]] = js.native
}

object SchemaListPerfSampleSeriesResponse {
  @scala.inline
  def apply(perfSampleSeries: js.Array[SchemaPerfSampleSeries] = null): SchemaListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSampleSeries != null) __obj.updateDynamic("perfSampleSeries")(perfSampleSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPerfSampleSeriesResponse]
  }
}

