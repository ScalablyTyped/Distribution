package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsTimeout extends js.Object {
  
  val timeout: Typeoftimeout = js.native
  
  val validate: Typeofvalidate = js.native
}
object TypeofoptionsTimeout {
  
  @scala.inline
  def apply(timeout: Typeoftimeout, validate: Typeofvalidate): TypeofoptionsTimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsTimeout]
  }
  
  @scala.inline
  implicit class TypeofoptionsTimeoutOps[Self <: TypeofoptionsTimeout] (val x: Self) extends AnyVal {
    
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
    def setTimeout(value: Typeoftimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
