package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStreamStatus extends StObject {
  
  /**
    * The health status of the stream.
    */
  var healthStatus: js.UndefOr[SchemaLiveStreamHealthStatus] = js.undefined
  
  var streamStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveStreamStatus {
  
  inline def apply(): SchemaLiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamStatus]
  }
  
  extension [Self <: SchemaLiveStreamStatus](x: Self) {
    
    inline def setHealthStatus(value: SchemaLiveStreamHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setStreamStatus(value: String): Self = StObject.set(x, "streamStatus", value.asInstanceOf[js.Any])
    
    inline def setStreamStatusNull: Self = StObject.set(x, "streamStatus", null)
    
    inline def setStreamStatusUndefined: Self = StObject.set(x, "streamStatus", js.undefined)
  }
}
