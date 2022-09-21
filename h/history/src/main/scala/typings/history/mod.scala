package typings.history

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Action extends StObject
  @JSImport("history", "Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    /**
      * A POP indicates a change to an arbitrary index in the history stack, such
      * as a back or forward navigation. It does not describe the direction of the
      * navigation, only that the current index changed.
      *
      * Note: This is the default action for newly created history objects.
      */
    @js.native
    sealed trait Pop
      extends StObject
         with Action
    /* "POP" */ val Pop: typings.history.mod.Action.Pop & String = js.native
    
    /**
      * A PUSH indicates a new entry being added to the history stack, such as when
      * a link is clicked and a new page loads. When this happens, all subsequent
      * entries in the stack are lost.
      */
    @js.native
    sealed trait Push
      extends StObject
         with Action
    /* "PUSH" */ val Push: typings.history.mod.Action.Push & String = js.native
    
    /**
      * A REPLACE indicates the entry at the current index in the history stack
      * being replaced by a new one.
      */
    @js.native
    sealed trait Replace
      extends StObject
         with Action
    /* "REPLACE" */ val Replace: typings.history.mod.Action.Replace & String = js.native
  }
  
  inline def createBrowserHistory(): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[BrowserHistory]
  inline def createBrowserHistory(options: BrowserHistoryOptions): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserHistory]
  
  inline def createHashHistory(): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[HashHistory]
  inline def createHashHistory(options: HashHistoryOptions): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[HashHistory]
  
  inline def createMemoryHistory(): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[MemoryHistory]
  inline def createMemoryHistory(options: MemoryHistoryOptions): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory]
  
  inline def createPath(hasPathnameSearchHash: typings.history.anon.PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(hasPathnameSearchHash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(path: String): typings.history.anon.PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.history.anon.PartialPath]
  
  type Blocker = js.Function1[/* tx */ Transition, Unit]
  
  type BrowserHistory = History
  
  trait BrowserHistoryOptions extends StObject {
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object BrowserHistoryOptions {
    
    inline def apply(): BrowserHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHistoryOptions]
    }
    
    extension [Self <: BrowserHistoryOptions](x: Self) {
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type Hash = String
  
  type HashHistory = History
  
  trait HashHistoryOptions extends StObject {
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object HashHistoryOptions {
    
    inline def apply(): HashHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashHistoryOptions]
    }
    
    extension [Self <: HashHistoryOptions](x: Self) {
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait History extends StObject {
    
    /**
      * The last action that modified the current location. This will always be
      * Action.Pop when a history instance is first created. This value is mutable.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.action
      */
    val action: Action = js.native
    
    /**
      * Navigates to the previous entry in the stack. Identical to go(-1).
      *
      * Warning: if the current location is the first location in the stack, this
      * will unload the current document.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.back
      */
    def back(): Unit = js.native
    
    /**
      * Prevents the current location from changing and sets up a listener that
      * will be called instead.
      *
      * @param blocker - A function that will be called when a transition is blocked
      * @returns unblock - A function that may be used to stop blocking
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.block
      */
    def block(blocker: Blocker): js.Function0[Unit] = js.native
    
    /**
      * Returns a valid href for the given `to` value that may be used as
      * the value of an <a href> attribute.
      *
      * @param to - The destination URL
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.createHref
      */
    def createHref(to: To): String = js.native
    
    /**
      * Navigates to the next entry in the stack. Identical to go(1).
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.forward
      */
    def forward(): Unit = js.native
    
    /**
      * Navigates `n` entries backward/forward in the history stack relative to the
      * current index. For example, a "back" navigation would use go(-1).
      *
      * @param delta - The delta in the stack index
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.go
      */
    def go(delta: Double): Unit = js.native
    
    /**
      * Sets up a listener that will be called whenever the current location
      * changes.
      *
      * @param listener - A function that will be called when the location changes
      * @returns unlisten - A function that may be used to stop listening
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.listen
      */
    def listen(listener: Listener): js.Function0[Unit] = js.native
    
    /**
      * The current location. This value is mutable.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.location
      */
    val location: Location = js.native
    
    /**
      * Pushes a new location onto the history stack, increasing its length by one.
      * If there were any entries in the stack after the current one, they are
      * lost.
      *
      * @param to - The new URL
      * @param state - Data to associate with the new location
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.push
      */
    def push(to: To): Unit = js.native
    def push(to: To, state: Any): Unit = js.native
    
    /**
      * Replaces the current location in the history stack with a new one.  The
      * location that was replaced will no longer be available.
      *
      * @param to - The new URL
      * @param state - Data to associate with the new location
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.replace
      */
    def replace(to: To): Unit = js.native
    def replace(to: To, state: Any): Unit = js.native
  }
  
  type InitialEntry = String | typings.history.anon.PartialLocation
  
  type Key = String
  
  type Listener = js.Function1[/* update */ Update, Unit]
  
  trait Location
    extends StObject
       with Path {
    
    /**
      * A unique string associated with this location. May be used to safely store
      * and retrieve data in some other storage API, like `localStorage`.
      *
      * Note: This value is always "default" on the initial location.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.key
      */
    var key: Key
    
    /**
      * A value of arbitrary data associated with this location.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.state
      */
    var state: Any
  }
  object Location {
    
    inline def apply(hash: Hash, key: Key, pathname: Pathname, search: Search, state: Any): Location = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemoryHistory
    extends StObject
       with History {
    
    val index: Double = js.native
  }
  
  trait MemoryHistoryOptions extends StObject {
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object MemoryHistoryOptions {
    
    inline def apply(): MemoryHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryHistoryOptions]
    }
    
    extension [Self <: MemoryHistoryOptions](x: Self) {
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<history.history.Location> */
  trait PartialLocation extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    extension [Self <: PartialLocation](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<history.history.Path> */
  trait PartialPath extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
  }
  object PartialPath {
    
    inline def apply(): PartialPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPath]
    }
    
    extension [Self <: PartialPath](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    /**
      * A URL fragment identifier, beginning with a #.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.hash
      */
    var hash: Hash
    
    /**
      * A URL pathname, beginning with a /.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.pathname
      */
    var pathname: Pathname
    
    /**
      * A URL search string, beginning with a ?.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.search
      */
    var search: Search
  }
  object Path {
    
    inline def apply(hash: Hash, pathname: Pathname, search: Search): Path = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  type Pathname = String
  
  type Search = String
  
  type State = Any
  
  type To = String | typings.history.anon.PartialPath
  
  trait Transition
    extends StObject
       with Update {
    
    /**
      * Retries the update to the current location.
      */
    def retry(): Unit
  }
  object Transition {
    
    inline def apply(action: Action, location: Location, retry: () => Unit): Transition = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry))
      __obj.asInstanceOf[Transition]
    }
    
    extension [Self <: Transition](x: Self) {
      
      inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
    }
  }
  
  trait Update extends StObject {
    
    /**
      * The action that triggered the change.
      */
    var action: Action
    
    /**
      * The new location.
      */
    var location: Location
  }
  object Update {
    
    inline def apply(action: Action, location: Location): Update = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
