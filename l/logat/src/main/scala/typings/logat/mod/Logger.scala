package typings.logat.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends EventEmitter {
  
  def debug(args: js.Any*): Unit = js.native
  
  def error(args: js.Any*): Unit = js.native
  
  def getOptions(): LogOptionsI = js.native
  
  def info(args: js.Any*): Unit = js.native
  
  def setOptions(options: LogOptionsI): Unit = js.native
  
  def warn(args: js.Any*): Unit = js.native
}
