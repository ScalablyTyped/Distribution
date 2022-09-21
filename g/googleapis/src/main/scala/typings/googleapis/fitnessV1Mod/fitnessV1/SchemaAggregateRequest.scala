package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAggregateRequest extends StObject {
  
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the same bucketing criteria. There will be one dataset in the response for every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[SchemaAggregateBy]] = js.undefined
  
  /**
    * Specifies that data be aggregated each activity segment recorded for a user. Similar to bucketByActivitySegment, but bucketing is done for each activity segment rather than all segments of the same type. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[SchemaBucketByActivity] = js.undefined
  
  /**
    * Specifies that data be aggregated by the type of activity being performed when the data was recorded. All data that was recorded during a certain activity type (.for the given time range) will be aggregated into the same bucket. Data that was recorded while the user was not active will not be included in the response. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivityType: js.UndefOr[SchemaBucketByActivity] = js.undefined
  
  /**
    * Specifies that data be aggregated by user sessions. Data that does not fall within the time range of a session will not be included in the response. Mutually exclusive of other bucketing specifications.
    */
  var bucketBySession: js.UndefOr[SchemaBucketBySession] = js.undefined
  
  /**
    * Specifies that data be aggregated by a single time interval. Mutually exclusive of other bucketing specifications.
    */
  var bucketByTime: js.UndefOr[SchemaBucketByTime] = js.undefined
  
  /**
    * The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. The maximum allowed difference between start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
    */
  var endTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DO NOT POPULATE THIS FIELD. It is ignored.
    */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaAggregateRequest {
  
  inline def apply(): SchemaAggregateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateRequest]
  }
  
  extension [Self <: SchemaAggregateRequest](x: Self) {
    
    inline def setAggregateBy(value: js.Array[SchemaAggregateBy]): Self = StObject.set(x, "aggregateBy", value.asInstanceOf[js.Any])
    
    inline def setAggregateByUndefined: Self = StObject.set(x, "aggregateBy", js.undefined)
    
    inline def setAggregateByVarargs(value: SchemaAggregateBy*): Self = StObject.set(x, "aggregateBy", js.Array(value*))
    
    inline def setBucketByActivitySegment(value: SchemaBucketByActivity): Self = StObject.set(x, "bucketByActivitySegment", value.asInstanceOf[js.Any])
    
    inline def setBucketByActivitySegmentUndefined: Self = StObject.set(x, "bucketByActivitySegment", js.undefined)
    
    inline def setBucketByActivityType(value: SchemaBucketByActivity): Self = StObject.set(x, "bucketByActivityType", value.asInstanceOf[js.Any])
    
    inline def setBucketByActivityTypeUndefined: Self = StObject.set(x, "bucketByActivityType", js.undefined)
    
    inline def setBucketBySession(value: SchemaBucketBySession): Self = StObject.set(x, "bucketBySession", value.asInstanceOf[js.Any])
    
    inline def setBucketBySessionUndefined: Self = StObject.set(x, "bucketBySession", js.undefined)
    
    inline def setBucketByTime(value: SchemaBucketByTime): Self = StObject.set(x, "bucketByTime", value.asInstanceOf[js.Any])
    
    inline def setBucketByTimeUndefined: Self = StObject.set(x, "bucketByTime", js.undefined)
    
    inline def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMillisNull: Self = StObject.set(x, "endTimeMillis", null)
    
    inline def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    inline def setFilteredDataQualityStandard(value: js.Array[String]): Self = StObject.set(x, "filteredDataQualityStandard", value.asInstanceOf[js.Any])
    
    inline def setFilteredDataQualityStandardNull: Self = StObject.set(x, "filteredDataQualityStandard", null)
    
    inline def setFilteredDataQualityStandardUndefined: Self = StObject.set(x, "filteredDataQualityStandard", js.undefined)
    
    inline def setFilteredDataQualityStandardVarargs(value: String*): Self = StObject.set(x, "filteredDataQualityStandard", js.Array(value*))
    
    inline def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisNull: Self = StObject.set(x, "startTimeMillis", null)
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
  }
}
