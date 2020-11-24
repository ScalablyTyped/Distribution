package typings.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRequestResult extends js.Object {
  
  var result: RequestResult = js.native
  
  var statusCode: String = js.native
}
object BatchRequestResult {
  
  @scala.inline
  def apply(result: RequestResult, statusCode: String): BatchRequestResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestResult]
  }
  
  @scala.inline
  implicit class BatchRequestResultOps[Self <: BatchRequestResult] (val x: Self) extends AnyVal {
    
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
    def setResult(value: RequestResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
