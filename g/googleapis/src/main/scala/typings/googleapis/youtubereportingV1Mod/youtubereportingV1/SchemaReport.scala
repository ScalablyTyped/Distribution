package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A report&#39;s metadata including the URL from which the report itself can
  * be downloaded.
  */
@js.native
trait SchemaReport extends StObject {
  
  /**
    * The date/time when this report was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The URL from which the report can be downloaded (max. 1000 characters).
    */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /**
    * The end of the time period that the report instance covers. The value is
    * exclusive.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The server-generated ID of the report.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The date/time when the job this report belongs to will expire/expired.
    */
  var jobExpireTime: js.UndefOr[String] = js.native
  
  /**
    * The ID of the job that created this report.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The start of the time period that the report instance covers. The value
    * is inclusive.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaReport {
  
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  @scala.inline
  implicit class SchemaReportMutableBuilder[Self <: SchemaReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobExpireTime(value: String): Self = StObject.set(x, "jobExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExpireTimeUndefined: Self = StObject.set(x, "jobExpireTime", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
