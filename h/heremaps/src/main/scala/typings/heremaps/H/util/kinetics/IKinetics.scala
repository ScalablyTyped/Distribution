package typings.heremaps.H.util.kinetics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface defines kinetic move parameters used by map for kinetic drag.
  * @property power {number} - Power multiplier. Multiplier is used to increase the speed of the kinetic move. By default map uses 1.
  * @property duration {number} - Defines duration of the kinetic move.
  */
@js.native
trait IKinetics extends js.Object {
  
  var duration: Double = js.native
  
  /**
    * Easing function modifies animation progress. In example it can modify the animation in a way it starts rapidly and then slows down at the end.
    * @param p {number} - current progress
    * @returns {number} - modified progress
    */
  def ease(p: Double): Double = js.native
  
  var power: Double = js.native
}
object IKinetics {
  
  @scala.inline
  def apply(duration: Double, ease: Double => Double, power: Double): IKinetics = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKinetics]
  }
  
  @scala.inline
  implicit class IKineticsOps[Self <: IKinetics] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEase(value: Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
  }
}
