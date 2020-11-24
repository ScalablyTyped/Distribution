package typings.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delimiter extends js.Object {
  
  var close: Boolean = js.native
  
  var end: Double = js.native
  
  var jump: Double = js.native
  
  var length: Double = js.native
  
  var marker: Double = js.native
  
  var open: Boolean = js.native
  
  var token: Double = js.native
}
object Delimiter {
  
  @scala.inline
  def apply(
    close: Boolean,
    end: Double,
    jump: Double,
    length: Double,
    marker: Double,
    open: Boolean,
    token: Double
  ): Delimiter = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], jump = jump.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJump(value: Double): Self = this.set("jump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Double): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: Double): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
