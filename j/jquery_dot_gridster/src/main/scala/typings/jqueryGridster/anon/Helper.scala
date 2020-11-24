package typings.jqueryGridster.anon

import typings.jqueryGridster.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Helper extends js.Object {
  
  var helper: JQuery = js.native
}
object Helper {
  
  @scala.inline
  def apply(helper: JQuery): Helper = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Helper]
  }
  
  @scala.inline
  implicit class HelperOps[Self <: Helper] (val x: Self) extends AnyVal {
    
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
    def setHelper(value: JQuery): Self = this.set("helper", value.asInstanceOf[js.Any])
  }
}
