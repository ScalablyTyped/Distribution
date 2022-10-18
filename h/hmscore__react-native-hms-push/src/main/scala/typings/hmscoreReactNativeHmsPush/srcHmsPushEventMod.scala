package typings.hmscoreReactNativeHmsPush

import typings.hmscoreReactNativeHmsPush.anon.DataJSON
import typings.hmscoreReactNativeHmsPush.anon.DataJSONString
import typings.hmscoreReactNativeHmsPush.anon.MsgId
import typings.hmscoreReactNativeHmsPush.anon.Result
import typings.hmscoreReactNativeHmsPush.anon.Token
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.LOCAL_NOTIFICATION_ACTION_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.NOTIFICATION_OPENED_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_MULTI_SENDER_TOKEN_ERROR_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT_DELIVERED
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT_ERROR
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_TOKEN_ERROR_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_TOKEN_RECEIVED_EVENT
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.REMOTE_DATA_MESSAGE_RECEIVED
import typings.hmscoreReactNativeHmsPush.srcRemoteDataMessageMod.RemoteDataMessageObject
import typings.hmscoreReactNativeHmsPush.srcRemoteDataMessageMod.RemoteDataMessageWithExtras
import typings.hmscoreReactNativeHmsPush.srcResultResponseMod.ResultResponse
import typings.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHmsPushEventMod {
  
  trait HmsPushEventListeners extends StObject {
    
    def onLocalNotificationAction(result: js.Function1[/* result */ DataJSONString, Unit]): NativeEventSubscription
    
    def onMultiSenderTokenError(result: js.Function1[/* result */ ResultResponse[String], Unit]): NativeEventSubscription
    
    def onMultiSenderTokenReceived(result: js.Function1[/* result */ DataJSON, Unit]): NativeEventSubscription
    
    def onNotificationOpenedApp(result: js.Function1[/* result */ RemoteDataMessageWithExtras, Unit]): NativeEventSubscription
    
    def onPushMessageSent(result: js.Function1[/* result */ MsgId, Unit]): NativeEventSubscription
    
    def onPushMessageSentDelivered(result: js.Function1[/* result */ ResultResponse[Boolean], Unit]): NativeEventSubscription
    
    def onPushMessageSentError(result: js.Function1[/* result */ Result, Unit]): NativeEventSubscription
    
    def onRemoteMessageReceived(result: js.Function1[/* result */ RemoteDataMessageObject, Unit]): NativeEventSubscription
    
    def onTokenError(result: js.Function1[/* result */ ResultResponse[String], Unit]): NativeEventSubscription
    
    def onTokenReceived(result: js.Function1[/* result */ Token, Unit]): NativeEventSubscription
  }
  object HmsPushEventListeners {
    
    inline def apply(
      onLocalNotificationAction: js.Function1[/* result */ DataJSONString, Unit] => NativeEventSubscription,
      onMultiSenderTokenError: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription,
      onMultiSenderTokenReceived: js.Function1[/* result */ DataJSON, Unit] => NativeEventSubscription,
      onNotificationOpenedApp: js.Function1[/* result */ RemoteDataMessageWithExtras, Unit] => NativeEventSubscription,
      onPushMessageSent: js.Function1[/* result */ MsgId, Unit] => NativeEventSubscription,
      onPushMessageSentDelivered: js.Function1[/* result */ ResultResponse[Boolean], Unit] => NativeEventSubscription,
      onPushMessageSentError: js.Function1[/* result */ Result, Unit] => NativeEventSubscription,
      onRemoteMessageReceived: js.Function1[/* result */ RemoteDataMessageObject, Unit] => NativeEventSubscription,
      onTokenError: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription,
      onTokenReceived: js.Function1[/* result */ Token, Unit] => NativeEventSubscription
    ): HmsPushEventListeners = {
      val __obj = js.Dynamic.literal(onLocalNotificationAction = js.Any.fromFunction1(onLocalNotificationAction), onMultiSenderTokenError = js.Any.fromFunction1(onMultiSenderTokenError), onMultiSenderTokenReceived = js.Any.fromFunction1(onMultiSenderTokenReceived), onNotificationOpenedApp = js.Any.fromFunction1(onNotificationOpenedApp), onPushMessageSent = js.Any.fromFunction1(onPushMessageSent), onPushMessageSentDelivered = js.Any.fromFunction1(onPushMessageSentDelivered), onPushMessageSentError = js.Any.fromFunction1(onPushMessageSentError), onRemoteMessageReceived = js.Any.fromFunction1(onRemoteMessageReceived), onTokenError = js.Any.fromFunction1(onTokenError), onTokenReceived = js.Any.fromFunction1(onTokenReceived))
      __obj.asInstanceOf[HmsPushEventListeners]
    }
    
    extension [Self <: HmsPushEventListeners](x: Self) {
      
      inline def setOnLocalNotificationAction(value: js.Function1[/* result */ DataJSONString, Unit] => NativeEventSubscription): Self = StObject.set(x, "onLocalNotificationAction", js.Any.fromFunction1(value))
      
      inline def setOnMultiSenderTokenError(value: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription): Self = StObject.set(x, "onMultiSenderTokenError", js.Any.fromFunction1(value))
      
      inline def setOnMultiSenderTokenReceived(value: js.Function1[/* result */ DataJSON, Unit] => NativeEventSubscription): Self = StObject.set(x, "onMultiSenderTokenReceived", js.Any.fromFunction1(value))
      
      inline def setOnNotificationOpenedApp(value: js.Function1[/* result */ RemoteDataMessageWithExtras, Unit] => NativeEventSubscription): Self = StObject.set(x, "onNotificationOpenedApp", js.Any.fromFunction1(value))
      
      inline def setOnPushMessageSent(value: js.Function1[/* result */ MsgId, Unit] => NativeEventSubscription): Self = StObject.set(x, "onPushMessageSent", js.Any.fromFunction1(value))
      
      inline def setOnPushMessageSentDelivered(value: js.Function1[/* result */ ResultResponse[Boolean], Unit] => NativeEventSubscription): Self = StObject.set(x, "onPushMessageSentDelivered", js.Any.fromFunction1(value))
      
      inline def setOnPushMessageSentError(value: js.Function1[/* result */ Result, Unit] => NativeEventSubscription): Self = StObject.set(x, "onPushMessageSentError", js.Any.fromFunction1(value))
      
      inline def setOnRemoteMessageReceived(value: js.Function1[/* result */ RemoteDataMessageObject, Unit] => NativeEventSubscription): Self = StObject.set(x, "onRemoteMessageReceived", js.Any.fromFunction1(value))
      
      inline def setOnTokenError(value: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription): Self = StObject.set(x, "onTokenError", js.Any.fromFunction1(value))
      
      inline def setOnTokenReceived(value: js.Function1[/* result */ Token, Unit] => NativeEventSubscription): Self = StObject.set(x, "onTokenReceived", js.Any.fromFunction1(value))
    }
  }
  
  trait HmsPushEventType
    extends StObject
       with HmsPushEvents
       with HmsPushEventListeners
  object HmsPushEventType {
    
    inline def apply(
      onLocalNotificationAction: js.Function1[/* result */ DataJSONString, Unit] => NativeEventSubscription,
      onMultiSenderTokenError: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription,
      onMultiSenderTokenReceived: js.Function1[/* result */ DataJSON, Unit] => NativeEventSubscription,
      onNotificationOpenedApp: js.Function1[/* result */ RemoteDataMessageWithExtras, Unit] => NativeEventSubscription,
      onPushMessageSent: js.Function1[/* result */ MsgId, Unit] => NativeEventSubscription,
      onPushMessageSentDelivered: js.Function1[/* result */ ResultResponse[Boolean], Unit] => NativeEventSubscription,
      onPushMessageSentError: js.Function1[/* result */ Result, Unit] => NativeEventSubscription,
      onRemoteMessageReceived: js.Function1[/* result */ RemoteDataMessageObject, Unit] => NativeEventSubscription,
      onTokenError: js.Function1[/* result */ ResultResponse[String], Unit] => NativeEventSubscription,
      onTokenReceived: js.Function1[/* result */ Token, Unit] => NativeEventSubscription
    ): HmsPushEventType = {
      val __obj = js.Dynamic.literal(LOCAL_NOTIFICATION_ACTION_EVENT = "LOCAL_NOTIFICATION_ACTION_EVENT", NOTIFICATION_OPENED_EVENT = "NOTIFICATION_OPENED_EVENT", ON_MULTI_SENDER_TOKEN_ERROR_EVENT = "ON_MULTI_SENDER_TOKEN_ERROR_EVENT", ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT = "ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT", ON_PUSH_MESSAGE_SENT = "ON_PUSH_MESSAGE_SENT", ON_PUSH_MESSAGE_SENT_DELIVERED = "ON_PUSH_MESSAGE_SENT_DELIVERED", ON_PUSH_MESSAGE_SENT_ERROR = "ON_PUSH_MESSAGE_SENT_ERROR", ON_TOKEN_ERROR_EVENT = "ON_TOKEN_ERROR_EVENT", ON_TOKEN_RECEIVED_EVENT = "ON_TOKEN_RECEIVED_EVENT", REMOTE_DATA_MESSAGE_RECEIVED = "REMOTE_DATA_MESSAGE_RECEIVED", onLocalNotificationAction = js.Any.fromFunction1(onLocalNotificationAction), onMultiSenderTokenError = js.Any.fromFunction1(onMultiSenderTokenError), onMultiSenderTokenReceived = js.Any.fromFunction1(onMultiSenderTokenReceived), onNotificationOpenedApp = js.Any.fromFunction1(onNotificationOpenedApp), onPushMessageSent = js.Any.fromFunction1(onPushMessageSent), onPushMessageSentDelivered = js.Any.fromFunction1(onPushMessageSentDelivered), onPushMessageSentError = js.Any.fromFunction1(onPushMessageSentError), onRemoteMessageReceived = js.Any.fromFunction1(onRemoteMessageReceived), onTokenError = js.Any.fromFunction1(onTokenError), onTokenReceived = js.Any.fromFunction1(onTokenReceived))
      __obj.asInstanceOf[HmsPushEventType]
    }
  }
  
  trait HmsPushEvents extends StObject {
    
    var LOCAL_NOTIFICATION_ACTION_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.LOCAL_NOTIFICATION_ACTION_EVENT
    
    var NOTIFICATION_OPENED_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.NOTIFICATION_OPENED_EVENT
    
    var ON_MULTI_SENDER_TOKEN_ERROR_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_MULTI_SENDER_TOKEN_ERROR_EVENT
    
    var ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT
    
    var ON_PUSH_MESSAGE_SENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT
    
    var ON_PUSH_MESSAGE_SENT_DELIVERED: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT_DELIVERED
    
    var ON_PUSH_MESSAGE_SENT_ERROR: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_PUSH_MESSAGE_SENT_ERROR
    
    var ON_TOKEN_ERROR_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_TOKEN_ERROR_EVENT
    
    var ON_TOKEN_RECEIVED_EVENT: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ON_TOKEN_RECEIVED_EVENT
    
    var REMOTE_DATA_MESSAGE_RECEIVED: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.REMOTE_DATA_MESSAGE_RECEIVED
  }
  object HmsPushEvents {
    
    inline def apply(): HmsPushEvents = {
      val __obj = js.Dynamic.literal(LOCAL_NOTIFICATION_ACTION_EVENT = "LOCAL_NOTIFICATION_ACTION_EVENT", NOTIFICATION_OPENED_EVENT = "NOTIFICATION_OPENED_EVENT", ON_MULTI_SENDER_TOKEN_ERROR_EVENT = "ON_MULTI_SENDER_TOKEN_ERROR_EVENT", ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT = "ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT", ON_PUSH_MESSAGE_SENT = "ON_PUSH_MESSAGE_SENT", ON_PUSH_MESSAGE_SENT_DELIVERED = "ON_PUSH_MESSAGE_SENT_DELIVERED", ON_PUSH_MESSAGE_SENT_ERROR = "ON_PUSH_MESSAGE_SENT_ERROR", ON_TOKEN_ERROR_EVENT = "ON_TOKEN_ERROR_EVENT", ON_TOKEN_RECEIVED_EVENT = "ON_TOKEN_RECEIVED_EVENT", REMOTE_DATA_MESSAGE_RECEIVED = "REMOTE_DATA_MESSAGE_RECEIVED")
      __obj.asInstanceOf[HmsPushEvents]
    }
    
    extension [Self <: HmsPushEvents](x: Self) {
      
      inline def setLOCAL_NOTIFICATION_ACTION_EVENT(value: LOCAL_NOTIFICATION_ACTION_EVENT): Self = StObject.set(x, "LOCAL_NOTIFICATION_ACTION_EVENT", value.asInstanceOf[js.Any])
      
      inline def setNOTIFICATION_OPENED_EVENT(value: NOTIFICATION_OPENED_EVENT): Self = StObject.set(x, "NOTIFICATION_OPENED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setON_MULTI_SENDER_TOKEN_ERROR_EVENT(value: ON_MULTI_SENDER_TOKEN_ERROR_EVENT): Self = StObject.set(x, "ON_MULTI_SENDER_TOKEN_ERROR_EVENT", value.asInstanceOf[js.Any])
      
      inline def setON_MULTI_SENDER_TOKEN_RECEIVED_EVENT(value: ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT): Self = StObject.set(x, "ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setON_PUSH_MESSAGE_SENT(value: ON_PUSH_MESSAGE_SENT): Self = StObject.set(x, "ON_PUSH_MESSAGE_SENT", value.asInstanceOf[js.Any])
      
      inline def setON_PUSH_MESSAGE_SENT_DELIVERED(value: ON_PUSH_MESSAGE_SENT_DELIVERED): Self = StObject.set(x, "ON_PUSH_MESSAGE_SENT_DELIVERED", value.asInstanceOf[js.Any])
      
      inline def setON_PUSH_MESSAGE_SENT_ERROR(value: ON_PUSH_MESSAGE_SENT_ERROR): Self = StObject.set(x, "ON_PUSH_MESSAGE_SENT_ERROR", value.asInstanceOf[js.Any])
      
      inline def setON_TOKEN_ERROR_EVENT(value: ON_TOKEN_ERROR_EVENT): Self = StObject.set(x, "ON_TOKEN_ERROR_EVENT", value.asInstanceOf[js.Any])
      
      inline def setON_TOKEN_RECEIVED_EVENT(value: ON_TOKEN_RECEIVED_EVENT): Self = StObject.set(x, "ON_TOKEN_RECEIVED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setREMOTE_DATA_MESSAGE_RECEIVED(value: REMOTE_DATA_MESSAGE_RECEIVED): Self = StObject.set(x, "REMOTE_DATA_MESSAGE_RECEIVED", value.asInstanceOf[js.Any])
    }
  }
}
