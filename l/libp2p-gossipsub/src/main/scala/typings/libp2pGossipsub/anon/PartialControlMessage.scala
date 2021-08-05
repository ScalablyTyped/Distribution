package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.messageMod.ControlGraft
import typings.libp2pGossipsub.messageMod.ControlIHave
import typings.libp2pGossipsub.messageMod.ControlIWant
import typings.libp2pGossipsub.messageMod.ControlPrune
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/message.ControlMessage> */
trait PartialControlMessage extends StObject {
  
  var graft: js.UndefOr[js.Array[ControlGraft]] = js.undefined
  
  var ihave: js.UndefOr[js.Array[ControlIHave]] = js.undefined
  
  var iwant: js.UndefOr[js.Array[ControlIWant]] = js.undefined
  
  var prune: js.UndefOr[js.Array[ControlPrune]] = js.undefined
}
object PartialControlMessage {
  
  inline def apply(): PartialControlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialControlMessage]
  }
  
  extension [Self <: PartialControlMessage](x: Self) {
    
    inline def setGraft(value: js.Array[ControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
    
    inline def setGraftUndefined: Self = StObject.set(x, "graft", js.undefined)
    
    inline def setGraftVarargs(value: ControlGraft*): Self = StObject.set(x, "graft", js.Array(value :_*))
    
    inline def setIhave(value: js.Array[ControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
    
    inline def setIhaveUndefined: Self = StObject.set(x, "ihave", js.undefined)
    
    inline def setIhaveVarargs(value: ControlIHave*): Self = StObject.set(x, "ihave", js.Array(value :_*))
    
    inline def setIwant(value: js.Array[ControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
    
    inline def setIwantUndefined: Self = StObject.set(x, "iwant", js.undefined)
    
    inline def setIwantVarargs(value: ControlIWant*): Self = StObject.set(x, "iwant", js.Array(value :_*))
    
    inline def setPrune(value: js.Array[ControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
    
    inline def setPruneVarargs(value: ControlPrune*): Self = StObject.set(x, "prune", js.Array(value :_*))
  }
}
