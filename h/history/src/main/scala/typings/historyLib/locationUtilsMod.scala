package typings
package historyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/LocationUtils", JSImport.Namespace)
@js.native
object locationUtilsMod extends js.Object {
  def createLocation(path: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
  def createLocation(
    path: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
  def createLocation(
    path: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState,
    key: historyLib.historyMod.LocationKey
  ): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
  def createLocation(
    path: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState,
    key: historyLib.historyMod.LocationKey,
    currentLocation: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  ): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
  def locationsAreEqual(
    lv: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    rv: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
  ): scala.Boolean = js.native
}

