package typings.hmscoreReactNativeHmsPush

import org.scalablytyped.runtime.StringDictionary
import typings.hmscoreReactNativeHmsPush.anon.AnalyticInfo
import typings.hmscoreReactNativeHmsPush.anon.BADGENUMBER
import typings.hmscoreReactNativeHmsPush.anon.kinkeyofLocalNotification
import typings.hmscoreReactNativeHmsPush.hmsPushEventMod.HmsPushEventType
import typings.hmscoreReactNativeHmsPush.hmsPushProfileTypesMod.ProfileTypeEnum
import typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeInterface
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`-1`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`0`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`1`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`2`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.HCM
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.analyticInfo
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.analyticInfoMap
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.collapseKey
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.data
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.dataOfMap
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.from
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageId
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageType
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.originalUrgency
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.sentTime
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.to
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.token
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ttl
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.urgency
import typings.hmscoreReactNativeHmsPush.localNotificationAttributesMod.LocalNotificationAttributes
import typings.hmscoreReactNativeHmsPush.remoteDataMessageMod.BackgroundRemoteMessage
import typings.hmscoreReactNativeHmsPush.remoteDataMessageMod.RemoteDataMessageWithExtras
import typings.hmscoreReactNativeHmsPush.remoteMessageBuilderMod.RemoteMessageBuilderInterface
import typings.hmscoreReactNativeHmsPush.resultResponseMod.ResultResponse
import typings.hmscoreReactNativeHmsPush.rnremotemessageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@hmscore/react-native-hms-push", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def deleteAAID(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAAID")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteToken(value: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def getAAID(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAAID")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getCreationTime(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreationTime")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getId(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getToken(value: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
  }
  
  object HmsLocalNotification {
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification.Attr")
    @js.native
    val Attr: LocalNotificationAttributes = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification.Importance")
    @js.native
    val Importance: typings.hmscoreReactNativeHmsPush.importanceMod.Importance = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification.Priority")
    @js.native
    val Priority: typings.hmscoreReactNativeHmsPush.priorityMod.Priority = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification.RepeatType")
    @js.native
    val RepeatType: typings.hmscoreReactNativeHmsPush.repeatTypeMod.RepeatType = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "HmsLocalNotification.Visibility")
    @js.native
    val Visibility: typings.hmscoreReactNativeHmsPush.visibilityMod.Visibility = js.native
    
    inline def cancelAllNotifications(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAllNotifications")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def cancelNotifications(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelNotifications")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def cancelNotificationsWithId(notificationIds: js.Array[String]): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelNotificationsWithId")(notificationIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def cancelNotificationsWithTag(tag: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelNotificationsWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def cancelScheduledNotifications(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelScheduledNotifications")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def channelBlocked(channelId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("channelBlocked")(channelId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def channelExists(channelId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("channelExists")(channelId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteChannel(channelId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteChannel")(channelId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def getChannels(): js.Promise[ResultResponse[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannels")().asInstanceOf[js.Promise[ResultResponse[js.Array[String]]]]
    
    inline def getNotifications(): js.Promise[ResultResponse[js.Array[LocalNotificationOptions]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotifications")().asInstanceOf[js.Promise[ResultResponse[js.Array[LocalNotificationOptions]]]]
    
    inline def getScheduledNotifications(): js.Promise[ResultResponse[js.Array[LocalNotificationOptions]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheduledNotifications")().asInstanceOf[js.Promise[ResultResponse[js.Array[LocalNotificationOptions]]]]
    
    inline def localNotification(options: LocalNotificationOptions): js.Promise[ResultResponse[LocalNotificationAttributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("localNotification")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[LocalNotificationAttributes]]]
    
    inline def localNotificationSchedule(options: LocalNotificationOptions): js.Promise[ResultResponse[LocalNotificationAttributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("localNotificationSchedule")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[LocalNotificationAttributes]]]
  }
  
  @JSImport("@hmscore/react-native-hms-push", "HmsPushEvent")
  @js.native
  val HmsPushEvent: HmsPushEventType = js.native
  
  object HmsPushInstanceId {
    
    @JSImport("@hmscore/react-native-hms-push", "HmsPushInstanceId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deleteAAID(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAAID")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteToken(value: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def getAAID(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAAID")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getCreationTime(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreationTime")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getId(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getToken(value: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
  }
  
  object HmsPushMessaging {
    
    @JSImport("@hmscore/react-native-hms-push", "HmsPushMessaging")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInitialNotification(): js.Promise[ResultResponse[RemoteDataMessageWithExtras]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialNotification")().asInstanceOf[js.Promise[ResultResponse[RemoteDataMessageWithExtras]]]
    
    inline def isAutoInitEnabled(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoInitEnabled")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def sendRemoteMessage(remoteMessageObject: StringDictionary[Any]): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendRemoteMessage")(remoteMessageObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def setAutoInitEnabled(value: Boolean): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoInitEnabled")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def setBackgroundMessageHandler(handler: js.Function1[/* dataMessage */ BackgroundRemoteMessage, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundMessageHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def subscribe(topic: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(topic.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def turnOffPush(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnOffPush")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def turnOnPush(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnOnPush")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def unsubscribe(topic: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(topic.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
  }
  
  object HmsPushOpenDevice {
    
    @JSImport("@hmscore/react-native-hms-push", "HmsPushOpenDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getOdid(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOdid")().asInstanceOf[js.Promise[ResultResponse[String]]]
  }
  
  object HmsPushProfile {
    
    @JSImport("@hmscore/react-native-hms-push", "HmsPushProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /* Inlined std.Readonly<@hmscore/react-native-hms-push.@hmscore/react-native-hms-push/src/HmsPushProfileTypes.ProfileType> */
    object Type {
      
      @JSImport("@hmscore/react-native-hms-push", "HmsPushProfile.Type.CUSTOM_PROFILE")
      @js.native
      val CUSTOM_PROFILE: `2` = js.native
      
      @JSImport("@hmscore/react-native-hms-push", "HmsPushProfile.Type.HUAWEI_PROFILE")
      @js.native
      val HUAWEI_PROFILE: `1` = js.native
      
      @JSImport("@hmscore/react-native-hms-push", "HmsPushProfile.Type.UNDEFINED_PROFILE")
      @js.native
      val UNDEFINED_PROFILE: `-1` = js.native
    }
    
    inline def addProfile(`type`: ProfileTypeEnum, profileId: String): js.Promise[ResultResponse[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addProfile")(`type`.asInstanceOf[js.Any], profileId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def addProfileWithSubjectId(subjectId: String, `type`: ProfileTypeEnum, profileId: String): js.Promise[ResultResponse[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addProfileWithSubjectId")(subjectId.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], profileId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def deleteProfile(profileId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteProfile")(profileId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteProfileWithSubjectId(subjectId: String, profileId: String): js.Promise[ResultResponse[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProfileWithSubjectId")(subjectId.asInstanceOf[js.Any], profileId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def isSupportProfile(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportProfile")().asInstanceOf[js.Promise[ResultResponse[String]]]
  }
  
  @JSImport("@hmscore/react-native-hms-push", "HmsPushResultCode")
  @js.native
  val HmsPushResultCode: HmsPushResultCodeInterface = js.native
  
  @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage")
  @js.native
  open class RNRemoteMessage protected () extends default {
    def this(options: AnalyticInfo) = this()
  }
  /* static members */
  object RNRemoteMessage {
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ANALYTIC_INFO")
    @js.native
    def ANALYTIC_INFO: analyticInfo = js.native
    inline def ANALYTIC_INFO_=(x: analyticInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYTIC_INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ANALYTIC_INFO_MAP")
    @js.native
    def ANALYTIC_INFO_MAP: analyticInfoMap = js.native
    inline def ANALYTIC_INFO_MAP_=(x: analyticInfoMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYTIC_INFO_MAP")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.COLLAPSEKEY")
    @js.native
    def COLLAPSEKEY: collapseKey = js.native
    inline def COLLAPSEKEY_=(x: collapseKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSEKEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.DATA")
    @js.native
    def DATA: data = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.DATAOFMAP")
    @js.native
    def DATAOFMAP: dataOfMap = js.native
    inline def DATAOFMAP_=(x: dataOfMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATAOFMAP")(x.asInstanceOf[js.Any])
    
    inline def DATA_=(x: data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.FROM")
    @js.native
    def FROM: from = js.native
    inline def FROM_=(x: from): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.INSTANCE_ID_SCOPE")
    @js.native
    def INSTANCE_ID_SCOPE: HCM = js.native
    inline def INSTANCE_ID_SCOPE_=(x: HCM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE_ID_SCOPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.MESSAGEID")
    @js.native
    def MESSAGEID: messageId = js.native
    inline def MESSAGEID_=(x: messageId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGEID")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.MESSAGETYPE")
    @js.native
    def MESSAGETYPE: messageType = js.native
    inline def MESSAGETYPE_=(x: messageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGETYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.NOTIFICATION")
    @js.native
    def NOTIFICATION: BADGENUMBER = js.native
    inline def NOTIFICATION_=(x: BADGENUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTIFICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ORIGINALURGENCY")
    @js.native
    def ORIGINALURGENCY: originalUrgency = js.native
    inline def ORIGINALURGENCY_=(x: originalUrgency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGINALURGENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_HIG")
    @js.native
    def PRIORITY_HIG: `1` = js.native
    inline def PRIORITY_HIG_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_HIG")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_NORMAL")
    @js.native
    def PRIORITY_NORMAL: `2` = js.native
    inline def PRIORITY_NORMAL_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_NORMAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_UNKNOWN")
    @js.native
    def PRIORITY_UNKNOWN: `0` = js.native
    inline def PRIORITY_UNKNOWN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.SENTTIME")
    @js.native
    def SENTTIME: sentTime = js.native
    inline def SENTTIME_=(x: sentTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SENTTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TO")
    @js.native
    def TO: to = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TOKEN")
    @js.native
    def TOKEN: token = js.native
    inline def TOKEN_=(x: token): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN")(x.asInstanceOf[js.Any])
    
    inline def TO_=(x: to): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TTL")
    @js.native
    def TTL: ttl = js.native
    inline def TTL_=(x: ttl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TTL")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.URGENCY")
    @js.native
    def URGENCY: urgency = js.native
    inline def URGENCY_=(x: urgency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URGENCY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@hmscore/react-native-hms-push", "RemoteMessageBuilder")
  @js.native
  val RemoteMessageBuilder: RemoteMessageBuilderInterface = js.native
  
  type LocalNotificationOptions = kinkeyofLocalNotification | StringDictionary[Any]
}
