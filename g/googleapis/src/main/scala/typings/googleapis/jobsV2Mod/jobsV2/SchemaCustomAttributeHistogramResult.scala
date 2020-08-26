package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom attribute histogram result.
  */
@js.native
trait SchemaCustomAttributeHistogramResult extends js.Object {
  /**
    * Stores the key of custom attribute the histogram is performed on.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Stores bucketed histogram counting result or min/max values for custom
    * attribute long values associated with `key`.
    */
  var longValueHistogramResult: js.UndefOr[SchemaNumericBucketingResult] = js.native
  /**
    * Stores a map from the values of string custom field associated with `key`
    * to the number of jobs with that value in this histogram result.
    */
  var stringValueHistogramResult: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaCustomAttributeHistogramResult {
  @scala.inline
  def apply(): SchemaCustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramResult]
  }
  @scala.inline
  implicit class SchemaCustomAttributeHistogramResultOps[Self <: SchemaCustomAttributeHistogramResult] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLongValueHistogramResult(value: SchemaNumericBucketingResult): Self = this.set("longValueHistogramResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongValueHistogramResult: Self = this.set("longValueHistogramResult", js.undefined)
    @scala.inline
    def setStringValueHistogramResult(value: StringDictionary[Double]): Self = this.set("stringValueHistogramResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValueHistogramResult: Self = this.set("stringValueHistogramResult", js.undefined)
  }
  
}

