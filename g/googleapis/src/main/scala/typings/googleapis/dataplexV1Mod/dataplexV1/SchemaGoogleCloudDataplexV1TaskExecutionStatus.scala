package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskExecutionStatus extends StObject {
  
  /**
    * Output only. latest job execution
    */
  var latestJob: js.UndefOr[SchemaGoogleCloudDataplexV1Job] = js.undefined
  
  /**
    * Output only. Last update time of the status.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskExecutionStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskExecutionStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskExecutionStatus](x: Self) {
    
    inline def setLatestJob(value: SchemaGoogleCloudDataplexV1Job): Self = StObject.set(x, "latestJob", value.asInstanceOf[js.Any])
    
    inline def setLatestJobUndefined: Self = StObject.set(x, "latestJob", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
