package typings.libp2pInterfaces

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-interfaces/src/crypto/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class InvalidCryptoExchangeError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
  /* static members */
  @js.native
  object InvalidCryptoExchangeError extends js.Object {
    
    def code: String = js.native
  }
  
  @js.native
  class InvalidCryptoTransmissionError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
  /* static members */
  @js.native
  object InvalidCryptoTransmissionError extends js.Object {
    
    def code: String = js.native
  }
  
  @js.native
  class UnexpectedPeerError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
  /* static members */
  @js.native
  object UnexpectedPeerError extends js.Object {
    
    def code: String = js.native
  }
}
