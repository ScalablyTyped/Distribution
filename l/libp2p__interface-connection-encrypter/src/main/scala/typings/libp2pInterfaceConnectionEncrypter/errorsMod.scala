package typings.libp2pInterfaceConnectionEncrypter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object errorsMod {
  
  @JSImport("@libp2p/interface-connection-encrypter/errors", "InvalidCryptoExchangeError")
  @js.native
  open class InvalidCryptoExchangeError ()
    extends typings.libp2pInterfaceConnectionEncrypter.distSrcErrorsMod.InvalidCryptoExchangeError {
    def this(message: String) = this()
  }
  /* static members */
  object InvalidCryptoExchangeError {
    
    @JSImport("@libp2p/interface-connection-encrypter/errors", "InvalidCryptoExchangeError.code")
    @js.native
    val code: /* "ERR_INVALID_CRYPTO_EXCHANGE" */ String = js.native
  }
  
  @JSImport("@libp2p/interface-connection-encrypter/errors", "InvalidCryptoTransmissionError")
  @js.native
  open class InvalidCryptoTransmissionError ()
    extends typings.libp2pInterfaceConnectionEncrypter.distSrcErrorsMod.InvalidCryptoTransmissionError {
    def this(message: String) = this()
  }
  /* static members */
  object InvalidCryptoTransmissionError {
    
    @JSImport("@libp2p/interface-connection-encrypter/errors", "InvalidCryptoTransmissionError.code")
    @js.native
    val code: /* "ERR_INVALID_CRYPTO_TRANSMISSION" */ String = js.native
  }
  
  @JSImport("@libp2p/interface-connection-encrypter/errors", "UnexpectedPeerError")
  @js.native
  open class UnexpectedPeerError ()
    extends typings.libp2pInterfaceConnectionEncrypter.distSrcErrorsMod.UnexpectedPeerError {
    def this(message: String) = this()
  }
  /* static members */
  object UnexpectedPeerError {
    
    @JSImport("@libp2p/interface-connection-encrypter/errors", "UnexpectedPeerError.code")
    @js.native
    val code: /* "ERR_UNEXPECTED_PEER" */ String = js.native
  }
}
