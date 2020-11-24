package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concat extends js.Object {
  
  var LeftSide: String | Concat = js.native
  
  var RightSide: String | Concat = js.native
}
object Concat {
  
  @scala.inline
  def apply(LeftSide: String | Concat, RightSide: String | Concat): Concat = {
    val __obj = js.Dynamic.literal(LeftSide = LeftSide.asInstanceOf[js.Any], RightSide = RightSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat]
  }
  
  @scala.inline
  implicit class ConcatOps[Self <: Concat] (val x: Self) extends AnyVal {
    
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
    def setLeftSide(value: String | Concat): Self = this.set("LeftSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSide(value: String | Concat): Self = this.set("RightSide", value.asInstanceOf[js.Any])
  }
}
