package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executioncount extends StObject {
  
  var code: String = js.native
  
  var execution_count: ExecutionCount = js.native
}
object Executioncount {
  
  @scala.inline
  def apply(code: String): Executioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executioncount]
  }
  
  @scala.inline
  implicit class ExecutioncountMutableBuilder[Self <: Executioncount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
  }
}
