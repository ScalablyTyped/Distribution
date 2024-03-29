package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPopulationRule extends StObject {
  
  /**
    * Floodlight activity ID associated with this rule. This field can be left blank.
    */
  var floodlightActivityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of floodlight activity associated with this rule. This is a read-only, auto-generated field.
    */
  var floodlightActivityName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses themselves are made up of list population terms which are joined by ORs.
    */
  var listPopulationClauses: js.UndefOr[js.Array[SchemaListPopulationClause]] = js.undefined
}
object SchemaListPopulationRule {
  
  inline def apply(): SchemaListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationRule]
  }
  
  extension [Self <: SchemaListPopulationRule](x: Self) {
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdNull: Self = StObject.set(x, "floodlightActivityId", null)
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setFloodlightActivityName(value: String): Self = StObject.set(x, "floodlightActivityName", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityNameNull: Self = StObject.set(x, "floodlightActivityName", null)
    
    inline def setFloodlightActivityNameUndefined: Self = StObject.set(x, "floodlightActivityName", js.undefined)
    
    inline def setListPopulationClauses(value: js.Array[SchemaListPopulationClause]): Self = StObject.set(x, "listPopulationClauses", value.asInstanceOf[js.Any])
    
    inline def setListPopulationClausesUndefined: Self = StObject.set(x, "listPopulationClauses", js.undefined)
    
    inline def setListPopulationClausesVarargs(value: SchemaListPopulationClause*): Self = StObject.set(x, "listPopulationClauses", js.Array(value*))
  }
}
