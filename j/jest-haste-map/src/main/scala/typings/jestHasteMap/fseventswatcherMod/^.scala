package typings.jestHasteMap.fseventswatcherMod

import typings.jestHasteMap.anon.Dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export `FSEventsWatcher` class.
  * Watches `dir`.
  */
@JSImport("jest-haste-map/build/lib/FSEventsWatcher", JSImport.Namespace)
@js.native
class ^ protected () extends FSEventsWatcher {
  def this(dir: String, opts: Dot) = this()
}

@JSImport("jest-haste-map/build/lib/FSEventsWatcher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var normalizeProxy: js.Any = js.native
  var recReaddir: js.Any = js.native
  def isSupported(): Boolean = js.native
}

