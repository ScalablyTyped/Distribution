package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistParam extends StObject {
  
  var playlist: js.Array[Any]
}
object PlaylistParam {
  
  inline def apply(playlist: js.Array[Any]): PlaylistParam = {
    val __obj = js.Dynamic.literal(playlist = playlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistParam] (val x: Self) extends AnyVal {
    
    inline def setPlaylist(value: js.Array[Any]): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setPlaylistVarargs(value: Any*): Self = StObject.set(x, "playlist", js.Array(value*))
  }
}
