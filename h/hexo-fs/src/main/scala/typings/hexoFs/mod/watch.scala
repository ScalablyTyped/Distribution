package typings.hexoFs.mod

import typings.chokidar.mod.FSWatcher
import typings.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): typings.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): typings.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String]): typings.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): typings.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.mod.^[FSWatcher] = js.native
}

