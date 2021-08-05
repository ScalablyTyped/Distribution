package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait levelPtsUpdatedData extends StObject {
  
  var details: LevelDetails
  
  var drift: Double
  
  var level: Double
}
object levelPtsUpdatedData {
  
  inline def apply(details: LevelDetails, drift: Double, level: Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], drift = drift.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
  
  extension [Self <: levelPtsUpdatedData](x: Self) {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDrift(value: Double): Self = StObject.set(x, "drift", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
