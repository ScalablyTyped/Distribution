package typings.libp2pInterfaces

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "InvalidCryptoExchangeError")
  @js.native
  class InvalidCryptoExchangeError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "InvalidCryptoTransmissionError")
  @js.native
  class InvalidCryptoTransmissionError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "UnexpectedPeerError")
  @js.native
  class UnexpectedPeerError () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
  }
}
