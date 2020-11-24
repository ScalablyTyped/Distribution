package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a query.
  */
@js.native
trait SchemaQuery extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#query&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Query metadata.
    */
  var metadata: js.UndefOr[SchemaQueryMetadata] = js.native
  
  /**
    * Query parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.native
  
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.native
  
  /**
    * The ending time for the data that is shown in the report. Note,
    * reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and
    * ignored otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  
  /**
    * The starting time for the data that is shown in the report. Note,
    * reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES
    * and ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  
  /**
    * Information on how often and when to run a query.
    */
  var schedule: js.UndefOr[SchemaQuerySchedule] = js.native
  
  /**
    * Canonical timezone code for report data time. Defaults to
    * America/New_York.
    */
  var timezoneCode: js.UndefOr[String] = js.native
}
object SchemaQuery {
  
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaQueryMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setParams(value: SchemaParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setQueryId(value: String): Self = this.set("queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryId: Self = this.set("queryId", js.undefined)
    
    @scala.inline
    def setReportDataEndTimeMs(value: String): Self = this.set("reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDataEndTimeMs: Self = this.set("reportDataEndTimeMs", js.undefined)
    
    @scala.inline
    def setReportDataStartTimeMs(value: String): Self = this.set("reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDataStartTimeMs: Self = this.set("reportDataStartTimeMs", js.undefined)
    
    @scala.inline
    def setSchedule(value: SchemaQuerySchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setTimezoneCode(value: String): Self = this.set("timezoneCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneCode: Self = this.set("timezoneCode", js.undefined)
  }
}
