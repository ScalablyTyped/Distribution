package typings.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(path: String, data: js.Any): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: AppendFileOptions): typings.bluebird.mod.^[Unit] = js.native
  def apply(
    path: String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typings.bluebird.mod.^[Unit] = js.native
}

