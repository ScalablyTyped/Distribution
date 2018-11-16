package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgHierarchicalGridMethods extends js.Object {
  /**
  	 * Returns a flat list of all child grid elements (recursive)
  	 */
  def allChildren(): js.Object = js.native
  /**
  	 * Returns a flat list of all child grid widgets (not elements) - recursive
  	 */
  def allChildrenWidgets(): js.Object = js.native
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.ighierarchicalgrid#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.ighierarchicalgrid#options:language) or [locale](ui.ighierarchicalgrid#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.ighierarchicalgrid#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.ighierarchicalgrid#options:regional) option setter
  	 */
  def changeRegional(): scala.Unit = js.native
  /**
  	 * Collapses a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param id accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is expanded(optional). Takes 2 arguments - first is hierarchical grid object, second is the row element that was collapsed
  	 */
  def collapse(id: stdLib.Element): scala.Unit = js.native
  /**
  	 * Collapses a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param id accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is expanded(optional). Takes 2 arguments - first is hierarchical grid object, second is the row element that was collapsed
  	 */
  def collapse(id: stdLib.Element, callback: js.Function): scala.Unit = js.native
  /**
  	 * Checks if a parent row is currently collapsed
  	 *
  	 * @param element accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 */
  def collapsed(element: stdLib.Element): scala.Boolean = js.native
  /**
  	 * Commits pending transactions to the client data source for main and all child grids.
  	 */
  def commit(): scala.Unit = js.native
  /**
  	 * Data binds the hierarchical grid. No child grids will be created or rendered by default, unless there is initialExpandDepth >= 0 set.
  	 */
  def dataBind(): scala.Unit = js.native
  /**
  	 * Destroys the hierarchical grid by recursively destroying all child grids
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Expands (toggles) a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param id accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is expanded(optional). Takes 2 arguments first is hierarchical grid object, second is the row element that was expanded
  	 */
  def expand(id: stdLib.Element): scala.Unit = js.native
  /**
  	 * Expands (toggles) a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param id accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is expanded(optional). Takes 2 arguments first is hierarchical grid object, second is the row element that was expanded
  	 */
  def expand(id: stdLib.Element, callback: js.Function): scala.Unit = js.native
  /**
  	 * Checks if a parent row is expanded or not
  	 *
  	 * @param element accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 */
  def expanded(element: stdLib.Element): scala.Boolean = js.native
  /**
  	 * Checks if a parent row is populated with data
  	 *
  	 * @param element accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 */
  def populated(element: stdLib.Element): scala.Boolean = js.native
  /**
  	 * Clears the transaction log (delegates to igDataSource). Note that this does not update the UI. In case the UI must be updated, set the second parameter "updateUI" to true, which will trigger a call to dataBind() to re-render the contents.
  	 *
  	 * @param rebind Whether to perform a rebind.
  	 */
  def rollback(): scala.Unit = js.native
  /**
  	 * Clears the transaction log (delegates to igDataSource). Note that this does not update the UI. In case the UI must be updated, set the second parameter "updateUI" to true, which will trigger a call to dataBind() to re-render the contents.
  	 *
  	 * @param rebind Whether to perform a rebind.
  	 */
  def rollback(rebind: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns the element of the root grid (igGrid)
  	 */
  def root(): js.Object = js.native
  /**
  	 * Returns the widget object of the root grid (igGrid)
  	 */
  def rootWidget(): js.Object = js.native
  /**
  	 * Posts to the settings.updateUrl using $.ajax, by serializing the changes as url params
  	 *
  	 * @param success Specifies a custom function to be called when AJAX request to the updateUrl option succeeds(optional)
  	 * @param error Specifies a custom function to be called when AJAX request to the updateUrl option fails(optional)
  	 */
  def saveChanges(success: js.Function, error: js.Function): scala.Unit = js.native
  /**
  	 * Expands or collapses (toggles) a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param element accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is toggled(optional). Takes 2 arguments - first is hierarchical grid object, second is the row element that was toggled
  	 */
  def toggle(element: stdLib.Element): scala.Unit = js.native
  /**
  	 * Expands or collapses (toggles) a parent row
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param element accepts a dom element, or a jquery wrapped dom element that should be a TR and should specify a parent row
  	 * @param callback Specifies a custom function to be called when parent row is toggled(optional). Takes 2 arguments - first is hierarchical grid object, second is the row element that was toggled
  	 */
  def toggle(element: stdLib.Element, callback: js.Function): scala.Unit = js.native
}

