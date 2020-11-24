package typings.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JalCalResult extends js.Object {
  
  /** Gregorian year of the beginning of Jalaali year */
  var gy: Double = js.native
  
  /** Number of years since the last leap year (0 to 4) */
  var leap: Double = js.native
  
  /** The March day of Farvardin the 1st (1st day of jy) */
  var march: Double = js.native
}
object JalCalResult {
  
  @scala.inline
  def apply(gy: Double, leap: Double, march: Double): JalCalResult = {
    val __obj = js.Dynamic.literal(gy = gy.asInstanceOf[js.Any], leap = leap.asInstanceOf[js.Any], march = march.asInstanceOf[js.Any])
    __obj.asInstanceOf[JalCalResult]
  }
  
  @scala.inline
  implicit class JalCalResultOps[Self <: JalCalResult] (val x: Self) extends AnyVal {
    
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
    def setGy(value: Double): Self = this.set("gy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeap(value: Double): Self = this.set("leap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarch(value: Double): Self = this.set("march", value.asInstanceOf[js.Any])
  }
}
