package typings.ioredis.mod

import typings.ioredis.anon.Lua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commander extends js.Object {
  def createBuiltinCommand(commandName: String): js.Object = js.native
  def defineCommand(name: String, definition: Lua): Unit = js.native
  def getBuiltinCommands(): js.Array[String] = js.native
  def sendCommand(): Unit = js.native
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: String => js.Object,
    defineCommand: (String, Lua) => Unit,
    getBuiltinCommands: () => js.Array[String],
    sendCommand: () => Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
    __obj.asInstanceOf[Commander]
  }
  @scala.inline
  implicit class CommanderOps[Self <: Commander] (val x: Self) extends AnyVal {
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
    def setCreateBuiltinCommand(value: String => js.Object): Self = this.set("createBuiltinCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setDefineCommand(value: (String, Lua) => Unit): Self = this.set("defineCommand", js.Any.fromFunction2(value))
    @scala.inline
    def setGetBuiltinCommands(value: () => js.Array[String]): Self = this.set("getBuiltinCommands", js.Any.fromFunction0(value))
    @scala.inline
    def setSendCommand(value: () => Unit): Self = this.set("sendCommand", js.Any.fromFunction0(value))
  }
  
}

