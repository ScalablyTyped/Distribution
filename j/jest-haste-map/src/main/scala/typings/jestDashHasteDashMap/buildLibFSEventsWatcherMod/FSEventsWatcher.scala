package typings.jestDashHasteDashMap.buildLibFSEventsWatcherMod

import typings.anymatch.anymatchMod.Matcher
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export `FSEventsWatcher` class.
  * Watches `dir`.
  */
@js.native
trait FSEventsWatcher extends EventEmitter {
  /**
    * Emit events.
    */
  var _emit: js.Any = js.native
  var _tracked: js.Any = js.native
  val dot: Boolean = js.native
  val glob: js.Array[String] = js.native
  var handleEvent: js.Any = js.native
  val hasIgnore: Boolean = js.native
  val ignored: js.UndefOr[Matcher] = js.native
  var isFileIncluded: js.Any = js.native
  val root: String = js.native
  val watcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Watcher */ js.Any = js.native
  /**
    * End watching.
    */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def doIgnore(path: String): Boolean = js.native
}

