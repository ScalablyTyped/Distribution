package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Compensation based histogram result.
  */
@js.native
trait SchemaCompensationHistogramResult extends js.Object {
  /**
    * Histogram result.
    */
  var result: js.UndefOr[SchemaNumericBucketingResult] = js.native
  /**
    * Type of the request, corresponding to CompensationHistogramRequest.type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompensationHistogramResult {
  @scala.inline
  def apply(result: SchemaNumericBucketingResult = null, `type`: String = null): SchemaCompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationHistogramResult]
  }
}

