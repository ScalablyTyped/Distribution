package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Brief description of the live stream status.
  */
trait SchemaLiveStreamStatus extends StObject {
  
  /**
    * The health status of the stream.
    */
  var healthStatus: js.UndefOr[SchemaLiveStreamHealthStatus] = js.undefined
  
  var streamStatus: js.UndefOr[String] = js.undefined
}
object SchemaLiveStreamStatus {
  
  @scala.inline
  def apply(): SchemaLiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamStatus]
  }
  
  @scala.inline
  implicit class SchemaLiveStreamStatusMutableBuilder[Self <: SchemaLiveStreamStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: SchemaLiveStreamHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setStreamStatus(value: String): Self = StObject.set(x, "streamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamStatusUndefined: Self = StObject.set(x, "streamStatus", js.undefined)
  }
}
