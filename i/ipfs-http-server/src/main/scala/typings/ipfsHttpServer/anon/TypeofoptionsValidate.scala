package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsValidate extends js.Object {
  
  val validate: TypeofvalidateOptions1 = js.native
}
object TypeofoptionsValidate {
  
  @scala.inline
  def apply(validate: TypeofvalidateOptions1): TypeofoptionsValidate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsValidate]
  }
  
  @scala.inline
  implicit class TypeofoptionsValidateOps[Self <: TypeofoptionsValidate] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: TypeofvalidateOptions1): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
