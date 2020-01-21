package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Compensation based histogram request.
  */
@js.native
trait SchemaCompensationHistogramRequest extends js.Object {
  /**
    * Required.  Numeric histogram options, like buckets, whether include min
    * or max value.
    */
  var bucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.native
  /**
    * Required.  Type of the request, representing which field the
    * histogramming should be performed over. A single request can only specify
    * one histogram of each `CompensationHistogramRequestType`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompensationHistogramRequest {
  @scala.inline
  def apply(bucketingOption: SchemaNumericBucketingOption = null, `type`: String = null): SchemaCompensationHistogramRequest = {
    val __obj = js.Dynamic.literal()
    if (bucketingOption != null) __obj.updateDynamic("bucketingOption")(bucketingOption.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationHistogramRequest]
  }
}

