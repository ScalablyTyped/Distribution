package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTracksUpdatedData extends StObject {
  
  var audioTracks: js.Array[MediaPlaylist]
}
object AudioTracksUpdatedData {
  
  inline def apply(audioTracks: js.Array[MediaPlaylist]): AudioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTracksUpdatedData]
  }
  
  extension [Self <: AudioTracksUpdatedData](x: Self) {
    
    inline def setAudioTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "audioTracks", js.Array(value*))
  }
}
