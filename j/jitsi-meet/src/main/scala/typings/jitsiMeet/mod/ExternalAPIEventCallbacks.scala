package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalAPIEventCallbacks extends StObject {
  
  def audioAvailabilityChanged(e: AudioAvailabilityChangedEvent): Unit
  
  def audioMuteStatusChanged(e: AudioMuteStatusChangedEvent): Unit
  
  def avatarChanged(e: AvatarChangedEvent): Unit
  
  def cameraError(e: CameraErrorEvent): Unit
  
  def deviceListChanged(e: DeviceListChangedEvent): Unit
  
  def displayNameChange(e: DisplayNameChangeEvent): Unit
  
  def dominantSpeakerChanged(e: DominantSpeakerChangedEvent): Unit
  
  def emailChange(e: EmailChangeEvent): Unit
  
  def endpointTextMessageReceived(e: EndpointTextMessageReceivedEvent): Unit
  
  def feedbackSubmitted(e: FeedbackSubmittedEvent): Unit
  
  def filmstripDisplayChanged(e: FilmstripDisplayChangedEvent): Unit
  
  def incomingMessage(e: IncomingMessageEvent): Unit
  
  def largeVideoChanged(e: LargeVideoChangedEvent): Unit
  
  def log(e: LogEvent): Unit
  
  def micError(e: MicErrorEvent): Unit
  
  def outgoingMessage(e: OutgoingMessageEvent): Unit
  
  def participantJoined(e: ParticipantJoinedEvent): Unit
  
  def participantKickedOut(e: ParticipantKickedOutEvent): Unit
  
  def participantLeft(e: ParticipantLeftEvent): Unit
  
  def participantRoleChanged(e: ParticipantRoleChangedEvent): Unit
  
  def passwordRequired(): Unit
  
  def readyToClose(): Unit
  
  def screenSharingStatusChanged(e: ScreenSharingStatusChangedEvent): Unit
  
  def subjectChange(e: SubjectChangeEvent): Unit
  
  def suspendDetected(): Unit
  
  def tileViewChanged(e: TileViewChangedEvent): Unit
  
  def videoAvailabilityChanged(e: VideoAvailabilityChangedEvent): Unit
  
  def videoConferenceJoined(e: VideoConferenceJoinedEvent): Unit
  
  def videoConferenceLeft(e: VideoConferenceLeftEvent): Unit
  
  def videoMuteStatusChanged(e: VideoMuteStatusChangedEvent): Unit
  
  def videoQualityChanged(e: VideoQualityChangedEvent): Unit
}
object ExternalAPIEventCallbacks {
  
