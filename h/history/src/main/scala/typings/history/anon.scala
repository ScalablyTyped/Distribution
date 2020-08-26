package typings.history

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationKey
import typings.history.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
    def apply[S](): MemoryHistory[S] = js.native
    def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply[S](): History[S] = js.native
    def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallLocation extends js.Object {
    def apply[S](location: LocationDescriptorObject[S]): Path = js.native
  }
  
  @js.native
  trait FnCallLvRv extends js.Object {
    def apply[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  }
  
  @js.native
  trait FnCallOptions extends js.Object {
    def apply[S](): History[S] = js.native
    def apply[S](options: HashHistoryBuildOptions): History[S] = js.native
  }
  
  @js.native
  trait FnCallPathStateKeyCurrentLocation extends js.Object {
    def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: S,
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def apply[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
    def apply[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: LocationKey,
      currentLocation: Location[S]
    ): Location[S] = js.native
  }
  
}

