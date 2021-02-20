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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("history", "createBrowserHistory")
  @js.native
  def createBrowserHistory[S](): History[S] = js.native
  @JSImport("history", "createBrowserHistory")
  @js.native
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  
  @JSImport("history", "createHashHistory")
  @js.native
  def createHashHistory[S](): History[S] = js.native
  @JSImport("history", "createHashHistory")
  @js.native
  def createHashHistory[S](options: HashHistoryBuildOptions): History[S] = js.native
  
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: S,
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
  @JSImport("history", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: LocationKey,
    currentLocation: Location[S]
  ): Location[S] = js.native
  
  @JSImport("history", "createMemoryHistory")
  @js.native
  def createMemoryHistory[S](): MemoryHistory[S] = js.native
  @JSImport("history", "createMemoryHistory")
  @js.native
  def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  
  @JSImport("history", "createPath")
  @js.native
  def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
  
  @JSImport("history", "locationsAreEqual")
  @js.native
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  
  @JSImport("history", "parsePath")
  @js.native
  def parsePath(path: Path): Location[LocationState] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.history.historyStrings.PUSH
    - typings.history.historyStrings.POP
    - typings.history.historyStrings.REPLACE
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def POP: typings.history.historyStrings.POP = "POP".asInstanceOf[typings.history.historyStrings.POP]
    
    @scala.inline
    def PUSH: typings.history.historyStrings.PUSH = "PUSH".asInstanceOf[typings.history.historyStrings.PUSH]
    
    @scala.inline
    def REPLACE: typings.history.historyStrings.REPLACE = "REPLACE".asInstanceOf[typings.history.historyStrings.REPLACE]
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
  
  @js.native
  trait Location[S] extends StObject {
    
    var hash: Hash = js.native
    
    var key: js.UndefOr[LocationKey] = js.native
    
    var pathname: Pathname = js.native
    
    var search: Search = js.native
    
    var state: S = js.native
  }
  object Location {
    
    @scala.inline
    def apply[S](hash: Hash, pathname: Pathname, search: Search, state: S): Location[S] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location[S]]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location[_], S] (val x: Self with Location[S]) extends AnyVal {
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type LocationDescriptor[S] = typings.history.mod.History.LocationDescriptor[S]
  
  @js.native
  trait LocationDescriptorObject[S] extends StObject {
    
    var hash: js.UndefOr[Hash] = js.native
    
    var key: js.UndefOr[LocationKey] = js.native
    
    var pathname: js.UndefOr[Pathname] = js.native
    
    var search: js.UndefOr[Search] = js.native
    
    var state: js.UndefOr[S] = js.native
  }
  object LocationDescriptorObject {
    
    @scala.inline
    def apply[S](): LocationDescriptorObject[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationDescriptorObject[S]]
    }
    
    @scala.inline
    implicit class LocationDescriptorObjectMutableBuilder[Self <: LocationDescriptorObject[_], S] (val x: Self with LocationDescriptorObject[S]) extends AnyVal {
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type LocationKey = typings.history.mod.History.LocationKey
  
  type LocationListener[S] = typings.history.mod.History.LocationListener[S]
  
  type LocationState = typings.history.mod.History.LocationState
  
  @js.native
  trait Module extends StObject {
    
    def createBrowserHistory[S](): History[S] = js.native
    def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
    @JSName("createBrowserHistory")
    var createBrowserHistory_Original: FnCall = js.native
    
    def createHashHistory[S](): History[S] = js.native
    def createHashHistory[S](options: HashHistoryBuildOptions): History[S] = js.native
    @JSName("createHashHistory")
    var createHashHistory_Original: FnCallOptions = js.native
    
    def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
    def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
    def createLocation[S](
      path: LocationDescriptor[S],
      state: S,
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
    def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
    def createLocation[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: js.UndefOr[scala.Nothing],
      currentLocation: Location[S]
    ): Location[S] = js.native
    def createLocation[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
    def createLocation[S](
      path: LocationDescriptor[S],
      state: js.UndefOr[scala.Nothing],
      key: LocationKey,
      currentLocation: Location[S]
    ): Location[S] = js.native
    @JSName("createLocation")
    var createLocation_Original: FnCallPathStateKeyCurrentLocation = js.native
    
    def createMemoryHistory[S](): MemoryHistory[S] = js.native
    def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
    @JSName("createMemoryHistory")
    var createMemoryHistory_Original: Fn0 = js.native
    
    def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
    @JSName("createPath")
    var createPath_Original: FnCallLocation = js.native
    
    def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
    @JSName("locationsAreEqual")
    var locationsAreEqual_Original: FnCallLvRv = js.native
    
    def parsePath(path: Path): Location[LocationState] = js.native
    @JSName("parsePath")
    var parsePath_Original: js.Function1[/* path */ Path, Location[LocationState]] = js.native
  }
  
  type Path = typings.history.mod.History.Path
  
  type Pathname = typings.history.mod.History.Pathname
  
  type Search = typings.history.mod.History.Search
  
  type TransitionHook[S] = typings.history.mod.History.TransitionHook[S]
  
  type TransitionPromptHook[S] = typings.history.mod.History.TransitionPromptHook[S]
  
  type UnregisterCallback = js.Function0[Unit]
}
