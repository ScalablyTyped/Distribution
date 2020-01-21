package typings.grpcGrpcJs.channelCredentialsMod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.node.Buffer
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/channel-credentials", "ChannelCredentials")
@js.native
abstract class ChannelCredentials protected () extends js.Object {
  protected def this(callCredentials: CallCredentials) = this()
  var callCredentials: CallCredentials = js.native
  /**
    * Check whether two channel credentials objects are equal. Two secure
    * credentials are equal if they were constructed with the same parameters.
    * @param other The other ChannelCredentials Object
    */
  def _equals(other: ChannelCredentials): Boolean = js.native
  /**
    * Gets the set of per-call credentials associated with this instance.
    */
  def _getCallCredentials(): CallCredentials = js.native
  /**
    * Gets a SecureContext object generated from input parameters if this
    * instance was created with createSsl, or null if this instance was created
    * with createInsecure.
    */
  def _getConnectionOptions(): ConnectionOptions | Null = js.native
  /**
    * Indicates whether this credentials object creates a secure channel.
    */
  def _isSecure(): Boolean = js.native
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials = js.native
}

/* static members */
@JSImport("@grpc/grpc-js/build/src/channel-credentials", "ChannelCredentials")
@js.native
object ChannelCredentials extends js.Object {
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  def createInsecure(): ChannelCredentials = js.native
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  def createSsl(): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = js.native
}

