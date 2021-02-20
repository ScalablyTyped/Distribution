package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Replies {
  
  @JSImport("instabug-reactnative", "Replies.getUnreadRepliesCount")
  @js.native
  def getUnreadRepliesCount(messageCountCallback: js.Function1[/* count */ Double, Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.hasChats")
  @js.native
  def hasChats(callback: js.Function1[/* previousChats */ Boolean, Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.setEnabled")
  @js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.setInAppNotificationSound")
  @js.native
  def setInAppNotificationSound(shouldPlaySound: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.setInAppNotificationsEnabled")
  @js.native
  def setInAppNotificationsEnabled(inAppNotificationsEnabled: Boolean): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.setOnNewReplyReceivedCallback")
  @js.native
  def setOnNewReplyReceivedCallback(onNewReplyReceivedCallback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.setOnNewReplyReceivedHandler")
  @js.native
  def setOnNewReplyReceivedHandler(onNewReplyReceivedHandler: js.Function0[Unit]): Unit = js.native
  
  @JSImport("instabug-reactnative", "Replies.show")
  @js.native
  def show(): Unit = js.native
}
