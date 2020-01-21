package typings.jestWatcher.jestHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestWatcher.jestWatcherStrings.onFileChange
  - typings.jestWatcher.jestWatcherStrings.onTestRunComplete
  - typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite
*/
trait AvailableHooks extends js.Object

object AvailableHooks {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onFileChange: typings.jestWatcher.jestWatcherStrings.onFileChange = this.cast("onFileChange")
  @scala.inline
  def onTestRunComplete: typings.jestWatcher.jestWatcherStrings.onTestRunComplete = this.cast("onTestRunComplete")
  @scala.inline
  def shouldRunTestSuite: typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite = this.cast("shouldRunTestSuite")
}

