package typings.jestRunner.typesMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestWatcher extends EventEmitter {
  
  def isInterrupted(): Boolean = js.native
  
  def isWatchMode(): Boolean = js.native
  
  def setState(state: WatcherState): Unit = js.native
  
  var state: WatcherState = js.native
}
