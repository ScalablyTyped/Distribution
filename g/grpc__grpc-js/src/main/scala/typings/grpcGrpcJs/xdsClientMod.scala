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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cluster__Output */ js.Any
        ]
    ): Unit = js.native
    
    def addEndpointWatcher(
      edsServiceName: String,
      watcher: Watcher[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ js.Any
        ]
    ): Unit = js.native
    
    /* private */ var adsCall: js.Any = js.native
    
    /* private */ var adsClient: js.Any = js.native
    
    /* private */ var adsNode: js.Any = js.native
    
    /* private */ var adsState: js.Any = js.native
    
    /* private */ var clusterStatsMap: js.Any = js.native
    
    /* private */ var handleAdsResponse: js.Any = js.native
    
    /* private */ var hasShutdown: js.Any = js.native
    
    /* private */ var latestLrsSettings: js.Any = js.native
    
    /* private */ var lrsCall: js.Any = js.native
    
    /* private */ var lrsClient: js.Any = js.native
    
    /* private */ var lrsNode: js.Any = js.native
    
    /**
      * Start the ADS stream if the client exists and there is not already an
      * existing stream, and there
      */
    /* private */ var maybeStartAdsStream: js.Any = js.native
    
    /* private */ var maybeStartLrsStream: js.Any = js.native
    
    /**
      * Reject an update. This should be called without updating the local
      * nonce and version info.
      */
    /* private */ var nack: js.Any = js.native
    
    def removeClusterWatcher(
      clusterName: String,
      watcher: Watcher[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cluster__Output */ js.Any
        ]
    ): Unit = js.native
    
    def removeEndpointWatcher(
      edsServiceName: String,
      watcher: Watcher[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClusterLoadAssignment__Output */ js.Any
        ]
    ): Unit = js.native
    
    /* private */ var reportStreamError: js.Any = js.native
    
    /* private */ var sendStats: js.Any = js.native
    
    def shutdown(): Unit = js.native
    
    /* private */ var statsTimer: js.Any = js.native
    
    /* private */ var updateNames: js.Any = js.native
  }
  
  type AdsTypeUrl = EdsTypeUrl | CdsTypeUrl | RdsTypeUrl | LdsTypeUrl
  
  type CdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotCluster
  
  type EdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotClusterLoadAssignment
  
  type LdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotListener
  
  type RdsTypeUrl = typeDotgoogleapisDotcomSlashenvoyDotapiDotv2DotRouteConfiguration
  
  trait Watcher[UpdateType] extends StObject {
    
    def onResourceDoesNotExist(): Unit
    
    def onTransientError(error: StatusObject): Unit
    
    def onValidUpdate(update: UpdateType): Unit
  }
  object Watcher {
    
    inline def apply[UpdateType](
      onResourceDoesNotExist: () => Unit,
      onTransientError: StatusObject => Unit,
      onValidUpdate: UpdateType => Unit
    ): Watcher[UpdateType] = {
      val __obj = js.Dynamic.literal(onResourceDoesNotExist = js.Any.fromFunction0(onResourceDoesNotExist), onTransientError = js.Any.fromFunction1(onTransientError), onValidUpdate = js.Any.fromFunction1(onValidUpdate))
      __obj.asInstanceOf[Watcher[UpdateType]]
    }
    
    extension [Self <: Watcher[?], UpdateType](x: Self & Watcher[UpdateType]) {
      
      inline def setOnResourceDoesNotExist(value: () => Unit): Self = StObject.set(x, "onResourceDoesNotExist", js.Any.fromFunction0(value))
      
      inline def setOnTransientError(value: StatusObject => Unit): Self = StObject.set(x, "onTransientError", js.Any.fromFunction1(value))
      
      inline def setOnValidUpdate(value: UpdateType => Unit): Self = StObject.set(x, "onValidUpdate", js.Any.fromFunction1(value))
    }
  }
  
  trait XdsClusterDropStats extends StObject {
    
    def addCallDropped(category: String): Unit
  }
  object XdsClusterDropStats {
    
    inline def apply(addCallDropped: String => Unit): XdsClusterDropStats = {
      val __obj = js.Dynamic.literal(addCallDropped = js.Any.fromFunction1(addCallDropped))
      __obj.asInstanceOf[XdsClusterDropStats]
    }
    
    extension [Self <: XdsClusterDropStats](x: Self) {
      
      inline def setAddCallDropped(value: String => Unit): Self = StObject.set(x, "addCallDropped", js.Any.fromFunction1(value))
    }
  }
  
  trait XdsClusterLocalityStats extends StObject {
    
    def addCallFinished(fail: Boolean): Unit
    
    def addCallStarted(): Unit
  }
  object XdsClusterLocalityStats {
    
    inline def apply(addCallFinished: Boolean => Unit, addCallStarted: () => Unit): XdsClusterLocalityStats = {
      val __obj = js.Dynamic.literal(addCallFinished = js.Any.fromFunction1(addCallFinished), addCallStarted = js.Any.fromFunction0(addCallStarted))
      __obj.asInstanceOf[XdsClusterLocalityStats]
    }
    
    extension [Self <: XdsClusterLocalityStats](x: Self) {
      
      inline def setAddCallFinished(value: Boolean => Unit): Self = StObject.set(x, "addCallFinished", js.Any.fromFunction1(value))
      
      inline def setAddCallStarted(value: () => Unit): Self = StObject.set(x, "addCallStarted", js.Any.fromFunction0(value))
    }
  }
}