  inline def apply(
    audioAvailabilityChanged: AudioAvailabilityChangedEvent => Unit,
    audioMuteStatusChanged: AudioMuteStatusChangedEvent => Unit,
    avatarChanged: AvatarChangedEvent => Unit,
    cameraError: CameraErrorEvent => Unit,
    deviceListChanged: DeviceListChangedEvent => Unit,
    displayNameChange: DisplayNameChangeEvent => Unit,
    dominantSpeakerChanged: DominantSpeakerChangedEvent => Unit,
    emailChange: EmailChangeEvent => Unit,
    endpointTextMessageReceived: EndpointTextMessageReceivedEvent => Unit,
    feedbackSubmitted: FeedbackSubmittedEvent => Unit,
    filmstripDisplayChanged: FilmstripDisplayChangedEvent => Unit,
    incomingMessage: IncomingMessageEvent => Unit,
    largeVideoChanged: LargeVideoChangedEvent => Unit,
    log: LogEvent => Unit,
    micError: MicErrorEvent => Unit,
    outgoingMessage: OutgoingMessageEvent => Unit,
    participantJoined: ParticipantJoinedEvent => Unit,
    participantKickedOut: ParticipantKickedOutEvent => Unit,
    participantLeft: ParticipantLeftEvent => Unit,
    participantRoleChanged: ParticipantRoleChangedEvent => Unit,
    passwordRequired: () => Unit,
    readyToClose: () => Unit,
    screenSharingStatusChanged: ScreenSharingStatusChangedEvent => Unit,
    subjectChange: SubjectChangeEvent => Unit,
    suspendDetected: () => Unit,
    tileViewChanged: TileViewChangedEvent => Unit,
    videoAvailabilityChanged: VideoAvailabilityChangedEvent => Unit,
    videoConferenceJoined: VideoConferenceJoinedEvent => Unit,
    videoConferenceLeft: VideoConferenceLeftEvent => Unit,
    videoMuteStatusChanged: VideoMuteStatusChangedEvent => Unit,
    videoQualityChanged: VideoQualityChangedEvent => Unit
  ): ExternalAPIEventCallbacks = {
    val __obj = js.Dynamic.literal(audioAvailabilityChanged = js.Any.fromFunction1(audioAvailabilityChanged), audioMuteStatusChanged = js.Any.fromFunction1(audioMuteStatusChanged), avatarChanged = js.Any.fromFunction1(avatarChanged), cameraError = js.Any.fromFunction1(cameraError), deviceListChanged = js.Any.fromFunction1(deviceListChanged), displayNameChange = js.Any.fromFunction1(displayNameChange), dominantSpeakerChanged = js.Any.fromFunction1(dominantSpeakerChanged), emailChange = js.Any.fromFunction1(emailChange), endpointTextMessageReceived = js.Any.fromFunction1(endpointTextMessageReceived), feedbackSubmitted = js.Any.fromFunction1(feedbackSubmitted), filmstripDisplayChanged = js.Any.fromFunction1(filmstripDisplayChanged), incomingMessage = js.Any.fromFunction1(incomingMessage), largeVideoChanged = js.Any.fromFunction1(largeVideoChanged), log = js.Any.fromFunction1(log), micError = js.Any.fromFunction1(micError), outgoingMessage = js.Any.fromFunction1(outgoingMessage), participantJoined = js.Any.fromFunction1(participantJoined), participantKickedOut = js.Any.fromFunction1(participantKickedOut), participantLeft = js.Any.fromFunction1(participantLeft), participantRoleChanged = js.Any.fromFunction1(participantRoleChanged), passwordRequired = js.Any.fromFunction0(passwordRequired), readyToClose = js.Any.fromFunction0(readyToClose), screenSharingStatusChanged = js.Any.fromFunction1(screenSharingStatusChanged), subjectChange = js.Any.fromFunction1(subjectChange), suspendDetected = js.Any.fromFunction0(suspendDetected), tileViewChanged = js.Any.fromFunction1(tileViewChanged), videoAvailabilityChanged = js.Any.fromFunction1(videoAvailabilityChanged), videoConferenceJoined = js.Any.fromFunction1(videoConferenceJoined), videoConferenceLeft = js.Any.fromFunction1(videoConferenceLeft), videoMuteStatusChanged = js.Any.fromFunction1(videoMuteStatusChanged), videoQualityChanged = js.Any.fromFunction1(videoQualityChanged))
    __obj.asInstanceOf[ExternalAPIEventCallbacks]
  }
  
  extension [Self <: ExternalAPIEventCallbacks](x: Self) {
    
    inline def setAudioAvailabilityChanged(value: AudioAvailabilityChangedEvent => Unit): Self = StObject.set(x, "audioAvailabilityChanged", js.Any.fromFunction1(value))
    
    inline def setAudioMuteStatusChanged(value: AudioMuteStatusChangedEvent => Unit): Self = StObject.set(x, "audioMuteStatusChanged", js.Any.fromFunction1(value))
    
    inline def setAvatarChanged(value: AvatarChangedEvent => Unit): Self = StObject.set(x, "avatarChanged", js.Any.fromFunction1(value))
    
    inline def setCameraError(value: CameraErrorEvent => Unit): Self = StObject.set(x, "cameraError", js.Any.fromFunction1(value))
    
    inline def setDeviceListChanged(value: DeviceListChangedEvent => Unit): Self = StObject.set(x, "deviceListChanged", js.Any.fromFunction1(value))
    
    inline def setDisplayNameChange(value: DisplayNameChangeEvent => Unit): Self = StObject.set(x, "displayNameChange", js.Any.fromFunction1(value))
    
    inline def setDominantSpeakerChanged(value: DominantSpeakerChangedEvent => Unit): Self = StObject.set(x, "dominantSpeakerChanged", js.Any.fromFunction1(value))
    
