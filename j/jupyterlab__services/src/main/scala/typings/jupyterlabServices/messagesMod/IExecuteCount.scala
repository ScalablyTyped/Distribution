package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteCount extends js.Object {
  
  var execution_count: ExecutionCount = js.native
}
object IExecuteCount {
  
  @scala.inline
  def apply(): IExecuteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteCount]
  }
  
  @scala.inline
  implicit class IExecuteCountOps[Self <: IExecuteCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = this.set("execution_count", null)
  }
}
