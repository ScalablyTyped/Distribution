package typings.ink.focusMod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.ReactNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: ReactNode = js.native
  
  var exitOnCtrlC: Boolean = js.native
  
  def onExit(): Unit = js.native
  def onExit(error: Error): Unit = js.native
  
  var stderr: WriteStream = js.native
  
  var stdin: ReadStream = js.native
  
  var stdout: WriteStream = js.native
  
  def writeToStderr(data: String): Unit = js.native
  
  def writeToStdout(data: String): Unit = js.native
}
