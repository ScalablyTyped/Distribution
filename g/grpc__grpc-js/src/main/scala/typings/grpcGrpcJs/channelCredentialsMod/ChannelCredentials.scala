package typings.grpcGrpcJs.channelCredentialsMod

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.node.Buffer
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/channel-credentials", "ChannelCredentials")
@js.native
abstract class ChannelCredentials protected () extends js.Object {
  protected def this(callCredentials: CallCredentials) = this()
  
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
  
  var callCredentials: CallCredentials = js.native
  
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
  def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): ChannelCredentials = js.native
}
