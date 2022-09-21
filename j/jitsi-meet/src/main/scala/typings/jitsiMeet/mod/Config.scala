package typings.jitsiMeet.mod

import typings.jitsiMeet.jitsiMeetBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var _desktopSharingSourceDevice: js.UndefOr[String] = js.undefined
  
  // undocumented from jitsi-meet, type assumed from name;
  var _immediateReloadThreshold: js.UndefOr[Any] = js.undefined
  
  // undocumented from lib-jitsi-meet, type assumed from name;
  var _peerConnStatusOutOfLastNTimeout: js.UndefOr[Any] = js.undefined
  
  var _peerConnStatusRtcMuteTimeout: js.UndefOr[Any] = js.undefined
  
  var abTesting: js.UndefOr[Any] = js.undefined
  
  var analytics: js.UndefOr[ConfigAnalytics] = js.undefined
  
  var apiLogLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  var audioLevelsInterval: js.UndefOr[Double] = js.undefined
  
  var autoCaptionOnRecord: js.UndefOr[Boolean] = js.undefined
  
  var avgRtpStatsN: js.UndefOr[Any] = js.undefined
  
  var bosh: js.UndefOr[String] = js.undefined
  
  var brandingDataUrl: js.UndefOr[String] = js.undefined
  
  var brandingRoomAlias: js.UndefOr[Any] = js.undefined
  
  var callStatsConfIDNamespace: js.UndefOr[Any] = js.undefined
  
  var callStatsCustomScriptUrl: js.UndefOr[Any] = js.undefined
  
  var callStatsID: js.UndefOr[String] = js.undefined
  
  var callStatsSecret: js.UndefOr[String] = js.undefined
  
  var channelLastN: js.UndefOr[Double] = js.undefined
  
  var chromeExtensionBanner: js.UndefOr[ChromeExtensionBanner] = js.undefined
  
  var clientNode: js.UndefOr[String] = js.undefined
  
  var constraints: js.UndefOr[Constraints] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var debugAudioLevels: js.UndefOr[Any] = js.undefined
  
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  var deploymentInfo: js.UndefOr[ConfigDeploymentInfo] = js.undefined
  
  var deploymentUrls: js.UndefOr[ConfigDeploymentURLs] = js.undefined
  
  var desktopSharingFrameRate: js.UndefOr[QualityConstraints] = js.undefined
  
  var desktopSharingSources: js.UndefOr[Any] = js.undefined
  
  var dialInConfCodeUrl: js.UndefOr[String] = js.undefined
  
  var dialInNumbersUrl: js.UndefOr[String] = js.undefined
  
  var dialOutAuthUrl: js.UndefOr[String] = js.undefined
  
  var dialOutCodesUrl: js.UndefOr[String] = js.undefined
  
  var disable1On1Mode: js.UndefOr[Boolean] = js.undefined
  
  var disableAEC: js.UndefOr[Boolean] = js.undefined
  
  var disableAGC: js.UndefOr[Boolean] = js.undefined
  
  var disableAP: js.UndefOr[Boolean] = js.undefined
  
  var disableAudioLevels: js.UndefOr[Boolean] = js.undefined
  
  var disableDeepLinking: js.UndefOr[Boolean] = js.undefined
  
  var disableH264: js.UndefOr[Boolean] = js.undefined
  
  var disableHPF: js.UndefOr[Boolean] = js.undefined
  
  var disableInviteFunctions: js.UndefOr[Boolean] = js.undefined
  
  var disableLocalVideoFlip: js.UndefOr[Boolean] = js.undefined
  
  var disableNS: js.UndefOr[Boolean] = js.undefined
  
  var disableProfile: js.UndefOr[Boolean] = js.undefined
  
  var disableRecordAudioNotification: js.UndefOr[Boolean] = js.undefined
  
  var disableRemoteControl: js.UndefOr[Boolean] = js.undefined
  
  var disableRemoteMute: js.UndefOr[Boolean] = js.undefined
  
  var disableRtx: js.UndefOr[Boolean] = js.undefined
  
  var disableSimulcast: js.UndefOr[Boolean] = js.undefined
  
  var disableThirdPartyRequests: js.UndefOr[Boolean] = js.undefined
  
  var displayJids: js.UndefOr[Boolean] = js.undefined
  
  var doNotStoreRoom: js.UndefOr[Boolean] = js.undefined
  
  var dropbox: js.UndefOr[ConfigDropbox] = js.undefined
  
  var e2eping: js.UndefOr[ConfigE2EPing] = js.undefined
  
  var enableAutomaticUrlCopy: js.UndefOr[Boolean] = js.undefined
  
  var enableCalendarIntegration: js.UndefOr[Boolean] = js.undefined
  
  var enableClosePage: js.UndefOr[Boolean] = js.undefined
  
  var enableDisplayNameInStats: js.UndefOr[Boolean] = js.undefined
  
  var enableEmailInStats: js.UndefOr[Boolean] = js.undefined
  
  var enableFeaturesBasedOnToken: js.UndefOr[Boolean] = js.undefined
  
  var enableIceRestart: js.UndefOr[Boolean] = js.undefined
  
  var enableInsecureRoomNameWarning: js.UndefOr[Boolean] = js.undefined
  
  var enableLayerSuspension: js.UndefOr[Boolean] = js.undefined
  
  var enableLipSync: js.UndefOr[Boolean] = js.undefined
  
  var enableNoAudioDetection: js.UndefOr[Boolean] = js.undefined
  
  var enableNoisyMicDetection: js.UndefOr[Boolean] = js.undefined
  
  var enableOpusRed: js.UndefOr[Boolean] = js.undefined
  
  var enableRemb: js.UndefOr[Boolean] = js.undefined
  
  var enableSaveLogs: js.UndefOr[Boolean] = js.undefined
  
  var enableTalkWhileMuted: js.UndefOr[Boolean] = js.undefined
  
  var enableTcc: js.UndefOr[Boolean] = js.undefined
  
  var enableUserRolesBasedOnToken: js.UndefOr[Boolean] = js.undefined
  
  var enableWelcomePage: js.UndefOr[Boolean] = js.undefined
  
  var etherpad_base: js.UndefOr[String] = js.undefined
  
  var externalConnectUrl: js.UndefOr[String | Null] = js.undefined
  
  var fileRecordingsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var fileRecordingsServiceEnabled: js.UndefOr[Boolean] = js.undefined
  
  var fileRecordingsServiceSharingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var firefox_fake_device: js.UndefOr[Any] = js.undefined
  
  var focusUserJid: js.UndefOr[String] = js.undefined
  
  var forceJVB121Ratio: js.UndefOr[Boolean] = js.undefined
  
  var gatherStats: js.UndefOr[Boolean] = js.undefined
  
  var googleApiApplicationClientID: js.UndefOr[Any] = js.undefined
  
  var gravatarBaseURL: js.UndefOr[String] = js.undefined
  
  var hiddenDomain: js.UndefOr[Any] = js.undefined
  
  var hideConferenceTimer: js.UndefOr[Boolean] = js.undefined
  
  var hideLobbyButton: js.UndefOr[Boolean] = js.undefined
  
  var hosts: js.UndefOr[ConfigHosts] = js.undefined
  
  var iAmRecorder: js.UndefOr[Boolean] = js.undefined
  
  var iAmSipGateway: js.UndefOr[Boolean] = js.undefined
  
  var ignoreStartMuted: js.UndefOr[Boolean] = js.undefined
  
  var lastNLimits: js.UndefOr[Record[Double, Double]] = js.undefined
  
  var liveStreamingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var localRecording: js.UndefOr[ConfigLocalRecording] = js.undefined
  
  var lockRoomGuestEnabled: js.UndefOr[Boolean] = js.undefined
  
  var maxFullResolutionParticipants: js.UndefOr[Double] = js.undefined
  
  var microsoftApiApplicationClientID: js.UndefOr[Boolean] = js.undefined
  
  var minParticipants: js.UndefOr[Double] = js.undefined
  
  var moderatedRoomServiceUrl: js.UndefOr[String] = js.undefined
  
  var nick: js.UndefOr[Any] = js.undefined
  
  var noticeMessage: js.UndefOr[String] = js.undefined
  
  var openBridgeChannel: js.UndefOr[Boolean | String] = js.undefined
  
  var opusMaxAverageBitrate: js.UndefOr[Double] = js.undefined
  
  var p2p: js.UndefOr[ConfigP2P] = js.undefined
  
  var pcStatsInterval: js.UndefOr[Double] = js.undefined
  
  var peopleSearchQueryTypes: js.UndefOr[Any] = js.undefined
  
  var peopleSearchUrl: js.UndefOr[String] = js.undefined
  
  var preferH264: js.UndefOr[Boolean] = js.undefined
  
  var prejoinPageEnabled: js.UndefOr[Boolean] = js.undefined
  
  var recordingLimit: js.UndefOr[ConfigRecordingLimit] = js.undefined
  
  var remoteVideoMenu: js.UndefOr[ConfigRemoteVideoMenu] = js.undefined
  
  var requireDisplayName: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var roomPasswordNumberOfDigits: js.UndefOr[`false` | Double] = js.undefined
  
  var startAudioMuted: js.UndefOr[Double] = js.undefined
  
  var startAudioOnly: js.UndefOr[Boolean] = js.undefined
  
  var startBitrate: js.UndefOr[Any] = js.undefined
  
  var startScreenSharing: js.UndefOr[Boolean] = js.undefined
  
  var startSilent: js.UndefOr[Boolean] = js.undefined
  
  var startVideoMuted: js.UndefOr[Double] = js.undefined
  
  var startWithAudioMuted: js.UndefOr[Boolean] = js.undefined
  
  var startWithVideoMuted: js.UndefOr[Boolean] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var testing: js.UndefOr[ConfigTesting] = js.undefined
  
  var tokenAuthUrl: js.UndefOr[String] = js.undefined
  
  var transcribingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var useTurnUdp: js.UndefOr[`false`] = js.undefined
  
  var videoQuality: js.UndefOr[ConfigVideoQuality] = js.undefined
  
  var webrtcIceTcpDisable: js.UndefOr[Boolean] = js.undefined
  
  var webrtcIceUdpDisable: js.UndefOr[Boolean] = js.undefined
  
  var websocket: js.UndefOr[String] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAbTesting(value: Any): Self = StObject.set(x, "abTesting", value.asInstanceOf[js.Any])
    
    inline def setAbTestingUndefined: Self = StObject.set(x, "abTesting", js.undefined)
    
    inline def setAnalytics(value: ConfigAnalytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setApiLogLevels(value: js.Array[String]): Self = StObject.set(x, "apiLogLevels", value.asInstanceOf[js.Any])
    
    inline def setApiLogLevelsUndefined: Self = StObject.set(x, "apiLogLevels", js.undefined)
    
    inline def setApiLogLevelsVarargs(value: String*): Self = StObject.set(x, "apiLogLevels", js.Array(value*))
    
    inline def setAudioLevelsInterval(value: Double): Self = StObject.set(x, "audioLevelsInterval", value.asInstanceOf[js.Any])
    
    inline def setAudioLevelsIntervalUndefined: Self = StObject.set(x, "audioLevelsInterval", js.undefined)
    
    inline def setAutoCaptionOnRecord(value: Boolean): Self = StObject.set(x, "autoCaptionOnRecord", value.asInstanceOf[js.Any])
    
    inline def setAutoCaptionOnRecordUndefined: Self = StObject.set(x, "autoCaptionOnRecord", js.undefined)
    
    inline def setAvgRtpStatsN(value: Any): Self = StObject.set(x, "avgRtpStatsN", value.asInstanceOf[js.Any])
    
    inline def setAvgRtpStatsNUndefined: Self = StObject.set(x, "avgRtpStatsN", js.undefined)
    
    inline def setBosh(value: String): Self = StObject.set(x, "bosh", value.asInstanceOf[js.Any])
    
    inline def setBoshUndefined: Self = StObject.set(x, "bosh", js.undefined)
    
    inline def setBrandingDataUrl(value: String): Self = StObject.set(x, "brandingDataUrl", value.asInstanceOf[js.Any])
    
    inline def setBrandingDataUrlUndefined: Self = StObject.set(x, "brandingDataUrl", js.undefined)
    
    inline def setBrandingRoomAlias(value: Any): Self = StObject.set(x, "brandingRoomAlias", value.asInstanceOf[js.Any])
    
    inline def setBrandingRoomAliasUndefined: Self = StObject.set(x, "brandingRoomAlias", js.undefined)
    
    inline def setCallStatsConfIDNamespace(value: Any): Self = StObject.set(x, "callStatsConfIDNamespace", value.asInstanceOf[js.Any])
    
    inline def setCallStatsConfIDNamespaceUndefined: Self = StObject.set(x, "callStatsConfIDNamespace", js.undefined)
    
    inline def setCallStatsCustomScriptUrl(value: Any): Self = StObject.set(x, "callStatsCustomScriptUrl", value.asInstanceOf[js.Any])
    
    inline def setCallStatsCustomScriptUrlUndefined: Self = StObject.set(x, "callStatsCustomScriptUrl", js.undefined)
    
    inline def setCallStatsID(value: String): Self = StObject.set(x, "callStatsID", value.asInstanceOf[js.Any])
    
    inline def setCallStatsIDUndefined: Self = StObject.set(x, "callStatsID", js.undefined)
    
    inline def setCallStatsSecret(value: String): Self = StObject.set(x, "callStatsSecret", value.asInstanceOf[js.Any])
    
    inline def setCallStatsSecretUndefined: Self = StObject.set(x, "callStatsSecret", js.undefined)
    
    inline def setChannelLastN(value: Double): Self = StObject.set(x, "channelLastN", value.asInstanceOf[js.Any])
    
    inline def setChannelLastNUndefined: Self = StObject.set(x, "channelLastN", js.undefined)
    
    inline def setChromeExtensionBanner(value: ChromeExtensionBanner): Self = StObject.set(x, "chromeExtensionBanner", value.asInstanceOf[js.Any])
    
    inline def setChromeExtensionBannerUndefined: Self = StObject.set(x, "chromeExtensionBanner", js.undefined)
    
    inline def setClientNode(value: String): Self = StObject.set(x, "clientNode", value.asInstanceOf[js.Any])
    
    inline def setClientNodeUndefined: Self = StObject.set(x, "clientNode", js.undefined)
    
    inline def setConstraints(value: Constraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugAudioLevels(value: Any): Self = StObject.set(x, "debugAudioLevels", value.asInstanceOf[js.Any])
    
    inline def setDebugAudioLevelsUndefined: Self = StObject.set(x, "debugAudioLevels", js.undefined)
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDeploymentInfo(value: ConfigDeploymentInfo): Self = StObject.set(x, "deploymentInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentInfoUndefined: Self = StObject.set(x, "deploymentInfo", js.undefined)
    
    inline def setDeploymentUrls(value: ConfigDeploymentURLs): Self = StObject.set(x, "deploymentUrls", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUrlsUndefined: Self = StObject.set(x, "deploymentUrls", js.undefined)
    
    inline def setDesktopSharingFrameRate(value: QualityConstraints): Self = StObject.set(x, "desktopSharingFrameRate", value.asInstanceOf[js.Any])
    
    inline def setDesktopSharingFrameRateUndefined: Self = StObject.set(x, "desktopSharingFrameRate", js.undefined)
    
    inline def setDesktopSharingSources(value: Any): Self = StObject.set(x, "desktopSharingSources", value.asInstanceOf[js.Any])
    
    inline def setDesktopSharingSourcesUndefined: Self = StObject.set(x, "desktopSharingSources", js.undefined)
    
    inline def setDialInConfCodeUrl(value: String): Self = StObject.set(x, "dialInConfCodeUrl", value.asInstanceOf[js.Any])
    
    inline def setDialInConfCodeUrlUndefined: Self = StObject.set(x, "dialInConfCodeUrl", js.undefined)
    
    inline def setDialInNumbersUrl(value: String): Self = StObject.set(x, "dialInNumbersUrl", value.asInstanceOf[js.Any])
    
    inline def setDialInNumbersUrlUndefined: Self = StObject.set(x, "dialInNumbersUrl", js.undefined)
    
    inline def setDialOutAuthUrl(value: String): Self = StObject.set(x, "dialOutAuthUrl", value.asInstanceOf[js.Any])
    
    inline def setDialOutAuthUrlUndefined: Self = StObject.set(x, "dialOutAuthUrl", js.undefined)
    
    inline def setDialOutCodesUrl(value: String): Self = StObject.set(x, "dialOutCodesUrl", value.asInstanceOf[js.Any])
    
    inline def setDialOutCodesUrlUndefined: Self = StObject.set(x, "dialOutCodesUrl", js.undefined)
    
    inline def setDisable1On1Mode(value: Boolean): Self = StObject.set(x, "disable1On1Mode", value.asInstanceOf[js.Any])
    
    inline def setDisable1On1ModeUndefined: Self = StObject.set(x, "disable1On1Mode", js.undefined)
    
    inline def setDisableAEC(value: Boolean): Self = StObject.set(x, "disableAEC", value.asInstanceOf[js.Any])
    
    inline def setDisableAECUndefined: Self = StObject.set(x, "disableAEC", js.undefined)
    
    inline def setDisableAGC(value: Boolean): Self = StObject.set(x, "disableAGC", value.asInstanceOf[js.Any])
    
    inline def setDisableAGCUndefined: Self = StObject.set(x, "disableAGC", js.undefined)
    
    inline def setDisableAP(value: Boolean): Self = StObject.set(x, "disableAP", value.asInstanceOf[js.Any])
    
    inline def setDisableAPUndefined: Self = StObject.set(x, "disableAP", js.undefined)
    
    inline def setDisableAudioLevels(value: Boolean): Self = StObject.set(x, "disableAudioLevels", value.asInstanceOf[js.Any])
    
    inline def setDisableAudioLevelsUndefined: Self = StObject.set(x, "disableAudioLevels", js.undefined)
    
    inline def setDisableDeepLinking(value: Boolean): Self = StObject.set(x, "disableDeepLinking", value.asInstanceOf[js.Any])
    
    inline def setDisableDeepLinkingUndefined: Self = StObject.set(x, "disableDeepLinking", js.undefined)
    
    inline def setDisableH264(value: Boolean): Self = StObject.set(x, "disableH264", value.asInstanceOf[js.Any])
    
    inline def setDisableH264Undefined: Self = StObject.set(x, "disableH264", js.undefined)
    
    inline def setDisableHPF(value: Boolean): Self = StObject.set(x, "disableHPF", value.asInstanceOf[js.Any])
    
    inline def setDisableHPFUndefined: Self = StObject.set(x, "disableHPF", js.undefined)
    
    inline def setDisableInviteFunctions(value: Boolean): Self = StObject.set(x, "disableInviteFunctions", value.asInstanceOf[js.Any])
    
    inline def setDisableInviteFunctionsUndefined: Self = StObject.set(x, "disableInviteFunctions", js.undefined)
    
    inline def setDisableLocalVideoFlip(value: Boolean): Self = StObject.set(x, "disableLocalVideoFlip", value.asInstanceOf[js.Any])
    
    inline def setDisableLocalVideoFlipUndefined: Self = StObject.set(x, "disableLocalVideoFlip", js.undefined)
    
    inline def setDisableNS(value: Boolean): Self = StObject.set(x, "disableNS", value.asInstanceOf[js.Any])
    
    inline def setDisableNSUndefined: Self = StObject.set(x, "disableNS", js.undefined)
    
    inline def setDisableProfile(value: Boolean): Self = StObject.set(x, "disableProfile", value.asInstanceOf[js.Any])
    
    inline def setDisableProfileUndefined: Self = StObject.set(x, "disableProfile", js.undefined)
    
    inline def setDisableRecordAudioNotification(value: Boolean): Self = StObject.set(x, "disableRecordAudioNotification", value.asInstanceOf[js.Any])
    
    inline def setDisableRecordAudioNotificationUndefined: Self = StObject.set(x, "disableRecordAudioNotification", js.undefined)
    
    inline def setDisableRemoteControl(value: Boolean): Self = StObject.set(x, "disableRemoteControl", value.asInstanceOf[js.Any])
    
    inline def setDisableRemoteControlUndefined: Self = StObject.set(x, "disableRemoteControl", js.undefined)
    
    inline def setDisableRemoteMute(value: Boolean): Self = StObject.set(x, "disableRemoteMute", value.asInstanceOf[js.Any])
    
    inline def setDisableRemoteMuteUndefined: Self = StObject.set(x, "disableRemoteMute", js.undefined)
    
    inline def setDisableRtx(value: Boolean): Self = StObject.set(x, "disableRtx", value.asInstanceOf[js.Any])
    
    inline def setDisableRtxUndefined: Self = StObject.set(x, "disableRtx", js.undefined)
    
    inline def setDisableSimulcast(value: Boolean): Self = StObject.set(x, "disableSimulcast", value.asInstanceOf[js.Any])
    
    inline def setDisableSimulcastUndefined: Self = StObject.set(x, "disableSimulcast", js.undefined)
    
    inline def setDisableThirdPartyRequests(value: Boolean): Self = StObject.set(x, "disableThirdPartyRequests", value.asInstanceOf[js.Any])
    
    inline def setDisableThirdPartyRequestsUndefined: Self = StObject.set(x, "disableThirdPartyRequests", js.undefined)
    
    inline def setDisplayJids(value: Boolean): Self = StObject.set(x, "displayJids", value.asInstanceOf[js.Any])
    
    inline def setDisplayJidsUndefined: Self = StObject.set(x, "displayJids", js.undefined)
    
    inline def setDoNotStoreRoom(value: Boolean): Self = StObject.set(x, "doNotStoreRoom", value.asInstanceOf[js.Any])
    
    inline def setDoNotStoreRoomUndefined: Self = StObject.set(x, "doNotStoreRoom", js.undefined)
    
    inline def setDropbox(value: ConfigDropbox): Self = StObject.set(x, "dropbox", value.asInstanceOf[js.Any])
    
    inline def setDropboxUndefined: Self = StObject.set(x, "dropbox", js.undefined)
    
    inline def setE2eping(value: ConfigE2EPing): Self = StObject.set(x, "e2eping", value.asInstanceOf[js.Any])
    
    inline def setE2epingUndefined: Self = StObject.set(x, "e2eping", js.undefined)
    
    inline def setEnableAutomaticUrlCopy(value: Boolean): Self = StObject.set(x, "enableAutomaticUrlCopy", value.asInstanceOf[js.Any])
    
    inline def setEnableAutomaticUrlCopyUndefined: Self = StObject.set(x, "enableAutomaticUrlCopy", js.undefined)
    
    inline def setEnableCalendarIntegration(value: Boolean): Self = StObject.set(x, "enableCalendarIntegration", value.asInstanceOf[js.Any])
    
    inline def setEnableCalendarIntegrationUndefined: Self = StObject.set(x, "enableCalendarIntegration", js.undefined)
    
    inline def setEnableClosePage(value: Boolean): Self = StObject.set(x, "enableClosePage", value.asInstanceOf[js.Any])
    
    inline def setEnableClosePageUndefined: Self = StObject.set(x, "enableClosePage", js.undefined)
    
    inline def setEnableDisplayNameInStats(value: Boolean): Self = StObject.set(x, "enableDisplayNameInStats", value.asInstanceOf[js.Any])
    
    inline def setEnableDisplayNameInStatsUndefined: Self = StObject.set(x, "enableDisplayNameInStats", js.undefined)
    
    inline def setEnableEmailInStats(value: Boolean): Self = StObject.set(x, "enableEmailInStats", value.asInstanceOf[js.Any])
    
    inline def setEnableEmailInStatsUndefined: Self = StObject.set(x, "enableEmailInStats", js.undefined)
    
    inline def setEnableFeaturesBasedOnToken(value: Boolean): Self = StObject.set(x, "enableFeaturesBasedOnToken", value.asInstanceOf[js.Any])
    
    inline def setEnableFeaturesBasedOnTokenUndefined: Self = StObject.set(x, "enableFeaturesBasedOnToken", js.undefined)
    
    inline def setEnableIceRestart(value: Boolean): Self = StObject.set(x, "enableIceRestart", value.asInstanceOf[js.Any])
    
    inline def setEnableIceRestartUndefined: Self = StObject.set(x, "enableIceRestart", js.undefined)
    
    inline def setEnableInsecureRoomNameWarning(value: Boolean): Self = StObject.set(x, "enableInsecureRoomNameWarning", value.asInstanceOf[js.Any])
    
    inline def setEnableInsecureRoomNameWarningUndefined: Self = StObject.set(x, "enableInsecureRoomNameWarning", js.undefined)
    
    inline def setEnableLayerSuspension(value: Boolean): Self = StObject.set(x, "enableLayerSuspension", value.asInstanceOf[js.Any])
    
    inline def setEnableLayerSuspensionUndefined: Self = StObject.set(x, "enableLayerSuspension", js.undefined)
    
    inline def setEnableLipSync(value: Boolean): Self = StObject.set(x, "enableLipSync", value.asInstanceOf[js.Any])
    
    inline def setEnableLipSyncUndefined: Self = StObject.set(x, "enableLipSync", js.undefined)
    
    inline def setEnableNoAudioDetection(value: Boolean): Self = StObject.set(x, "enableNoAudioDetection", value.asInstanceOf[js.Any])
    
    inline def setEnableNoAudioDetectionUndefined: Self = StObject.set(x, "enableNoAudioDetection", js.undefined)
    
    inline def setEnableNoisyMicDetection(value: Boolean): Self = StObject.set(x, "enableNoisyMicDetection", value.asInstanceOf[js.Any])
    
    inline def setEnableNoisyMicDetectionUndefined: Self = StObject.set(x, "enableNoisyMicDetection", js.undefined)
    
    inline def setEnableOpusRed(value: Boolean): Self = StObject.set(x, "enableOpusRed", value.asInstanceOf[js.Any])
    
    inline def setEnableOpusRedUndefined: Self = StObject.set(x, "enableOpusRed", js.undefined)
    
    inline def setEnableRemb(value: Boolean): Self = StObject.set(x, "enableRemb", value.asInstanceOf[js.Any])
    
    inline def setEnableRembUndefined: Self = StObject.set(x, "enableRemb", js.undefined)
    
    inline def setEnableSaveLogs(value: Boolean): Self = StObject.set(x, "enableSaveLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSaveLogsUndefined: Self = StObject.set(x, "enableSaveLogs", js.undefined)
    
    inline def setEnableTalkWhileMuted(value: Boolean): Self = StObject.set(x, "enableTalkWhileMuted", value.asInstanceOf[js.Any])
    
    inline def setEnableTalkWhileMutedUndefined: Self = StObject.set(x, "enableTalkWhileMuted", js.undefined)
    
    inline def setEnableTcc(value: Boolean): Self = StObject.set(x, "enableTcc", value.asInstanceOf[js.Any])
    
    inline def setEnableTccUndefined: Self = StObject.set(x, "enableTcc", js.undefined)
    
    inline def setEnableUserRolesBasedOnToken(value: Boolean): Self = StObject.set(x, "enableUserRolesBasedOnToken", value.asInstanceOf[js.Any])
    
    inline def setEnableUserRolesBasedOnTokenUndefined: Self = StObject.set(x, "enableUserRolesBasedOnToken", js.undefined)
    
    inline def setEnableWelcomePage(value: Boolean): Self = StObject.set(x, "enableWelcomePage", value.asInstanceOf[js.Any])
    
    inline def setEnableWelcomePageUndefined: Self = StObject.set(x, "enableWelcomePage", js.undefined)
    
    inline def setEtherpad_base(value: String): Self = StObject.set(x, "etherpad_base", value.asInstanceOf[js.Any])
    
    inline def setEtherpad_baseUndefined: Self = StObject.set(x, "etherpad_base", js.undefined)
    
    inline def setExternalConnectUrl(value: String): Self = StObject.set(x, "externalConnectUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalConnectUrlNull: Self = StObject.set(x, "externalConnectUrl", null)
    
    inline def setExternalConnectUrlUndefined: Self = StObject.set(x, "externalConnectUrl", js.undefined)
    
    inline def setFileRecordingsEnabled(value: Boolean): Self = StObject.set(x, "fileRecordingsEnabled", value.asInstanceOf[js.Any])
    
    inline def setFileRecordingsEnabledUndefined: Self = StObject.set(x, "fileRecordingsEnabled", js.undefined)
    
    inline def setFileRecordingsServiceEnabled(value: Boolean): Self = StObject.set(x, "fileRecordingsServiceEnabled", value.asInstanceOf[js.Any])
    
    inline def setFileRecordingsServiceEnabledUndefined: Self = StObject.set(x, "fileRecordingsServiceEnabled", js.undefined)
    
    inline def setFileRecordingsServiceSharingEnabled(value: Boolean): Self = StObject.set(x, "fileRecordingsServiceSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setFileRecordingsServiceSharingEnabledUndefined: Self = StObject.set(x, "fileRecordingsServiceSharingEnabled", js.undefined)
    
    inline def setFirefox_fake_device(value: Any): Self = StObject.set(x, "firefox_fake_device", value.asInstanceOf[js.Any])
    
    inline def setFirefox_fake_deviceUndefined: Self = StObject.set(x, "firefox_fake_device", js.undefined)
    
    inline def setFocusUserJid(value: String): Self = StObject.set(x, "focusUserJid", value.asInstanceOf[js.Any])
    
    inline def setFocusUserJidUndefined: Self = StObject.set(x, "focusUserJid", js.undefined)
    
    inline def setForceJVB121Ratio(value: Boolean): Self = StObject.set(x, "forceJVB121Ratio", value.asInstanceOf[js.Any])
    
    inline def setForceJVB121RatioUndefined: Self = StObject.set(x, "forceJVB121Ratio", js.undefined)
    
    inline def setGatherStats(value: Boolean): Self = StObject.set(x, "gatherStats", value.asInstanceOf[js.Any])
    
    inline def setGatherStatsUndefined: Self = StObject.set(x, "gatherStats", js.undefined)
    
    inline def setGoogleApiApplicationClientID(value: Any): Self = StObject.set(x, "googleApiApplicationClientID", value.asInstanceOf[js.Any])
    
    inline def setGoogleApiApplicationClientIDUndefined: Self = StObject.set(x, "googleApiApplicationClientID", js.undefined)
    
    inline def setGravatarBaseURL(value: String): Self = StObject.set(x, "gravatarBaseURL", value.asInstanceOf[js.Any])
    
    inline def setGravatarBaseURLUndefined: Self = StObject.set(x, "gravatarBaseURL", js.undefined)
    
    inline def setHiddenDomain(value: Any): Self = StObject.set(x, "hiddenDomain", value.asInstanceOf[js.Any])
    
    inline def setHiddenDomainUndefined: Self = StObject.set(x, "hiddenDomain", js.undefined)
    
    inline def setHideConferenceTimer(value: Boolean): Self = StObject.set(x, "hideConferenceTimer", value.asInstanceOf[js.Any])
    
    inline def setHideConferenceTimerUndefined: Self = StObject.set(x, "hideConferenceTimer", js.undefined)
    
    inline def setHideLobbyButton(value: Boolean): Self = StObject.set(x, "hideLobbyButton", value.asInstanceOf[js.Any])
    
    inline def setHideLobbyButtonUndefined: Self = StObject.set(x, "hideLobbyButton", js.undefined)
    
    inline def setHosts(value: ConfigHosts): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setIAmRecorder(value: Boolean): Self = StObject.set(x, "iAmRecorder", value.asInstanceOf[js.Any])
    
    inline def setIAmRecorderUndefined: Self = StObject.set(x, "iAmRecorder", js.undefined)
    
    inline def setIAmSipGateway(value: Boolean): Self = StObject.set(x, "iAmSipGateway", value.asInstanceOf[js.Any])
    
    inline def setIAmSipGatewayUndefined: Self = StObject.set(x, "iAmSipGateway", js.undefined)
    
    inline def setIgnoreStartMuted(value: Boolean): Self = StObject.set(x, "ignoreStartMuted", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStartMutedUndefined: Self = StObject.set(x, "ignoreStartMuted", js.undefined)
    
    inline def setLastNLimits(value: Record[Double, Double]): Self = StObject.set(x, "lastNLimits", value.asInstanceOf[js.Any])
    
    inline def setLastNLimitsUndefined: Self = StObject.set(x, "lastNLimits", js.undefined)
    
    inline def setLiveStreamingEnabled(value: Boolean): Self = StObject.set(x, "liveStreamingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLiveStreamingEnabledUndefined: Self = StObject.set(x, "liveStreamingEnabled", js.undefined)
    
    inline def setLocalRecording(value: ConfigLocalRecording): Self = StObject.set(x, "localRecording", value.asInstanceOf[js.Any])
    
    inline def setLocalRecordingUndefined: Self = StObject.set(x, "localRecording", js.undefined)
    
    inline def setLockRoomGuestEnabled(value: Boolean): Self = StObject.set(x, "lockRoomGuestEnabled", value.asInstanceOf[js.Any])
    
    inline def setLockRoomGuestEnabledUndefined: Self = StObject.set(x, "lockRoomGuestEnabled", js.undefined)
    
    inline def setMaxFullResolutionParticipants(value: Double): Self = StObject.set(x, "maxFullResolutionParticipants", value.asInstanceOf[js.Any])
    
    inline def setMaxFullResolutionParticipantsUndefined: Self = StObject.set(x, "maxFullResolutionParticipants", js.undefined)
    
    inline def setMicrosoftApiApplicationClientID(value: Boolean): Self = StObject.set(x, "microsoftApiApplicationClientID", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftApiApplicationClientIDUndefined: Self = StObject.set(x, "microsoftApiApplicationClientID", js.undefined)
    
    inline def setMinParticipants(value: Double): Self = StObject.set(x, "minParticipants", value.asInstanceOf[js.Any])
    
    inline def setMinParticipantsUndefined: Self = StObject.set(x, "minParticipants", js.undefined)
    
    inline def setModeratedRoomServiceUrl(value: String): Self = StObject.set(x, "moderatedRoomServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setModeratedRoomServiceUrlUndefined: Self = StObject.set(x, "moderatedRoomServiceUrl", js.undefined)
    
    inline def setNick(value: Any): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setNickUndefined: Self = StObject.set(x, "nick", js.undefined)
    
    inline def setNoticeMessage(value: String): Self = StObject.set(x, "noticeMessage", value.asInstanceOf[js.Any])
    
    inline def setNoticeMessageUndefined: Self = StObject.set(x, "noticeMessage", js.undefined)
    
    inline def setOpenBridgeChannel(value: Boolean | String): Self = StObject.set(x, "openBridgeChannel", value.asInstanceOf[js.Any])
    
    inline def setOpenBridgeChannelUndefined: Self = StObject.set(x, "openBridgeChannel", js.undefined)
    
    inline def setOpusMaxAverageBitrate(value: Double): Self = StObject.set(x, "opusMaxAverageBitrate", value.asInstanceOf[js.Any])
    
    inline def setOpusMaxAverageBitrateUndefined: Self = StObject.set(x, "opusMaxAverageBitrate", js.undefined)
    
    inline def setP2p(value: ConfigP2P): Self = StObject.set(x, "p2p", value.asInstanceOf[js.Any])
    
    inline def setP2pUndefined: Self = StObject.set(x, "p2p", js.undefined)
    
    inline def setPcStatsInterval(value: Double): Self = StObject.set(x, "pcStatsInterval", value.asInstanceOf[js.Any])
    
    inline def setPcStatsIntervalUndefined: Self = StObject.set(x, "pcStatsInterval", js.undefined)
    
    inline def setPeopleSearchQueryTypes(value: Any): Self = StObject.set(x, "peopleSearchQueryTypes", value.asInstanceOf[js.Any])
    
    inline def setPeopleSearchQueryTypesUndefined: Self = StObject.set(x, "peopleSearchQueryTypes", js.undefined)
    
    inline def setPeopleSearchUrl(value: String): Self = StObject.set(x, "peopleSearchUrl", value.asInstanceOf[js.Any])
    
    inline def setPeopleSearchUrlUndefined: Self = StObject.set(x, "peopleSearchUrl", js.undefined)
    
    inline def setPreferH264(value: Boolean): Self = StObject.set(x, "preferH264", value.asInstanceOf[js.Any])
    
    inline def setPreferH264Undefined: Self = StObject.set(x, "preferH264", js.undefined)
    
    inline def setPrejoinPageEnabled(value: Boolean): Self = StObject.set(x, "prejoinPageEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrejoinPageEnabledUndefined: Self = StObject.set(x, "prejoinPageEnabled", js.undefined)
    
    inline def setRecordingLimit(value: ConfigRecordingLimit): Self = StObject.set(x, "recordingLimit", value.asInstanceOf[js.Any])
    
    inline def setRecordingLimitUndefined: Self = StObject.set(x, "recordingLimit", js.undefined)
    
    inline def setRemoteVideoMenu(value: ConfigRemoteVideoMenu): Self = StObject.set(x, "remoteVideoMenu", value.asInstanceOf[js.Any])
    
    inline def setRemoteVideoMenuUndefined: Self = StObject.set(x, "remoteVideoMenu", js.undefined)
    
    inline def setRequireDisplayName(value: Boolean): Self = StObject.set(x, "requireDisplayName", value.asInstanceOf[js.Any])
    
    inline def setRequireDisplayNameUndefined: Self = StObject.set(x, "requireDisplayName", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setRoomPasswordNumberOfDigits(value: `false` | Double): Self = StObject.set(x, "roomPasswordNumberOfDigits", value.asInstanceOf[js.Any])
    
    inline def setRoomPasswordNumberOfDigitsUndefined: Self = StObject.set(x, "roomPasswordNumberOfDigits", js.undefined)
    
    inline def setStartAudioMuted(value: Double): Self = StObject.set(x, "startAudioMuted", value.asInstanceOf[js.Any])
    
    inline def setStartAudioMutedUndefined: Self = StObject.set(x, "startAudioMuted", js.undefined)
    
    inline def setStartAudioOnly(value: Boolean): Self = StObject.set(x, "startAudioOnly", value.asInstanceOf[js.Any])
    
    inline def setStartAudioOnlyUndefined: Self = StObject.set(x, "startAudioOnly", js.undefined)
    
    inline def setStartBitrate(value: Any): Self = StObject.set(x, "startBitrate", value.asInstanceOf[js.Any])
    
    inline def setStartBitrateUndefined: Self = StObject.set(x, "startBitrate", js.undefined)
    
    inline def setStartScreenSharing(value: Boolean): Self = StObject.set(x, "startScreenSharing", value.asInstanceOf[js.Any])
    
    inline def setStartScreenSharingUndefined: Self = StObject.set(x, "startScreenSharing", js.undefined)
    
    inline def setStartSilent(value: Boolean): Self = StObject.set(x, "startSilent", value.asInstanceOf[js.Any])
    
    inline def setStartSilentUndefined: Self = StObject.set(x, "startSilent", js.undefined)
    
    inline def setStartVideoMuted(value: Double): Self = StObject.set(x, "startVideoMuted", value.asInstanceOf[js.Any])
    
    inline def setStartVideoMutedUndefined: Self = StObject.set(x, "startVideoMuted", js.undefined)
    
    inline def setStartWithAudioMuted(value: Boolean): Self = StObject.set(x, "startWithAudioMuted", value.asInstanceOf[js.Any])
    
    inline def setStartWithAudioMutedUndefined: Self = StObject.set(x, "startWithAudioMuted", js.undefined)
    
    inline def setStartWithVideoMuted(value: Boolean): Self = StObject.set(x, "startWithVideoMuted", value.asInstanceOf[js.Any])
    
    inline def setStartWithVideoMutedUndefined: Self = StObject.set(x, "startWithVideoMuted", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTesting(value: ConfigTesting): Self = StObject.set(x, "testing", value.asInstanceOf[js.Any])
    
    inline def setTestingUndefined: Self = StObject.set(x, "testing", js.undefined)
    
    inline def setTokenAuthUrl(value: String): Self = StObject.set(x, "tokenAuthUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenAuthUrlUndefined: Self = StObject.set(x, "tokenAuthUrl", js.undefined)
    
    inline def setTranscribingEnabled(value: Boolean): Self = StObject.set(x, "transcribingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTranscribingEnabledUndefined: Self = StObject.set(x, "transcribingEnabled", js.undefined)
    
    inline def setUseTurnUdp(value: `false`): Self = StObject.set(x, "useTurnUdp", value.asInstanceOf[js.Any])
    
    inline def setUseTurnUdpUndefined: Self = StObject.set(x, "useTurnUdp", js.undefined)
    
    inline def setVideoQuality(value: ConfigVideoQuality): Self = StObject.set(x, "videoQuality", value.asInstanceOf[js.Any])
    
    inline def setVideoQualityUndefined: Self = StObject.set(x, "videoQuality", js.undefined)
    
    inline def setWebrtcIceTcpDisable(value: Boolean): Self = StObject.set(x, "webrtcIceTcpDisable", value.asInstanceOf[js.Any])
    
    inline def setWebrtcIceTcpDisableUndefined: Self = StObject.set(x, "webrtcIceTcpDisable", js.undefined)
    
    inline def setWebrtcIceUdpDisable(value: Boolean): Self = StObject.set(x, "webrtcIceUdpDisable", value.asInstanceOf[js.Any])
    
    inline def setWebrtcIceUdpDisableUndefined: Self = StObject.set(x, "webrtcIceUdpDisable", js.undefined)
    
    inline def setWebsocket(value: String): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    
    inline def set_desktopSharingSourceDevice(value: String): Self = StObject.set(x, "_desktopSharingSourceDevice", value.asInstanceOf[js.Any])
    
    inline def set_desktopSharingSourceDeviceUndefined: Self = StObject.set(x, "_desktopSharingSourceDevice", js.undefined)
    
    inline def set_immediateReloadThreshold(value: Any): Self = StObject.set(x, "_immediateReloadThreshold", value.asInstanceOf[js.Any])
    
    inline def set_immediateReloadThresholdUndefined: Self = StObject.set(x, "_immediateReloadThreshold", js.undefined)
    
    inline def set_peerConnStatusOutOfLastNTimeout(value: Any): Self = StObject.set(x, "_peerConnStatusOutOfLastNTimeout", value.asInstanceOf[js.Any])
    
    inline def set_peerConnStatusOutOfLastNTimeoutUndefined: Self = StObject.set(x, "_peerConnStatusOutOfLastNTimeout", js.undefined)
    
    inline def set_peerConnStatusRtcMuteTimeout(value: Any): Self = StObject.set(x, "_peerConnStatusRtcMuteTimeout", value.asInstanceOf[js.Any])
    
    inline def set_peerConnStatusRtcMuteTimeoutUndefined: Self = StObject.set(x, "_peerConnStatusRtcMuteTimeout", js.undefined)
  }
}
