package typings.jestWatcher

import typings.jestWatcher.jestHooksMod.AvailableHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestWatcherStrings {
  
  @js.native
  sealed trait onFileChange
    extends StObject
       with AvailableHooks
  @scala.inline
  def onFileChange: onFileChange = "onFileChange".asInstanceOf[onFileChange]
  
  @js.native
  sealed trait onTestRunComplete
    extends StObject
       with AvailableHooks
  @scala.inline
  def onTestRunComplete: onTestRunComplete = "onTestRunComplete".asInstanceOf[onTestRunComplete]
  
  @js.native
  sealed trait shouldRunTestSuite
    extends StObject
       with AvailableHooks
  @scala.inline
  def shouldRunTestSuite: shouldRunTestSuite = "shouldRunTestSuite".asInstanceOf[shouldRunTestSuite]
  
  @js.native
  sealed trait watch extends StObject
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
  
  @js.native
  sealed trait watchAll extends StObject
  @scala.inline
  def watchAll: watchAll = "watchAll".asInstanceOf[watchAll]
}
