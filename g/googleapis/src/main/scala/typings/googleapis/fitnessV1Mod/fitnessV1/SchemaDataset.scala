package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataset extends StObject {
  
  /**
    * The data stream ID of the data source that created the points in this dataset.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The largest end time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also match the second part of the dataset identifier.
    */
  var maxEndTimeNs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The smallest start time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also match the first part of the dataset identifier.
    */
  var minStartTimeNs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This token will be set when a dataset is received in response to a GET request and the dataset is too large to be included in a single response. Provide this value in a subsequent GET request to return the next page of data points within this dataset.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A partial list of data points contained in the dataset, ordered by endTimeNanos. This list is considered complete when retrieving a small dataset and partial when patching a dataset or retrieving a dataset that is too large to include in a single response.
    */
  var point: js.UndefOr[js.Array[SchemaDataPoint]] = js.undefined
}
object SchemaDataset {
  
  inline def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  
  extension [Self <: SchemaDataset](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setMaxEndTimeNs(value: String): Self = StObject.set(x, "maxEndTimeNs", value.asInstanceOf[js.Any])
    
    inline def setMaxEndTimeNsNull: Self = StObject.set(x, "maxEndTimeNs", null)
    
    inline def setMaxEndTimeNsUndefined: Self = StObject.set(x, "maxEndTimeNs", js.undefined)
    
    inline def setMinStartTimeNs(value: String): Self = StObject.set(x, "minStartTimeNs", value.asInstanceOf[js.Any])
    
    inline def setMinStartTimeNsNull: Self = StObject.set(x, "minStartTimeNs", null)
    
    inline def setMinStartTimeNsUndefined: Self = StObject.set(x, "minStartTimeNs", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPoint(value: js.Array[SchemaDataPoint]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPointVarargs(value: SchemaDataPoint*): Self = StObject.set(x, "point", js.Array(value*))
  }
}
