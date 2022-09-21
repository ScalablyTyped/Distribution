package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelPTSUpdatedData extends StObject {
  
  var details: LevelDetails
  
  var drift: Double
  
  var end: Double
  
  var frag: Fragment
  
  var level: Level
  
  var start: Double
  
  var `type`: String
}
object LevelPTSUpdatedData {
  
  inline def apply(
    details: LevelDetails,
    drift: Double,
    end: Double,
    frag: Fragment,
    level: Level,
    start: Double,
    `type`: String
  ): LevelPTSUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], drift = drift.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelPTSUpdatedData]
  }
  
  extension [Self <: LevelPTSUpdatedData](x: Self) {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDrift(value: Double): Self = StObject.set(x, "drift", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
