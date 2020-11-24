package typings.losslessJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularRefsBoolean extends js.Object {
  
  var circularRefs: Boolean = js.native
}
object CircularRefsBoolean {
  
  @scala.inline
  def apply(circularRefs: Boolean): CircularRefsBoolean = {
    val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularRefsBoolean]
  }
  
  @scala.inline
  implicit class CircularRefsBooleanOps[Self <: CircularRefsBoolean] (val x: Self) extends AnyVal {
    
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
    def setCircularRefs(value: Boolean): Self = this.set("circularRefs", value.asInstanceOf[js.Any])
  }
}
