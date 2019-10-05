package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.chokidar.chokidarMod.FSWatcher
import typings.chokidar.chokidarMod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): ^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): ^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): ^[FSWatcher] = js.native
  def apply(path: js.Array[String]): ^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): ^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): ^[FSWatcher] = js.native
}

