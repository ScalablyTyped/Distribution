package typings.luminoPolling.mod.IPoll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of poll state at any given time.
  *
  * @typeparam T - The resolved type of the factory's promises.
  *
  * @typeparam U - The rejected type of the factory's promises.
  *
  * @typeparam V - The type to extend the phases supported by a poll.
  */
@js.native
trait State[T, U, V /* <: String */] extends js.Object {
  
  /**
    * The number of milliseconds until the current tick resolves.
    */
  val interval: Double = js.native
  
  /**
    * The payload of the last poll resolution or rejection.
    *
    * #### Notes
    * The payload is `null` unless the `phase` is `'reconnected`, `'resolved'`,
    * or `'rejected'`. Its type is `T` for resolutions and `U` for rejections.
    */
  val payload: T | U | Null = js.native
  
  /**
    * The current poll phase.
    */
  val phase: Phase[V] = js.native
  
  /**
    * The timestamp for when this tick was scheduled.
    */
  val timestamp: Double = js.native
}
object State {
  
  @scala.inline
  def apply[T, U, V /* <: String */](interval: Double, phase: Phase[V], timestamp: Double): State[T, U, V] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T, U, V]]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State[_, _, _], T, U, V /* <: String */] (val x: Self with (State[T, U, V])) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: Phase[V]): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: T | U): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNull: Self = this.set("payload", null)
  }
}
