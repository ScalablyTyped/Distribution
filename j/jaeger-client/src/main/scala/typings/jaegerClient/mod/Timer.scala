package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timer extends js.Object {
  // Records the time passed in.
  def record(value: Double): Unit = js.native
}

object Timer {
  @scala.inline
  def apply(record: Double => Unit): Timer = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[Timer]
  }
  @scala.inline
  implicit class TimerOps[Self <: Timer] (val x: Self) extends AnyVal {
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
    def setRecord(value: Double => Unit): Self = this.set("record", js.Any.fromFunction1(value))
  }
  
}

