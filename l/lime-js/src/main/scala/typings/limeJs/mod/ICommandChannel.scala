package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandChannel extends js.Object {
  def onCommand(command: Command): js.Any = js.native
  def sendCommand(command: Command): Unit = js.native
}

object ICommandChannel {
  @scala.inline
  def apply(onCommand: Command => js.Any, sendCommand: Command => Unit): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1(sendCommand))
    __obj.asInstanceOf[ICommandChannel]
  }
  @scala.inline
  implicit class ICommandChannelOps[Self <: ICommandChannel] (val x: Self) extends AnyVal {
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
    def setOnCommand(value: Command => js.Any): Self = this.set("onCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setSendCommand(value: Command => Unit): Self = this.set("sendCommand", js.Any.fromFunction1(value))
  }
  
}

