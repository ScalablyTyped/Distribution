package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends js.Object {
  
  @JSName("$and")
  var $and: js.Any = js.native
  
  @JSName("$or")
  var $or: js.Any = js.native
}
object And {
  
  @scala.inline
  def apply($and: js.Any, $or: js.Any): And = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndOps[Self <: And] (val x: Self) extends AnyVal {
    
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
    def set$and(value: js.Any): Self = this.set("$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$or(value: js.Any): Self = this.set("$or", value.asInstanceOf[js.Any])
  }
}
