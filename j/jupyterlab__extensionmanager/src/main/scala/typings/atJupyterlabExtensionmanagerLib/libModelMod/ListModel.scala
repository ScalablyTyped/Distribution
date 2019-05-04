package typings
package atJupyterlabExtensionmanagerLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel")
@js.native
class ListModel protected ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.VDomModel {
  def this(serviceManager: atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager) = this()
  var _installed: js.Any = js.native
  var _page: js.Any = js.native
  var _pagination: js.Any = js.native
  var _pendingActions: js.Any = js.native
  var _query: js.Any = js.native
  var _searchResult: js.Any = js.native
  var _totalEntries: js.Any = js.native
  /**
    * Whether the model has finished async initialization.
    */
  var initialized: scala.Boolean = js.native
  /**
    * A readonly array of the installed extensions.
    */
  val installed: js.Array[IEntry] = js.native
  /**
    * Contains an error message if an error occurred when querying installed extensions.
    */
  var installedError: java.lang.String | scala.Null = js.native
  /**
    * The current NPM repository search page.
    *
    * The npm repository search is paginated by the `pagination` attribute.
    * The `page` value selects which page is used.
    *
    * Setting its value triggers a new search.
    */
  var page: scala.Double = js.native
  /**
    * The NPM repository search pagination.
    *
    * The npm repository search is paginated by the `pagination` attribute.
    * The `page` value selects which page is used.
    *
    * Setting its value triggers a new search.
    */
  var pagination: scala.Double = js.native
  /**
    * Whether a fresh build should be considered due to actions taken.
    */
  var promptBuild: scala.Boolean = js.native
  /**
    * The current NPM repository search query.
    *
    * Setting its value triggers a new search.
    */
  var query: java.lang.String | scala.Null = js.native
  /**
    * Contains an error message if an error occurred when searching for extensions.
    */
  var searchError: java.lang.String | scala.Null = js.native
  /**
    * A readonly array containing the latest search result
    */
  val searchResult: js.Array[IEntry] = js.native
  /**
    * A helper for performing searches of jupyterlab extensions on the NPM repository.
    */
  var searcher: atJupyterlabExtensionmanagerLib.libQueryMod.Searcher = js.native
  /**
    * Contains an error message if an error occurred when querying the server extension.
    */
  var serverConnectionError: java.lang.String | scala.Null = js.native
  /**
    * Settings for connecting to the notebook server.
    */
  var serverConnectionSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * Contains an error message if the server has unfulfilled requirements.
    */
  var serverRequirementsError: java.lang.String | scala.Null = js.native
  /**
    * The service manager to use for building.
    */
  var serviceManager: atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager = js.native
  /**
    * The total number of results in the current search.
    */
  val totalEntries: scala.Double = js.native
  /**
    * Add a pending action.
    *
    * @param pending A promise that resolves when the action is completed.
    */
  /* protected */ def _addPendingAction(pending: js.Promise[_]): scala.Unit = js.native
  /**
    * Send a request to the server to perform an action on an extension.
    *
    * @param action A valid action to perform.
    * @param entry The extension to perform the action on.
    */
  /* protected */ def _performAction(action: java.lang.String, entry: IEntry): js.Promise[IActionReply] = js.native
  /**
    * Check for companion packages in kernels or server.
    *
    * @param entry An entry indicating which extension to check.
    */
  def checkCompanionPackages(entry: IEntry): js.Promise[scala.Boolean] = js.native
  /**
    * Disable an extension.
    *
    * @param entry An entry indicating which extension to disable.
    */
  def disable(entry: IEntry): scala.Unit = js.native
  /**
    * Enable an extension.
    *
    * @param entry An entry indicating which extension to enable.
    */
  def enable(entry: IEntry): scala.Unit = js.native
  /**
    * Make a request to the server for info about its installed extensions.
    */
  /* protected */ def fetchInstalled(): js.Promise[js.Array[IInstalledEntry]] = js.native
  /* protected */ def fetchInstalled(refreshInstalled: scala.Boolean): js.Promise[js.Array[IInstalledEntry]] = js.native
  /**
    * Whether there are currently any actions pending.
    */
  def hasPendingActions(): scala.Boolean = js.native
  /**
    * Ignore a build recommendation
    */
  def ignoreBuildRecommendation(): scala.Unit = js.native
  /**
    * Initialize the model.
    */
  def initialize(): scala.Unit = js.native
  /**
    * Install an extension.
    *
    * @param entry An entry indicating which extension to install.
    */
  def install(entry: IEntry): js.Promise[scala.Unit] = js.native
  /**
    * Perform a build on the server
    */
  def performBuild(): scala.Unit = js.native
  /**
    * Search with current query.
    *
    * Sets searchError and totalEntries as appropriate.
    *
    * @returns {Promise<{ [key: string]: IEntry; }>} The search result as a map of entries.
    */
  /* protected */ def performSearch(): js.Promise[org.scalablytyped.runtime.StringDictionary[IEntry]] = js.native
  /**
    * Query the installed extensions.
    *
    * Sets installedError as appropriate.
    *
    * @returns {Promise<{ [key: string]: IEntry; }>} A map of installed extensions.
    */
  /* protected */ def queryInstalled(refreshInstalled: scala.Boolean): js.Promise[org.scalablytyped.runtime.StringDictionary[IEntry]] = js.native
  /**
    * Ignore a build recommendation
    */
  def refreshInstalled(): scala.Unit = js.native
  /**
    * Translate installed extensions information from the server into entries.
    *
    * @param res Promise to the server reply data.
    */
  /* protected */ def translateInstalled(res: js.Promise[js.Array[IInstalledEntry]]): js.Promise[org.scalablytyped.runtime.StringDictionary[IEntry]] = js.native
  /**
    * Translate search results from an npm repository query into entries
    * and remove entries with 'deprecated' in the keyword list
    *
    * @param res Promise to an npm query result.
    */
  /* protected */ def translateSearchResult(res: js.Promise[atJupyterlabExtensionmanagerLib.libQueryMod.ISearchResult]): js.Promise[org.scalablytyped.runtime.StringDictionary[IEntry]] = js.native
  /**
    * Trigger a build check to incorporate actions taken.
    */
  def triggerBuildCheck(): scala.Unit = js.native
  /**
    * Uninstall an extension.
    *
    * @param entry An entry indicating which extension to uninstall.
    */
  def uninstall(entry: IEntry): scala.Unit = js.native
  /**
    * Update the current model.
    *
    * This will query the NPM repository, and the notebook server.
    *
    * Emits the `stateChanged` signal on successful completion.
    */
  /* protected */ def update(): js.Promise[scala.Unit] = js.native
  /* protected */ def update(refreshInstalled: scala.Boolean): js.Promise[scala.Unit] = js.native
}

