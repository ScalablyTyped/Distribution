package typings.highcharts.mod

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
  implicit class TimeTicksInfoObjectOps[Self <: TimeTicksInfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHigherRanksVarargs(value: String*): Self = this.set("higherRanks", js.Array(value :_*))
    
    @scala.inline
    def setHigherRanks(value: js.Array[String]): Self = this.set("higherRanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRange(value: Double): Self = this.set("totalRange", value.asInstanceOf[js.Any])
  }
}
