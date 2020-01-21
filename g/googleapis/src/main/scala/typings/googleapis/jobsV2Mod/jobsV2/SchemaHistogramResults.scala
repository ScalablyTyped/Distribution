package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Histogram results that matches HistogramFacets specified in
  * SearchJobsRequest.
  */
@js.native
trait SchemaHistogramResults extends js.Object {
  /**
    * Specifies compensation field-based histogram results that matches
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[SchemaCompensationHistogramResult]] = js.native
  /**
    * Specifies histogram results for custom attributes that matches
    * HistogramFacets.custom_attribute_histogram_facets.
    */
  var customAttributeHistogramResults: js.UndefOr[js.Array[SchemaCustomAttributeHistogramResult]] = js.native
  /**
    * Specifies histogram results that matches
    * HistogramFacets.simple_histogram_facets.
    */
  var simpleHistogramResults: js.UndefOr[js.Array[SchemaHistogramResult]] = js.native
}

object SchemaHistogramResults {
  @scala.inline
  def apply(
    compensationHistogramResults: js.Array[SchemaCompensationHistogramResult] = null,
    customAttributeHistogramResults: js.Array[SchemaCustomAttributeHistogramResult] = null,
    simpleHistogramResults: js.Array[SchemaHistogramResult] = null
  ): SchemaHistogramResults = {
    val __obj = js.Dynamic.literal()
    if (compensationHistogramResults != null) __obj.updateDynamic("compensationHistogramResults")(compensationHistogramResults.asInstanceOf[js.Any])
    if (customAttributeHistogramResults != null) __obj.updateDynamic("customAttributeHistogramResults")(customAttributeHistogramResults.asInstanceOf[js.Any])
    if (simpleHistogramResults != null) __obj.updateDynamic("simpleHistogramResults")(simpleHistogramResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistogramResults]
  }
}

