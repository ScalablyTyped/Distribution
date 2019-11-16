package typings.jestDashRunner.buildTypesMod

import org.scalablytyped.runtime.Instantiable1
import typings.jestDashRunner.Anon_IsWatchMode
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWatcher
  extends EventEmitter
     with Instantiable1[/* hasIsWatchMode */ Anon_IsWatchMode, TestWatcher] {
  var state: WatcherState = js.native
  def isInterrupted(): Boolean = js.native
  def isWatchMode(): Boolean = js.native
  def setState(state: WatcherState): Unit = js.native
}

