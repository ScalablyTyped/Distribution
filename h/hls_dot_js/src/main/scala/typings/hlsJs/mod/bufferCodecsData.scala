package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface mediaDetachingData {}
// interface mediaDetachedData {}
// interface bufferResetData {}
trait bufferCodecsData extends StObject {
  
  var tracks: Tracks
}
object bufferCodecsData {
  
  inline def apply(tracks: Tracks): bufferCodecsData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCodecsData]
  }
  
  extension [Self <: bufferCodecsData](x: Self) {
    
    inline def setTracks(value: Tracks): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
