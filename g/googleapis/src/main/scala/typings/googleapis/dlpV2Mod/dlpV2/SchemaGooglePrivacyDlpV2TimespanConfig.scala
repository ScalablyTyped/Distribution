package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of the timespan of the items to include in scanning.
  * Currently only supported when inspecting Google Cloud Storage and BigQuery.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimespanConfig extends js.Object {
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
  def apply(
    enableAutoPopulationOfTimespanConfig: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    startTime: String = null,
    timestampField: SchemaGooglePrivacyDlpV2FieldId = null
  ): SchemaGooglePrivacyDlpV2TimespanConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoPopulationOfTimespanConfig)) __obj.updateDynamic("enableAutoPopulationOfTimespanConfig")(enableAutoPopulationOfTimespanConfig.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timestampField != null) __obj.updateDynamic("timestampField")(timestampField.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimespanConfig]
  }
}

