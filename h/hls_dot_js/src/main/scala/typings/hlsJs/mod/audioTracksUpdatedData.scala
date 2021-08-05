package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait audioTracksUpdatedData extends StObject {
  
  var audioTracks: js.Array[HlsAudioTrack]
}
object audioTracksUpdatedData {
  
  inline def apply(audioTracks: js.Array[HlsAudioTrack]): audioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTracksUpdatedData]
  }
  
  extension [Self <: audioTracksUpdatedData](x: Self) {
    
    inline def setAudioTracks(value: js.Array[HlsAudioTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: HlsAudioTrack*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
  }
}
