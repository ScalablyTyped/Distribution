package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathEvents extends js.Object {
  
  /*This value is the time (in milliseconds) that a user must hold the mouse still over a math element before it
    * is considered to be hovering over the math.
    */
  var hover: js.UndefOr[Double] = js.native
  
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathEvents.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.native
}
object MathEvents {
  
  @scala.inline
  def apply(): MathEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathEvents]
  }
  
  @scala.inline
  implicit class MathEventsOps[Self <: MathEvents] (val x: Self) extends AnyVal {
    
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
    def setHover(value: Double): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
