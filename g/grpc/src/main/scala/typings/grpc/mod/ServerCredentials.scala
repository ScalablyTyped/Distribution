package typings.grpc.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "ServerCredentials")
@js.native
class ServerCredentials () extends StObject
/* static members */
object ServerCredentials {
  
  @JSImport("grpc", "ServerCredentials")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create insecure server credentials
    * @return The ServerCredentials
    */
  inline def createInsecure(): ServerCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[ServerCredentials]
  
  inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[ServerCredentials]
  inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[ServerCredentials]
  /**
    * Create SSL server credentials
    * @param rootCerts Root CA certificates for validating client certificates
    * @param keyCertPairs A list of private key and certificate chain pairs to
    * be used for authenticating the server
    * @param checkClientCertificate Indicates that the server should request
    * and verify the client's certificates.
    * Defaults to `false`.
    * @return The ServerCredentials
    */
  inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[ServerCredentials]
  inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[ServerCredentials]
}
