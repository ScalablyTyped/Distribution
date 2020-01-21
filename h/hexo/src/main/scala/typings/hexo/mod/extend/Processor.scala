package typings.hexo.mod.extend

import typings.hexo.mod.Box.File
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor extends js.Object {
  def register(fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: js.Function1[/* str */ String, _], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
}

