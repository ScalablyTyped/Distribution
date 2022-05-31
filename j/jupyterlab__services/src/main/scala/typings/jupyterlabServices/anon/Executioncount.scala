package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executioncount extends StObject {
  
  var code: String
  
  var execution_count: ExecutionCount
}
object Executioncount {
  
  inline def apply(code: String): Executioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[Executioncount]
  }
  
  extension [Self <: Executioncount](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
  }
}
