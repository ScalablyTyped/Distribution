package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait levelSwitchedData extends StObject {
  
  var level: Double
}
object levelSwitchedData {
  
  inline def apply(level: Double): levelSwitchedData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelSwitchedData]
  }
  
  extension [Self <: levelSwitchedData](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
