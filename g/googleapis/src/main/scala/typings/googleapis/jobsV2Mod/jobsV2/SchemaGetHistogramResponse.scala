package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Output only.  The response of the
  * GetHistogram method.
  */
@js.native
trait SchemaGetHistogramResponse extends js.Object {
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * The Histogram results.
    */
  var results: js.UndefOr[js.Array[SchemaHistogramResult]] = js.native
}

object SchemaGetHistogramResponse {
  @scala.inline
  def apply(metadata: SchemaResponseMetadata = null, results: js.Array[SchemaHistogramResult] = null): SchemaGetHistogramResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetHistogramResponse]
  }
}

