package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

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
  def apply(): SchemaCompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationHistogramResult]
  }
  @scala.inline
  implicit class SchemaCompensationHistogramResultOps[Self <: SchemaCompensationHistogramResult] (val x: Self) extends AnyVal {
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
    def setResult(value: SchemaNumericBucketingResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

