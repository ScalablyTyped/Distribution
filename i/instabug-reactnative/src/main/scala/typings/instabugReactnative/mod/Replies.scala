package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Replies {
  
  @JSImport("instabug-reactnative", "Replies")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the number of unread messages the user currently has.
    * Use this method to get the number of unread messages the user
    * has, then possibly notify them about it with your own UI.
    * @param {messageCountCallback} messageCountCallback callback with argument
    * Notifications count, or -1 in case the SDK has not been initialized.
    */
  inline def getUnreadRepliesCount(messageCountCallback: js.Function1[/* count */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnreadRepliesCount")(messageCountCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Tells whether the user has chats already or not.
    * @param {function} callback - callback that is invoked if chats exist
    */
  inline def hasChats(callback: js.Function1[/* previousChats */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChats")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables and disables everything related to receiving replies.
    * @param {boolean} isEnabled
    */
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set whether new in app notification received will play a small sound notification
    * or not (Default is {@code false})
    * @android
    *
    * @param shouldPlaySound desired state of conversation sounds
    */
  inline def setInAppNotificationSound(shouldPlaySound: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInAppNotificationSound")(shouldPlaySound.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables/disables showing in-app notifications when the user receives a
    * new message.
    * @param {boolean} inAppNotificationsEnabled A boolean to set whether
    * notifications are enabled or disabled.
    */
  inline def setInAppNotificationsEnabled(inAppNotificationsEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInAppNotificationsEnabled")(inAppNotificationsEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set the push notification's icon that will be shown with Instabug notifications
    *
    * @param notificationIcon the notification icon resource ID
    */
  inline def setNotificationIconAndroid(notificationIcon: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNotificationIconAndroid")(notificationIcon.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets a block of code that gets executed when a new message is received.
    * @param {function} onNewReplyReceivedHandler - A callback that gets
    * executed when a new message is received.
    */
  inline def setOnNewReplyReceivedHandler(onNewReplyReceivedHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnNewReplyReceivedHandler")(onNewReplyReceivedHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set a notification channel id to a notification channel that notifications
    * can be posted to.
    *
    * @param pushNotificationChannelId an id to a notification channel that notifications
    */
  inline def setPushNotificationChannelIdAndroid(pushNotificationChannelId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationChannelIdAndroid")(pushNotificationChannelId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set the GCM registration token to Instabug
    *
    * @param token the GCM registration token
    */
  inline def setPushNotificationRegistrationTokenAndroid(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationRegistrationTokenAndroid")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Enables/disables the use of push notifications in the SDK.
    * Defaults to YES.
    * @param {boolean} isPushNotificationEnabled A boolean to indicate whether push
    * notifications are enabled or disabled.
    */
  inline def setPushNotificationsEnabled(isPushNotificationEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationsEnabled")(isPushNotificationEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set whether new system notification received will play the default sound from
    * RingtoneManager or not (Default is {@code false})
    *
    * @param shouldPlaySound desired state of conversation sounds
    */
  inline def setSystemReplyNotificationSoundEnabledAndroid(shouldPlaySound: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSystemReplyNotificationSoundEnabledAndroid")(shouldPlaySound.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Manual invocation for replies.
    */
  inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  
  /**
    * Show in-app Messaging's notifications
    *
    * @param data the data bundle related to Instabug
    */
  inline def showNotificationAndroid(data: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotificationAndroid")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
