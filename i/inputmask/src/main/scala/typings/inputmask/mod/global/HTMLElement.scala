package typings.inputmask.mod.global

import typings.inputmask.mod.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends js.Object {
  
  var inputmask: js.UndefOr[Instance] = js.native
}
object HTMLElement {
  
  @scala.inline
  def apply(): HTMLElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
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
    def setInputmask(value: Instance): Self = this.set("inputmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmask: Self = this.set("inputmask", js.undefined)
  }
}
