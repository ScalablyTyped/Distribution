package typings.luminoDatagrid.celleditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellInputValidatorResponse extends js.Object {
  
  /**
    * Validation error message. Set only when input is invalid
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Flag indicating cell input is valid or not
    */
  var valid: Boolean = js.native
}
object ICellInputValidatorResponse {
  
  @scala.inline
  def apply(valid: Boolean): ICellInputValidatorResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellInputValidatorResponse]
  }
  
  @scala.inline
  implicit class ICellInputValidatorResponseOps[Self <: ICellInputValidatorResponse] (val x: Self) extends AnyVal {
    
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
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
