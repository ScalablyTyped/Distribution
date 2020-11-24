package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.messageMod.ControlGraft
import typings.libp2pGossipsub.messageMod.ControlIHave
import typings.libp2pGossipsub.messageMod.ControlIWant
import typings.libp2pGossipsub.messageMod.ControlPrune
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/message.ControlMessage> */
@js.native
trait PartialControlMessage extends js.Object {
  
  var graft: js.UndefOr[js.Array[ControlGraft]] = js.native
  
  var ihave: js.UndefOr[js.Array[ControlIHave]] = js.native
  
  var iwant: js.UndefOr[js.Array[ControlIWant]] = js.native
  
  var prune: js.UndefOr[js.Array[ControlPrune]] = js.native
}
object PartialControlMessage {
  
  @scala.inline
  def apply(): PartialControlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialControlMessage]
  }
  
  @scala.inline
  implicit class PartialControlMessageOps[Self <: PartialControlMessage] (val x: Self) extends AnyVal {
    
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
    def deleteGraft: Self = this.set("graft", js.undefined)
    
    @scala.inline
    def setIhaveVarargs(value: ControlIHave*): Self = this.set("ihave", js.Array(value :_*))
    
    @scala.inline
    def setIhave(value: js.Array[ControlIHave]): Self = this.set("ihave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIhave: Self = this.set("ihave", js.undefined)
    
    @scala.inline
    def setIwantVarargs(value: ControlIWant*): Self = this.set("iwant", js.Array(value :_*))
    
    @scala.inline
    def setIwant(value: js.Array[ControlIWant]): Self = this.set("iwant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIwant: Self = this.set("iwant", js.undefined)
    
    @scala.inline
    def setPruneVarargs(value: ControlPrune*): Self = this.set("prune", js.Array(value :_*))
    
    @scala.inline
    def setPrune(value: js.Array[ControlPrune]): Self = this.set("prune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrune: Self = this.set("prune", js.undefined)
  }
}
