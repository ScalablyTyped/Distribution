package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNotEnabledError extends js.Object {
  
  val code_4: String = js.native
}
object TypeofNotEnabledError {
  
  @scala.inline
  def apply(code_4: String): TypeofNotEnabledError = {
    val __obj = js.Dynamic.literal(code_4 = code_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNotEnabledError]
  }
  
  @scala.inline
  implicit class TypeofNotEnabledErrorOps[Self <: TypeofNotEnabledError] (val x: Self) extends AnyVal {
    
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
    def setCode_4(value: String): Self = this.set("code_4", value.asInstanceOf[js.Any])
  }
}
