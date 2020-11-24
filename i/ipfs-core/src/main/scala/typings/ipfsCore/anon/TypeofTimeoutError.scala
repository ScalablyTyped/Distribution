package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimeoutError extends js.Object {
  
  val code_5: String = js.native
}
object TypeofTimeoutError {
  
  @scala.inline
  def apply(code_5: String): TypeofTimeoutError = {
    val __obj = js.Dynamic.literal(code_5 = code_5.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimeoutError]
  }
  
  @scala.inline
  implicit class TypeofTimeoutErrorOps[Self <: TypeofTimeoutError] (val x: Self) extends AnyVal {
    
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
    def setCode_5(value: String): Self = this.set("code_5", value.asInstanceOf[js.Any])
  }
}
