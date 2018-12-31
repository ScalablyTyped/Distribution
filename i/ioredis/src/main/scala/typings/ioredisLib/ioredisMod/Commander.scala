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

