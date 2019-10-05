package typings.hexo.hexoMod.extend

import typings.hexo.hexoMod.extend.Console.Options
import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Console")
@js.native
trait Console_ extends js.Object {
  def register(name: String, desc: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, desc: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
  def register(name: String, options: Options, fn: js.Function1[/* args */ ParsedArgs, Unit]): Unit = js.native
}

