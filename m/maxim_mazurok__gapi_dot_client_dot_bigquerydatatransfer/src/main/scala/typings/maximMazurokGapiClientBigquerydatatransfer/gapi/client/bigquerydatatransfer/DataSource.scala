package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /** Indicates the type of authorization. */
  var authorizationType: js.UndefOr[String] = js.native
  
  /** Data source client id which should be used to receive refresh token. */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the data source supports automatic data refresh for the past few days, and how it's supported. For some data sources, data might not be complete until a few days
    * later, so it's useful to refresh data automatically.
    */
  var dataRefreshType: js.UndefOr[String] = js.native
  
  /** Data source id. */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /** Default data refresh window on days. Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`. */
  var defaultDataRefreshWindowDays: js.UndefOr[Double] = js.native
  
  /** Default data transfer schedule. Examples of valid schedules include: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. */
  var defaultSchedule: js.UndefOr[String] = js.native
  
  /** User friendly data source description string. */
  var description: js.UndefOr[String] = js.native
  
  /** User friendly data source name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Url for the help document for this data source. */
  var helpUrl: js.UndefOr[String] = js.native
  
  /** Disables backfilling and manual run scheduling for the data source. */
  var manualRunsDisabled: js.UndefOr[Boolean] = js.native
  
  /** The minimum interval for scheduler to schedule runs. */
  var minimumScheduleInterval: js.UndefOr[String] = js.native
  
  /** Output only. Data source resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** Data source parameters. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.native
  
  /**
    * Api auth scopes for which refresh token needs to be obtained. These are scopes needed by a data source to prepare data and ingest them into BigQuery, e.g.,
    * https://www.googleapis.com/auth/bigquery
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  
  /** Specifies whether the data source supports a user defined schedule, or operates on the default schedule. When set to `true`, user can override default schedule. */
  var supportsCustomSchedule: js.UndefOr[Boolean] = js.native
  
  /** Deprecated. This field has no effect. */
  var supportsMultipleTransfers: js.UndefOr[Boolean] = js.native
  
  /** Deprecated. This field has no effect. */
  var transferType: js.UndefOr[String] = js.native
  
  /** The number of seconds to wait for an update from the data source before the Data Transfer Service marks the transfer as FAILED. */
  var updateDeadlineSeconds: js.UndefOr[Double] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationType(value: String): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationTypeUndefined: Self = StObject.set(x, "authorizationType", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setDataRefreshType(value: String): Self = StObject.set(x, "dataRefreshType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRefreshTypeUndefined: Self = StObject.set(x, "dataRefreshType", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDefaultDataRefreshWindowDays(value: Double): Self = StObject.set(x, "defaultDataRefreshWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDataRefreshWindowDaysUndefined: Self = StObject.set(x, "defaultDataRefreshWindowDays", js.undefined)
    
    @scala.inline
    def setDefaultSchedule(value: String): Self = StObject.set(x, "defaultSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultScheduleUndefined: Self = StObject.set(x, "defaultSchedule", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
    
    @scala.inline
    def setManualRunsDisabled(value: Boolean): Self = StObject.set(x, "manualRunsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRunsDisabledUndefined: Self = StObject.set(x, "manualRunsDisabled", js.undefined)
    
    @scala.inline
    def setMinimumScheduleInterval(value: String): Self = StObject.set(x, "minimumScheduleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumScheduleIntervalUndefined: Self = StObject.set(x, "minimumScheduleInterval", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[DataSourceParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DataSourceParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setSupportsCustomSchedule(value: Boolean): Self = StObject.set(x, "supportsCustomSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsCustomScheduleUndefined: Self = StObject.set(x, "supportsCustomSchedule", js.undefined)
    
    @scala.inline
    def setSupportsMultipleTransfers(value: Boolean): Self = StObject.set(x, "supportsMultipleTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMultipleTransfersUndefined: Self = StObject.set(x, "supportsMultipleTransfers", js.undefined)
    
    @scala.inline
    def setTransferType(value: String): Self = StObject.set(x, "transferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferTypeUndefined: Self = StObject.set(x, "transferType", js.undefined)
    
    @scala.inline
    def setUpdateDeadlineSeconds(value: Double): Self = StObject.set(x, "updateDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeadlineSecondsUndefined: Self = StObject.set(x, "updateDeadlineSeconds", js.undefined)
  }
}
