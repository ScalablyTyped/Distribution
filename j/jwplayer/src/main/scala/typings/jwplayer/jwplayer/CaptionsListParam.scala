package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionsListParam extends StObject {
  
  var tracks: js.Array[Any]
}
object CaptionsListParam {
  
  inline def apply(tracks: js.Array[Any]): CaptionsListParam = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsListParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptionsListParam] (val x: Self) extends AnyVal {
    
    inline def setTracks(value: js.Array[Any]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: Any*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
