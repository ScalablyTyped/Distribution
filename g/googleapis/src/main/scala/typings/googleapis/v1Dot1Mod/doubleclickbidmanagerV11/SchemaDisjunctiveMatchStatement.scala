package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisjunctiveMatchStatement extends StObject {
  
  /**
    * Filters. There is a limit of 100 filters that can be set per disjunctive match statement.
    */
  var eventFilters: js.UndefOr[js.Array[SchemaEventFilter]] = js.undefined
}
object SchemaDisjunctiveMatchStatement {
  
  inline def apply(): SchemaDisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisjunctiveMatchStatement]
  }
  
  extension [Self <: SchemaDisjunctiveMatchStatement](x: Self) {
    
    inline def setEventFilters(value: js.Array[SchemaEventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: SchemaEventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
  }
}
