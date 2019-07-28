package typings.gulp.gulpMod

import typings.node.fsMod.FSWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchMethod extends js.Object {
  def apply(globs: Globs): FSWatcher = js.native
  def apply(globs: Globs, fn: typings.undertaker.undertakerMod.TaskFunction): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions, fn: typings.undertaker.undertakerMod.TaskFunction): FSWatcher = js.native
}

