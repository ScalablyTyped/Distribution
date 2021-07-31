package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Songs extends StObject {
  
  var songs: js.Array[js.Any]
  
  var `type`: String
}
object Songs {
  
  @scala.inline
  def apply(songs: js.Array[js.Any], `type`: String): Songs = {
    val __obj = js.Dynamic.literal(songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Songs]
  }
  
  @scala.inline
  implicit class SongsMutableBuilder[Self <: Songs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSongs(value: js.Array[js.Any]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSongsVarargs(value: js.Any*): Self = StObject.set(x, "songs", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
