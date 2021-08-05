package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fpsDropLevelCappingData extends StObject {
  
  var droppedLevel: Level
  
  var level: Level
}
object fpsDropLevelCappingData {
  
  inline def apply(droppedLevel: Level, level: Level): fpsDropLevelCappingData = {
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropLevelCappingData]
  }
  
  extension [Self <: fpsDropLevelCappingData](x: Self) {
    
    inline def setDroppedLevel(value: Level): Self = StObject.set(x, "droppedLevel", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
