package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferConfig extends StObject {
  
  /**
    * The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1],
    * rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
    */
  var dataRefreshWindowDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Data source ID. This cannot be changed once data transfer is created. The full list of available data source IDs can be returned through an API call:
    * https://cloud.google.com/bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
    */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.undefined
  
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.undefined
  
  /** Is this config disabled. When set to true, no runs are scheduled for a given transfer. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** User specified display name for the data transfer. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config. */
  var emailPreferences: js.UndefOr[EmailPreferences] = js.undefined
  
  /**
    * The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a
    * uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Next time when data transfer will run. */
  var nextRunTime: js.UndefOr[String] = js.undefined
  
  /**
    * Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is:
    * `projects/{project}/topics/{topic}`
    */
  var notificationPubsubTopic: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not
    * available, this field will not be populated.
    */
  var ownerInfo: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer' section for each data source. For example the parameters for Cloud
    * Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
    */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The
    * specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation
    * about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring
    * transfers depends on the data source; refer to the documentation for your data source.
    */
  var schedule: js.UndefOr[String] = js.undefined
  
  /** Options customizing the data transfer schedule. */
  var scheduleOptions: js.UndefOr[ScheduleOptions] = js.undefined
  
  /** Output only. State of the most recently updated transfer run. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Data transfer modification time. Ignored by server on input. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Unique ID of the user on whose behalf transfer is done. */
  var userId: js.UndefOr[String] = js.undefined
}
object TransferConfig {
  
  inline def apply(): TransferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferConfig] (val x: Self) extends AnyVal {
    
    inline def setDataRefreshWindowDays(value: Double): Self = StObject.set(x, "dataRefreshWindowDays", value.asInstanceOf[js.Any])
    
    inline def setDataRefreshWindowDaysUndefined: Self = StObject.set(x, "dataRefreshWindowDays", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setDatasetRegion(value: String): Self = StObject.set(x, "datasetRegion", value.asInstanceOf[js.Any])
    
    inline def setDatasetRegionUndefined: Self = StObject.set(x, "datasetRegion", js.undefined)
    
    inline def setDestinationDatasetId(value: String): Self = StObject.set(x, "destinationDatasetId", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatasetIdUndefined: Self = StObject.set(x, "destinationDatasetId", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailPreferences(value: EmailPreferences): Self = StObject.set(x, "emailPreferences", value.asInstanceOf[js.Any])
    
    inline def setEmailPreferencesUndefined: Self = StObject.set(x, "emailPreferences", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextRunTime(value: String): Self = StObject.set(x, "nextRunTime", value.asInstanceOf[js.Any])
    
    inline def setNextRunTimeUndefined: Self = StObject.set(x, "nextRunTime", js.undefined)
    
    inline def setNotificationPubsubTopic(value: String): Self = StObject.set(x, "notificationPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setNotificationPubsubTopicUndefined: Self = StObject.set(x, "notificationPubsubTopic", js.undefined)
    
    inline def setOwnerInfo(value: UserInfo): Self = StObject.set(x, "ownerInfo", value.asInstanceOf[js.Any])
    
    inline def setOwnerInfoUndefined: Self = StObject.set(x, "ownerInfo", js.undefined)
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleOptions(value: ScheduleOptions): Self = StObject.set(x, "scheduleOptions", value.asInstanceOf[js.Any])
    
    inline def setScheduleOptionsUndefined: Self = StObject.set(x, "scheduleOptions", js.undefined)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
