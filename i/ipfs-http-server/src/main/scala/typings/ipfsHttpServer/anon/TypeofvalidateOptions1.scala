package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofvalidateOptions1 extends js.Object {
  
  val options_1: js.Any = js.native
}
object TypeofvalidateOptions1 {
  
  @scala.inline
  def apply(options_1: js.Any): TypeofvalidateOptions1 = {
    val __obj = js.Dynamic.literal(options_1 = options_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofvalidateOptions1]
  }
  
  @scala.inline
  implicit class TypeofvalidateOptions1Ops[Self <: TypeofvalidateOptions1] (val x: Self) extends AnyVal {
    
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
    def setOptions_1(value: js.Any): Self = this.set("options_1", value.asInstanceOf[js.Any])
  }
}
