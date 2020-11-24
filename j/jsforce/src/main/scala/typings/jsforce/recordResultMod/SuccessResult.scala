package typings.jsforce.recordResultMod

import typings.jsforce.jsforceBooleans.`true`
import typings.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessResult extends RecordResult {
  
  var id: SalesforceId = js.native
  
  var success: `true` = js.native
}
object SuccessResult {
  
  @scala.inline
  def apply(id: SalesforceId, success: `true`): SuccessResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResult]
  }
  
  @scala.inline
  implicit class SuccessResultOps[Self <: SuccessResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: SalesforceId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
