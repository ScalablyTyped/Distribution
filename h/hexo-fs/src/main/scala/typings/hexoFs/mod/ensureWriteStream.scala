package typings.hexoFs.mod

import typings.hexoFs.AnonAutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStream")
@js.native
object ensureWriteStream extends js.Object {
  def apply(path: String): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[typings.gracefulFs.mod.WriteStream], Unit]
  ): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: String): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[typings.gracefulFs.mod.WriteStream], Unit]
  ): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: AnonAutoClose): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: AnonAutoClose,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[typings.gracefulFs.mod.WriteStream], Unit]
  ): typings.bluebird.mod.^[typings.gracefulFs.mod.WriteStream] = js.native
}

