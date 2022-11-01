package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeTicksInfoObject
  extends StObject
     with TimeNormalizedObject {
  
  var higherRanks: js.Array[String]
  
  var totalRange: Double
}
object TimeTicksInfoObject {
  
  inline def apply(higherRanks: js.Array[String], totalRange: Double, unitRange: Double): TimeTicksInfoObject = {
    val __obj = js.Dynamic.literal(higherRanks = higherRanks.asInstanceOf[js.Any], totalRange = totalRange.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTicksInfoObject]
  }
  
  extension [Self <: TimeTicksInfoObject](x: Self) {
    
    inline def setHigherRanks(value: js.Array[String]): Self = StObject.set(x, "higherRanks", value.asInstanceOf[js.Any])
    
    inline def setHigherRanksVarargs(value: String*): Self = StObject.set(x, "higherRanks", js.Array(value*))
    
    inline def setTotalRange(value: Double): Self = StObject.set(x, "totalRange", value.asInstanceOf[js.Any])
  }
}
