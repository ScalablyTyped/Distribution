package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateBuiltInVariableResponse extends StObject {
  
  /**
    * List of created built-in variables.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.undefined
}
object SchemaCreateBuiltInVariableResponse {
  
  inline def apply(): SchemaCreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateBuiltInVariableResponse]
  }
  
  extension [Self <: SchemaCreateBuiltInVariableResponse](x: Self) {
    
    inline def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    inline def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value*))
  }
}
