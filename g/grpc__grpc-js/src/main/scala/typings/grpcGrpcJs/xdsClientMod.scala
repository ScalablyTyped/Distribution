package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.grpcGrpcJsStrings.typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotCluster
import typings.grpcGrpcJs.grpcGrpcJsStrings.typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotClusterLoadAssignment
import typings.grpcGrpcJs.grpcGrpcJsStrings.typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotListener
import typings.grpcGrpcJs.grpcGrpcJsStrings.typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotRouteConfiguration
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xdsClientMod {
  
  @JSImport("@grpc/grpc-js/build/src/xds-client", "XdsClient")
  @js.native
  class XdsClient protected () extends StObject {
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
  
  type AdsTypeUrl = EdsTypeUrl | CdsTypeUrl | RdsTypeUrl | LdsTypeUrl
  
  type CdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotCluster
  
  type EdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotClusterLoadAssignment
  
  type LdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotListener
  
  type RdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotRouteConfiguration
  
  @js.native
  trait Watcher[UpdateType] extends StObject {
    
    def onResourceDoesNotExist(): Unit = js.native
    
    def onTransientError(error: StatusObject): Unit = js.native
    
    def onValidUpdate(update: UpdateType): Unit = js.native
  }
  object Watcher {
    
    @scala.inline
    def apply[UpdateType](
      onResourceDoesNotExist: () => Unit,
      onTransientError: StatusObject => Unit,
      onValidUpdate: UpdateType => Unit
    ): Watcher[UpdateType] = {
      val __obj = js.Dynamic.literal(onResourceDoesNotExist = js.Any.fromFunction0(onResourceDoesNotExist), onTransientError = js.Any.fromFunction1(onTransientError), onValidUpdate = js.Any.fromFunction1(onValidUpdate))
      __obj.asInstanceOf[Watcher[UpdateType]]
    }
    
    @scala.inline
    implicit class WatcherMutableBuilder[Self <: Watcher[_], UpdateType] (val x: Self with Watcher[UpdateType]) extends AnyVal {
      
      @scala.inline
      def setOnResourceDoesNotExist(value: () => Unit): Self = StObject.set(x, "onResourceDoesNotExist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTransientError(value: StatusObject => Unit): Self = StObject.set(x, "onTransientError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidUpdate(value: UpdateType => Unit): Self = StObject.set(x, "onValidUpdate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait XdsClusterDropStats extends StObject {
    
    def addCallDropped(category: String): Unit = js.native
  }
  object XdsClusterDropStats {
    
    @scala.inline
    def apply(addCallDropped: String => Unit): XdsClusterDropStats = {
      val __obj = js.Dynamic.literal(addCallDropped = js.Any.fromFunction1(addCallDropped))
      __obj.asInstanceOf[XdsClusterDropStats]
    }
    
    @scala.inline
    implicit class XdsClusterDropStatsMutableBuilder[Self <: XdsClusterDropStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCallDropped(value: String => Unit): Self = StObject.set(x, "addCallDropped", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait XdsClusterLocalityStats extends StObject {
    
    def addCallFinished(fail: Boolean): Unit = js.native
    
    def addCallStarted(): Unit = js.native
  }
  object XdsClusterLocalityStats {
    
    @scala.inline
    def apply(addCallFinished: Boolean => Unit, addCallStarted: () => Unit): XdsClusterLocalityStats = {
      val __obj = js.Dynamic.literal(addCallFinished = js.Any.fromFunction1(addCallFinished), addCallStarted = js.Any.fromFunction0(addCallStarted))
      __obj.asInstanceOf[XdsClusterLocalityStats]
    }
    
    @scala.inline
    implicit class XdsClusterLocalityStatsMutableBuilder[Self <: XdsClusterLocalityStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCallFinished(value: Boolean => Unit): Self = StObject.set(x, "addCallFinished", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddCallStarted(value: () => Unit): Self = StObject.set(x, "addCallStarted", js.Any.fromFunction0(value))
    }
  }
}
