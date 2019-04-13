package typings
package hexoLib.hexoMod.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def register(
    name: java.lang.String,
    desc: java.lang.String,
    fn: js.Function1[/* args */ minimistLib.minimistMod.ParsedArgs, scala.Unit]
  ): scala.Unit = js.native
  def register(
    name: java.lang.String,
    desc: java.lang.String,
    options: hexoLib.hexoMod.extendNs.ConsoleNs.Options,
    fn: js.Function1[/* args */ minimistLib.minimistMod.ParsedArgs, scala.Unit]
  ): scala.Unit = js.native
  def register(
    name: java.lang.String,
    fn: js.Function1[/* args */ minimistLib.minimistMod.ParsedArgs, scala.Unit]
  ): scala.Unit = js.native
  def register(
    name: java.lang.String,
    options: hexoLib.hexoMod.extendNs.ConsoleNs.Options,
    fn: js.Function1[/* args */ minimistLib.minimistMod.ParsedArgs, scala.Unit]
  ): scala.Unit = js.native
}

