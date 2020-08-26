package typings.grpcGrpcJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "credentials")
@js.native
object credentials extends js.Object {
  var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any = js.native
  var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any = js.native
  var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any = js.native
  var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any = js.native
  var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any = js.native
  /**
    * Combine any number of CallCredentials into a single CallCredentials
    * object.
    * @param first The first CallCredentials object.
    * @param additional Any number of additional CallCredentials objects.
    * @return The resulting CallCredentials object.
    */
  def combineCallCredentials(
    first: typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
    additional: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
  ): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  /**
    * Combine a ChannelCredentials with any number of CallCredentials into a
    * single ChannelCredentials object.
    * @param channelCredentials The ChannelCredentials object.
    * @param callCredentials Any number of CallCredentials objects.
    * @return The resulting ChannelCredentials object.
    */
  def combineChannelCredentials(
    channelCredentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
  ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
}

