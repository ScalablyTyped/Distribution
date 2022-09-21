package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingOptions extends StObject {
  
  var dropboxToken: js.UndefOr[String] = js.undefined
  
  var mode: RecordingMode
  
  var rtmpBroadcastID: js.UndefOr[String] = js.undefined
  
  var rtmpStreamKey: js.UndefOr[String] = js.undefined
  
  var shouldShare: js.UndefOr[Boolean] = js.undefined
  
  var youtubeBroadcastID: js.UndefOr[String] = js.undefined
  
  var youtubeStreamKey: js.UndefOr[String] = js.undefined
}
object RecordingOptions {
  
  inline def apply(mode: RecordingMode): RecordingOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
  
  extension [Self <: RecordingOptions](x: Self) {
    
    inline def setDropboxToken(value: String): Self = StObject.set(x, "dropboxToken", value.asInstanceOf[js.Any])
    
    inline def setDropboxTokenUndefined: Self = StObject.set(x, "dropboxToken", js.undefined)
    
    inline def setMode(value: RecordingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRtmpBroadcastID(value: String): Self = StObject.set(x, "rtmpBroadcastID", value.asInstanceOf[js.Any])
    
    inline def setRtmpBroadcastIDUndefined: Self = StObject.set(x, "rtmpBroadcastID", js.undefined)
    
    inline def setRtmpStreamKey(value: String): Self = StObject.set(x, "rtmpStreamKey", value.asInstanceOf[js.Any])
    
    inline def setRtmpStreamKeyUndefined: Self = StObject.set(x, "rtmpStreamKey", js.undefined)
    
    inline def setShouldShare(value: Boolean): Self = StObject.set(x, "shouldShare", value.asInstanceOf[js.Any])
    
    inline def setShouldShareUndefined: Self = StObject.set(x, "shouldShare", js.undefined)
    
    inline def setYoutubeBroadcastID(value: String): Self = StObject.set(x, "youtubeBroadcastID", value.asInstanceOf[js.Any])
    
    inline def setYoutubeBroadcastIDUndefined: Self = StObject.set(x, "youtubeBroadcastID", js.undefined)
    
    inline def setYoutubeStreamKey(value: String): Self = StObject.set(x, "youtubeStreamKey", value.asInstanceOf[js.Any])
    
    inline def setYoutubeStreamKeyUndefined: Self = StObject.set(x, "youtubeStreamKey", js.undefined)
  }
}
