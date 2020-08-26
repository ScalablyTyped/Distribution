package typings.jestEnvironmentPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timer extends js.Object {
  var id: Double = js.native
  def ref(): Timer = js.native
  def unref(): Timer = js.native
}

object Timer {
  @scala.inline
  def apply(id: Double, ref: () => Timer, unref: () => Timer): Timer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: () => Timer): Self = this.set("ref", js.Any.fromFunction0(value))
    @scala.inline
    def setUnref(value: () => Timer): Self = this.set("unref", js.Any.fromFunction0(value))
  }
  
}

