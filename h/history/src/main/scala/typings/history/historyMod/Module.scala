package typings.history.historyMod

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  @JSName("createBrowserHistory")
  var createBrowserHistory_Original: js.Function1[/* options */ js.UndefOr[BrowserHistoryBuildOptions], History[LocationState]] = js.native
  @JSName("createHashHistory")
  var createHashHistory_Original: js.Function1[/* options */ js.UndefOr[HashHistoryBuildOptions], History[LocationState]] = js.native
  @JSName("createLocation")
  var createLocation_Original: js.Function4[
    /* path */ LocationDescriptor[LocationState], 
    /* state */ js.UndefOr[LocationState], 
    /* key */ js.UndefOr[LocationKey], 
    /* currentLocation */ js.UndefOr[Location[LocationState]], 
    Location[LocationState]
  ] = js.native
  @JSName("createMemoryHistory")
  var createMemoryHistory_Original: js.Function1[/* options */ js.UndefOr[MemoryHistoryBuildOptions], MemoryHistory[LocationState]] = js.native
  @JSName("createPath")
  var createPath_Original: js.Function1[/* location */ LocationDescriptorObject[LocationState], Path] = js.native
  @JSName("locationsAreEqual")
  var locationsAreEqual_Original: js.Function2[
    /* lv */ LocationDescriptor[LocationState], 
    /* rv */ LocationDescriptor[LocationState], 
    Boolean
  ] = js.native
  @JSName("parsePath")
  var parsePath_Original: js.Function1[/* path */ Path, Location[LocationState]] = js.native
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

