package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitSelf extends StObject {
  
  var emitSelf: Boolean
}
object EmitSelf {
  
  inline def apply(emitSelf: Boolean): EmitSelf = {
    val __obj = js.Dynamic.literal(emitSelf = emitSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitSelf]
  }
  
  extension [Self <: EmitSelf](x: Self) {
    
    inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
  }
}
