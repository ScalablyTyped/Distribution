package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Output only.  The response of the
  * GetHistogram method.
  */
trait SchemaGetHistogramResponse extends StObject {
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
  
  /**
    * The Histogram results.
    */
  var results: js.UndefOr[js.Array[SchemaHistogramResult]] = js.undefined
}
object SchemaGetHistogramResponse {
  
  @scala.inline
  def apply(): SchemaGetHistogramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramResponse]
  }
  
  @scala.inline
  implicit class SchemaGetHistogramResponseMutableBuilder[Self <: SchemaGetHistogramResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaHistogramResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaHistogramResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
