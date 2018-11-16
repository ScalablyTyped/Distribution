package typings
package gulpLib.gulpMod.GulpClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchMethod extends js.Object {
  def apply(globs: Globs): nodeLib.fsMod.FSWatcher = js.native
  def apply(globs: Globs, fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction): nodeLib.fsMod.FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions): nodeLib.fsMod.FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions, fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction): nodeLib.fsMod.FSWatcher = js.native
}

