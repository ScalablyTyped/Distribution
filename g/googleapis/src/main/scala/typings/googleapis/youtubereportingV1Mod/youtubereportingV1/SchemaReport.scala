package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReport extends StObject {
  
  /**
    * The date/time when this report was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL from which the report can be downloaded (max. 1000 characters).
    */
  var downloadUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end of the time period that the report instance covers. The value is exclusive.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The server-generated ID of the report.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date/time when the job this report belongs to will expire/expired.
    */
  var jobExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the job that created this report.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start of the time period that the report instance covers. The value is inclusive.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaReport {
  
  inline def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  extension [Self <: SchemaReport](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlNull: Self = StObject.set(x, "downloadUrl", null)
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobExpireTime(value: String): Self = StObject.set(x, "jobExpireTime", value.asInstanceOf[js.Any])
    
    inline def setJobExpireTimeNull: Self = StObject.set(x, "jobExpireTime", null)
    
    inline def setJobExpireTimeUndefined: Self = StObject.set(x, "jobExpireTime", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
