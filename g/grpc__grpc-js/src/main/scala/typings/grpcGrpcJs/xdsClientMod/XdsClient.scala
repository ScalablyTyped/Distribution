package typings.grpcGrpcJs.xdsClientMod

import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/xds-client", "XdsClient")
@js.native
class XdsClient protected () extends js.Object {
  def this(targetName: String, serviceConfigWatcher: Watcher[ServiceConfig], channelOptions: ChannelOptions) = this()
  
  /**
    * Acknowledge an update. This should be called after the local nonce and
    * version info are updated so that it sends the post-update values.
    */
  def ack(typeUrl: AdsTypeUrl): Unit = js.native
  
  /**
    *
    * @param lrsServer The target name of the server to send stats to. An empty
    *     string indicates that the default LRS client should be used. Currently
    *     only the empty string is supported here.
    * @param clusterName
    * @param edsServiceName
    */
  def addClusterDropStats(lrsServer: String, clusterName: String, edsServiceName: String): XdsClusterDropStats = js.native
  
  def addClusterLocalityStats(
    lrsServer: String,
    clusterName: String,
    edsServiceName: String,
    locality: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any
  ): XdsClusterLocalityStats = js.native
  
  def addClusterWatcher(
    clusterName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cluster__Output */ _
    ]
  ): Unit = js.native
  
  def addEndpointWatcher(
    edsServiceName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ _
    ]
  ): Unit = js.native
  
  var adsCall: js.Any = js.native
  
  var adsClient: js.Any = js.native
  
  var adsNode: js.Any = js.native
  
  var adsState: js.Any = js.native
  
  var clusterStatsMap: js.Any = js.native
  
  var handleAdsResponse: js.Any = js.native
  
  var hasShutdown: js.Any = js.native
  
  var latestLrsSettings: js.Any = js.native
  
  var lrsCall: js.Any = js.native
  
  var lrsClient: js.Any = js.native
  
  var lrsNode: js.Any = js.native
  
  /**
    * Start the ADS stream if the client exists and there is not already an
    * existing stream, and there
    */
  var maybeStartAdsStream: js.Any = js.native
  
  var maybeStartLrsStream: js.Any = js.native
  
  /**
    * Reject an update. This should be called without updating the local
    * nonce and version info.
    */
  var nack: js.Any = js.native
  
  def removeClusterWatcher(
    clusterName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cluster__Output */ _
    ]
  ): Unit = js.native
  
  def removeEndpointWatcher(
    edsServiceName: String,
    watcher: Watcher[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ _
    ]
  ): Unit = js.native
  
  var reportStreamError: js.Any = js.native
  
  var sendStats: js.Any = js.native
  
  def shutdown(): Unit = js.native
  
  var statsTimer: js.Any = js.native
  
  var updateNames: js.Any = js.native
}
