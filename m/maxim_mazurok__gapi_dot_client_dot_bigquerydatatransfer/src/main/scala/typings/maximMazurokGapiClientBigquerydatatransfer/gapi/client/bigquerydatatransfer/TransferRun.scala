package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferRun extends StObject {
  
  /** Output only. Data source id. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /** Output only. The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.undefined
  
  /** Output only. Email notifications will be sent according to these preferences to the email address of the user who owns the transfer config this run was derived from. */
  var emailPreferences: js.UndefOr[EmailPreferences] = js.undefined
  
  /** Output only. Time when transfer run ended. Parameter ignored by server for input requests. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Status of the transfer run. */
  var errorStatus: js.UndefOr[Status] = js.undefined
  
  /**
    * The resource name of the transfer run. Transfer run names have the form `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`. The name is ignored
    * when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Pub/Sub topic where a notification will be sent after this transfer run finishes */
  var notificationPubsubTopic: js.UndefOr[String] = js.undefined
  
  /** Output only. Data transfer specific parameters. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.TransferRun & TopLevel[js.Any]
  ] = js.undefined
  
  /** For batch transfer runs, specifies the date and time of the data should be ingested. */
  var runTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Describes the schedule of this transfer run if it was created as part of a regular schedule. For batch transfer runs that are scheduled manually, this is empty. NOTE:
    * the system might choose to delay the schedule depending on the current load, so `schedule_time` doesn't always match this.
    */
  var schedule: js.UndefOr[String] = js.undefined
  
  /** Minimum time after which a transfer run can be started. */
  var scheduleTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when transfer run was started. Parameter ignored by server for input requests. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Data transfer run state. Ignored for input requests. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Last time the data transfer run state was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Unique ID of the user on whose behalf transfer is done. */
  var userId: js.UndefOr[String] = js.undefined
}
object TransferRun {
  
  inline def apply(): TransferRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferRun]
  }
  
  extension [Self <: TransferRun](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setDestinationDatasetId(value: String): Self = StObject.set(x, "destinationDatasetId", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatasetIdUndefined: Self = StObject.set(x, "destinationDatasetId", js.undefined)
    
    inline def setEmailPreferences(value: EmailPreferences): Self = StObject.set(x, "emailPreferences", value.asInstanceOf[js.Any])
    
    inline def setEmailPreferencesUndefined: Self = StObject.set(x, "emailPreferences", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorStatus(value: Status): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationPubsubTopic(value: String): Self = StObject.set(x, "notificationPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setNotificationPubsubTopicUndefined: Self = StObject.set(x, "notificationPubsubTopic", js.undefined)
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.TransferRun & TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRunTime(value: String): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
    
    inline def setRunTimeUndefined: Self = StObject.set(x, "runTime", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
