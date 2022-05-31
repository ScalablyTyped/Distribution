package typings.jupyterlabExtensionmanager

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.installed
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.searchResult
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.modelMod.Action
import typings.jupyterlabExtensionmanager.modelMod.IEntry
import typings.jupyterlabExtensionmanager.modelMod.ListModel
import typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IState
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "CollapsibleSection")
  @js.native
  class CollapsibleSection protected ()
    extends Component[IProperties, IState, js.Any] {
    def this(props: IProperties) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCollapsibleSection(nextProps: IProperties): Unit = js.native
    
    /**
      * Handler for search input changes.
      */
    def handleCollapse(): Unit = js.native
  }
  object CollapsibleSection {
    
    /**
      * React properties for collapsible section component.
      */
    trait IProperties extends StObject {
      
      /**
        * If true, the section will be collapsed and will not respond
        * to open nor close actions.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If given, this will be diplayed instead of the children.
        */
      var errorMessage: js.UndefOr[String | Null] = js.undefined
      
      /**
        * If true, the section will be opened if not disabled.
        */
      var forceOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The header string for section list.
        */
      var header: String
      
      /**
        * Any additional elements to add to the header.
        */
      var headerElements: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * Whether the view will be expanded or collapsed initially, defaults to open.
        */
      var isOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Handle collapse event.
        */
      var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    }
    object IProperties {
      
      inline def apply(header: String): IProperties = {
        val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProperties]
      }
      
      extension [Self <: IProperties](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
        
        inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
        
        inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
        
        inline def setForceOpen(value: Boolean): Self = StObject.set(x, "forceOpen", value.asInstanceOf[js.Any])
        
        inline def setForceOpenUndefined: Self = StObject.set(x, "forceOpen", js.undefined)
        
        inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderElements(value: ReactNode): Self = StObject.set(x, "headerElements", value.asInstanceOf[js.Any])
        
        inline def setHeaderElementsUndefined: Self = StObject.set(x, "headerElements", js.undefined)
        
        inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
        
        inline def setOnCollapse(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
        
        inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      }
    }
    
    /**
      * React state for collapsible section component.
      */
    trait IState extends StObject {
      
      /**
        * Whether the section is expanded or collapsed.
        */
      var isOpen: Boolean
    }
    object IState {
      
      inline def apply(isOpen: Boolean): IState = {
        val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
        __obj.asInstanceOf[IState]
      }
      
      extension [Self <: IState](x: Self) {
        
        inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "ExtensionView")
  @js.native
  class ExtensionView protected () extends VDomRenderer[ListModel] {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
    
    /* private */ var _forceOpen: js.Any = js.native
    
    /* private */ var _settings: js.Any = js.native
    
    /**
      * Toggle the focused modifier based on the input node focus state.
      */
    /* private */ var _toggleFocused: js.Any = js.native
    
    /**
      * Handle the DOM events for the command palette.
      *
      * @param event - The DOM event sent to the command palette.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the command palette's DOM node.
      * It should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The search input node.
      */
    def inputNode: HTMLInputElement = js.native
    
    /**
      * Callback handler for when the user wants to perform an action on an extension.
      *
      * @param action The action to perform.
      * @param entry The entry to perform the action on.
      */
    def onAction(action: Action, entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * Callback handler for the user changes the page of the search result pagination.
      *
      * @param value The pagination page number.
      */
    def onPage(value: Double): Unit = js.native
    
    /**
      * Callback handler for the user specifies a new search query.
      *
      * @param value The new query.
      */
    def onSearch(value: String): Unit = js.native
  }
  
  object ListView {
    
    inline def apply(props: typings.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@jupyterlab/extensionmanager/lib/widget", "ListView")
    @js.native
    val ^ : js.Any = js.native
    
    trait IProperties extends StObject {
      
      /**
        * The extension entries to display.
        */
      var entries: js.Array[IEntry]
      
      /**
        * The list mode to apply.
        */
      var listMode: black | white | default | invalid
      
      /**
        * The number of pages that can be viewed via pagination.
        */
      var numPages: Double
      
      /**
        * The callback to use for changing the page
        */
      def onPage(page: Double): Unit
      
      /**
        * Callback to use for performing an action on an entry.
        */
      def performAction(action: Action, entry: IEntry): Unit
      
      /**
        * The requested view type.
        */
      var viewType: installed | searchResult
    }
    object IProperties {
      
      inline def apply(
        entries: js.Array[IEntry],
        listMode: black | white | default | invalid,
        numPages: Double,
        onPage: Double => Unit,
        performAction: (Action, IEntry) => Unit,
        viewType: installed | searchResult
      ): typings.jupyterlabExtensionmanager.widgetMod.ListView.IProperties = {
        val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabExtensionmanager.widgetMod.ListView.IProperties]
      }
      
      extension [Self <: typings.jupyterlabExtensionmanager.widgetMod.ListView.IProperties](x: Self) {
        
        inline def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
        
        inline def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
        
        inline def setListMode(value: black | white | default | invalid): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
        
        inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
        
        inline def setOnPage(value: Double => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
        
        inline def setPerformAction(value: (Action, IEntry) => Unit): Self = StObject.set(x, "performAction", js.Any.fromFunction2(value))
        
        inline def setViewType(value: installed | searchResult): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
  @js.native
  class SearchBar protected ()
    extends Component[
          typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties, 
          typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IState, 
          js.Any
        ] {
    def this(props: typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
    
    /**
      * Handler for search input changes.
      */
    def handleChange(e: FormEvent[HTMLElement]): Unit = js.native
  }
  object SearchBar {
    
    /**
      * React properties for search bar component.
      */
    trait IProperties extends StObject {
      
      var disabled: Boolean
      
      /**
        * The placeholder string to use in the search bar input field when empty.
        */
      var placeholder: String
      
      var settings: ISettings
    }
    object IProperties {
      
      inline def apply(disabled: Boolean, placeholder: String, settings: ISettings): typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties = {
        val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties]
      }
      
      extension [Self <: typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: ISettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * React state for search bar component.
      */
    trait IState extends StObject {
      
      /**
        * The value of the search bar input field.
        */
      var value: String
    }
    object IState {
      
      inline def apply(value: String): typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IState = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IState]
      }
      
      extension [Self <: typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IState](x: Self) {
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object ListEntry {
    
    trait IProperties extends StObject {
      
      /**
        * The entry to visualize.
        */
      var entry: IEntry
      
      /**
        * The list mode to apply.
        */
      var listMode: black | white | default | invalid
      
      /**
        * Callback to use for performing an action on the entry.
        */
      def performAction(action: Action, entry: IEntry): Unit
      
      /**
        * The requested view type.
        */
      var viewType: installed | searchResult
    }
    object IProperties {
      
      inline def apply(
        entry: IEntry,
        listMode: black | white | default | invalid,
        performAction: (Action, IEntry) => Unit,
        viewType: installed | searchResult
      ): typings.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties = {
        val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties]
      }
      
      extension [Self <: typings.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties](x: Self) {
        
        inline def setEntry(value: IEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
        
        inline def setListMode(value: black | white | default | invalid): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
        
        inline def setPerformAction(value: (Action, IEntry) => Unit): Self = StObject.set(x, "performAction", js.Any.fromFunction2(value))
        
        inline def setViewType(value: installed | searchResult): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      }
    }
  }
}
