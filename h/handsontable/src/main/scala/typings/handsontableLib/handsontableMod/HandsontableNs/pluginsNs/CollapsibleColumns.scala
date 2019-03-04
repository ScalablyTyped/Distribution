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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    buttonEnabledList: js.Object,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    checkDependencies: js.Function0[scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    collapseAll: js.Function0[scala.Unit],
    collapseSection: js.Function1[js.Object, scala.Unit],
    collapsedSections: js.Object,
    columnHeaderLevelCount: scala.Double,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    expandAll: js.Function0[scala.Unit],
    expandSection: js.Function1[js.Object, scala.Unit],
    generateIndicator: js.Function2[scala.Double, stdLib.HTMLElement, stdLib.HTMLElement],
    hiddenColumnsPlugin: js.Object,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    markSectionAs: js.Function4[java.lang.String, scala.Double, scala.Double, scala.Boolean, scala.Unit],
    meetsDependencies: js.Function0[scala.Boolean],
    nestedHeadersPlugin: js.Object,
    parseSettings: js.Function0[scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    settings: scala.Boolean | js.Array[_],
    toggleAllCollapsibleSections: js.Function1[java.lang.String, scala.Unit],
    toggleCollapsibleSection: js.Function2[js.Object, java.lang.String, scala.Unit]
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(addHook = addHook, buttonEnabledList = buttonEnabledList, callOnPluginsReady = callOnPluginsReady, checkDependencies = checkDependencies, clearHooks = clearHooks, collapseAll = collapseAll, collapseSection = collapseSection, collapsedSections = collapsedSections, columnHeaderLevelCount = columnHeaderLevelCount, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, expandAll = expandAll, expandSection = expandSection, generateIndicator = generateIndicator, hiddenColumnsPlugin = hiddenColumnsPlugin, init = init, initialized = initialized, isPluginsReady = isPluginsReady, markSectionAs = markSectionAs, meetsDependencies = meetsDependencies, nestedHeadersPlugin = nestedHeadersPlugin, parseSettings = parseSettings, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, settings = settings.asInstanceOf[js.Any], toggleAllCollapsibleSections = toggleAllCollapsibleSections, toggleCollapsibleSection = toggleCollapsibleSection)
  
    __obj.asInstanceOf[CollapsibleColumns]
  }
}

