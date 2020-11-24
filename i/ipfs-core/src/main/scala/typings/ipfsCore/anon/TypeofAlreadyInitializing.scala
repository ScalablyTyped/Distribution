package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlreadyInitializing extends js.Object {
  
  val code_1: String = js.native
}
object TypeofAlreadyInitializing {
  
  @scala.inline
  def apply(code_1: String): TypeofAlreadyInitializing = {
    val __obj = js.Dynamic.literal(code_1 = code_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAlreadyInitializing]
  }
  
  @scala.inline
  implicit class TypeofAlreadyInitializingOps[Self <: TypeofAlreadyInitializing] (val x: Self) extends AnyVal {
    
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
    def setCode_1(value: String): Self = this.set("code_1", value.asInstanceOf[js.Any])
  }
}
