package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITelemetry extends js.Object {
  def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit] = js.native
}

object ITelemetry {
  @scala.inline
  def apply(sendCommand: (String, js.Array[String]) => js.Promise[Unit]): ITelemetry = {
    val __obj = js.Dynamic.literal(sendCommand = js.Any.fromFunction2(sendCommand))
    __obj.asInstanceOf[ITelemetry]
  }
  @scala.inline
  implicit class ITelemetryOps[Self <: ITelemetry] (val x: Self) extends AnyVal {
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
    def setSendCommand(value: (String, js.Array[String]) => js.Promise[Unit]): Self = this.set("sendCommand", js.Any.fromFunction2(value))
  }
  
}

