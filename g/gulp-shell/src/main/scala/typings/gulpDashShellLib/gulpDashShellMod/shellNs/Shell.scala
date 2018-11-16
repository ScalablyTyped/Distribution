package typings
package gulpDashShellLib.gulpDashShellMod.shellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shell extends js.Object {
  def apply(commands: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(commands: java.lang.String, options: Option): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(commands: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(commands: js.Array[java.lang.String], options: Option): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def task(commands: java.lang.String): js.Function1[/* done */ js.Function, nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def task(commands: java.lang.String, options: Option): js.Function1[/* done */ js.Function, nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def task(commands: js.Array[java.lang.String]): js.Function1[/* done */ js.Function, nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def task(commands: js.Array[java.lang.String], options: Option): js.Function1[/* done */ js.Function, nodeLib.NodeJSNs.ReadWriteStream] = js.native
}