    inline def setEmailChange(value: EmailChangeEvent => Unit): Self = StObject.set(x, "emailChange", js.Any.fromFunction1(value))
    
    inline def setEndpointTextMessageReceived(value: EndpointTextMessageReceivedEvent => Unit): Self = StObject.set(x, "endpointTextMessageReceived", js.Any.fromFunction1(value))
    
    inline def setFeedbackSubmitted(value: FeedbackSubmittedEvent => Unit): Self = StObject.set(x, "feedbackSubmitted", js.Any.fromFunction1(value))
    
    inline def setFilmstripDisplayChanged(value: FilmstripDisplayChangedEvent => Unit): Self = StObject.set(x, "filmstripDisplayChanged", js.Any.fromFunction1(value))
    
    inline def setIncomingMessage(value: IncomingMessageEvent => Unit): Self = StObject.set(x, "incomingMessage", js.Any.fromFunction1(value))
    
    inline def setLargeVideoChanged(value: LargeVideoChangedEvent => Unit): Self = StObject.set(x, "largeVideoChanged", js.Any.fromFunction1(value))
    
    inline def setLog(value: LogEvent => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setMicError(value: MicErrorEvent => Unit): Self = StObject.set(x, "micError", js.Any.fromFunction1(value))
    
    inline def setOutgoingMessage(value: OutgoingMessageEvent => Unit): Self = StObject.set(x, "outgoingMessage", js.Any.fromFunction1(value))
    
    inline def setParticipantJoined(value: ParticipantJoinedEvent => Unit): Self = StObject.set(x, "participantJoined", js.Any.fromFunction1(value))
    
    inline def setParticipantKickedOut(value: ParticipantKickedOutEvent => Unit): Self = StObject.set(x, "participantKickedOut", js.Any.fromFunction1(value))
    
    inline def setParticipantLeft(value: ParticipantLeftEvent => Unit): Self = StObject.set(x, "participantLeft", js.Any.fromFunction1(value))
    
    inline def setParticipantRoleChanged(value: ParticipantRoleChangedEvent => Unit): Self = StObject.set(x, "participantRoleChanged", js.Any.fromFunction1(value))
    
    inline def setPasswordRequired(value: () => Unit): Self = StObject.set(x, "passwordRequired", js.Any.fromFunction0(value))
    
    inline def setReadyToClose(value: () => Unit): Self = StObject.set(x, "readyToClose", js.Any.fromFunction0(value))
    
    inline def setScreenSharingStatusChanged(value: ScreenSharingStatusChangedEvent => Unit): Self = StObject.set(x, "screenSharingStatusChanged", js.Any.fromFunction1(value))
    
    inline def setSubjectChange(value: SubjectChangeEvent => Unit): Self = StObject.set(x, "subjectChange", js.Any.fromFunction1(value))
    
    inline def setSuspendDetected(value: () => Unit): Self = StObject.set(x, "suspendDetected", js.Any.fromFunction0(value))
    
    inline def setTileViewChanged(value: TileViewChangedEvent => Unit): Self = StObject.set(x, "tileViewChanged", js.Any.fromFunction1(value))
    
    inline def setVideoAvailabilityChanged(value: VideoAvailabilityChangedEvent => Unit): Self = StObject.set(x, "videoAvailabilityChanged", js.Any.fromFunction1(value))
    
    inline def setVideoConferenceJoined(value: VideoConferenceJoinedEvent => Unit): Self = StObject.set(x, "videoConferenceJoined", js.Any.fromFunction1(value))
    
    inline def setVideoConferenceLeft(value: VideoConferenceLeftEvent => Unit): Self = StObject.set(x, "videoConferenceLeft", js.Any.fromFunction1(value))
    
    inline def setVideoMuteStatusChanged(value: VideoMuteStatusChangedEvent => Unit): Self = StObject.set(x, "videoMuteStatusChanged", js.Any.fromFunction1(value))
    
    inline def setVideoQualityChanged(value: VideoQualityChangedEvent => Unit): Self = StObject.set(x, "videoQualityChanged", js.Any.fromFunction1(value))
  }
}
