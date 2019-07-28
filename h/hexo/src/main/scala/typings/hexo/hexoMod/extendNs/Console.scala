package typings.hexo.hexoMod.extendNs

import typings.hexo.hexoMod.extendNs.ConsoleNs.Options
import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def register(name: String, desc: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, desc: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
}

