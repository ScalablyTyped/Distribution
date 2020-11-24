package typings.libp2pGossipsub.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlMessage extends js.Object {
  
  var graft: js.Array[ControlGraft] = js.native
  
  var ihave: js.Array[ControlIHave] = js.native
  
  var iwant: js.Array[ControlIWant] = js.native
  
  var prune: js.Array[ControlPrune] = js.native
}
object ControlMessage {
  
  @scala.inline
  def apply(
    graft: js.Array[ControlGraft],
    ihave: js.Array[ControlIHave],
    iwant: js.Array[ControlIWant],
    prune: js.Array[ControlPrune]
  ): ControlMessage = {
    val __obj = js.Dynamic.literal(graft = graft.asInstanceOf[js.Any], ihave = ihave.asInstanceOf[js.Any], iwant = iwant.asInstanceOf[js.Any], prune = prune.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlMessage]
  }
  
  @scala.inline
  implicit class ControlMessageOps[Self <: ControlMessage] (val x: Self) extends AnyVal {
    
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
    def setGraftVarargs(value: ControlGraft*): Self = this.set("graft", js.Array(value :_*))
    
    @scala.inline
    def setGraft(value: js.Array[ControlGraft]): Self = this.set("graft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIhaveVarargs(value: ControlIHave*): Self = this.set("ihave", js.Array(value :_*))
    
    @scala.inline
    def setIhave(value: js.Array[ControlIHave]): Self = this.set("ihave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIwantVarargs(value: ControlIWant*): Self = this.set("iwant", js.Array(value :_*))
    
    @scala.inline
    def setIwant(value: js.Array[ControlIWant]): Self = this.set("iwant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPruneVarargs(value: ControlPrune*): Self = this.set("prune", js.Array(value :_*))
    
    @scala.inline
    def setPrune(value: js.Array[ControlPrune]): Self = this.set("prune", value.asInstanceOf[js.Any])
  }
}
