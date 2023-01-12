package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonNativeTextTrack extends StObject {
  
  var default: Boolean
  
  var _id: js.UndefOr[String] = js.undefined
  
  var closedCaptions: js.UndefOr[MediaPlaylist] = js.undefined
  
  var kind: String
  
  var label: Any
  
  var subtitleTrack: js.UndefOr[MediaPlaylist] = js.undefined
}
object NonNativeTextTrack {
  
  inline def apply(default: Boolean, kind: String, label: Any): NonNativeTextTrack = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNativeTextTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonNativeTextTrack] (val x: Self) extends AnyVal {
    
    inline def setClosedCaptions(value: MediaPlaylist): Self = StObject.set(x, "closedCaptions", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsUndefined: Self = StObject.set(x, "closedCaptions", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTrack(value: MediaPlaylist): Self = StObject.set(x, "subtitleTrack", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTrackUndefined: Self = StObject.set(x, "subtitleTrack", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
