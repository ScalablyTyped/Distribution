package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleTracksUpdatedData extends StObject {
  
  var subtitleTracks: js.Array[MediaPlaylist]
}
object SubtitleTracksUpdatedData {
  
  inline def apply(subtitleTracks: js.Array[MediaPlaylist]): SubtitleTracksUpdatedData = {
    val __obj = js.Dynamic.literal(subtitleTracks = subtitleTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtitleTracksUpdatedData]
  }
  
  extension [Self <: SubtitleTracksUpdatedData](x: Self) {
    
    inline def setSubtitleTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "subtitleTracks", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "subtitleTracks", js.Array(value*))
  }
}
