package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAggregateBucket extends js.Object {
  
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
  implicit class SchemaAggregateBucketOps[Self <: SchemaAggregateBucket] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: Double): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    
    @scala.inline
    def setDatasetVarargs(value: SchemaDataset*): Self = this.set("dataset", js.Array(value :_*))
    
    @scala.inline
    def setDataset(value: js.Array[SchemaDataset]): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = this.set("endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeMillis: Self = this.set("endTimeMillis", js.undefined)
    
    @scala.inline
    def setSession(value: SchemaSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = this.set("startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("startTimeMillis", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
