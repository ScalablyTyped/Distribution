package typings.grpcGrpcJs.xdsClientMod

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/xds-client", "XdsClient")
@js.native
class XdsClient protected () extends js.Object {
  def this(targetName: String, serviceConfigWatcher: Watcher[ServiceConfig], channelOptions: ChannelOptions) = this()
  /**
    * Acknowledge an EDS update. This should be called after the local nonce and
    * version info are updated so that it sends the post-update values.
    */
  var ackEds: js.Any = js.native
  var adsCall: js.Any = js.native
  var client: js.Any = js.native
  var endpointWatchers: js.Any = js.native
  var handleEdsResponse: js.Any = js.native
  var hasShutdown: js.Any = js.native
  var lastEdsNonce: js.Any = js.native
  var lastEdsVersionInfo: js.Any = js.native
  var latestEdsResponses: js.Any = js.native
  /**
    * Start the ADS stream if the client exists and there is not already an
    * existing stream, and there
    */
  var maybeStartAdsStream: js.Any = js.native
  /**
    * Reject an EDS update. This should be called without updating the local
    * nonce and version info.
    */
  var nackEds: js.Any = js.native
  var nackUnknown: js.Any = js.native
  var node: js.Any = js.native
  var reportStreamError: js.Any = js.native
  var serviceConfigWatcher: js.Any = js.native
  var targetName: js.Any = js.native
  var updateEdsNames: js.Any = js.native
  /**
    * Validate the ClusterLoadAssignment object by these rules:
    * https://github.com/grpc/proposal/blob/master/A27-xds-global-load-balancing.md#clusterloadassignment-proto
    * @param message
    */
  var validateEdsResponse: js.Any = js.native
  def addEndpointWatcher(
    edsServiceName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ _
    ]
  ): Unit = js.native
  def removeEndpointWatcher(
    edsServiceName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ _
    ]
  ): Unit = js.native
  def shutdown(): Unit = js.native
}

