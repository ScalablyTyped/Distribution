package typings.hexoDashFs.hexoDashFsMod

import typings.chokidar.chokidarMod.FSWatcher
import typings.chokidar.chokidarMod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: js.Array[String]): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
}

