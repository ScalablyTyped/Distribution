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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("buttonEnabledList")(buttonEnabledList)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("checkDependencies")(checkDependencies)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("collapseAll")(collapseAll)
    __obj.updateDynamic("collapseSection")(collapseSection)
    __obj.updateDynamic("collapsedSections")(collapsedSections)
    __obj.updateDynamic("columnHeaderLevelCount")(columnHeaderLevelCount)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("eventManager")(eventManager)
    __obj.updateDynamic("expandAll")(expandAll)
    __obj.updateDynamic("expandSection")(expandSection)
    __obj.updateDynamic("generateIndicator")(generateIndicator)
    __obj.updateDynamic("hiddenColumnsPlugin")(hiddenColumnsPlugin)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("markSectionAs")(markSectionAs)
    __obj.updateDynamic("meetsDependencies")(meetsDependencies)
    __obj.updateDynamic("nestedHeadersPlugin")(nestedHeadersPlugin)
    __obj.updateDynamic("parseSettings")(parseSettings)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleAllCollapsibleSections")(toggleAllCollapsibleSections)
    __obj.updateDynamic("toggleCollapsibleSection")(toggleCollapsibleSection)
    __obj.asInstanceOf[CollapsibleColumns]
  }
}

