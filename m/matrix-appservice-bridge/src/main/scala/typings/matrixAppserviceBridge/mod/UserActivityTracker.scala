package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.userActivityMod.ChangesCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserActivityTracker")
@js.native
open class UserActivityTracker protected ()
  extends typings.matrixAppserviceBridge.userActivityMod.UserActivityTracker {
  def this(
    config: typings.matrixAppserviceBridge.userActivityMod.UserActivityTrackerConfig,
    dataSet: typings.matrixAppserviceBridge.userActivityMod.UserActivitySet
  ) = this()
  def this(
    config: typings.matrixAppserviceBridge.userActivityMod.UserActivityTrackerConfig,
    dataSet: typings.matrixAppserviceBridge.userActivityMod.UserActivitySet,
    onChanges: ChangesCallback
  ) = this()
}
