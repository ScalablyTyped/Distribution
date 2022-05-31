package typings.history

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object History {
    
    @JSGlobal("History")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBrowserHistory[S](): typings.history.mod.History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[typings.history.mod.History[S]]
    inline def createBrowserHistory[S](options: BrowserHistoryBuildOptions): typings.history.mod.History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[typings.history.mod.History[S]]
    
    inline def createHashHistory[S](): typings.history.mod.History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[typings.history.mod.History[S]]
    inline def createHashHistory[S](options: HashHistoryBuildOptions): typings.history.mod.History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[typings.history.mod.History[S]]
    
    inline def createLocation[S](path: LocationDescriptor[S]): Location[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any]).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: S, key: Unit, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: Unit, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
    
    inline def createMemoryHistory[S](): MemoryHistory[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[MemoryHistory[S]]
    inline def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory[S]]
    
    inline def createPath[S](location: LocationDescriptorObject[S]): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(location.asInstanceOf[js.Any]).asInstanceOf[Path]
    
    inline def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("locationsAreEqual")(lv.asInstanceOf[js.Any], rv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def parsePath(path: Path): Location[LocationState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[Location[LocationState]]
  }
}
