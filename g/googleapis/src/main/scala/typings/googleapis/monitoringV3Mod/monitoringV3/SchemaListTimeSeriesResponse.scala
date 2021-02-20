package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListTimeSeries response.
  */
@js.native
trait SchemaListTimeSeriesResponse extends StObject {
  
  /**
    * Query execution errors that may have caused the time series data returned
    * to be incomplete.
    */
  var executionErrors: js.UndefOr[js.Array[SchemaStatus]] = js.native
  
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * One or more time series that match the filter included in the request.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.native
}
object SchemaListTimeSeriesResponse {
  
  @scala.inline
  def apply(): SchemaListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListTimeSeriesResponseMutableBuilder[Self <: SchemaListTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionErrors(value: js.Array[SchemaStatus]): Self = StObject.set(x, "executionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionErrorsUndefined: Self = StObject.set(x, "executionErrors", js.undefined)
    
    @scala.inline
    def setExecutionErrorsVarargs(value: SchemaStatus*): Self = StObject.set(x, "executionErrors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTimeSeries(value: js.Array[SchemaTimeSeries]): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
    
    @scala.inline
    def setTimeSeriesVarargs(value: SchemaTimeSeries*): Self = StObject.set(x, "timeSeries", js.Array(value :_*))
  }
}
