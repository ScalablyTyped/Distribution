package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelsParam extends StObject {
  
  var levels: js.Array[Any]
  
  var width: Double
}
object LevelsParam {
  
  inline def apply(levels: js.Array[Any], width: Double): LevelsParam = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsParam]
  }
  
  extension [Self <: LevelsParam](x: Self) {
    
    inline def setLevels(value: js.Array[Any]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Any*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
