package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.KeyCertPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
abstract class ServerCredentials ()
  extends typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials

/* static members */
@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  def createInsecure(): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
}

