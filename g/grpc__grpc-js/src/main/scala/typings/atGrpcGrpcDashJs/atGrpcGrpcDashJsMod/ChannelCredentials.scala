package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.VerifyOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "ChannelCredentials")
@js.native
abstract class ChannelCredentials protected ()
  extends typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials {
  protected def this(callCredentials: typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials) = this()
}

/* static members */
@JSImport("@grpc/grpc-js", "ChannelCredentials")
@js.native
object ChannelCredentials extends js.Object {
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  def createInsecure(): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  def createSsl(): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials = js.native
}

