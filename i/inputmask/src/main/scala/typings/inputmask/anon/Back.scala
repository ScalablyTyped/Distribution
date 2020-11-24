package typings.inputmask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends js.Object {
  
  var back: String = js.native
  
  var front: String = js.native
}
object Back {
  
  @scala.inline
  def apply(back: String, front: String): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit class BackOps[Self <: Back] (val x: Self) extends AnyVal {
    
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
    def setBack(value: String): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFront(value: String): Self = this.set("front", value.asInstanceOf[js.Any])
  }
}
