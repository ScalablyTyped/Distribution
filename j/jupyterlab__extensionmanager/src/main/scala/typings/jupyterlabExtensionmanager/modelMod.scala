package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.deprecated
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.listingsMod.IListEntry
import typings.jupyterlabExtensionmanager.listingsMod.Lister
import typings.jupyterlabExtensionmanager.npmMod.ISearchResult
import typings.jupyterlabExtensionmanager.npmMod.Searcher
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel")
  @js.native
  class ListModel protected () extends VDomModel {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
    
    /**
      * Add a pending action.
      *
      * @param pending A promise that resolves when the action is completed.
      */
    /* protected */ def _addPendingAction(pending: js.Promise[_]): Unit = js.native
    
    var _blacklistArray: js.Any = js.native
    
    var _debouncedUpdate: js.Any = js.native
    
    var _installed: js.Any = js.native
    
    var _listMode: js.Any = js.native
    
    var _listingIsLoaded: js.Any = js.native
    
    var _page: js.Any = js.native
    
    var _pagination: js.Any = js.native
    
    var _pendingActions: js.Any = js.native
    
    /**
      * Send a request to the server to perform an action on an extension.
      *
      * @param action A valid action to perform.
      * @param entry The extension to perform the action on.
      */
    /* protected */ def _performAction(action: String, entry: IEntry): js.Promise[IActionReply] = js.native
    
    var _query: js.Any = js.native
    
    var _searchResult: js.Any = js.native
    
    var _totalBlacklistedFound: js.Any = js.native
    
    var _totalEntries: js.Any = js.native
    
    var _totalWhitelistedFound: js.Any = js.native
    
    var _whitelistArray: js.Any = js.native
    
    /**
      * Contains an error message if an error occurred when searching for lists.
      */
    var blacklistError: String | Null = js.native
    
    /**
      * Check for companion packages in kernels or server.
      *
      * @param entry An entry indicating which extension to check.
      */
    def checkCompanionPackages(entry: IEntry): js.Promise[Boolean] = js.native
    
    /**
      * Disable an extension.
      *
      * @param entry An entry indicating which extension to disable.
      */
    def disable(entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * Enable an extension.
      *
      * @param entry An entry indicating which extension to enable.
      */
    def enable(entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * Make a request to the server for info about its installed extensions.
      */
    /* protected */ def fetchInstalled(): js.Promise[js.Array[IInstalledEntry]] = js.native
    /* protected */ def fetchInstalled(refreshInstalled: Boolean): js.Promise[js.Array[IInstalledEntry]] = js.native
    
    /**
      * Whether there are currently any actions pending.
      */
    def hasPendingActions(): Boolean = js.native
    
    /**
      * Ignore a build recommendation
      */
    def ignoreBuildRecommendation(): Unit = js.native
    
    /**
      * Initialize the model.
      */
    def initialize(): js.Promise[Unit] = js.native
    
    /**
      * Whether the model has finished async initialization.
      */
    var initialized: Boolean = js.native
    
    /**
      * Install an extension.
      *
      * @param entry An entry indicating which extension to install.
      */
    def install(entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * A readonly array of the installed extensions.
      */
    def installed: js.Array[IEntry] = js.native
    
    /**
      * Contains an error message if an error occurred when querying installed extensions.
      */
    var installedError: String | Null = js.native
    
    var isListed: js.Any = js.native
    
    /**
      * The list mode.
      */
    def listMode: black | white | default | invalid = js.native
    
    var lister: Lister = js.native
    
    /**
      * The current NPM repository search page.
      *
      * The npm repository search is paginated by the `pagination` attribute.
      * The `page` value selects which page is used.
      *
      * Setting its value triggers a new search.
      */
    def page: Double = js.native
    def page_=(value: Double): Unit = js.native
    
    /**
      * The NPM repository search pagination.
      *
      * The npm repository search is paginated by the `pagination` attribute.
      * The `page` value selects which page is used.
      *
      * Setting its value triggers a new search.
      */
    def pagination: Double = js.native
    def pagination_=(value: Double): Unit = js.native
    
    /**
      * Perform a build on the server
      */
    def performBuild(): Unit = js.native
    
    /**
      * Search with current query.
      *
      * Sets searchError and totalEntries as appropriate.
      *
      * @returns {Promise<{ [key: string]: IEntry; }>} The search result as a map of entries.
      */
    /* protected */ def performSearch(): js.Promise[StringDictionary[IEntry]] = js.native
    
    /**
      * Whether a fresh build should be considered due to actions taken.
      */
    var promptBuild: Boolean = js.native
    
    /**
      * The current NPM repository search query.
      *
      * Setting its value triggers a new search.
      */
    def query: String | Null = js.native
    
    /**
      * Query the installed extensions.
      *
      * Sets installedError as appropriate.
      *
      * @returns {Promise<{ [key: string]: IEntry; }>} A map of installed extensions.
      */
    /* protected */ def queryInstalled(refreshInstalled: Boolean): js.Promise[StringDictionary[IEntry]] = js.native
    
    def query_=(value: String | Null): Unit = js.native
    
    /**
      * Ignore a build recommendation
      */
    def refreshInstalled(): Unit = js.native
    
    /**
      * Contains an error message if an error occurred when searching for extensions.
      */
    var searchError: String | Null = js.native
    
    /**
      * A readonly array containing the latest search result
      */
    def searchResult: js.Array[IEntry] = js.native
    
    /**
      * A helper for performing searches of jupyterlab extensions on the NPM repository.
      */
    var searcher: Searcher = js.native
    
    /**
      * Contains an error message if an error occurred when querying the server extension.
      */
    var serverConnectionError: String | Null = js.native
    
    /**
      * Settings for connecting to the notebook server.
      */
    var serverConnectionSettings: typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings = js.native
    
    /**
      * Contains an error message if the server has unfulfilled requirements.
      */
    var serverRequirementsError: String | Null = js.native
    
    /**
      * The service manager to use for building.
      */
    var serviceManager: ServiceManager = js.native
    
    /**
      * The total number of blacklisted results in the current search.
      */
    def totalBlacklistedFound: Double = js.native
    
    /**
      * The total number of results in the current search.
      */
    def totalEntries: Double = js.native
    
    /**
      * The total number of whitelisted results in the current search.
      */
    def totalWhitelistedFound: Double = js.native
    
    /**
      * Translate installed extensions information from the server into entries.
      *
      * @param res Promise to the server reply data.
      */
    /* protected */ def translateInstalled(res: js.Promise[js.Array[IInstalledEntry]]): js.Promise[StringDictionary[IEntry]] = js.native
    
    /**
      * Translate search results from an npm repository query into entries
      * and remove entries with 'deprecated' in the keyword list
      *
      * @param res Promise to an npm query result.
      */
    /* protected */ def translateSearchResult(res: js.Promise[ISearchResult]): js.Promise[StringDictionary[IEntry]] = js.native
    
    /**
      * Trigger a build check to incorporate actions taken.
      */
    def triggerBuildCheck(): Unit = js.native
    
    /**
      * Uninstall an extension.
      *
      * @param entry An entry indicating which extension to uninstall.
      */
    def uninstall(entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * Update the current model.
      *
      * This will query the NPM repository, and the notebook server.
      *
      * Emits the `stateChanged` signal on successful completion.
      */
    /* protected */ def update(): js.Promise[Unit] = js.native
    /* protected */ def update(refreshInstalled: Boolean): js.Promise[Unit] = js.native
  }
  object ListModel {
    
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    @JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel.entryHasUpdate")
    @js.native
    def entryHasUpdate(entry: IEntry): Boolean = js.native
    
    @JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel.isDisclaimed")
    @js.native
    def isDisclaimed(): Boolean = js.native
    
    @JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel.toogleDisclaimed")
    @js.native
    def toogleDisclaimed(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install
    - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall
    - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable
    - typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def disable: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable = "disable".asInstanceOf[typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable]
    
    @scala.inline
    def enable: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable = "enable".asInstanceOf[typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable]
    
    @scala.inline
    def install: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install = "install".asInstanceOf[typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install]
    
    @scala.inline
    def uninstall: typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall = "uninstall".asInstanceOf[typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall]
  }
  
  @js.native
  trait IActionReply extends StObject {
    
    /**
      * An optional message when the status is not 'ok'.
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * The status category of the reply.
      */
    var status: ok | warning | error | Null = js.native
  }
  object IActionReply {
    
    @scala.inline
    def apply(): IActionReply = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionReply]
    }
    
    @scala.inline
    implicit class IActionReplyMutableBuilder[Self <: IActionReply] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStatus(value: ok | warning | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
    }
  }
  
  @js.native
  trait IEntry extends StObject {
    
    var blacklistEntry: js.UndefOr[IListEntry] = js.native
    
    /**
      * A short description of the extension.
      */
    var description: String = js.native
    
    /**
      * Whether the extension is currently enabled.
      */
    var enabled: Boolean = js.native
    
    /**
      * Whether the extension is currently installed.
      */
    var installed: Boolean = js.native
    
    /**
      * The installed version of the extension.
      */
    var installed_version: String = js.native
    
    /**
      * The latest version of the extension.
      */
    var latest_version: String = js.native
    
    /**
      * The name of the extension.
      */
    var name: String = js.native
    
    /**
      * A flag indicating the status of an installed extension.
      */
    var status: ok | warning | error | deprecated | Null = js.native
    
    /**
      * A representative link of the package.
      */
    var url: String = js.native
    
    var whitelistEntry: js.UndefOr[IListEntry] = js.native
  }
  object IEntry {
    
    @scala.inline
    def apply(
      description: String,
      enabled: Boolean,
      installed: Boolean,
      installed_version: String,
      latest_version: String,
      name: String,
      url: String
    ): IEntry = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntry]
    }
    
    @scala.inline
    implicit class IEntryMutableBuilder[Self <: IEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklistEntry(value: IListEntry): Self = StObject.set(x, "blacklistEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistEntryUndefined: Self = StObject.set(x, "blacklistEntry", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalled_version(value: String): Self = StObject.set(x, "installed_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_version(value: String): Self = StObject.set(x, "latest_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ok | warning | error | deprecated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistEntry(value: IListEntry): Self = StObject.set(x, "whitelistEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistEntryUndefined: Self = StObject.set(x, "whitelistEntry", js.undefined)
    }
  }
  
  @js.native
  trait IInstalledEntry extends StObject {
    
    /**
      * A short description of the extension.
      */
    var description: String = js.native
    
    /**
      * Whether the extension is currently enabled.
      */
    var enabled: Boolean = js.native
    
    /**
      * Whether the extension is currently installed.
      */
    var installed: js.UndefOr[Boolean] = js.native
    
    /**
      * The installed version of the extension.
      */
    var installed_version: String = js.native
    
    /**
      * The latest version of the extension.
      */
    var latest_version: String = js.native
    
    /**
      * The name of the extension.
      */
    var name: String = js.native
    
    /**
      * A flag indicating the status of an installed extension.
      */
    var status: ok | warning | error | deprecated | Null = js.native
    
    /**
      * A representative link of the package.
      */
    var url: String = js.native
  }
  object IInstalledEntry {
    
    @scala.inline
    def apply(
      description: String,
      enabled: Boolean,
      installed_version: String,
      latest_version: String,
      name: String,
      url: String
    ): IInstalledEntry = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInstalledEntry]
    }
    
    @scala.inline
    implicit class IInstalledEntryMutableBuilder[Self <: IInstalledEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalledUndefined: Self = StObject.set(x, "installed", js.undefined)
      
      @scala.inline
      def setInstalled_version(value: String): Self = StObject.set(x, "installed_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_version(value: String): Self = StObject.set(x, "latest_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ok | warning | error | deprecated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
