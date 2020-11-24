package typings.kurentoClient

import typings.kurentoClient.mod.ConnectionState
import typings.kurentoClient.mod.IceComponentState
import typings.kurentoClient.mod.MediaFlowState
import typings.kurentoClient.mod.MediaState
import typings.kurentoClient.mod.MediaTranscodingState
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.UriEndpointState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kurentoClientStrings {
  
  @scala.inline
  def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @scala.inline
  def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @scala.inline
  def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @scala.inline
  def ConnectionStateChanged: ConnectionStateChanged = "ConnectionStateChanged".asInstanceOf[ConnectionStateChanged]
  
  @scala.inline
  def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @scala.inline
  def DataChannelClose: DataChannelClose = "DataChannelClose".asInstanceOf[DataChannelClose]
  
  @scala.inline
  def DataChannelOpen: DataChannelOpen = "DataChannelOpen".asInstanceOf[DataChannelOpen]
  
  @scala.inline
  def ElementConnected: ElementConnected = "ElementConnected".asInstanceOf[ElementConnected]
  
  @scala.inline
  def ElementDisconnected: ElementDisconnected = "ElementDisconnected".asInstanceOf[ElementDisconnected]
  
  @scala.inline
  def EndOfStream: EndOfStream = "EndOfStream".asInstanceOf[EndOfStream]
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @scala.inline
  def FLOWING: FLOWING = "FLOWING".asInstanceOf[FLOWING]
  
  @scala.inline
  def GATHERING: GATHERING = "GATHERING".asInstanceOf[GATHERING]
  
  @scala.inline
  def IceCandidate: IceCandidate = "IceCandidate".asInstanceOf[IceCandidate]
  
  @scala.inline
  def IceCandidateFound: IceCandidateFound = "IceCandidateFound".asInstanceOf[IceCandidateFound]
  
  @scala.inline
  def IceComponentStateChange: IceComponentStateChange = "IceComponentStateChange".asInstanceOf[IceComponentStateChange]
  
  @scala.inline
  def IceGatheringDone: IceGatheringDone = "IceGatheringDone".asInstanceOf[IceGatheringDone]
  
  @scala.inline
  def MediaFlowInStateChange: MediaFlowInStateChange = "MediaFlowInStateChange".asInstanceOf[MediaFlowInStateChange]
  
  @scala.inline
  def MediaFlowOutStateChange: MediaFlowOutStateChange = "MediaFlowOutStateChange".asInstanceOf[MediaFlowOutStateChange]
  
  @scala.inline
  def MediaPipeline: MediaPipeline = "MediaPipeline".asInstanceOf[MediaPipeline]
  
  @scala.inline
  def MediaStateChanged: MediaStateChanged = "MediaStateChanged".asInstanceOf[MediaStateChanged]
  
  @scala.inline
  def MediaTranscodingStateChange: MediaTranscodingStateChange = "MediaTranscodingStateChange".asInstanceOf[MediaTranscodingStateChange]
  
  @scala.inline
  def NOT_FLOWING: NOT_FLOWING = "NOT_FLOWING".asInstanceOf[NOT_FLOWING]
  
  @scala.inline
  def NOT_TRANSCODING: NOT_TRANSCODING = "NOT_TRANSCODING".asInstanceOf[NOT_TRANSCODING]
  
  @scala.inline
  def NewCandidatePairSelected: NewCandidatePairSelected = "NewCandidatePairSelected".asInstanceOf[NewCandidatePairSelected]
  
  @scala.inline
  def ObjectCreated: ObjectCreated = "ObjectCreated".asInstanceOf[ObjectCreated]
  
  @scala.inline
  def ObjectDestroyed: ObjectDestroyed = "ObjectDestroyed".asInstanceOf[ObjectDestroyed]
  
  @scala.inline
  def OnIceCandidate: OnIceCandidate = "OnIceCandidate".asInstanceOf[OnIceCandidate]
  
  @scala.inline
  def PAUSE: PAUSE = "PAUSE".asInstanceOf[PAUSE]
  
  @scala.inline
  def Paused: Paused = "Paused".asInstanceOf[Paused]
  
  @scala.inline
  def PlayerEndpoint: PlayerEndpoint = "PlayerEndpoint".asInstanceOf[PlayerEndpoint]
  
  @scala.inline
  def READY: READY = "READY".asInstanceOf[READY]
  
  @scala.inline
  def RecorderEndpoint: RecorderEndpoint = "RecorderEndpoint".asInstanceOf[RecorderEndpoint]
  
  @scala.inline
  def Recording: Recording = "Recording".asInstanceOf[Recording]
  
  @scala.inline
  def START: START = "START".asInstanceOf[START]
  
  @scala.inline
  def STOP: STOP = "STOP".asInstanceOf[STOP]
  
  @scala.inline
  def SpaceDATA: SpaceDATA = (" DATA").asInstanceOf[SpaceDATA]
  
  @scala.inline
  def Stopped: Stopped = "Stopped".asInstanceOf[Stopped]
  
  @scala.inline
  def TRANSCODING: TRANSCODING = "TRANSCODING".asInstanceOf[TRANSCODING]
  
  @scala.inline
  def UriEndpointStateChanged: UriEndpointStateChanged = "UriEndpointStateChanged".asInstanceOf[UriEndpointStateChanged]
  
  @scala.inline
  def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @scala.inline
  def WebRtcEndpoint: WebRtcEndpoint = "WebRtcEndpoint".asInstanceOf[WebRtcEndpoint]
  
  @js.native
  sealed trait AUDIO extends MediaType
  
  @js.native
  sealed trait CONNECTED
    extends ConnectionState
       with IceComponentState
       with MediaState
  
  @js.native
  sealed trait CONNECTING extends IceComponentState
  
  @js.native
  sealed trait ConnectionStateChanged extends js.Object
  
  @js.native
  sealed trait DISCONNECTED
    extends ConnectionState
       with IceComponentState
       with MediaState
  
  @js.native
  sealed trait DataChannelClose extends js.Object
  
  @js.native
  sealed trait DataChannelOpen extends js.Object
  
  @js.native
  sealed trait ElementConnected extends js.Object
  
  @js.native
  sealed trait ElementDisconnected extends js.Object
  
  @js.native
  sealed trait EndOfStream extends js.Object
  
  @js.native
  sealed trait FAILED extends IceComponentState
  
  @js.native
  sealed trait FLOWING extends MediaFlowState
  
  @js.native
  sealed trait GATHERING extends IceComponentState
  
  @js.native
  sealed trait IceCandidate extends js.Object
  
  @js.native
  sealed trait IceCandidateFound extends js.Object
  
  @js.native
  sealed trait IceComponentStateChange extends js.Object
  
  @js.native
  sealed trait IceGatheringDone extends js.Object
  
  @js.native
  sealed trait MediaFlowInStateChange extends js.Object
  
  @js.native
  sealed trait MediaFlowOutStateChange extends js.Object
  
  @js.native
  sealed trait MediaPipeline extends js.Object
  
  @js.native
  sealed trait MediaStateChanged extends js.Object
  
  @js.native
  sealed trait MediaTranscodingStateChange extends js.Object
  
  @js.native
  sealed trait NOT_FLOWING extends MediaFlowState
  
  @js.native
  sealed trait NOT_TRANSCODING extends MediaTranscodingState
  
  @js.native
  sealed trait NewCandidatePairSelected extends js.Object
  
  @js.native
  sealed trait ObjectCreated extends js.Object
  
  @js.native
  sealed trait ObjectDestroyed extends js.Object
  
  @js.native
  sealed trait OnIceCandidate extends js.Object
  
  @js.native
  sealed trait PAUSE extends UriEndpointState
  
  @js.native
  sealed trait Paused extends js.Object
  
  @js.native
  sealed trait PlayerEndpoint extends js.Object
  
  @js.native
  sealed trait READY extends IceComponentState
  
  @js.native
  sealed trait RecorderEndpoint extends js.Object
  
  @js.native
  sealed trait Recording extends js.Object
  
  @js.native
  sealed trait START extends UriEndpointState
  
  @js.native
  sealed trait STOP extends UriEndpointState
  
  @js.native
  sealed trait SpaceDATA extends MediaType
  
  @js.native
  sealed trait Stopped extends js.Object
  
  @js.native
  sealed trait TRANSCODING extends MediaTranscodingState
  
  @js.native
  sealed trait UriEndpointStateChanged extends js.Object
  
  @js.native
  sealed trait VIDEO extends MediaType
  
  @js.native
  sealed trait WebRtcEndpoint extends js.Object
}
