package typings.grpc.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "ServerCredentials")
@js.native
class ServerCredentials () extends StObject
/* static members */
object ServerCredentials {
  
  /**
    * Create insecure server credentials
    * @return The ServerCredentials
    */
  @JSImport("grpc", "ServerCredentials.createInsecure")
  @js.native
  def createInsecure(): ServerCredentials = js.native
  
  @JSImport("grpc", "ServerCredentials.createSsl")
  @js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
  @JSImport("grpc", "ServerCredentials.createSsl")
  @js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
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
  @JSImport("grpc", "ServerCredentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
  @JSImport("grpc", "ServerCredentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
}
