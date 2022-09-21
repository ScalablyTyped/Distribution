package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPopulationClause extends StObject {
  
  /**
    * Terms of this list population clause. Each clause is made up of list population terms representing constraints and are joined by ORs.
    */
  var terms: js.UndefOr[js.Array[SchemaListPopulationTerm]] = js.undefined
}
object SchemaListPopulationClause {
  
  inline def apply(): SchemaListPopulationClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationClause]
  }
  
  extension [Self <: SchemaListPopulationClause](x: Self) {
    
    inline def setTerms(value: js.Array[SchemaListPopulationTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTermsVarargs(value: SchemaListPopulationTerm*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
