package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commander extends js.Object {
  def createBuiltinCommand(commandName: java.lang.String): js.Object
  def defineCommand(name: java.lang.String, definition: ioredisLib.Anon_Lua): js.Any
  def getBuiltinCommands(): js.Array[java.lang.String]
  def sendCommand(): scala.Unit
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: js.Function1[java.lang.String, js.Object],
    defineCommand: js.Function2[java.lang.String, ioredisLib.Anon_Lua, js.Any],
    getBuiltinCommands: js.Function0[js.Array[java.lang.String]],
    sendCommand: js.Function0[scala.Unit]
  ): Commander = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBuiltinCommand")(createBuiltinCommand)
    __obj.updateDynamic("defineCommand")(defineCommand)
    __obj.updateDynamic("getBuiltinCommands")(getBuiltinCommands)
    __obj.updateDynamic("sendCommand")(sendCommand)
    __obj.asInstanceOf[Commander]
  }
}

