package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleColumns extends Base {
  var buttonEnabledList: js.Object
  var collapsedSections: js.Object
  var columnHeaderLevelCount: Double
  var eventManager: EventManager
  var hiddenColumnsPlugin: js.Object
  var nestedHeadersPlugin: js.Object
  var settings: Boolean | js.Array[_]
  def checkDependencies(): Unit
  def collapseAll(): Unit
  def collapseSection(coords: js.Object): Unit
  def expandAll(): Unit
  def expandSection(coords: js.Object): Unit
  def generateIndicator(col: Double, TH: HTMLElement): HTMLElement
  def markSectionAs(state: String, row: Double, column: Double, recursive: Boolean): Unit
  def meetsDependencies(): Boolean
  def parseSettings(): Unit
  def toggleAllCollapsibleSections(action: String): Unit
  def toggleCollapsibleSection(coords: js.Object, action: String): Unit
}

object CollapsibleColumns {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    buttonEnabledList: js.Object,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkDependencies: () => Unit,
    clearHooks: () => Unit,
    collapseAll: () => Unit,
    collapseSection: js.Object => Unit,
    collapsedSections: js.Object,
    columnHeaderLevelCount: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    expandAll: () => Unit,
    expandSection: js.Object => Unit,
    generateIndicator: (Double, HTMLElement) => HTMLElement,
    hiddenColumnsPlugin: js.Object,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    markSectionAs: (String, Double, Double, Boolean) => Unit,
    meetsDependencies: () => Boolean,
    nestedHeadersPlugin: js.Object,
    parseSettings: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    settings: Boolean | js.Array[_],
    t: RecordTranslator,
    toggleAllCollapsibleSections: String => Unit,
    toggleCollapsibleSection: (js.Object, String) => Unit,
    updatePlugin: () => Unit
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), buttonEnabledList = buttonEnabledList.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkDependencies = js.Any.fromFunction0(checkDependencies), clearHooks = js.Any.fromFunction0(clearHooks), collapseAll = js.Any.fromFunction0(collapseAll), collapseSection = js.Any.fromFunction1(collapseSection), collapsedSections = collapsedSections.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], expandAll = js.Any.fromFunction0(expandAll), expandSection = js.Any.fromFunction1(expandSection), generateIndicator = js.Any.fromFunction2(generateIndicator), hiddenColumnsPlugin = hiddenColumnsPlugin.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], markSectionAs = js.Any.fromFunction4(markSectionAs), meetsDependencies = js.Any.fromFunction0(meetsDependencies), nestedHeadersPlugin = nestedHeadersPlugin.asInstanceOf[js.Any], parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], toggleAllCollapsibleSections = js.Any.fromFunction1(toggleAllCollapsibleSections), toggleCollapsibleSection = js.Any.fromFunction2(toggleCollapsibleSection), updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[CollapsibleColumns]
  }
}

