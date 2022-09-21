package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInfo extends StObject {
  
  /** Abuse reporting configuration for the ongoing conference. */
  var abuseReportingConfig: js.UndefOr[AbuseReportingConfig] = js.undefined
  
  /**
    * Output only. Display name of the owner of artifacts generated in this conference. The expected use of this in clients is to present info like "This recording will be sent to John
    * Doe's Drive". This field can be empty if preferred display name determination fails for any reason.
    */
  var artifactOwner: js.UndefOr[UserDisplayInfo] = js.undefined
  
  /** Output only. Documents attached to an ongoing conference. */
  var attachedDocuments: js.UndefOr[js.Array[DocumentInfo]] = js.undefined
  
  /**
    * Output only. The set of reactions that clients are allowed to send and can expect to receive. Note that a device in the conference should have the MAY_SEND_REACTIONS privilege to be
    * able to send reactions.
    */
  var availableReactions: js.UndefOr[js.Array[ReactionInfo]] = js.undefined
  
  /** Information about active broadcast session in the ongoing conference. */
  var broadcastSessionInfo: js.UndefOr[BroadcastSessionInfo] = js.undefined
  
  /**
    * Output only. The calendar event ID of a Google Calendar event that the meeting space is associated with. If the meeting space is not associated with an event in Google Calendar,
    * this field is empty. For recurring events, it refers to the recurring instance associated with the current call, as determined by the server.
    */
  var calendarEventId: js.UndefOr[String] = js.undefined
  
  /**
    * The current co-activity session, or unset if there is none in progress. A co-activity session can be initiated by devices in JOINED state . Initiator of the co-activity is expected
    * to populate this field to start the session. Once clients detect that the co-activity has finished, any JOINED device can clear this field to end the co-activity session. In the
    * case of switching activities, the initiator of the new activity merely needs to override this with the new co-activity data, and all connected clients are expected to handle the
    * transition gracefully.
    */
  var coActivity: js.UndefOr[CoActivity] = js.undefined
  
  /** The current collaboration session, or unset if no collaboration is in progress. */
  var collaboration: js.UndefOr[Collaboration] = js.undefined
  
  /** CSE information for the ongoing conference. */
  var cseInfo: js.UndefOr[CseInfo] = js.undefined
  
  /**
    * Output only. The maximum number of devices that may be in the joined state simultaneously in this conference. This can be used by clients to guess whether it will be possible to
    * join, but the only way to know is to try to join. It can also be used to inform users about the limit that is in effect. This limit is normally set when the conference is created
    * and not changed during the lifetime of the conference. But there are some cases where it may change, so clients should be aware that the information may be stale.
    */
  var maxJoinedDevices: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Information about the media backend for the currently ongoing conference in the meeting space. The media backend information will only be filled in for clients that are
    * supposed to present the information. The information should be displayed in a debug panel and is only intended for internal debugging purposes. If the string is empty nothing should
    * be displayed about the media backend.
    */
  var mediaBackendInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name or description of the organization or domain that the organizer belongs to. The expected use of this in clients is to present messages like "John Doe (outside
    * of Google.com) is trying to join this call", where "Google.com" is the organization name. The field will be empty if the organization name could not be determined, possibly because
    * of a backend error.
    */
  var organizationName: js.UndefOr[String] = js.undefined
  
  /** Paygate information to clients. */
  var paygateInfo: js.UndefOr[PaygateInfo] = js.undefined
  
  /** The current presenter in the call, or unset if there is no current presenter. Clients can set this to change the presenter. */
  var presenter: js.UndefOr[Presenter] = js.undefined
  
  /**
    * Deprecated, use RecordingSessionInfo instead. Info about recording for this conference. This will always be set in server responses, with a valid recording status. This is
    * superseded by streaming_sessions field, which contains the same information about this recording as well as additional information about other application type at the same time.
    * This will be deprecated and removed at some point.
    */
  var recordingInfo: js.UndefOr[RecordingInfo] = js.undefined
  
  /** Information about active recording session in the ongoing conference. */
  var recordingSessionInfo: js.UndefOr[RecordingSessionInfo] = js.undefined
  
  /** Settings of the ongoing conference. */
  var settings: js.UndefOr[CallSettings] = js.undefined
  
  /**
    * Output only. Info about streaming sessions (recording or broadcast) for this conference. This should contain all active sessions. Currently, it's guaranteed to have at most one
    * recording and at most one broadcast (at most two sessions in total). For each application type (recording or broadcast), latest inactive session is included if there's no active
    * one.
    */
  var streamingSessions: js.UndefOr[js.Array[StreamingSessionInfo]] = js.undefined
  
  /** Supported caption languages in BCP 47 language code format, e.g.'en-US'. */
  var supportedCaptionLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Information about active transcription session in the ongoing conference. */
  var transcriptionSessionInfo: js.UndefOr[TranscriptionSessionInfo] = js.undefined
  
  /** The number of devices viewing the conference - MeetingDevices that are in VIEWER role and JOINED state in the conference. */
  var viewerCount: js.UndefOr[Double] = js.undefined
  
  /** Information about active YouTube broadcast sessions in the ongoing conference. */
  var youTubeBroadcastSessionInfos: js.UndefOr[js.Array[YouTubeBroadcastSessionInfo]] = js.undefined
}
object CallInfo {
  
