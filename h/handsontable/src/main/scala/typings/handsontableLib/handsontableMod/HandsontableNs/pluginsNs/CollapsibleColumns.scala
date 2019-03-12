package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleColumns extends Base {
  var buttonEnabledList: js.Object
  var collapsedSections: js.Object
  var columnHeaderLevelCount: scala.Double
  var eventManager: EventManager
  var hiddenColumnsPlugin: js.Object
  var nestedHeadersPlugin: js.Object
  var settings: scala.Boolean | js.Array[_]
  def checkDependencies(): scala.Unit
  def collapseAll(): scala.Unit
  def collapseSection(coords: js.Object): scala.Unit
  def expandAll(): scala.Unit
  def expandSection(coords: js.Object): scala.Unit
  def generateIndicator(col: scala.Double, TH: stdLib.HTMLElement): stdLib.HTMLElement
  def markSectionAs(state: java.lang.String, row: scala.Double, column: scala.Double, recursive: scala.Boolean): scala.Unit
  def meetsDependencies(): scala.Boolean
  def parseSettings(): scala.Unit
  def toggleAllCollapsibleSections(action: java.lang.String): scala.Unit
  def toggleCollapsibleSection(coords: js.Object, action: java.lang.String): scala.Unit
}

object CollapsibleColumns {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    buttonEnabledList: js.Object,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    checkDependencies: () => scala.Unit,
    clearHooks: () => scala.Unit,
    collapseAll: () => scala.Unit,
    collapseSection: js.Object => scala.Unit,
    collapsedSections: js.Object,
    columnHeaderLevelCount: scala.Double,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    expandAll: () => scala.Unit,
    expandSection: js.Object => scala.Unit,
    generateIndicator: (scala.Double, stdLib.HTMLElement) => stdLib.HTMLElement,
    hiddenColumnsPlugin: js.Object,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    markSectionAs: (java.lang.String, scala.Double, scala.Double, scala.Boolean) => scala.Unit,
    meetsDependencies: () => scala.Boolean,
    nestedHeadersPlugin: js.Object,
    parseSettings: () => scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    settings: scala.Boolean | js.Array[_],
    toggleAllCollapsibleSections: java.lang.String => scala.Unit,
    toggleCollapsibleSection: (js.Object, java.lang.String) => scala.Unit
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), buttonEnabledList = buttonEnabledList, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkDependencies = js.Any.fromFunction0(checkDependencies), clearHooks = js.Any.fromFunction0(clearHooks), collapseAll = js.Any.fromFunction0(collapseAll), collapseSection = js.Any.fromFunction1(collapseSection), collapsedSections = collapsedSections, columnHeaderLevelCount = columnHeaderLevelCount, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, expandAll = js.Any.fromFunction0(expandAll), expandSection = js.Any.fromFunction1(expandSection), generateIndicator = js.Any.fromFunction2(generateIndicator), hiddenColumnsPlugin = hiddenColumnsPlugin, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, markSectionAs = js.Any.fromFunction4(markSectionAs), meetsDependencies = js.Any.fromFunction0(meetsDependencies), nestedHeadersPlugin = nestedHeadersPlugin, parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), settings = settings.asInstanceOf[js.Any], toggleAllCollapsibleSections = js.Any.fromFunction1(toggleAllCollapsibleSections), toggleCollapsibleSection = js.Any.fromFunction2(toggleCollapsibleSection))
  
    __obj.asInstanceOf[CollapsibleColumns]
  }
}

