package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteCount extends StObject {
  
  var execution_count: ExecutionCount
}
object IExecuteCount {
  
  inline def apply(): IExecuteCount = {
    val __obj = js.Dynamic.literal(execution_count = null)
    __obj.asInstanceOf[IExecuteCount]
  }
  
  extension [Self <: IExecuteCount](x: Self) {
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
  }
}
