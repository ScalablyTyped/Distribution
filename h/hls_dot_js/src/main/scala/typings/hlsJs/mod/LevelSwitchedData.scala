package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelSwitchedData extends StObject {
  
  var level: Double
}
object LevelSwitchedData {
  
  inline def apply(level: Double): LevelSwitchedData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelSwitchedData]
  }
  
  extension [Self <: LevelSwitchedData](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
