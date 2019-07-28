package typings.history.historyMod

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createBrowserHistory(): History[LocationState] = js.native
  def createBrowserHistory(options: BrowserHistoryBuildOptions): History[LocationState] = js.native
  def createHashHistory(): History[LocationState] = js.native
  def createHashHistory(options: HashHistoryBuildOptions): History[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState]): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState): Location[LocationState] = js.native
  def createLocation(path: LocationDescriptor[LocationState], state: LocationState, key: LocationKey): Location[LocationState] = js.native
  def createLocation(
    path: LocationDescriptor[LocationState],
    state: LocationState,
    key: LocationKey,
    currentLocation: Location[LocationState]
  ): Location[LocationState] = js.native
  def createMemoryHistory(): MemoryHistory[LocationState] = js.native
  def createMemoryHistory(options: MemoryHistoryBuildOptions): MemoryHistory[LocationState] = js.native
  def createPath(location: LocationDescriptorObject[LocationState]): Path = js.native
  def locationsAreEqual(lv: LocationDescriptor[LocationState], rv: LocationDescriptor[LocationState]): Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
}

