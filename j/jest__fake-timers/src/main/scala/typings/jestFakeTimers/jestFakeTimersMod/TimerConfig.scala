package typings.jestFakeTimers.jestFakeTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerConfig[Ref] extends js.Object {
  def idToRef(id: Double): Ref
  def refToId(ref: Ref): Double | Unit
}

object TimerConfig {
  @scala.inline
  def apply[Ref](idToRef: Double => Ref, refToId: Ref => Double | Unit): TimerConfig[Ref] = {
    val __obj = js.Dynamic.literal(idToRef = js.Any.fromFunction1(idToRef), refToId = js.Any.fromFunction1(refToId))
  
    __obj.asInstanceOf[TimerConfig[Ref]]
  }
}

