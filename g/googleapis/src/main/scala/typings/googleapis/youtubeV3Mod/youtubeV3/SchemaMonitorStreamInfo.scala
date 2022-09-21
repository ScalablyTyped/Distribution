package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitorStreamInfo extends StObject {
  
  /**
    * If you have set the enableMonitorStream property to true, then this property determines the length of the live broadcast delay.
    */
  var broadcastStreamDelayMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * HTML code that embeds a player that plays the monitor stream.
    */
  var embedHtml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value determines whether the monitor stream is enabled for the broadcast. If the monitor stream is enabled, then YouTube will broadcast the event content on a special stream intended only for the broadcaster's consumption. The broadcaster can use the stream to review the event content and also to identify the optimal times to insert cuepoints. You need to set this value to true if you intend to have a broadcast delay for your event. *Note:* This property cannot be updated once the broadcast is in the testing or live state.
    */
  var enableMonitorStream: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMonitorStreamInfo {
  
  inline def apply(): SchemaMonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitorStreamInfo]
  }
  
  extension [Self <: SchemaMonitorStreamInfo](x: Self) {
    
    inline def setBroadcastStreamDelayMs(value: Double): Self = StObject.set(x, "broadcastStreamDelayMs", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStreamDelayMsNull: Self = StObject.set(x, "broadcastStreamDelayMs", null)
    
    inline def setBroadcastStreamDelayMsUndefined: Self = StObject.set(x, "broadcastStreamDelayMs", js.undefined)
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlNull: Self = StObject.set(x, "embedHtml", null)
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    inline def setEnableMonitorStream(value: Boolean): Self = StObject.set(x, "enableMonitorStream", value.asInstanceOf[js.Any])
    
    inline def setEnableMonitorStreamNull: Self = StObject.set(x, "enableMonitorStream", null)
    
    inline def setEnableMonitorStreamUndefined: Self = StObject.set(x, "enableMonitorStream", js.undefined)
  }
}
