package typings.history

import typings.history.anon.Fn0
import typings.history.anon.FnCall
import typings.history.anon.FnCallLocation
import typings.history.anon.FnCallLvRv
import typings.history.anon.FnCallOptions
import typings.history.anon.FnCallPathStateKeyCurrentLocation
import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.createHashHistoryMod.HashHistoryBuildOptions
import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import typings.history.historyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBrowserHistory[S](): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[History[S]]
  inline def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[History[S]]
  
  inline def createHashHistory[S](): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[History[S]]
  inline def createHashHistory[S](options: HashHistoryBuildOptions): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[History[S]]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.history.historyStrings.PUSH
    - typings.history.historyStrings.POP
    - typings.history.historyStrings.REPLACE
  */
  trait Action extends StObject
  object Action {
    
    inline def POP: typings.history.historyStrings.POP = "POP".asInstanceOf[typings.history.historyStrings.POP]
    
    inline def PUSH: typings.history.historyStrings.PUSH = "PUSH".asInstanceOf[typings.history.historyStrings.PUSH]
    
    inline def REPLACE: typings.history.historyStrings.REPLACE = "REPLACE".asInstanceOf[typings.history.historyStrings.REPLACE]
  }
  
  type Hash = typings.history.mod.History.Hash
  
  @js.native
  trait History[HistoryLocationState] extends StObject {
    
    var action: Action = js.native
    
    def block(): UnregisterCallback = js.native
    def block(prompt: String): UnregisterCallback = js.native
    def block(prompt: Boolean): UnregisterCallback = js.native
    def block(prompt: TransitionPromptHook[HistoryLocationState]): UnregisterCallback = js.native
    
    def createHref(location: LocationDescriptorObject[HistoryLocationState]): Href = js.native
    
    def go(n: Double): Unit = js.native
    
    def goBack(): Unit = js.native
    
    def goForward(): Unit = js.native
    
    var length: Double = js.native
    
    def listen(listener: LocationListener[HistoryLocationState]): UnregisterCallback = js.native
    
    var location: Location[HistoryLocationState] = js.native
    
    def push(location: LocationDescriptor[HistoryLocationState]): Unit = js.native
    def push(path: Path): Unit = js.native
    def push(path: Path, state: HistoryLocationState): Unit = js.native
    
    def replace(location: LocationDescriptor[HistoryLocationState]): Unit = js.native
    def replace(path: Path): Unit = js.native
    def replace(path: Path, state: HistoryLocationState): Unit = js.native
  }
  object History {
    
    type Hash = String
    
    type Href = String
    
    type LocationDescriptor[S] = typings.history.mod.History.Path | LocationDescriptorObject[S]
    
    type LocationKey = String
    
    type LocationListener[S] = js.Function2[/* location */ Location[S], /* action */ Action, Unit]
    
    type LocationState = js.Any
    
    type Path = String
    
    type Pathname = String
    
    type Search = String
    
    type TransitionHook[S] = js.Function2[
        /* location */ Location[S], 
        /* callback */ js.Function1[/* result */ js.Any, Unit], 
        js.Any
      ]
    
    type TransitionPromptHook[S] = js.Function2[/* location */ Location[S], /* action */ Action, String | `false` | Unit]
  }
  
  type Href = typings.history.mod.History.Href
  
  trait Location[S] extends StObject {
    
    var hash: Hash
    
    var key: js.UndefOr[LocationKey] = js.undefined
    
    var pathname: Pathname
    
    var search: Search
    
    var state: S
  }
  object Location {
    
    inline def apply[S](hash: Hash, pathname: Pathname, search: Search, state: S): Location[S] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location[S]]
    }
    
    extension [Self <: Location[?], S](x: Self & Location[S]) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type LocationDescriptor[S] = typings.history.mod.History.LocationDescriptor[S]
  
  trait LocationDescriptorObject[S] extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var key: js.UndefOr[LocationKey] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
    
    var state: js.UndefOr[S] = js.undefined
  }
  object LocationDescriptorObject {
    
    inline def apply[S](): LocationDescriptorObject[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationDescriptorObject[S]]
    }
    
    extension [Self <: LocationDescriptorObject[?], S](x: Self & LocationDescriptorObject[S]) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type LocationKey = typings.history.mod.History.LocationKey
  
  type LocationListener[S] = typings.history.mod.History.LocationListener[S]
  
  type LocationState = typings.history.mod.History.LocationState
  
  trait Module extends StObject {
    
    def createBrowserHistory[S](): History[S]
    def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S]
    @JSName("createBrowserHistory")
    var createBrowserHistory_Original: FnCall
    
    def createHashHistory[S](): History[S]
    def createHashHistory[S](options: HashHistoryBuildOptions): History[S]
    @JSName("createHashHistory")
    var createHashHistory_Original: FnCallOptions
    
    def createLocation[S](path: LocationDescriptor[S]): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: S): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: S, key: Unit, currentLocation: Location[S]): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: Unit, key: Unit, currentLocation: Location[S]): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey): Location[S]
    def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey, currentLocation: Location[S]): Location[S]
    @JSName("createLocation")
    var createLocation_Original: FnCallPathStateKeyCurrentLocation
    
    def createMemoryHistory[S](): MemoryHistory[S]
    def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S]
    @JSName("createMemoryHistory")
    var createMemoryHistory_Original: Fn0
    
    def createPath[S](location: LocationDescriptorObject[S]): Path
    @JSName("createPath")
    var createPath_Original: FnCallLocation
    
    def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean
    @JSName("locationsAreEqual")
    var locationsAreEqual_Original: FnCallLvRv
    
    def parsePath(path: Path): Location[LocationState]
    @JSName("parsePath")
    var parsePath_Original: js.Function1[/* path */ Path, Location[LocationState]]
  }
  object Module {
    
    inline def apply(
      createBrowserHistory: FnCall,
      createHashHistory: FnCallOptions,
      createLocation: FnCallPathStateKeyCurrentLocation,
      createMemoryHistory: Fn0,
      createPath: FnCallLocation,
      locationsAreEqual: FnCallLvRv,
      parsePath: /* path */ Path => Location[LocationState]
    ): Module = {
      val __obj = js.Dynamic.literal(createBrowserHistory = createBrowserHistory.asInstanceOf[js.Any], createHashHistory = createHashHistory.asInstanceOf[js.Any], createLocation = createLocation.asInstanceOf[js.Any], createMemoryHistory = createMemoryHistory.asInstanceOf[js.Any], createPath = createPath.asInstanceOf[js.Any], locationsAreEqual = locationsAreEqual.asInstanceOf[js.Any], parsePath = js.Any.fromFunction1(parsePath))
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setCreateBrowserHistory(value: FnCall): Self = StObject.set(x, "createBrowserHistory", value.asInstanceOf[js.Any])
      
      inline def setCreateHashHistory(value: FnCallOptions): Self = StObject.set(x, "createHashHistory", value.asInstanceOf[js.Any])
      
      inline def setCreateLocation(value: FnCallPathStateKeyCurrentLocation): Self = StObject.set(x, "createLocation", value.asInstanceOf[js.Any])
      
      inline def setCreateMemoryHistory(value: Fn0): Self = StObject.set(x, "createMemoryHistory", value.asInstanceOf[js.Any])
      
      inline def setCreatePath(value: FnCallLocation): Self = StObject.set(x, "createPath", value.asInstanceOf[js.Any])
      
      inline def setLocationsAreEqual(value: FnCallLvRv): Self = StObject.set(x, "locationsAreEqual", value.asInstanceOf[js.Any])
      
      inline def setParsePath(value: /* path */ Path => Location[LocationState]): Self = StObject.set(x, "parsePath", js.Any.fromFunction1(value))
    }
  }
  
  type Path = typings.history.mod.History.Path
  
  type Pathname = typings.history.mod.History.Pathname
  
  type Search = typings.history.mod.History.Search
  
  type TransitionHook[S] = typings.history.mod.History.TransitionHook[S]
  
  type TransitionPromptHook[S] = typings.history.mod.History.TransitionPromptHook[S]
  
  type UnregisterCallback = js.Function0[Unit]
}
