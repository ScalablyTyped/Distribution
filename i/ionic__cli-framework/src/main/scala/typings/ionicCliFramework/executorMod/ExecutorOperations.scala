package typings.ionicCliFramework.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutorOperations extends js.Object {
  
  val RPC: String = js.native
}
object ExecutorOperations {
  
  @scala.inline
  def apply(RPC: String): ExecutorOperations = {
    val __obj = js.Dynamic.literal(RPC = RPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutorOperations]
  }
  
  @scala.inline
  implicit class ExecutorOperationsOps[Self <: ExecutorOperations] (val x: Self) extends AnyVal {
    
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
    def setRPC(value: String): Self = this.set("RPC", value.asInstanceOf[js.Any])
  }
}
