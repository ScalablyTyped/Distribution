package typings.libp2pInterfaceConnectionEncrypter

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
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
}
