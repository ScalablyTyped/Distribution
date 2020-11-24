package typings.jestWatcher

import typings.jestWatcher.jestHooksMod.AvailableHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestWatcherStrings {
  
  @scala.inline
  def onFileChange: onFileChange = "onFileChange".asInstanceOf[onFileChange]
  
  @scala.inline
  def onTestRunComplete: onTestRunComplete = "onTestRunComplete".asInstanceOf[onTestRunComplete]
  
  @scala.inline
  def shouldRunTestSuite: shouldRunTestSuite = "shouldRunTestSuite".asInstanceOf[shouldRunTestSuite]
  
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
  
  @scala.inline
  def watchAll: watchAll = "watchAll".asInstanceOf[watchAll]
  
  @js.native
  sealed trait onFileChange extends AvailableHooks
  
  @js.native
  sealed trait onTestRunComplete extends AvailableHooks
  
  @js.native
  sealed trait shouldRunTestSuite extends AvailableHooks
  
  @js.native
  sealed trait watch extends js.Object
  
  @js.native
  sealed trait watchAll extends js.Object
}
