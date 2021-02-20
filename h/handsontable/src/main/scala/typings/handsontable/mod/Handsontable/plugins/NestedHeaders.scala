package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedHeaders extends Base {
  
  def checkForFixedColumnsCollision(): Unit = js.native
  
  def checkForOverlappingHeaders(): Unit = js.native
  
  var colspanArray: js.Array[_] = js.native
  
  var columnHeaderLevelCount: Double = js.native
  
  def fillColspanArrayWithDummies(colspan: Double, level: Double): Unit = js.native
  
  def fillTheRemainingColspans(): Unit = js.native
  
  def getChildHeaders(row: Double, column: Double): js.Array[_] = js.native
  
  def getColspan(row: Double, column: Double): Double = js.native
  
  def getNestedParent(level: Double, column: Double): js.Any = js.native
  
  var ghostTable: GhostTableNestedHeaders = js.native
  
  def headerRendererFactory(headerRow: Double): js.Function0[Unit] = js.native
  
  def levelToRowCoords(level: Double): Double = js.native
  
  def rowCoordsToLevel(row: Double): Double = js.native
  
  var settings: js.Array[_] = js.native
  
  def setupColspanArray(): Unit = js.native
}
object NestedHeaders {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkForFixedColumnsCollision: () => Unit,
    checkForOverlappingHeaders: () => Unit,
    clearHooks: () => Unit,
    colspanArray: js.Array[_],
    columnHeaderLevelCount: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    fillColspanArrayWithDummies: (Double, Double) => Unit,
    fillTheRemainingColspans: () => Unit,
    getChildHeaders: (Double, Double) => js.Array[_],
    getColspan: (Double, Double) => Double,
    getNestedParent: (Double, Double) => js.Any,
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: Double => js.Function0[Unit],
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    levelToRowCoords: Double => Double,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    rowCoordsToLevel: Double => Double,
    settings: js.Array[_],
    setupColspanArray: () => Unit,
    updatePlugin: () => Unit
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkForFixedColumnsCollision = js.Any.fromFunction0(checkForFixedColumnsCollision), checkForOverlappingHeaders = js.Any.fromFunction0(checkForOverlappingHeaders), clearHooks = js.Any.fromFunction0(clearHooks), colspanArray = colspanArray.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], fillColspanArrayWithDummies = js.Any.fromFunction2(fillColspanArrayWithDummies), fillTheRemainingColspans = js.Any.fromFunction0(fillTheRemainingColspans), getChildHeaders = js.Any.fromFunction2(getChildHeaders), getColspan = js.Any.fromFunction2(getColspan), getNestedParent = js.Any.fromFunction2(getNestedParent), ghostTable = ghostTable.asInstanceOf[js.Any], headerRendererFactory = js.Any.fromFunction1(headerRendererFactory), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], levelToRowCoords = js.Any.fromFunction1(levelToRowCoords), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), rowCoordsToLevel = js.Any.fromFunction1(rowCoordsToLevel), settings = settings.asInstanceOf[js.Any], setupColspanArray = js.Any.fromFunction0(setupColspanArray), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[NestedHeaders]
  }
  
  @scala.inline
  implicit class NestedHeadersMutableBuilder[Self <: NestedHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckForFixedColumnsCollision(value: () => Unit): Self = StObject.set(x, "checkForFixedColumnsCollision", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckForOverlappingHeaders(value: () => Unit): Self = StObject.set(x, "checkForOverlappingHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColspanArray(value: js.Array[_]): Self = StObject.set(x, "colspanArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColspanArrayVarargs(value: js.Any*): Self = StObject.set(x, "colspanArray", js.Array(value :_*))
    
    @scala.inline
    def setColumnHeaderLevelCount(value: Double): Self = StObject.set(x, "columnHeaderLevelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColspanArrayWithDummies(value: (Double, Double) => Unit): Self = StObject.set(x, "fillColspanArrayWithDummies", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFillTheRemainingColspans(value: () => Unit): Self = StObject.set(x, "fillTheRemainingColspans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChildHeaders(value: (Double, Double) => js.Array[_]): Self = StObject.set(x, "getChildHeaders", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetColspan(value: (Double, Double) => Double): Self = StObject.set(x, "getColspan", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNestedParent(value: (Double, Double) => js.Any): Self = StObject.set(x, "getNestedParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGhostTable(value: GhostTableNestedHeaders): Self = StObject.set(x, "ghostTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRendererFactory(value: Double => js.Function0[Unit]): Self = StObject.set(x, "headerRendererFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevelToRowCoords(value: Double => Double): Self = StObject.set(x, "levelToRowCoords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowCoordsToLevel(value: Double => Double): Self = StObject.set(x, "rowCoordsToLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSettings(value: js.Array[_]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: js.Any*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setSetupColspanArray(value: () => Unit): Self = StObject.set(x, "setupColspanArray", js.Any.fromFunction0(value))
  }
}
