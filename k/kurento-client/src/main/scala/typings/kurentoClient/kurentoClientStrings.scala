package typings.kurentoClient

import typings.kurentoClient.mod.ConnectionState
import typings.kurentoClient.mod.IceComponentState
import typings.kurentoClient.mod.MediaFlowState
import typings.kurentoClient.mod.MediaState
import typings.kurentoClient.mod.MediaTranscodingState
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.UriEndpointState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kurentoClientStrings {
  
  @js.native
  sealed trait AUDIO extends MediaType
  @scala.inline
  def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @js.native
  sealed trait CONNECTED
    extends ConnectionState
       with IceComponentState
       with MediaState
  @scala.inline
  def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CONNECTING extends IceComponentState
  @scala.inline
  def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @js.native
  sealed trait ConnectionStateChanged extends StObject
  @scala.inline
  def ConnectionStateChanged: ConnectionStateChanged = "ConnectionStateChanged".asInstanceOf[ConnectionStateChanged]
  
  @js.native
  sealed trait DISCONNECTED
    extends ConnectionState
       with IceComponentState
       with MediaState
  @scala.inline
  def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @js.native
  sealed trait DataChannelClose extends StObject
  @scala.inline
  def DataChannelClose: DataChannelClose = "DataChannelClose".asInstanceOf[DataChannelClose]
  
  @js.native
  sealed trait DataChannelOpen extends StObject
  @scala.inline
  def DataChannelOpen: DataChannelOpen = "DataChannelOpen".asInstanceOf[DataChannelOpen]
  
  @js.native
  sealed trait ElementConnected extends StObject
  @scala.inline
  def ElementConnected: ElementConnected = "ElementConnected".asInstanceOf[ElementConnected]
  
  @js.native
  sealed trait ElementDisconnected extends StObject
  @scala.inline
  def ElementDisconnected: ElementDisconnected = "ElementDisconnected".asInstanceOf[ElementDisconnected]
  
  @js.native
  sealed trait EndOfStream extends StObject
  @scala.inline
  def EndOfStream: EndOfStream = "EndOfStream".asInstanceOf[EndOfStream]
  
  @js.native
  sealed trait FAILED extends IceComponentState
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FLOWING extends MediaFlowState
  @scala.inline
  def FLOWING: FLOWING = "FLOWING".asInstanceOf[FLOWING]
  
  @js.native
  sealed trait GATHERING extends IceComponentState
  @scala.inline
  def GATHERING: GATHERING = "GATHERING".asInstanceOf[GATHERING]
  
  @js.native
  sealed trait IceCandidate extends StObject
  @scala.inline
  def IceCandidate: IceCandidate = "IceCandidate".asInstanceOf[IceCandidate]
  
  @js.native
  sealed trait IceCandidateFound extends StObject
  @scala.inline
  def IceCandidateFound: IceCandidateFound = "IceCandidateFound".asInstanceOf[IceCandidateFound]
  
  @js.native
  sealed trait IceComponentStateChange extends StObject
  @scala.inline
  def IceComponentStateChange: IceComponentStateChange = "IceComponentStateChange".asInstanceOf[IceComponentStateChange]
  
  @js.native
  sealed trait IceGatheringDone extends StObject
  @scala.inline
  def IceGatheringDone: IceGatheringDone = "IceGatheringDone".asInstanceOf[IceGatheringDone]
  
  @js.native
  sealed trait MediaFlowInStateChange extends StObject
  @scala.inline
  def MediaFlowInStateChange: MediaFlowInStateChange = "MediaFlowInStateChange".asInstanceOf[MediaFlowInStateChange]
  
  @js.native
  sealed trait MediaFlowOutStateChange extends StObject
  @scala.inline
  def MediaFlowOutStateChange: MediaFlowOutStateChange = "MediaFlowOutStateChange".asInstanceOf[MediaFlowOutStateChange]
  
  @js.native
  sealed trait MediaPipeline extends StObject
  @scala.inline
  def MediaPipeline: MediaPipeline = "MediaPipeline".asInstanceOf[MediaPipeline]
  
  @js.native
  sealed trait MediaStateChanged extends StObject
  @scala.inline
  def MediaStateChanged: MediaStateChanged = "MediaStateChanged".asInstanceOf[MediaStateChanged]
  
  @js.native
  sealed trait MediaTranscodingStateChange extends StObject
  @scala.inline
  def MediaTranscodingStateChange: MediaTranscodingStateChange = "MediaTranscodingStateChange".asInstanceOf[MediaTranscodingStateChange]
  
  @js.native
  sealed trait NOT_FLOWING extends MediaFlowState
  @scala.inline
  def NOT_FLOWING: NOT_FLOWING = "NOT_FLOWING".asInstanceOf[NOT_FLOWING]
  
  @js.native
  sealed trait NOT_TRANSCODING extends MediaTranscodingState
  @scala.inline
  def NOT_TRANSCODING: NOT_TRANSCODING = "NOT_TRANSCODING".asInstanceOf[NOT_TRANSCODING]
  
  @js.native
  sealed trait NewCandidatePairSelected extends StObject
  @scala.inline
  def NewCandidatePairSelected: NewCandidatePairSelected = "NewCandidatePairSelected".asInstanceOf[NewCandidatePairSelected]
  
  @js.native
  sealed trait ObjectCreated extends StObject
  @scala.inline
  def ObjectCreated: ObjectCreated = "ObjectCreated".asInstanceOf[ObjectCreated]
  
  @js.native
  sealed trait ObjectDestroyed extends StObject
  @scala.inline
  def ObjectDestroyed: ObjectDestroyed = "ObjectDestroyed".asInstanceOf[ObjectDestroyed]
  
  @js.native
  sealed trait OnIceCandidate extends StObject
  @scala.inline
  def OnIceCandidate: OnIceCandidate = "OnIceCandidate".asInstanceOf[OnIceCandidate]
  
  @js.native
  sealed trait PAUSE extends UriEndpointState
  @scala.inline
  def PAUSE: PAUSE = "PAUSE".asInstanceOf[PAUSE]
  
  @js.native
  sealed trait Paused extends StObject
  @scala.inline
  def Paused: Paused = "Paused".asInstanceOf[Paused]
  
  @js.native
  sealed trait PlayerEndpoint extends StObject
  @scala.inline
  def PlayerEndpoint: PlayerEndpoint = "PlayerEndpoint".asInstanceOf[PlayerEndpoint]
  
  @js.native
  sealed trait READY extends IceComponentState
  @scala.inline
  def READY: READY = "READY".asInstanceOf[READY]
  
  @js.native
  sealed trait RecorderEndpoint extends StObject
  @scala.inline
  def RecorderEndpoint: RecorderEndpoint = "RecorderEndpoint".asInstanceOf[RecorderEndpoint]
  
  @js.native
  sealed trait Recording extends StObject
  @scala.inline
  def Recording: Recording = "Recording".asInstanceOf[Recording]
  
  @js.native
  sealed trait START extends UriEndpointState
  @scala.inline
  def START: START = "START".asInstanceOf[START]
  
  @js.native
  sealed trait STOP extends UriEndpointState
  @scala.inline
  def STOP: STOP = "STOP".asInstanceOf[STOP]
  
  @js.native
  sealed trait SpaceDATA extends MediaType
  @scala.inline
  def SpaceDATA: SpaceDATA = (" DATA").asInstanceOf[SpaceDATA]
  
  @js.native
  sealed trait Stopped extends StObject
  @scala.inline
  def Stopped: Stopped = "Stopped".asInstanceOf[Stopped]
  
  @js.native
  sealed trait TRANSCODING extends MediaTranscodingState
  @scala.inline
  def TRANSCODING: TRANSCODING = "TRANSCODING".asInstanceOf[TRANSCODING]
  
  @js.native
  sealed trait UriEndpointStateChanged extends StObject
  @scala.inline
  def UriEndpointStateChanged: UriEndpointStateChanged = "UriEndpointStateChanged".asInstanceOf[UriEndpointStateChanged]
  
  @js.native
  sealed trait VIDEO extends MediaType
  @scala.inline
  def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @js.native
  sealed trait WebRtcEndpoint extends StObject
  @scala.inline
  def WebRtcEndpoint: WebRtcEndpoint = "WebRtcEndpoint".asInstanceOf[WebRtcEndpoint]
}