  inline def apply(): CallInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallInfo]
  }
  
  extension [Self <: CallInfo](x: Self) {
    
    inline def setAbuseReportingConfig(value: AbuseReportingConfig): Self = StObject.set(x, "abuseReportingConfig", value.asInstanceOf[js.Any])
    
    inline def setAbuseReportingConfigUndefined: Self = StObject.set(x, "abuseReportingConfig", js.undefined)
    
    inline def setArtifactOwner(value: UserDisplayInfo): Self = StObject.set(x, "artifactOwner", value.asInstanceOf[js.Any])
    
    inline def setArtifactOwnerUndefined: Self = StObject.set(x, "artifactOwner", js.undefined)
    
    inline def setAttachedDocuments(value: js.Array[DocumentInfo]): Self = StObject.set(x, "attachedDocuments", value.asInstanceOf[js.Any])
    
    inline def setAttachedDocumentsUndefined: Self = StObject.set(x, "attachedDocuments", js.undefined)
    
    inline def setAttachedDocumentsVarargs(value: DocumentInfo*): Self = StObject.set(x, "attachedDocuments", js.Array(value*))
    
    inline def setAvailableReactions(value: js.Array[ReactionInfo]): Self = StObject.set(x, "availableReactions", value.asInstanceOf[js.Any])
    
    inline def setAvailableReactionsUndefined: Self = StObject.set(x, "availableReactions", js.undefined)
    
    inline def setAvailableReactionsVarargs(value: ReactionInfo*): Self = StObject.set(x, "availableReactions", js.Array(value*))
    
    inline def setBroadcastSessionInfo(value: BroadcastSessionInfo): Self = StObject.set(x, "broadcastSessionInfo", value.asInstanceOf[js.Any])
    
    inline def setBroadcastSessionInfoUndefined: Self = StObject.set(x, "broadcastSessionInfo", js.undefined)
    
    inline def setCalendarEventId(value: String): Self = StObject.set(x, "calendarEventId", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventIdUndefined: Self = StObject.set(x, "calendarEventId", js.undefined)
    
    inline def setCoActivity(value: CoActivity): Self = StObject.set(x, "coActivity", value.asInstanceOf[js.Any])
    
    inline def setCoActivityUndefined: Self = StObject.set(x, "coActivity", js.undefined)
    
    inline def setCollaboration(value: Collaboration): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
    
    inline def setCollaborationUndefined: Self = StObject.set(x, "collaboration", js.undefined)
    
    inline def setCseInfo(value: CseInfo): Self = StObject.set(x, "cseInfo", value.asInstanceOf[js.Any])
    
    inline def setCseInfoUndefined: Self = StObject.set(x, "cseInfo", js.undefined)
    
    inline def setMaxJoinedDevices(value: Double): Self = StObject.set(x, "maxJoinedDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxJoinedDevicesUndefined: Self = StObject.set(x, "maxJoinedDevices", js.undefined)
    
    inline def setMediaBackendInfo(value: String): Self = StObject.set(x, "mediaBackendInfo", value.asInstanceOf[js.Any])
    
    inline def setMediaBackendInfoUndefined: Self = StObject.set(x, "mediaBackendInfo", js.undefined)
    
    inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
    
    inline def setPaygateInfo(value: PaygateInfo): Self = StObject.set(x, "paygateInfo", value.asInstanceOf[js.Any])
    
    inline def setPaygateInfoUndefined: Self = StObject.set(x, "paygateInfo", js.undefined)
    
    inline def setPresenter(value: Presenter): Self = StObject.set(x, "presenter", value.asInstanceOf[js.Any])
    
    inline def setPresenterUndefined: Self = StObject.set(x, "presenter", js.undefined)
    
    inline def setRecordingInfo(value: RecordingInfo): Self = StObject.set(x, "recordingInfo", value.asInstanceOf[js.Any])
    
    inline def setRecordingInfoUndefined: Self = StObject.set(x, "recordingInfo", js.undefined)
    
    inline def setRecordingSessionInfo(value: RecordingSessionInfo): Self = StObject.set(x, "recordingSessionInfo", value.asInstanceOf[js.Any])
    
    inline def setRecordingSessionInfoUndefined: Self = StObject.set(x, "recordingSessionInfo", js.undefined)
    
    inline def setSettings(value: CallSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setStreamingSessions(value: js.Array[StreamingSessionInfo]): Self = StObject.set(x, "streamingSessions", value.asInstanceOf[js.Any])
    
    inline def setStreamingSessionsUndefined: Self = StObject.set(x, "streamingSessions", js.undefined)
    
    inline def setStreamingSessionsVarargs(value: StreamingSessionInfo*): Self = StObject.set(x, "streamingSessions", js.Array(value*))
    
    inline def setSupportedCaptionLanguages(value: js.Array[String]): Self = StObject.set(x, "supportedCaptionLanguages", value.asInstanceOf[js.Any])
    
    inline def setSupportedCaptionLanguagesUndefined: Self = StObject.set(x, "supportedCaptionLanguages", js.undefined)
    
    inline def setSupportedCaptionLanguagesVarargs(value: String*): Self = StObject.set(x, "supportedCaptionLanguages", js.Array(value*))
    
    inline def setTranscriptionSessionInfo(value: TranscriptionSessionInfo): Self = StObject.set(x, "transcriptionSessionInfo", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionSessionInfoUndefined: Self = StObject.set(x, "transcriptionSessionInfo", js.undefined)
    
    inline def setViewerCount(value: Double): Self = StObject.set(x, "viewerCount", value.asInstanceOf[js.Any])
    
    inline def setViewerCountUndefined: Self = StObject.set(x, "viewerCount", js.undefined)
    
    inline def setYouTubeBroadcastSessionInfos(value: js.Array[YouTubeBroadcastSessionInfo]): Self = StObject.set(x, "youTubeBroadcastSessionInfos", value.asInstanceOf[js.Any])
    
    inline def setYouTubeBroadcastSessionInfosUndefined: Self = StObject.set(x, "youTubeBroadcastSessionInfos", js.undefined)
    
    inline def setYouTubeBroadcastSessionInfosVarargs(value: YouTubeBroadcastSessionInfo*): Self = StObject.set(x, "youTubeBroadcastSessionInfos", js.Array(value*))
  }
}
