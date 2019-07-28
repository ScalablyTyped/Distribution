package typings.gulpDashShell.gulpDashShellMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shell extends js.Object {
  def apply(commands: String): ReadWriteStream = js.native
  def apply(commands: String, options: Option): ReadWriteStream = js.native
  def apply(commands: js.Array[String]): ReadWriteStream = js.native
  def apply(commands: js.Array[String], options: Option): ReadWriteStream = js.native
  def task(commands: String): js.Function1[/* done */ js.Function, ReadWriteStream] = js.native
  def task(commands: String, options: Option): js.Function1[/* done */ js.Function, ReadWriteStream] = js.native
  def task(commands: js.Array[String]): js.Function1[/* done */ js.Function, ReadWriteStream] = js.native
  def task(commands: js.Array[String], options: Option): js.Function1[/* done */ js.Function, ReadWriteStream] = js.native
}

