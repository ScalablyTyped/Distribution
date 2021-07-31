package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Compensation based histogram result.
  */
trait SchemaCompensationHistogramResult extends StObject {
  
  /**
    * Histogram result.
    */
  var result: js.UndefOr[SchemaNumericBucketingResult] = js.undefined
  
  /**
    * Type of the request, corresponding to CompensationHistogramRequest.type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCompensationHistogramResult {
  
  @scala.inline
  def apply(): SchemaCompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationHistogramResult]
  }
  
  @scala.inline
  implicit class SchemaCompensationHistogramResultMutableBuilder[Self <: SchemaCompensationHistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaNumericBucketingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
