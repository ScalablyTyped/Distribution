package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSDropLevelCappingData extends StObject {
  
  var droppedLevel: Double
  
  var level: Double
}
object FPSDropLevelCappingData {
  
  inline def apply(droppedLevel: Double, level: Double): FPSDropLevelCappingData = {
    val __obj = js.Dynamic.literal(droppedLevel = droppedLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSDropLevelCappingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FPSDropLevelCappingData] (val x: Self) extends AnyVal {
    
    inline def setDroppedLevel(value: Double): Self = StObject.set(x, "droppedLevel", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
