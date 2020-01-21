package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Histogram result that matches HistogramSpec specified in
  * searches.
  */
@js.native
trait SchemaHistogramQueryResult extends js.Object {
  /**
    * A map from the values of the facet associated with distinct values to the
    * number of matching entries with corresponding value.  The key format is:
    * * (for string histogram) string values stored in the field. * (for named
    * numeric bucket) name specified in `bucket()` function, like   for
    * `bucket(0, MAX, &quot;non-negative&quot;)`, the key will be
    * `non-negative`. * (for anonymous numeric bucket) range formatted as
    * `&lt;low&gt;-&lt;high&gt;`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
    */
  var histogram: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Requested histogram expression.
    */
  var histogramQuery: js.UndefOr[String] = js.native
}

object SchemaHistogramQueryResult {
  @scala.inline
  def apply(histogram: StringDictionary[String] = null, histogramQuery: String = null): SchemaHistogramQueryResult = {
    val __obj = js.Dynamic.literal()
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (histogramQuery != null) __obj.updateDynamic("histogramQuery")(histogramQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistogramQueryResult]
  }
}

