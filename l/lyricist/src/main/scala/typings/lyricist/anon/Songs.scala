package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Songs extends StObject {
  
  var songs: js.Array[Any]
  
  var `type`: String
}
object Songs {
  
  inline def apply(songs: js.Array[Any], `type`: String): Songs = {
    val __obj = js.Dynamic.literal(songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Songs]
  }
  
  extension [Self <: Songs](x: Self) {
    
    inline def setSongs(value: js.Array[Any]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsVarargs(value: Any*): Self = StObject.set(x, "songs", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
