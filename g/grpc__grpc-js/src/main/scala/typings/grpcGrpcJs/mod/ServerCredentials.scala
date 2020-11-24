package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
abstract class ServerCredentials ()
  extends typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials
/* static members */
@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  
  def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
}
