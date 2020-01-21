package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Histogram facets to be specified in SearchJobsRequest.
  */
@js.native
trait SchemaHistogramFacets extends js.Object {
  /**
    * Optional.  Specifies compensation field-based histogram requests.
    * Duplicate values of CompensationHistogramRequest.type are not allowed.
    */
  var compensationHistogramFacets: js.UndefOr[js.Array[SchemaCompensationHistogramRequest]] = js.native
  /**
    * Optional.  Specifies the custom attributes histogram requests. Duplicate
    * values of CustomAttributeHistogramRequest.key are not allowed.
    */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[SchemaCustomAttributeHistogramRequest]] = js.native
  /**
    * Optional. Specifies the simple type of histogram facets, for example,
    * `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. This field is equivalent to
    * GetHistogramRequest.
    */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHistogramFacets {
  @scala.inline
  def apply(
    compensationHistogramFacets: js.Array[SchemaCompensationHistogramRequest] = null,
    customAttributeHistogramFacets: js.Array[SchemaCustomAttributeHistogramRequest] = null,
    simpleHistogramFacets: js.Array[String] = null
  ): SchemaHistogramFacets = {
    val __obj = js.Dynamic.literal()
    if (compensationHistogramFacets != null) __obj.updateDynamic("compensationHistogramFacets")(compensationHistogramFacets.asInstanceOf[js.Any])
    if (customAttributeHistogramFacets != null) __obj.updateDynamic("customAttributeHistogramFacets")(customAttributeHistogramFacets.asInstanceOf[js.Any])
    if (simpleHistogramFacets != null) __obj.updateDynamic("simpleHistogramFacets")(simpleHistogramFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistogramFacets]
  }
}

