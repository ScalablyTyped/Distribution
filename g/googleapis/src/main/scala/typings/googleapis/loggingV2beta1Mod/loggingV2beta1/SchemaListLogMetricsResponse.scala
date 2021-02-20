package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListLogMetrics.
  */
@js.native
trait SchemaListLogMetricsResponse extends StObject {
  
  /**
    * A list of logs-based metrics.
    */
  var metrics: js.UndefOr[js.Array[SchemaLogMetric]] = js.native
  
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListLogMetricsResponse {
  
  @scala.inline
  def apply(): SchemaListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogMetricsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLogMetricsResponseMutableBuilder[Self <: SchemaListLogMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaLogMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaLogMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
