package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "rmdir")
@js.native
object rmdir extends js.Object {
  def apply(path: String): ^[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ js.Any, Unit]): ^[Unit] = js.native
}

