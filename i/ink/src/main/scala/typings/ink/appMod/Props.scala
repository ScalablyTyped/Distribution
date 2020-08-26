package typings.ink.appMod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.ReactNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  val children: ReactNode = js.native
  val exitOnCtrlC: Boolean = js.native
  val stderr: WriteStream = js.native
  val stdin: ReadStream = js.native
  val stdout: WriteStream = js.native
  def onExit(): Unit = js.native
  def onExit(error: Error): Unit = js.native
  def writeToStderr(data: String): Unit = js.native
  def writeToStdout(data: String): Unit = js.native
}

