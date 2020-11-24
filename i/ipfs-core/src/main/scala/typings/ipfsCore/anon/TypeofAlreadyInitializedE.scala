package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlreadyInitializedE extends js.Object {
  
  val code_2: String = js.native
}
object TypeofAlreadyInitializedE {
  
  @scala.inline
  def apply(code_2: String): TypeofAlreadyInitializedE = {
    val __obj = js.Dynamic.literal(code_2 = code_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAlreadyInitializedE]
  }
  
  @scala.inline
  implicit class TypeofAlreadyInitializedEOps[Self <: TypeofAlreadyInitializedE] (val x: Self) extends AnyVal {
    
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
    def setCode_2(value: String): Self = this.set("code_2", value.asInstanceOf[js.Any])
  }
}
