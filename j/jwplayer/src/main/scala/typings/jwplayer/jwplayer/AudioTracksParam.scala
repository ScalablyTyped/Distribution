package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTracksParam extends StObject {
  
  var levels: js.Array[Any]
}
object AudioTracksParam {
  
  inline def apply(levels: js.Array[Any]): AudioTracksParam = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTracksParam]
  }
  
  extension [Self <: AudioTracksParam](x: Self) {
    
    inline def setLevels(value: js.Array[Any]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Any*): Self = StObject.set(x, "levels", js.Array(value*))
  }
}
