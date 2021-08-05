package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Replies {
  
  @JSImport("instabug-reactnative", "Replies")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUnreadRepliesCount(messageCountCallback: js.Function1[/* count */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnreadRepliesCount")(messageCountCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hasChats(callback: js.Function1[/* previousChats */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChats")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInAppNotificationSound(shouldPlaySound: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInAppNotificationSound")(shouldPlaySound.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setInAppNotificationsEnabled(inAppNotificationsEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInAppNotificationsEnabled")(inAppNotificationsEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setOnNewReplyReceivedCallback(onNewReplyReceivedCallback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnNewReplyReceivedCallback")(onNewReplyReceivedCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setOnNewReplyReceivedHandler(onNewReplyReceivedHandler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnNewReplyReceivedHandler")(onNewReplyReceivedHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
}
