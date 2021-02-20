package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of the timespan of the items to include in scanning.
  * Currently only supported when inspecting Google Cloud Storage and BigQuery.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimespanConfig extends StObject {
  
  /**
    * When the job is started by a JobTrigger we will automatically figure out
    * a valid start_time to avoid scanning files that have not been modified
    * since the last time the JobTrigger executed. This will be based on the
    * time of the execution of the last run of the JobTrigger.
    */
  var enableAutoPopulationOfTimespanConfig: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude files or rows newer than this value. If set to zero, no upper
    * time limit is applied.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Exclude files or rows older than this value.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Specification of the field containing the timestamp of scanned items.
    * Used for data sources like Datastore or BigQuery. If not specified for
    * BigQuery, table last modification timestamp is checked against given time
    * span. The valid data types of the timestamp field are: for BigQuery -
    * timestamp, date, datetime; for Datastore - timestamp. Datastore entity
    * will be scanned if the timestamp property does not exist or its value is
    * empty or invalid.
    */
  var timestampField: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}
object SchemaGooglePrivacyDlpV2TimespanConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimespanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimespanConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimespanConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TimespanConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAutoPopulationOfTimespanConfig(value: Boolean): Self = StObject.set(x, "enableAutoPopulationOfTimespanConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoPopulationOfTimespanConfigUndefined: Self = StObject.set(x, "enableAutoPopulationOfTimespanConfig", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTimestampField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "timestampField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampFieldUndefined: Self = StObject.set(x, "timestampField", js.undefined)
  }
}
