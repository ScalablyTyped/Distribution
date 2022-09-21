package typings.grpc.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCertPair extends StObject {
  
  /**
    * The server's certificate chain
    */
  var cert_chain: Buffer
  
  /**
    * The server's private key
    */
  var private_key: Buffer
}
object KeyCertPair {
  
  inline def apply(cert_chain: Buffer, private_key: Buffer): KeyCertPair = {
    val __obj = js.Dynamic.literal(cert_chain = cert_chain.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCertPair]
  }
  
  extension [Self <: KeyCertPair](x: Self) {
    
    inline def setCert_chain(value: Buffer): Self = StObject.set(x, "cert_chain", value.asInstanceOf[js.Any])
    
    inline def setPrivate_key(value: Buffer): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
  }
}
