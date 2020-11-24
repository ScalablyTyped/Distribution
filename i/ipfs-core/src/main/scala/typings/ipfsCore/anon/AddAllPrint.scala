package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAllPrint extends js.Object {
  
  var addAll: js.Any = js.native
  
  var print: js.Any = js.native
}
object AddAllPrint {
  
  @scala.inline
  def apply(addAll: js.Any, print: js.Any): AddAllPrint = {
    val __obj = js.Dynamic.literal(addAll = addAll.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAllPrint]
  }
  
  @scala.inline
  implicit class AddAllPrintOps[Self <: AddAllPrint] (val x: Self) extends AnyVal {
    
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
    def setAddAll(value: js.Any): Self = this.set("addAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: js.Any): Self = this.set("print", value.asInstanceOf[js.Any])
  }
}
