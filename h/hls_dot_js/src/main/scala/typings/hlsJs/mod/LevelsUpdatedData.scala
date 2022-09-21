package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelsUpdatedData extends StObject {
  
  var levels: js.Array[Level]
}
object LevelsUpdatedData {
  
  inline def apply(levels: js.Array[Level]): LevelsUpdatedData = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsUpdatedData]
  }
  
  extension [Self <: LevelsUpdatedData](x: Self) {
    
    inline def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value*))
  }
}
