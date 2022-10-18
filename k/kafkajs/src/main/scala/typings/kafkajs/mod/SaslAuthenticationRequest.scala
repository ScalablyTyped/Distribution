package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaslAuthenticationRequest extends StObject {
  
  def encode(): Buffer | js.Promise[Buffer]
}
object SaslAuthenticationRequest {
  
  inline def apply(encode: () => Buffer | js.Promise[Buffer]): SaslAuthenticationRequest = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction0(encode))
    __obj.asInstanceOf[SaslAuthenticationRequest]
  }
  
  extension [Self <: SaslAuthenticationRequest](x: Self) {
    
    inline def setEncode(value: () => Buffer | js.Promise[Buffer]): Self = StObject.set(x, "encode", js.Any.fromFunction0(value))
  }
}
