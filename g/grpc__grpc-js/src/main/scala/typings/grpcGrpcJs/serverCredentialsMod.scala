package typings.grpcGrpcJs

import typings.node.Buffer
import typings.node.http2Mod.SecureServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverCredentialsMod {
  
  @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials")
  @js.native
  abstract class ServerCredentials () extends StObject {
    
    def _getSettings(): SecureServerOptions | Null = js.native
    
    def _isSecure(): Boolean = js.native
  }
  /* static members */
  object ServerCredentials {
    
    @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials.createInsecure")
    @js.native
    def createInsecure(): ServerCredentials = js.native
    
    @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
    @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
    @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
    @JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
  }
  
  @js.native
  trait KeyCertPair extends StObject {
    
    var cert_chain: Buffer = js.native
    
    var private_key: Buffer = js.native
  }
  object KeyCertPair {
    
    @scala.inline
    def apply(cert_chain: Buffer, private_key: Buffer): KeyCertPair = {
      val __obj = js.Dynamic.literal(cert_chain = cert_chain.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCertPair]
    }
    
    @scala.inline
    implicit class KeyCertPairMutableBuilder[Self <: KeyCertPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert_chain(value: Buffer): Self = StObject.set(x, "cert_chain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_key(value: Buffer): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
    }
  }
}
