package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaslAuthenticationResponse[ParseResult] extends StObject {
  
  def decode(rawResponse: Buffer): Buffer | js.Promise[Buffer]
  
  def parse(data: Buffer): ParseResult
}
object SaslAuthenticationResponse {
  
  inline def apply[ParseResult](decode: Buffer => Buffer | js.Promise[Buffer], parse: Buffer => ParseResult): SaslAuthenticationResponse[ParseResult] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[SaslAuthenticationResponse[ParseResult]]
  }
  
  extension [Self <: SaslAuthenticationResponse[?], ParseResult](x: Self & SaslAuthenticationResponse[ParseResult]) {
    
    inline def setDecode(value: Buffer => Buffer | js.Promise[Buffer]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setParse(value: Buffer => ParseResult): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
