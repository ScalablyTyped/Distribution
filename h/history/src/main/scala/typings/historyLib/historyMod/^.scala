package typings
package historyLib.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createBrowserHistory(): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def createBrowserHistory(options: historyLib.createBrowserHistoryMod.BrowserHistoryBuildOptions): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def createHashHistory(): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def createHashHistory(options: historyLib.createHashHistoryMod.HashHistoryBuildOptions): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
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
  def createMemoryHistory(): historyLib.createMemoryHistoryMod.MemoryHistory[historyLib.historyMod.LocationState] = js.native
  def createMemoryHistory(options: historyLib.createMemoryHistoryMod.MemoryHistoryBuildOptions): historyLib.createMemoryHistoryMod.MemoryHistory[historyLib.historyMod.LocationState] = js.native
  def createPath(location: historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]): historyLib.historyMod.Path = js.native
  def locationsAreEqual(
    lv: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    rv: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
  ): scala.Boolean = js.native
  def parsePath(path: historyLib.historyMod.Path): historyLib.historyMod.Location[historyLib.historyMod.LocationState] = js.native
}

