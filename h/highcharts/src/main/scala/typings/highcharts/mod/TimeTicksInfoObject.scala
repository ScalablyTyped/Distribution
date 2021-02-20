package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeTicksInfoObject extends TimeNormalizedObject {
  
  var higherRanks: js.Array[String] = js.native
  
  var totalRange: Double = js.native
}
object TimeTicksInfoObject {
  
  @scala.inline
  def apply(count: Double, higherRanks: js.Array[String], totalRange: Double, unitRange: Double): TimeTicksInfoObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], higherRanks = higherRanks.asInstanceOf[js.Any], totalRange = totalRange.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTicksInfoObject]
  }
  
  @scala.inline
  implicit class TimeTicksInfoObjectMutableBuilder[Self <: TimeTicksInfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigherRanks(value: js.Array[String]): Self = StObject.set(x, "higherRanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherRanksVarargs(value: String*): Self = StObject.set(x, "higherRanks", js.Array(value :_*))
    
    @scala.inline
    def setTotalRange(value: Double): Self = StObject.set(x, "totalRange", value.asInstanceOf[js.Any])
  }
}
