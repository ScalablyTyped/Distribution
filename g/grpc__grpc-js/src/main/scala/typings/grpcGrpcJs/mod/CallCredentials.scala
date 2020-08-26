package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.callCredentialsMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "CallCredentials")
@js.native
abstract class CallCredentials ()
  extends typings.grpcGrpcJs.callCredentialsMod.CallCredentials

/* static members */
@JSImport("@grpc/grpc-js", "CallCredentials")
@js.native
object CallCredentials extends js.Object {
  def createEmpty(): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  /**
    * Create a gRPC credential from a Google credential object.
    * @param googleCredentials The authentication client to use.
    * @return The resulting CallCredentials object.
    */
  def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
}

