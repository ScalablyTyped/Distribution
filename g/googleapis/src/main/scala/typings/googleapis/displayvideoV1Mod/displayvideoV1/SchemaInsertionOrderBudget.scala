package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsertionOrderBudget extends StObject {
  
  /**
    * The type of automation used to manage bid and budget for the insertion order. If this field is unspecified in creation, the value defaults to `INSERTION_ORDER_AUTOMATION_TYPE_NONE`.
    */
  var automationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The list of budget segments. Use a budget segment to specify a specific budget for a given period of time an insertion order is running.
    */
  var budgetSegments: js.UndefOr[js.Array[SchemaInsertionOrderBudgetSegment]] = js.undefined
  
  /**
    * Required. Immutable. The budget unit specifies whether the budget is currency based or impression based.
    */
  var budgetUnit: js.UndefOr[String | Null] = js.undefined
}
object SchemaInsertionOrderBudget {
  
  inline def apply(): SchemaInsertionOrderBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertionOrderBudget]
  }
  
  extension [Self <: SchemaInsertionOrderBudget](x: Self) {
    
    inline def setAutomationType(value: String): Self = StObject.set(x, "automationType", value.asInstanceOf[js.Any])
    
    inline def setAutomationTypeNull: Self = StObject.set(x, "automationType", null)
    
    inline def setAutomationTypeUndefined: Self = StObject.set(x, "automationType", js.undefined)
    
    inline def setBudgetSegments(value: js.Array[SchemaInsertionOrderBudgetSegment]): Self = StObject.set(x, "budgetSegments", value.asInstanceOf[js.Any])
    
    inline def setBudgetSegmentsUndefined: Self = StObject.set(x, "budgetSegments", js.undefined)
    
    inline def setBudgetSegmentsVarargs(value: SchemaInsertionOrderBudgetSegment*): Self = StObject.set(x, "budgetSegments", js.Array(value*))
    
    inline def setBudgetUnit(value: String): Self = StObject.set(x, "budgetUnit", value.asInstanceOf[js.Any])
    
    inline def setBudgetUnitNull: Self = StObject.set(x, "budgetUnit", null)
    
    inline def setBudgetUnitUndefined: Self = StObject.set(x, "budgetUnit", js.undefined)
  }
}
