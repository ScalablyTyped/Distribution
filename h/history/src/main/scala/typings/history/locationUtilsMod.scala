package typings.history

import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationKey
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/LocationUtils", JSImport.Namespace)
@js.native
object locationUtilsMod extends js.Object {
  def createLocation(path: LocationDescriptor[LocationState]): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState, key: LocationKey): Location[LocationState] = js.native
  def createLocation(
    path: LocationDescriptor[LocationState],
    state: LocationState,
    key: LocationKey,
    currentLocation: Location[LocationState]
  ): Location[LocationState] = js.native
  def locationsAreEqual(lv: LocationDescriptor[LocationState], rv: LocationDescriptor[LocationState]): Boolean = js.native
}

