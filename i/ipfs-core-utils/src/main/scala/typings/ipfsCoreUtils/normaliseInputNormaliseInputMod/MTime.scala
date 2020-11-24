package typings.ipfsCoreUtils.normaliseInputNormaliseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MTime extends js.Object {
  
  /**
    * - the number of nanoseconds since the last full
    * second.
    */
  var nsecs: Double = js.native
  
  /**
    * - the number of seconds since (positive) or before
    * (negative) the Unix Epoch began
    */
  var secs: Double = js.native
}
object MTime {
  
  @scala.inline
  def apply(nsecs: Double, secs: Double): MTime = {
    val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MTime]
  }
  
  @scala.inline
  implicit class MTimeOps[Self <: MTime] (val x: Self) extends AnyVal {
    
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
    def setNsecs(value: Double): Self = this.set("nsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecs(value: Double): Self = this.set("secs", value.asInstanceOf[js.Any])
  }
}
