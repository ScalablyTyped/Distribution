package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStreamHealthStatus extends StObject {
  
  /**
    * The configurations issues on this stream
    */
  var configurationIssues: js.UndefOr[js.Array[SchemaLiveStreamConfigurationIssue]] = js.undefined
  
  /**
    * The last time this status was updated (in seconds)
    */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.undefined
  
  /**
    * The status code of this stream
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaLiveStreamHealthStatus {
  
  inline def apply(): SchemaLiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamHealthStatus]
  }
  
  extension [Self <: SchemaLiveStreamHealthStatus](x: Self) {
    
    inline def setConfigurationIssues(value: js.Array[SchemaLiveStreamConfigurationIssue]): Self = StObject.set(x, "configurationIssues", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIssuesUndefined: Self = StObject.set(x, "configurationIssues", js.undefined)
    
    inline def setConfigurationIssuesVarargs(value: SchemaLiveStreamConfigurationIssue*): Self = StObject.set(x, "configurationIssues", js.Array(value :_*))
    
    inline def setLastUpdateTimeSeconds(value: String): Self = StObject.set(x, "lastUpdateTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeSecondsUndefined: Self = StObject.set(x, "lastUpdateTimeSeconds", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
