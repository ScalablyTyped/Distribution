package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAggregateBucket extends StObject {
  
  /**
    * Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT
    */
  var activity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * There will be one dataset per AggregateBy in the request.
    */
  var dataset: js.UndefOr[js.Array[SchemaDataset]] = js.undefined
  
  /**
    * The end time for the aggregated data, in milliseconds since epoch, inclusive.
    */
  var endTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Available for Bucket.Type.SESSION
    */
  var session: js.UndefOr[SchemaSession] = js.undefined
  
  /**
    * The start time for the aggregated data, in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of a bucket signifies how the data aggregation is performed in the bucket.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAggregateBucket {
  
  inline def apply(): SchemaAggregateBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBucket]
  }
  
  extension [Self <: SchemaAggregateBucket](x: Self) {
    
    inline def setActivity(value: Double): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setDataset(value: js.Array[SchemaDataset]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setDatasetVarargs(value: SchemaDataset*): Self = StObject.set(x, "dataset", js.Array(value*))
    
    inline def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMillisNull: Self = StObject.set(x, "endTimeMillis", null)
    
    inline def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    inline def setSession(value: SchemaSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisNull: Self = StObject.set(x, "startTimeMillis", null)
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
