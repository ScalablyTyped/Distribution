package typings.libp2pInterfaces

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "InvalidCryptoExchangeError")
  @js.native
  class InvalidCryptoExchangeError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "InvalidCryptoTransmissionError")
  @js.native
  class InvalidCryptoTransmissionError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("libp2p-interfaces/src/crypto/errors", "UnexpectedPeerError")
  @js.native
  class UnexpectedPeerError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
