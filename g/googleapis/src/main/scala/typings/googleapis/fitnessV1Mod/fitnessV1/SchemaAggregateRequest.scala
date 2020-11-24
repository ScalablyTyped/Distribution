package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Next id: 10
  */
@js.native
trait SchemaAggregateRequest extends js.Object {
  
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec
    * must be provided. All data that is specified will be aggregated using the
    * same bucketing criteria. There will be one dataset in the response for
    * every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[SchemaAggregateBy]] = js.native
  
  /**
    * Specifies that data be aggregated each activity segment recored for a
    * user. Similar to bucketByActivitySegment, but bucketing is done for each
    * activity segment rather than all segments of the same type. Mutually
    * exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[SchemaBucketByActivity] = js.native
  
  /**
    * Specifies that data be aggregated by the type of activity being performed
    * when the data was recorded. All data that was recorded during a certain
    * activity type (for the given time range) will be aggregated into the same
    * bucket. Data that was recorded while the user was not active will not be
    * included in the response. Mutually exclusive of other bucketing
    * specifications.
    */
  var bucketByActivityType: js.UndefOr[SchemaBucketByActivity] = js.native
  
  /**
    * Specifies that data be aggregated by user sessions. Data that does not
    * fall within the time range of a session will not be included in the
    * response. Mutually exclusive of other bucketing specifications.
    */
  var bucketBySession: js.UndefOr[SchemaBucketBySession] = js.native
  
  /**
    * Specifies that data be aggregated by a single time interval. Mutually
    * exclusive of other bucketing specifications.
    */
  var bucketByTime: js.UndefOr[SchemaBucketByTime] = js.native
  
  /**
    * The end of a window of time. Data that intersects with this time window
    * will be aggregated. The time is in milliseconds since epoch, inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * DO NOT POPULATE THIS FIELD. As data quality standards are deprecated,
    * filling it in will result in no data sources being returned. It will be
    * removed in a future version entirely.
    */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The start of a window of time. Data that intersects with this time window
    * will be aggregated. The time is in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
}
object SchemaAggregateRequest {
  
  @scala.inline
  def apply(): SchemaAggregateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateRequest]
  }
  
  @scala.inline
  implicit class SchemaAggregateRequestOps[Self <: SchemaAggregateRequest] (val x: Self) extends AnyVal {
    
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
    def setAggregateByVarargs(value: SchemaAggregateBy*): Self = this.set("aggregateBy", js.Array(value :_*))
    
    @scala.inline
    def setAggregateBy(value: js.Array[SchemaAggregateBy]): Self = this.set("aggregateBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateBy: Self = this.set("aggregateBy", js.undefined)
    
    @scala.inline
    def setBucketByActivitySegment(value: SchemaBucketByActivity): Self = this.set("bucketByActivitySegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketByActivitySegment: Self = this.set("bucketByActivitySegment", js.undefined)
    
    @scala.inline
    def setBucketByActivityType(value: SchemaBucketByActivity): Self = this.set("bucketByActivityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketByActivityType: Self = this.set("bucketByActivityType", js.undefined)
    
    @scala.inline
    def setBucketBySession(value: SchemaBucketBySession): Self = this.set("bucketBySession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketBySession: Self = this.set("bucketBySession", js.undefined)
    
    @scala.inline
    def setBucketByTime(value: SchemaBucketByTime): Self = this.set("bucketByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketByTime: Self = this.set("bucketByTime", js.undefined)
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = this.set("endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeMillis: Self = this.set("endTimeMillis", js.undefined)
    
    @scala.inline
    def setFilteredDataQualityStandardVarargs(value: String*): Self = this.set("filteredDataQualityStandard", js.Array(value :_*))
    
    @scala.inline
    def setFilteredDataQualityStandard(value: js.Array[String]): Self = this.set("filteredDataQualityStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredDataQualityStandard: Self = this.set("filteredDataQualityStandard", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = this.set("startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("startTimeMillis", js.undefined)
  }
}
