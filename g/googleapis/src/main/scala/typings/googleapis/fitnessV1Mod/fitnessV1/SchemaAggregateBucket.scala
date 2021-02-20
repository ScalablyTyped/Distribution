package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAggregateBucket extends StObject {
  
  /**
    * Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT
    */
  var activity: js.UndefOr[Double] = js.native
  
  /**
    * There will be one dataset per AggregateBy in the request.
    */
  var dataset: js.UndefOr[js.Array[SchemaDataset]] = js.native
  
  /**
    * The end time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * Available for Bucket.Type.SESSION
    */
  var session: js.UndefOr[SchemaSession] = js.native
  
  /**
    * The start time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * The type of a bucket signifies how the data aggregation is performed in
    * the bucket.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAggregateBucket {
  
  @scala.inline
  def apply(): SchemaAggregateBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBucket]
  }
  
  @scala.inline
  implicit class SchemaAggregateBucketMutableBuilder[Self <: SchemaAggregateBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: Double): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    @scala.inline
    def setDataset(value: js.Array[SchemaDataset]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setDatasetVarargs(value: SchemaDataset*): Self = StObject.set(x, "dataset", js.Array(value :_*))
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    @scala.inline
    def setSession(value: SchemaSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
