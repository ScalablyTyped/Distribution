package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeNormalizedObject extends js.Object {
  
  /**
    * The count.
    */
  var count: Double = js.native
  
  /**
    * The interval in axis values (ms).
    */
  var unitRange: Double = js.native
}
object TimeNormalizedObject {
  
  @scala.inline
  def apply(count: Double, unitRange: Double): TimeNormalizedObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeNormalizedObject]
  }
  
  @scala.inline
  implicit class TimeNormalizedObjectOps[Self <: TimeNormalizedObject] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitRange(value: Double): Self = this.set("unitRange", value.asInstanceOf[js.Any])
  }
}
