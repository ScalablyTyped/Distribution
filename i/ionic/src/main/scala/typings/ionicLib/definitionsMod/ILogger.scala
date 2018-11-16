package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger
  extends atIonicCliDashFrameworkLib.cliDashFrameworkMod.Logger {
  @JSName("ok")
  var ok_Original: LogFn = js.native
  @JSName("rawmsg")
  var rawmsg_Original: LogFn = js.native
  def ok(msg: java.lang.String): scala.Unit = js.native
  def rawmsg(msg: java.lang.String): scala.Unit = js.native
}

