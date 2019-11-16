package typings.atJestCore.buildTestWatcherMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWatcher extends EventEmitter {
  var _isWatchMode: js.Any = js.native
  var state: State = js.native
  def isInterrupted(): Boolean = js.native
  def isWatchMode(): Boolean = js.native
  def setState(state: State): Unit = js.native
}

