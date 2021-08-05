package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionsListParam extends StObject {
  
  var tracks: js.Array[js.Any]
}
object CaptionsListParam {
  
  inline def apply(tracks: js.Array[js.Any]): CaptionsListParam = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsListParam]
  }
  
  extension [Self <: CaptionsListParam](x: Self) {
    
    inline def setTracks(value: js.Array[js.Any]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: js.Any*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
