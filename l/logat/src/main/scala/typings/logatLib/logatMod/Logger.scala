package typings
package logatLib.logatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger
  extends nodeLib.NodeJSNs.EventEmitter {
  def debug(args: js.Any*): scala.Unit = js.native
  def error(args: js.Any*): scala.Unit = js.native
  def getOptions(): LogOptionsI = js.native
  def info(args: js.Any*): scala.Unit = js.native
  def setOptions(options: LogOptionsI): scala.Unit = js.native
  def warn(args: js.Any*): scala.Unit = js.native
}

