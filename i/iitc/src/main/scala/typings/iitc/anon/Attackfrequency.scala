package typings.iitc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attackfrequency extends js.Object {
  
  var attack_frequency: Double = js.native
  
  var force_amplifier: Double = js.native
  
  var hit_bonus: Double = js.native
}
object Attackfrequency {
  
  @scala.inline
  def apply(attack_frequency: Double, force_amplifier: Double, hit_bonus: Double): Attackfrequency = {
    val __obj = js.Dynamic.literal(attack_frequency = attack_frequency.asInstanceOf[js.Any], force_amplifier = force_amplifier.asInstanceOf[js.Any], hit_bonus = hit_bonus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attackfrequency]
  }
  
  @scala.inline
  implicit class AttackfrequencyOps[Self <: Attackfrequency] (val x: Self) extends AnyVal {
    
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
    def setAttack_frequency(value: Double): Self = this.set("attack_frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce_amplifier(value: Double): Self = this.set("force_amplifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHit_bonus(value: Double): Self = this.set("hit_bonus", value.asInstanceOf[js.Any])
  }
}
