package typings.imagemagick.mod

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemagick", "identify")
@js.native
object identify extends js.Object {
  var path: String = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error, /* features */ Features, Unit]): ChildProcess = js.native
  def apply(path: js.Array[_], callback: js.Function2[/* err */ Error, /* result */ String, Unit]): ChildProcess = js.native
}

