package typings.handsontable

import typings.handsontable.pluginsFiltersFiltersMod.CellLikeData
import typings.handsontable.pluginsFiltersFiltersMod.ConditionId
import typings.handsontable.pluginsFiltersFiltersMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsFiltersConditionCollectionMod {
  
  @JSImport("handsontable/plugins/filters/conditionCollection", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ConditionCollection
  
  trait Condition extends StObject {
    
    var args: js.Array[Any]
    
    def func(dataRow: Any, values: js.Array[Any]): Boolean
    
    var name: ConditionName
  }
  object Condition {
    
    inline def apply(args: js.Array[Any], func: (Any, js.Array[Any]) => Boolean, name: ConditionName): Condition = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFunc(value: (Any, js.Array[Any]) => Boolean): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionCollection extends StObject {
    
    def addCondition(column: Double, conditionDefinition: ConditionId): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: Unit, position: Double): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType, position: Double): Unit = js.native
    
    def clean(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def exportAllConditions(): js.Array[ConditionId] = js.native
    
    def getColumnStackPosition(column: Double): Double | Unit = js.native
    
    def getConditions(column: Double): js.Array[Condition] = js.native
    
    def getFilteredColumns(): js.Array[Double] = js.native
    
    def getOperation(column: Double): Unit | OperationType = js.native
    
    def hasConditions(column: Double, name: String): Boolean = js.native
    
    def importAllConditions(conditions: js.Array[ConditionId]): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isMatch(value: CellLikeData, column: Double): Boolean = js.native
    
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData): Boolean = js.native
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData, operationType: OperationType): Boolean = js.native
    
    def removeConditions(column: Double): Unit = js.native
  }
  
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
  trait ConditionName extends StObject
  object ConditionName {
    
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
}
