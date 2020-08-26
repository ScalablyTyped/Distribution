package typings.jestRunner.typesMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWatcher extends EventEmitter {
  var state: WatcherState = js.native
  def isInterrupted(): Boolean = js.native
  def isWatchMode(): Boolean = js.native
  def setState(state: WatcherState): Unit = js.native
}

