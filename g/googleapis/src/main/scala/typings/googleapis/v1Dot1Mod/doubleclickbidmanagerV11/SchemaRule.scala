package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRule extends StObject {
  
  var disjunctiveMatchStatements: js.UndefOr[js.Array[SchemaDisjunctiveMatchStatement]] = js.undefined
  
  /**
    * Rule name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaRule {
  
  inline def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  extension [Self <: SchemaRule](x: Self) {
    
    inline def setDisjunctiveMatchStatements(value: js.Array[SchemaDisjunctiveMatchStatement]): Self = StObject.set(x, "disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    inline def setDisjunctiveMatchStatementsUndefined: Self = StObject.set(x, "disjunctiveMatchStatements", js.undefined)
    
    inline def setDisjunctiveMatchStatementsVarargs(value: SchemaDisjunctiveMatchStatement*): Self = StObject.set(x, "disjunctiveMatchStatements", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
