package typings.ipfsCore.pingMod

import typings.ipfsCore.ipfsCoreBooleans.`true`
import typings.ipfsCore.ipfsCoreStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pong extends Packet {
  
  var success: `true` = js.native
  
  var text: _empty = js.native
  
  var time: Double = js.native
}
object Pong {
  
  @scala.inline
  def apply(success: `true`, text: _empty, time: Double): Pong = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pong]
  }
  
  @scala.inline
  implicit class PongOps[Self <: Pong] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: _empty): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
