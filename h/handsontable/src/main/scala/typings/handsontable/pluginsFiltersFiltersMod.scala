package typings.handsontable

import typings.handsontable.anon.Col
import typings.handsontable.anon.Key
import typings.handsontable.anon.PhysicalIndex
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsFiltersFiltersMod {
  
  @JSImport("handsontable/plugins/filters/filters", "Filters")
  @js.native
  open class Filters protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def addCondition(column: Double, name: String, args: js.Array[Any]): Unit = js.native
    def addCondition(column: Double, name: String, args: js.Array[Any], operationId: OperationType): Unit = js.native
    
    def clearConditions(): Unit = js.native
    def clearConditions(column: Double): Unit = js.native
    
    var conditionCollection: typings.handsontable.pluginsFiltersConditionCollectionMod.default = js.native
    
    var conditionUpdateObserver: typings.handsontable.pluginsFiltersConditionUpdateObserverMod.default = js.native
    
    def filter(): Unit = js.native
    
    def getDataMapAtColumn(): js.Array[CellLikeData] = js.native
    def getDataMapAtColumn(column: Double): js.Array[CellLikeData] = js.native
    
    def getSelectedColumn(): PhysicalIndex | Null = js.native
    
    def isEnabled(): Boolean = js.native
    
    def removeConditions(column: Double): Unit = js.native
  }
  
  trait CellLikeData extends StObject {
    
    var meta: Col
    
    var value: String
  }
  object CellLikeData {
    
    inline def apply(meta: Col, value: String): CellLikeData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellLikeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellLikeData] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: Col): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnConditions extends StObject {
    
    var column: Double
    
    var conditions: js.Array[ConditionId]
    
    var operation: OperationType
  }
  object ColumnConditions {
    
    inline def apply(column: Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConditions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnConditions] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[ConditionId]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: ConditionId*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setOperation(value: OperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConditionId extends StObject {
    
    var args: js.Array[Any]
    
    var command: js.UndefOr[Key] = js.undefined
    
    var name: js.UndefOr[ConditionName] = js.undefined
  }
  object ConditionId {
    
    inline def apply(args: js.Array[Any]): ConditionId = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionId] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: Key): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ConditionName = _ConditionName
  
  type OperationType = _OperationType
  
  type Settings = Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.begins_with
    - typings.handsontable.handsontableStrings.between
    - typings.handsontable.handsontableStrings.by_value
    - typings.handsontable.handsontableStrings.contains
    - typings.handsontable.handsontableStrings.empty
    - typings.handsontable.handsontableStrings.ends_with
    - typings.handsontable.handsontableStrings.eq
    - typings.handsontable.handsontableStrings.gt
    - typings.handsontable.handsontableStrings.gte
    - typings.handsontable.handsontableStrings.lt
    - typings.handsontable.handsontableStrings.lte
    - typings.handsontable.handsontableStrings.not_between
    - typings.handsontable.handsontableStrings.not_contains
    - typings.handsontable.handsontableStrings.not_empty
    - typings.handsontable.handsontableStrings.neq
  */
  trait _ConditionName extends StObject
  object _ConditionName {
    
    inline def begins_with: typings.handsontable.handsontableStrings.begins_with = "begins_with".asInstanceOf[typings.handsontable.handsontableStrings.begins_with]
    
    inline def between: typings.handsontable.handsontableStrings.between = "between".asInstanceOf[typings.handsontable.handsontableStrings.between]
    
    inline def by_value: typings.handsontable.handsontableStrings.by_value = "by_value".asInstanceOf[typings.handsontable.handsontableStrings.by_value]
    
    inline def contains: typings.handsontable.handsontableStrings.contains = "contains".asInstanceOf[typings.handsontable.handsontableStrings.contains]
    
    inline def empty: typings.handsontable.handsontableStrings.empty = "empty".asInstanceOf[typings.handsontable.handsontableStrings.empty]
    
    inline def ends_with: typings.handsontable.handsontableStrings.ends_with = "ends_with".asInstanceOf[typings.handsontable.handsontableStrings.ends_with]
    
    inline def eq: typings.handsontable.handsontableStrings.eq = "eq".asInstanceOf[typings.handsontable.handsontableStrings.eq]
    
    inline def gt: typings.handsontable.handsontableStrings.gt = "gt".asInstanceOf[typings.handsontable.handsontableStrings.gt]
    
    inline def gte: typings.handsontable.handsontableStrings.gte = "gte".asInstanceOf[typings.handsontable.handsontableStrings.gte]
    
    inline def lt: typings.handsontable.handsontableStrings.lt = "lt".asInstanceOf[typings.handsontable.handsontableStrings.lt]
    
    inline def lte: typings.handsontable.handsontableStrings.lte = "lte".asInstanceOf[typings.handsontable.handsontableStrings.lte]
    
    inline def neq: typings.handsontable.handsontableStrings.neq = "neq".asInstanceOf[typings.handsontable.handsontableStrings.neq]
    
    inline def not_between: typings.handsontable.handsontableStrings.not_between = "not_between".asInstanceOf[typings.handsontable.handsontableStrings.not_between]
    
    inline def not_contains: typings.handsontable.handsontableStrings.not_contains = "not_contains".asInstanceOf[typings.handsontable.handsontableStrings.not_contains]
    
    inline def not_empty: typings.handsontable.handsontableStrings.not_empty = "not_empty".asInstanceOf[typings.handsontable.handsontableStrings.not_empty]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.conjunction
    - typings.handsontable.handsontableStrings.disjunction
  */
  trait _OperationType extends StObject
  object _OperationType {
    
    inline def conjunction: typings.handsontable.handsontableStrings.conjunction = "conjunction".asInstanceOf[typings.handsontable.handsontableStrings.conjunction]
    
    inline def disjunction: typings.handsontable.handsontableStrings.disjunction = "disjunction".asInstanceOf[typings.handsontable.handsontableStrings.disjunction]
  }
}
