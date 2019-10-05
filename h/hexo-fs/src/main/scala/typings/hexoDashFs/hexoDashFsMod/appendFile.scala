package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(path: String, data: js.Any): ^[Unit] = js.native
  def apply(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): ^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String): ^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): ^[Unit] = js.native
  def apply(path: String, data: js.Any, options: AppendFileOptions): ^[Unit] = js.native
  def apply(
    path: String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): ^[Unit] = js.native
}

