package typings.jqueryDynatree.JQueryUI

import typings.jqueryDynatree.DynatreeNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UI extends js.Object {
  
  var dynatree: DynatreeNamespace = js.native
}
object UI {
  
  @scala.inline
  def apply(dynatree: DynatreeNamespace): UI = {
    val __obj = js.Dynamic.literal(dynatree = dynatree.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
  
  @scala.inline
  implicit class UIOps[Self <: UI] (val x: Self) extends AnyVal {
    
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
    def setDynatree(value: DynatreeNamespace): Self = this.set("dynatree", value.asInstanceOf[js.Any])
  }
}
