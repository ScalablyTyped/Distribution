package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.libComponentsUserActivityMod.ChangesCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserActivityTracker")
@js.native
open class UserActivityTracker protected ()
  extends typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTracker {
  def this(
    config: typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTrackerConfig,
    dataSet: typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivitySet
  ) = this()
  def this(
    config: typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTrackerConfig,
    dataSet: typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivitySet,
    onChanges: ChangesCallback
  ) = this()
}
