package typings.iitc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Burnout extends js.Object {
  
  var burnout: Double = js.native
  
  var cooldown: Double = js.native
  
  var hacks: Double = js.native
}
object Burnout {
  
  @scala.inline
  def apply(burnout: Double, cooldown: Double, hacks: Double): Burnout = {
    val __obj = js.Dynamic.literal(burnout = burnout.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hacks = hacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Burnout]
  }
  
  @scala.inline
  implicit class BurnoutOps[Self <: Burnout] (val x: Self) extends AnyVal {
    
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
    def setBurnout(value: Double): Self = this.set("burnout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: Double): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHacks(value: Double): Self = this.set("hacks", value.asInstanceOf[js.Any])
  }
}
