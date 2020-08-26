package typings.ionicCliFramework.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions extends js.Object {
  val msg: js.UndefOr[String] = js.native
  val tickInterval: js.UndefOr[Double] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(): TaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions] (val x: Self) extends AnyVal {
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
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setTickInterval(value: Double): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
  }
  
}

