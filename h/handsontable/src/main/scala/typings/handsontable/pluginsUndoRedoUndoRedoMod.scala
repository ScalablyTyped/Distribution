package typings.handsontable

import typings.handsontable.commonMod.CellChange
import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.change
import typings.handsontable.handsontableStrings.filter
import typings.handsontable.handsontableStrings.insert_col
import typings.handsontable.handsontableStrings.insert_row
import typings.handsontable.handsontableStrings.remove_col
import typings.handsontable.handsontableStrings.remove_row
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.handsontable.pluginsFiltersFiltersMod.ColumnConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsUndoRedoUndoRedoMod {
  
  @JSImport("handsontable/plugins/undoRedo/undoRedo", "UndoRedo")
  @js.native
  open class UndoRedo protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def redo(): Unit = js.native
    
    def undo(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.ChangeAction
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertRowAction
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveRowAction
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertColAction
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveColAction
    - typings.handsontable.pluginsUndoRedoUndoRedoMod.FilterAction
  */
  trait Action extends StObject
  object Action {
    
    inline def ChangeAction(changes: js.Array[CellChange], selected: js.Array[js.Tuple2[Double, Double]]): typings.handsontable.pluginsUndoRedoUndoRedoMod.ChangeAction = {
      val __obj = js.Dynamic.literal(actionType = "change", changes = changes.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.ChangeAction]
    }
    
    inline def FilterAction(conditionsStack: js.Array[ColumnConditions]): typings.handsontable.pluginsUndoRedoUndoRedoMod.FilterAction = {
      val __obj = js.Dynamic.literal(actionType = "filter", conditionsStack = conditionsStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.FilterAction]
    }
    
    inline def InsertColAction(amount: Double, index: Double): typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertColAction = {
      val __obj = js.Dynamic.literal(actionType = "insert_col", amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertColAction]
    }
    
    inline def InsertRowAction(amount: Double, index: Double): typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertRowAction = {
      val __obj = js.Dynamic.literal(actionType = "insert_row", amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.InsertRowAction]
    }
    
    inline def RemoveColAction(
      amount: Double,
      columnPositions: js.Array[Double],
      data: js.Array[js.Array[CellValue]],
      headers: js.Array[String],
      index: Double,
      indexes: js.Array[Double]
    ): typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveColAction = {
      val __obj = js.Dynamic.literal(actionType = "remove_col", amount = amount.asInstanceOf[js.Any], columnPositions = columnPositions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveColAction]
    }
    
    inline def RemoveRowAction(data: js.Array[js.Array[CellValue]], index: Double): typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveRowAction = {
      val __obj = js.Dynamic.literal(actionType = "remove_row", data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.pluginsUndoRedoUndoRedoMod.RemoveRowAction]
    }
  }
  
  trait ChangeAction
    extends StObject
       with Action {
    
    var actionType: change
    
    var changes: js.Array[CellChange]
    
    var selected: js.Array[js.Tuple2[Double, Double]]
  }
  object ChangeAction {
    
    inline def apply(changes: js.Array[CellChange], selected: js.Array[js.Tuple2[Double, Double]]): ChangeAction = {
      val __obj = js.Dynamic.literal(actionType = "change", changes = changes.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeAction]
    }
    
    extension [Self <: ChangeAction](x: Self) {
      
      inline def setActionType(value: change): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: js.Array[CellChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: CellChange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setSelected(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "selected", js.Array(value*))
    }
  }
  
  trait FilterAction
    extends StObject
       with Action {
    
    var actionType: filter
    
    var conditionsStack: js.Array[ColumnConditions]
  }
  object FilterAction {
    
    inline def apply(conditionsStack: js.Array[ColumnConditions]): FilterAction = {
      val __obj = js.Dynamic.literal(actionType = "filter", conditionsStack = conditionsStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterAction]
    }
    
    extension [Self <: FilterAction](x: Self) {
      
      inline def setActionType(value: filter): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setConditionsStack(value: js.Array[ColumnConditions]): Self = StObject.set(x, "conditionsStack", value.asInstanceOf[js.Any])
      
      inline def setConditionsStackVarargs(value: ColumnConditions*): Self = StObject.set(x, "conditionsStack", js.Array(value*))
    }
  }
  
  trait InsertColAction
    extends StObject
       with Action {
    
    var actionType: insert_col
    
    var amount: Double
    
    var index: Double
  }
  object InsertColAction {
    
    inline def apply(amount: Double, index: Double): InsertColAction = {
      val __obj = js.Dynamic.literal(actionType = "insert_col", amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertColAction]
    }
    
    extension [Self <: InsertColAction](x: Self) {
      
      inline def setActionType(value: insert_col): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsertRowAction
    extends StObject
       with Action {
    
    var actionType: insert_row
    
    var amount: Double
    
    var index: Double
  }
  object InsertRowAction {
    
    inline def apply(amount: Double, index: Double): InsertRowAction = {
      val __obj = js.Dynamic.literal(actionType = "insert_row", amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertRowAction]
    }
    
    extension [Self <: InsertRowAction](x: Self) {
      
      inline def setActionType(value: insert_row): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveColAction
    extends StObject
       with Action {
    
    var actionType: remove_col
    
    var amount: Double
    
    var columnPositions: js.Array[Double]
    
    var data: js.Array[js.Array[CellValue]]
    
    var headers: js.Array[String]
    
    var index: Double
    
    var indexes: js.Array[Double]
  }
  object RemoveColAction {
    
    inline def apply(
      amount: Double,
      columnPositions: js.Array[Double],
      data: js.Array[js.Array[CellValue]],
      headers: js.Array[String],
      index: Double,
      indexes: js.Array[Double]
    ): RemoveColAction = {
      val __obj = js.Dynamic.literal(actionType = "remove_col", amount = amount.asInstanceOf[js.Any], columnPositions = columnPositions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveColAction]
    }
    
    extension [Self <: RemoveColAction](x: Self) {
      
      inline def setActionType(value: remove_col): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setColumnPositions(value: js.Array[Double]): Self = StObject.set(x, "columnPositions", value.asInstanceOf[js.Any])
      
      inline def setColumnPositionsVarargs(value: Double*): Self = StObject.set(x, "columnPositions", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value*))
    }
  }
  
  trait RemoveRowAction
    extends StObject
       with Action {
    
    var actionType: remove_row
    
    var data: js.Array[js.Array[CellValue]]
    
    var index: Double
  }
  object RemoveRowAction {
    
    inline def apply(data: js.Array[js.Array[CellValue]], index: Double): RemoveRowAction = {
      val __obj = js.Dynamic.literal(actionType = "remove_row", data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveRowAction]
    }
    
    extension [Self <: RemoveRowAction](x: Self) {
      
      inline def setActionType(value: remove_row): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean
}
