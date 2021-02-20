package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteCount extends StObject {
  
  var execution_count: ExecutionCount = js.native
}
object IExecuteCount {
  
  @scala.inline
  def apply(): IExecuteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteCount]
  }
  
  @scala.inline
  implicit class IExecuteCountMutableBuilder[Self <: IExecuteCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
  }
}
