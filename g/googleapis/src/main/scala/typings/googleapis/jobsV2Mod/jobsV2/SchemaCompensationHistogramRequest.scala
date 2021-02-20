package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Compensation based histogram request.
  */
@js.native
trait SchemaCompensationHistogramRequest extends StObject {
  
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
  def apply(): SchemaCompensationHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationHistogramRequest]
  }
  
  @scala.inline
  implicit class SchemaCompensationHistogramRequestMutableBuilder[Self <: SchemaCompensationHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketingOption(value: SchemaNumericBucketingOption): Self = StObject.set(x, "bucketingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketingOptionUndefined: Self = StObject.set(x, "bucketingOption", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
