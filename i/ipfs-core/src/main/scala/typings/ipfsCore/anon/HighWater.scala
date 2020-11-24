package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighWater extends js.Object {
  
  var HighWater: Double = js.native
  
  var LowWater: Double = js.native
}
object HighWater {
  
  @scala.inline
  def apply(HighWater: Double, LowWater: Double): HighWater = {
    val __obj = js.Dynamic.literal(HighWater = HighWater.asInstanceOf[js.Any], LowWater = LowWater.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighWater]
  }
  
  @scala.inline
  implicit class HighWaterOps[Self <: HighWater] (val x: Self) extends AnyVal {
    
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
    def setHighWater(value: Double): Self = this.set("HighWater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowWater(value: Double): Self = this.set("LowWater", value.asInstanceOf[js.Any])
  }
}
