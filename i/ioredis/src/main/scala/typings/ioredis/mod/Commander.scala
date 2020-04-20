package typings.ioredis.mod

import typings.ioredis.AnonLua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commander extends js.Object {
  def createBuiltinCommand(commandName: String): js.Object
  def defineCommand(name: String, definition: AnonLua): Unit
  def getBuiltinCommands(): js.Array[String]
  def sendCommand(): Unit
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: String => js.Object,
    defineCommand: (String, AnonLua) => Unit,
    getBuiltinCommands: () => js.Array[String],
    sendCommand: () => Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
    __obj.asInstanceOf[Commander]
  }
}

