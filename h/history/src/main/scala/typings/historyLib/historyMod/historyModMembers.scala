package typings
package historyLib.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", JSImport.Namespace)
@js.native
object historyModMembers extends js.Object {
  def createBrowserHistory(): History[LocationState] = js.native
  def createBrowserHistory(options: historyLib.createBrowserHistoryMod.BrowserHistoryBuildOptions): History[LocationState] = js.native
  def createHashHistory(): History[LocationState] = js.native
  def createHashHistory(options: historyLib.createHashHistoryMod.HashHistoryBuildOptions): History[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState]): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState, key: LocationKey): Location[LocationState] = js.native
  def createLocation(
    path: LocationDescriptor[LocationState],
    state: LocationState,
    key: LocationKey,
    currentLocation: Location[LocationState]
  ): Location[LocationState] = js.native
  def createMemoryHistory(): historyLib.createMemoryHistoryMod.MemoryHistory[LocationState] = js.native
  def createMemoryHistory(options: historyLib.createMemoryHistoryMod.MemoryHistoryBuildOptions): historyLib.createMemoryHistoryMod.MemoryHistory[LocationState] = js.native
  def createPath(location: LocationDescriptorObject[LocationState]): Path = js.native
  def locationsAreEqual(lv: LocationDescriptor[LocationState], rv: LocationDescriptor[LocationState]): scala.Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
}

