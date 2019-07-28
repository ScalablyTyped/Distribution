package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger extends Logger {
  @JSName("ok")
  var ok_Original: LogFn = js.native
  @JSName("rawmsg")
  var rawmsg_Original: LogFn = js.native
  def ok(msg: String): Unit = js.native
  def rawmsg(msg: String): Unit = js.native
}

