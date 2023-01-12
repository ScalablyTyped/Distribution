package typings.kbar

import typings.kbar.anon.EnterMs
import typings.kbar.anon.Name
import typings.kbar.anon.OnClose
import typings.kbar.libActionActionImplMod.ActionImpl
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait VisualState extends StObject
  @JSImport("kbar/lib/types", "VisualState")
  @js.native
  object VisualState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VisualState & String] = js.native
    
    @js.native
    sealed trait animatingIn
      extends StObject
         with VisualState
    /* "animating-in" */ val animatingIn: typings.kbar.libTypesMod.VisualState.animatingIn & String = js.native
    
    @js.native
    sealed trait animatingOut
      extends StObject
         with VisualState
    /* "animating-out" */ val animatingOut: typings.kbar.libTypesMod.VisualState.animatingOut & String = js.native
    
    @js.native
    sealed trait hidden
      extends StObject
         with VisualState
    /* "hidden" */ val hidden: typings.kbar.libTypesMod.VisualState.hidden & String = js.native
    
    @js.native
    sealed trait showing
      extends StObject
         with VisualState
    /* "showing" */ val showing: typings.kbar.libTypesMod.VisualState.showing & String = js.native
  }
  
  trait Action extends StObject {
    
    var icon: js.UndefOr[String | ReactElement | ReactNode] = js.undefined
    
    var id: ActionId
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var parent: js.UndefOr[ActionId] = js.undefined
    
    var perform: js.UndefOr[js.Function1[/* currentActionImpl */ ActionImpl, Any]] = js.undefined
    
    var priority: js.UndefOr[Priority] = js.undefined
    
    var section: js.UndefOr[ActionSection] = js.undefined
    
    var shortcut: js.UndefOr[js.Array[String]] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
  }
  object Action {
    
    inline def apply(id: ActionId, name: String): Action = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String | ReactElement | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: ActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ActionId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPerform(value: /* currentActionImpl */ ActionImpl => Any): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      inline def setPerformUndefined: Self = StObject.set(x, "perform", js.undefined)
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSection(value: ActionSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setShortcut(value: js.Array[String]): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      
      inline def setShortcutVarargs(value: String*): Self = StObject.set(x, "shortcut", js.Array(value*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
  
  trait ActionGroup extends StObject {
    
    var actions: js.Array[ActionImpl]
    
    var name: String
  }
  object ActionGroup {
    
    inline def apply(actions: js.Array[ActionImpl], name: String): ActionGroup = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionGroup] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ActionImpl]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionImpl*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionId = String
  
  type ActionSection = String | Name
  
  type ActionStore = Record[ActionId, ActionImpl]
  
  type ActionTree = Record[String, ActionImpl]
  
  @js.native
  trait History extends StObject {
    
    def add(item: HistoryItem): HistoryItem = js.native
    
    def redo(): Unit = js.native
    def redo(item: HistoryItem): Unit = js.native
    
    var redoStack: js.Array[HistoryItem] = js.native
    
    def remove(item: HistoryItem): Unit = js.native
    
    def reset(): Unit = js.native
    
    def undo(): Unit = js.native
    def undo(item: HistoryItem): Unit = js.native
    
    var undoStack: js.Array[HistoryItem] = js.native
  }
  
  trait HistoryItem extends StObject {
    
    def negate(): Any
    
    def perform(): Any
  }
  object HistoryItem {
    
    inline def apply(negate: () => Any, perform: () => Any): HistoryItem = {
      val __obj = js.Dynamic.literal(negate = js.Any.fromFunction0(negate), perform = js.Any.fromFunction0(perform))
      __obj.asInstanceOf[HistoryItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistoryItem] (val x: Self) extends AnyVal {
      
      inline def setNegate(value: () => Any): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
      
      inline def setPerform(value: () => Any): Self = StObject.set(x, "perform", js.Any.fromFunction0(value))
    }
  }
  
  trait IKBarContext extends StObject {
    
    def getState(): KBarState
    
    var options: KBarOptions
    
    var query: KBarQuery
    
    def subscribe(collector: js.Function1[/* state */ KBarState, Any], cb: js.Function1[/* collected */ Any, Unit]): Unit
  }
  object IKBarContext {
    
    inline def apply(
      getState: () => KBarState,
      options: KBarOptions,
      query: KBarQuery,
      subscribe: (js.Function1[/* state */ KBarState, Any], js.Function1[/* collected */ Any, Unit]) => Unit
    ): IKBarContext = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe))
      __obj.asInstanceOf[IKBarContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKBarContext] (val x: Self) extends AnyVal {
      
      inline def setGetState(value: () => KBarState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setOptions(value: KBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: KBarQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: (js.Function1[/* state */ KBarState, Any], js.Function1[/* collected */ Any, Unit]) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    }
  }
  
  trait KBarOptions extends StObject {
    
    var animations: js.UndefOr[EnterMs] = js.undefined
    
    var callbacks: js.UndefOr[OnClose] = js.undefined
    
    /**
      * `disableDocumentLock` disables the "document lock" functionality
      * of kbar, where the body element's scrollbar is hidden and pointer
      * events are disabled when kbar is open. This is useful if you're using
      * a custom modal component that has its own implementation of this
      * functionality.
      */
    var disableDocumentLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `disableScrollBarManagement` ensures that kbar will not
      * manipulate the document's `margin-right` property when open.
      * By default, kbar will add additional margin to the document
      * body when opened in order to prevent any layout shift with
      * the appearance/disappearance of the scrollbar.
      */
    var disableScrollbarManagement: js.UndefOr[Boolean] = js.undefined
    
    var enableHistory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `toggleShortcut` enables customizing which keyboard shortcut triggers
      * kbar. Defaults to "$mod+k" (cmd+k / ctrl+k)
      */
    var toggleShortcut: js.UndefOr[String] = js.undefined
  }
  object KBarOptions {
    
    inline def apply(): KBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KBarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KBarOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimations(value: EnterMs): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setCallbacks(value: OnClose): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setDisableDocumentLock(value: Boolean): Self = StObject.set(x, "disableDocumentLock", value.asInstanceOf[js.Any])
      
      inline def setDisableDocumentLockUndefined: Self = StObject.set(x, "disableDocumentLock", js.undefined)
      
      inline def setDisableScrollbarManagement(value: Boolean): Self = StObject.set(x, "disableScrollbarManagement", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollbarManagementUndefined: Self = StObject.set(x, "disableScrollbarManagement", js.undefined)
      
      inline def setEnableHistory(value: Boolean): Self = StObject.set(x, "enableHistory", value.asInstanceOf[js.Any])
      
      inline def setEnableHistoryUndefined: Self = StObject.set(x, "enableHistory", js.undefined)
      
      inline def setToggleShortcut(value: String): Self = StObject.set(x, "toggleShortcut", value.asInstanceOf[js.Any])
      
      inline def setToggleShortcutUndefined: Self = StObject.set(x, "toggleShortcut", js.undefined)
    }
  }
  
  trait KBarProviderProps extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var options: js.UndefOr[KBarOptions] = js.undefined
  }
  object KBarProviderProps {
    
    inline def apply(): KBarProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KBarProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KBarProviderProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setOptions(value: KBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait KBarQuery extends StObject {
    
    def registerActions(actions: js.Array[Action]): js.Function0[Unit] = js.native
    
    def setActiveIndex(cb: js.Function1[/* currIndex */ Double, Double]): Unit = js.native
    def setActiveIndex(cb: Double): Unit = js.native
    
    def setCurrentRootAction(): Unit = js.native
    def setCurrentRootAction(actionId: ActionId): Unit = js.native
    
    def setSearch(search: String): Unit = js.native
    
    def setVisualState(cb: js.Function1[/* vs */ VisualState, VisualState]): Unit = js.native
    def setVisualState(cb: VisualState): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  trait KBarState extends StObject {
    
    var actions: ActionTree
    
    var activeIndex: Double
    
    var currentRootActionId: js.UndefOr[ActionId | Null] = js.undefined
    
    var searchQuery: String
    
    var visualState: VisualState
  }
  object KBarState {
    
    inline def apply(actions: ActionTree, activeIndex: Double, searchQuery: String, visualState: VisualState): KBarState = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activeIndex = activeIndex.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], visualState = visualState.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBarState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KBarState] (val x: Self) extends AnyVal {
      
      inline def setActions(value: ActionTree): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentRootActionId(value: ActionId): Self = StObject.set(x, "currentRootActionId", value.asInstanceOf[js.Any])
      
      inline def setCurrentRootActionIdNull: Self = StObject.set(x, "currentRootActionId", null)
      
      inline def setCurrentRootActionIdUndefined: Self = StObject.set(x, "currentRootActionId", js.undefined)
      
      inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setVisualState(value: VisualState): Self = StObject.set(x, "visualState", value.asInstanceOf[js.Any])
    }
  }
  
  type Priority = Double
}
