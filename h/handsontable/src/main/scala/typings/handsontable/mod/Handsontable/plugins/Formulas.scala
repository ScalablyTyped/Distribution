package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formulas extends Base {
  
  var dataProvider: DataProvider = js.native
  
  var eventManager: EventManager = js.native
  
  def getCellValue(row: Double, column: Double): js.Any = js.native
  
  def getVariable(name: String): js.Any = js.native
  
  def hasComputedCellValue(row: Double, column: Double): Boolean = js.native
  
  def recalculate(): Unit = js.native
  
  def recalculateFull(): Unit = js.native
  
  def recalculateOptimized(): Unit = js.native
  
  def setVariable(name: String, value: js.Any): Unit = js.native
  
  var sheet: Sheet = js.native
  
  var undoRedoSnapshot: UndoRedoSnapshot = js.native
}
object Formulas {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    dataProvider: DataProvider,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getCellValue: (Double, Double) => js.Any,
    getVariable: String => js.Any,
    hasComputedCellValue: (Double, Double) => Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: () => Unit,
    recalculateFull: () => Unit,
    recalculateOptimized: () => Unit,
    removeHooks: String => Unit,
    setVariable: (String, js.Any) => Unit,
    sheet: Sheet,
    undoRedoSnapshot: UndoRedoSnapshot,
    updatePlugin: () => Unit
  ): Formulas = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), dataProvider = dataProvider.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getVariable = js.Any.fromFunction1(getVariable), hasComputedCellValue = js.Any.fromFunction2(hasComputedCellValue), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], recalculate = js.Any.fromFunction0(recalculate), recalculateFull = js.Any.fromFunction0(recalculateFull), recalculateOptimized = js.Any.fromFunction0(recalculateOptimized), removeHooks = js.Any.fromFunction1(removeHooks), setVariable = js.Any.fromFunction2(setVariable), sheet = sheet.asInstanceOf[js.Any], undoRedoSnapshot = undoRedoSnapshot.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Formulas]
  }
  
  @scala.inline
  implicit class FormulasMutableBuilder[Self <: Formulas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataProvider(value: DataProvider): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellValue(value: (Double, Double) => js.Any): Self = StObject.set(x, "getCellValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetVariable(value: String => js.Any): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasComputedCellValue(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasComputedCellValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRecalculate(value: () => Unit): Self = StObject.set(x, "recalculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecalculateFull(value: () => Unit): Self = StObject.set(x, "recalculateFull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecalculateOptimized(value: () => Unit): Self = StObject.set(x, "recalculateOptimized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVariable(value: (String, js.Any) => Unit): Self = StObject.set(x, "setVariable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoRedoSnapshot(value: UndoRedoSnapshot): Self = StObject.set(x, "undoRedoSnapshot", value.asInstanceOf[js.Any])
  }
}
