package typings.libp2pInterfaceConnectionEncrypter

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "InvalidCryptoExchangeError")
  @js.native
  open class InvalidCryptoExchangeError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object InvalidCryptoExchangeError {
    
    @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "InvalidCryptoExchangeError.code")
    @js.native
    val code: /* "ERR_INVALID_CRYPTO_EXCHANGE" */ String = js.native
  }
  
  @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "InvalidCryptoTransmissionError")
  @js.native
  open class InvalidCryptoTransmissionError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object InvalidCryptoTransmissionError {
    
    @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "InvalidCryptoTransmissionError.code")
    @js.native
    val code: /* "ERR_INVALID_CRYPTO_TRANSMISSION" */ String = js.native
  }
  
  @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "UnexpectedPeerError")
  @js.native
  open class UnexpectedPeerError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object UnexpectedPeerError {
    
    @JSImport("@libp2p/interface-connection-encrypter/dist/src/errors", "UnexpectedPeerError.code")
    @js.native
    val code: /* "ERR_UNEXPECTED_PEER" */ String = js.native
  }
}
