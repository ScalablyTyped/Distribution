package typings.jitsiMeet.mod

import typings.jitsiMeet.anon.RecordExternalAPICommands
import typings.jitsiMeet.jitsiMeetStrings.audioAvailabilityChanged
import typings.jitsiMeet.jitsiMeetStrings.audioMuteStatusChanged
import typings.jitsiMeet.jitsiMeetStrings.avatarChanged
import typings.jitsiMeet.jitsiMeetStrings.cameraError
import typings.jitsiMeet.jitsiMeetStrings.deviceListChanged
import typings.jitsiMeet.jitsiMeetStrings.displayNameChange
import typings.jitsiMeet.jitsiMeetStrings.dominantSpeakerChanged
import typings.jitsiMeet.jitsiMeetStrings.emailChange
import typings.jitsiMeet.jitsiMeetStrings.endpointTextMessageReceived
import typings.jitsiMeet.jitsiMeetStrings.feedbackSubmitted
import typings.jitsiMeet.jitsiMeetStrings.filmstripDisplayChanged
import typings.jitsiMeet.jitsiMeetStrings.incomingMessage
import typings.jitsiMeet.jitsiMeetStrings.largeVideoChanged
import typings.jitsiMeet.jitsiMeetStrings.log
import typings.jitsiMeet.jitsiMeetStrings.micError
import typings.jitsiMeet.jitsiMeetStrings.outgoingMessage
import typings.jitsiMeet.jitsiMeetStrings.participantJoined
import typings.jitsiMeet.jitsiMeetStrings.participantKickedOut
import typings.jitsiMeet.jitsiMeetStrings.participantLeft
import typings.jitsiMeet.jitsiMeetStrings.participantRoleChanged
import typings.jitsiMeet.jitsiMeetStrings.passwordRequired
import typings.jitsiMeet.jitsiMeetStrings.readyToClose
import typings.jitsiMeet.jitsiMeetStrings.screenSharingStatusChanged
import typings.jitsiMeet.jitsiMeetStrings.subjectChange
import typings.jitsiMeet.jitsiMeetStrings.suspendDetected
import typings.jitsiMeet.jitsiMeetStrings.tileViewChanged
import typings.jitsiMeet.jitsiMeetStrings.videoAvailabilityChanged
import typings.jitsiMeet.jitsiMeetStrings.videoConferenceJoined
import typings.jitsiMeet.jitsiMeetStrings.videoConferenceLeft
import typings.jitsiMeet.jitsiMeetStrings.videoMuteStatusChanged
import typings.jitsiMeet.jitsiMeetStrings.videoQualityChanged
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JitsiMeetExternalAPI
  extends StObject
     with TypedEventEmitter[
      ExternalAPIEventCallbacks, 
      /* keyof jitsi-meet.jitsi-meet.ExternalAPIEventCallbacks */ cameraError | avatarChanged | audioAvailabilityChanged | audioMuteStatusChanged | endpointTextMessageReceived | largeVideoChanged | log | micError | screenSharingStatusChanged | dominantSpeakerChanged | tileViewChanged | incomingMessage | outgoingMessage | displayNameChange | deviceListChanged | emailChange | feedbackSubmitted | filmstripDisplayChanged | participantJoined | participantKickedOut | participantLeft | participantRoleChanged | passwordRequired | videoConferenceJoined | videoConferenceLeft | videoAvailabilityChanged | videoMuteStatusChanged | videoQualityChanged | readyToClose | subjectChange | suspendDetected
    ] {
  
  // tslint gets unhappy about a constructor on an interface, but this is what is passed to it
  // constructor(domain: string, options?: ExternalAPIOptions): this;
  def captureLargeVideoScreenshot(): js.Promise[String] = js.native
  
  def dispose(): Unit = js.native
  
  def executeCommand(
    command: ExternalAPICommands,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type any is not an array type */ arguments: Any
  ): Unit = js.native
  
  def executeCommands(commands: js.Array[RecordExternalAPICommands]): Unit = js.native
  
  def getAvailableDevices(): js.Promise[DeviceMap] = js.native
  
  def getAvatarURL(participantId: String): String = js.native
  
  def getCurrentDevices(): js.Promise[DeviceMap] = js.native
  
  def getDisplayName(participantId: String): String = js.native
  
  def getEmail(participantId: String): String = js.native
  
  def getIFrame(): HTMLIFrameElement = js.native
  
  def getNumberOfParticipants(): Double = js.native
  
  def getParticipantsInfo(): Any = js.native
  
  def getVideoQuality(): Any = js.native
  
  def invite(invitees: js.Array[Any]): js.Promise[Null] = js.native
  
  def isAudioAvailable(): js.Promise[Boolean] = js.native
  
  def isAudioMuted(): js.Promise[Boolean] = js.native
  
  def isDeviceListAvailable(): js.Promise[Boolean] = js.native
  
  def isMultipleAudioInputSupported(): js.Promise[Boolean] = js.native
  
  def isVideoAvailable(): js.Promise[Boolean] = js.native
  
  def isVideoMuted(): js.Promise[Boolean] = js.native
  
  def pinParticipant(participantId: String): Unit = js.native
  
  def resizeLargeVideo(width: Double, height: Double): Unit = js.native
  
  def setAudioInputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def setAudioOutputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def setLargeVideoParticipant(participantId: String): Unit = js.native
  
  def setVideoInputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def startRecording(options: RecordingOptions): Unit = js.native
  
  def stopRecording(mode: RecordingMode): Unit = js.native
}
