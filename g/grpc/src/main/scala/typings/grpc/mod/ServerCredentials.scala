package typings.grpc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ServerCredentials")
@js.native
class ServerCredentials () extends js.Object

/* static members */
@JSImport("grpc", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  /**
    * Create insecure server credentials
    * @return The ServerCredentials
    */
  def createInsecure(): ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
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
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
}

