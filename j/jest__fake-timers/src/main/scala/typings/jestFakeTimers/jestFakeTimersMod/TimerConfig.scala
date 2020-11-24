package typings.jestFakeTimers.jestFakeTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerConfig[Ref] extends js.Object {
  
  def idToRef(id: Double): Ref = js.native
  
  def refToId(ref: Ref): Double | Unit = js.native
}
object TimerConfig {
  
  @scala.inline
  def apply[Ref](idToRef: Double => Ref, refToId: Ref => Double | Unit): TimerConfig[Ref] = {
    val __obj = js.Dynamic.literal(idToRef = js.Any.fromFunction1(idToRef), refToId = js.Any.fromFunction1(refToId))
    __obj.asInstanceOf[TimerConfig[Ref]]
  }
  
  @scala.inline
  implicit class TimerConfigOps[Self <: TimerConfig[_], Ref] (val x: Self with TimerConfig[Ref]) extends AnyVal {
    
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
    def setIdToRef(value: Double => Ref): Self = this.set("idToRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefToId(value: Ref => Double | Unit): Self = this.set("refToId", js.Any.fromFunction1(value))
  }
}
