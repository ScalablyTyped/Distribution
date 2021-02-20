package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleColumns extends Base {
  
  var buttonEnabledList: Map[Double, Set[Double]] = js.native
  
  def checkDependencies(): Unit = js.native
  
  var collapsableCoordsList: Map[Double, Set[Double]] = js.native
  
  def collapseAll(): Unit = js.native
  
  def collapseSection(coords: js.Object): Unit = js.native
  
  var collapsedColumns: js.Array[Double] = js.native
  
  var collapsedSections: Map[Double, js.Array[_]] = js.native
  
  var columnHeaderLevelCount: Double = js.native
  
  var eventManager: EventManager = js.native
  
  def expandAll(): Unit = js.native
  
  def expandSection(coords: js.Object): Unit = js.native
  
  def generateIndicator(col: Double, TH: HTMLElement): HTMLElement = js.native
  
  var hiddenColumnsPlugin: js.Object = js.native
  
  def markSectionAs(state: String, row: Double, column: Double, recursive: Boolean): Unit = js.native
  
  def meetsDependencies(): Boolean = js.native
  
  var nestedHeadersPlugin: js.Object = js.native
  
  def parseSettings(): Unit = js.native
  
  var settings: Boolean | js.Array[_] = js.native
  
  def toggleAllCollapsibleSections(action: String): Unit = js.native
  
  def toggleCollapsibleSection(coords: js.Array[js.Object], action: String): Unit = js.native
}
object CollapsibleColumns {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    buttonEnabledList: Map[Double, Set[Double]],
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkDependencies: () => Unit,
    clearHooks: () => Unit,
    collapsableCoordsList: Map[Double, Set[Double]],
    collapseAll: () => Unit,
    collapseSection: js.Object => Unit,
    collapsedColumns: js.Array[Double],
    collapsedSections: Map[Double, js.Array[_]],
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
    toggleAllCollapsibleSections: String => Unit,
    toggleCollapsibleSection: (js.Array[js.Object], String) => Unit,
    updatePlugin: () => Unit
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), buttonEnabledList = buttonEnabledList.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkDependencies = js.Any.fromFunction0(checkDependencies), clearHooks = js.Any.fromFunction0(clearHooks), collapsableCoordsList = collapsableCoordsList.asInstanceOf[js.Any], collapseAll = js.Any.fromFunction0(collapseAll), collapseSection = js.Any.fromFunction1(collapseSection), collapsedColumns = collapsedColumns.asInstanceOf[js.Any], collapsedSections = collapsedSections.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], expandAll = js.Any.fromFunction0(expandAll), expandSection = js.Any.fromFunction1(expandSection), generateIndicator = js.Any.fromFunction2(generateIndicator), hiddenColumnsPlugin = hiddenColumnsPlugin.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], markSectionAs = js.Any.fromFunction4(markSectionAs), meetsDependencies = js.Any.fromFunction0(meetsDependencies), nestedHeadersPlugin = nestedHeadersPlugin.asInstanceOf[js.Any], parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any], toggleAllCollapsibleSections = js.Any.fromFunction1(toggleAllCollapsibleSections), toggleCollapsibleSection = js.Any.fromFunction2(toggleCollapsibleSection), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[CollapsibleColumns]
  }
  
  @scala.inline
  implicit class CollapsibleColumnsMutableBuilder[Self <: CollapsibleColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonEnabledList(value: Map[Double, Set[Double]]): Self = StObject.set(x, "buttonEnabledList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckDependencies(value: () => Unit): Self = StObject.set(x, "checkDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapsableCoordsList(value: Map[Double, Set[Double]]): Self = StObject.set(x, "collapsableCoordsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseSection(value: js.Object => Unit): Self = StObject.set(x, "collapseSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsedColumns(value: js.Array[Double]): Self = StObject.set(x, "collapsedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedColumnsVarargs(value: Double*): Self = StObject.set(x, "collapsedColumns", js.Array(value :_*))
    
    @scala.inline
    def setCollapsedSections(value: Map[Double, js.Array[_]]): Self = StObject.set(x, "collapsedSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderLevelCount(value: Double): Self = StObject.set(x, "columnHeaderLevelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandSection(value: js.Object => Unit): Self = StObject.set(x, "expandSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateIndicator(value: (Double, HTMLElement) => HTMLElement): Self = StObject.set(x, "generateIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHiddenColumnsPlugin(value: js.Object): Self = StObject.set(x, "hiddenColumnsPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkSectionAs(value: (String, Double, Double, Boolean) => Unit): Self = StObject.set(x, "markSectionAs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMeetsDependencies(value: () => Boolean): Self = StObject.set(x, "meetsDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNestedHeadersPlugin(value: js.Object): Self = StObject.set(x, "nestedHeadersPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseSettings(value: () => Unit): Self = StObject.set(x, "parseSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettings(value: Boolean | js.Array[_]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: js.Any*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setToggleAllCollapsibleSections(value: String => Unit): Self = StObject.set(x, "toggleAllCollapsibleSections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleCollapsibleSection(value: (js.Array[js.Object], String) => Unit): Self = StObject.set(x, "toggleCollapsibleSection", js.Any.fromFunction2(value))
  }
}
